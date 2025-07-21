SELECT * FROM amorparami.MOVIE;
use amorparami;
insert into MOVIE values(20167645, "맨체스터 바이 더 씨", 2016, 2017, "미국", 99, 15, default, "케네스 로너건", "케이시 애플렉", 136);
insert into MOVIE values(20080071, "노인을 위한 나라는 없다", 2007, 2008, "미국", 99, 19, "파라마운트 밴티지", "조엘 코엔", "토미 리 존스", 122);
insert into MOVIE values(20060246, "무서운 영화4", 2006, 2006, "미국", 2, 15, "미라맥스 필름즈", "데이빗 주커", "안나 패리스", 83);
insert into MOVIE values(20050010, "콘스탄틴", 2005, 2005, "미국", 1, 15, "워너 브러더스 픽쳐스", "프란시스 로렌스", "키아누 리브스", 120);
insert into MOVIE values(20030316, "반지의 제왕:왕의 귀환", 2003, 2003, "미국", 99, 12, default, "피터 잭슨", "비고 모텐슨", 262);

insert into PRODUCT values("P0000021", 20167645, 2017, 99, 2000, 1, 15);
insert into PRODUCT values("P0000022", 20080071, 2008, 99, 2000, 2, 19);
insert into PRODUCT values("P0000023", 20060246, 2006, 2, 2000, 1, 15);
insert into PRODUCT values("P0000024", 20050010, 2005, 1, 2000, 2, 15);
insert into PRODUCT values("P0000025", 20030316, 2003, 99, 2000, 2, 12);

select * from PRODUCT p join MOVIE m
on p.MOVIE_CODE = m.MOVIE_CODE;

insert into RENTAL values("240305001", 1, "P0000025", "20240305", "20240305", 2500, default, default);
insert into RENTAL values("240406001", 1, "P0000024", "20240406", "20240406", 2500, default, default);
insert into RENTAL values("240407001", 1, "P0000023", "20240407", "20240407", 2500, default, 500);

--  년, 월, 일로 묶기
select *, sum(RENTAL_PRICE) as rental_price, year(rental_date), month(rental_date), day(rental_date) from RENTAL 
group by year(RENTAL_DATE), month(rental_date), day(rental_date);

select sum(ifnull(late_fee, 0)) as late_fee, year(return_date), month(return_date), day(return_date) from RENTAL
group by year(return_date), month(return_date), day(return_date);

select * from (select sum(RENTAL_PRICE) as rental_price, RENTAL_DATE 
from RENTAL group by year(RENTAL_DATE), month(rental_date), day(rental_date)) as R 
left outer join (select sum(ifnull(late_fee, 0)) as late_fee, return_date 
from RENTAL group by year(return_date), month(return_date), day(return_date)) as L
on date(R.rental_date) = date (L.return_date);

select * from (select sum(RENTAL_PRICE) as rental_price, RENTAL_DATE 
from RENTAL group by date(rental_date)) as R left outer join (select sum(ifnull(late_fee, 0)) as late_fee, return_date 
from RENTAL group by date(return_date)) as L on date(R.rental_date) = date (L.return_date)
union
select * from (select sum(RENTAL_PRICE) as rental_price, RENTAL_DATE 
from RENTAL group by date(rental_date)) as R right outer join (select sum(ifnull(late_fee, 0)) as late_fee, return_date 
from RENTAL group by date(return_date)) as L on date(R.rental_date) = date (L.return_date);


-- 뷰 생성
create or replace view day_sales
as select sum(RENTAL_PRICE) + sum(ifnull(LATE_FEE, 0)) as sales, year(rental_date) as year, month(rental_date) as month, day(rental_date) as day from RENTAL 
group by year(RENTAL_DATE), month(rental_date), day(rental_date);




delete from RENTAL where member_id = 1;

select * from day_sales;
select sum(sales), year, month from day_sales
group by year, month;

select member_id from MEMBER where member_name = "하정우";

select sum(rental_price + ifnull(late_fee, 0)), member_id from RENTAL
where member_id = (select member_id from MEMBER where member_name = "하정우") and year(RENTAL_DATE) = 2024
group by year(RENTAL_DATE);

select ifnull(d.rental_price, 0) + ifnull(d.late_fee, 0) as sales, ifnull(date(return_date), date(rental_date)) as date from(
select * from (select sum(RENTAL_PRICE) as rental_price, RENTAL_DATE 
from RENTAL group by date(rental_date)) as R left outer join (select sum(ifnull(late_fee, 0)) as late_fee, return_date 
from RENTAL group by date(return_date)) as L on date(R.rental_date) = date (L.return_date)
union
select * from (select sum(RENTAL_PRICE) as rental_price, RENTAL_DATE 
from RENTAL group by date(rental_date)) as R right outer join (select sum(ifnull(late_fee, 0)) as late_fee, return_date 
from RENTAL group by date(return_date)) as L on date(R.rental_date) = date (L.return_date)
) as d;