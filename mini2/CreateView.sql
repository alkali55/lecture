use amorparami;

-- 1. RENTAL 테이블에서 대여일을 기준으로 그룹화하며 해당 대여일의 대여료합계와 대여일을 보여주는 뷰 작성
create or replace view sales_source1
as select sum(RENTAL_PRICE) as rental_price, RENTAL_DATE 
from RENTAL group by date(rental_date);

-- 2. RENTAL 테이블에서 반납일을 기준으로 그룹화하며 
-- 해당 반납일의 연체료합계, 분실보상금합계와 반납일을 보여주는 뷰 작성
create or replace view sales_source2
as select sum(ifnull(late_fee, 0)) as late_fee, sum(ifnull(compensation_fee, 0)) as compensation_fee, return_date 
from RENTAL where return_date is not null group by date(return_date);

-- 3. 1과 2에서 만든 뷰를 (1번 뷰의 대여일 = 2번 뷰의 반납일) 이라는 조건으로
--  union을 사용하여 full outer join 하는 뷰 작성
create or replace view sales_source3
as 
select * from sales_source1 as R left outer join sales_source2 as L on date(R.rental_date) = date (L.return_date)
union
select * from sales_source1 as R right outer join sales_source2 as L on date(R.rental_date) = date (L.return_date);

-- 4. 3번에서 만든 뷰를 보기 편하도록 대여일만 표시하되 대여일이 null이면 반납일을 표시해주고
-- 대여료, 연체료, 분실보상금, 매출합계를 표시하되 null 이면 0으로 대체해주고
-- 일자별로 정렬하여 일일 매출 뷰를 작성
create or replace view sales_date as
select ifnull(date(rental_date), date(return_date)) as date, 
ifnull(d.rental_price, 0) as rental_price,
ifnull(d.late_fee, 0) as late_fee,
ifnull(d.compensation_fee, 0) as compensation_fee,
ifnull(d.rental_price, 0) + ifnull(d.late_fee, 0) + ifnull(d.compensation_fee, 0) as sales 
from sales_source3 as d order by date;

-- 5. 4에서 만든 일일 매출 뷰를 연도와 달을 기준으로 그룹화하여 월별 매출 뷰를 작성
create or replace view sales_month as
select year(date), month(date), sum(rental_price), sum(late_fee), sum(compensation_fee),
sum(sales) from sales_date
group by year(date), month(date);