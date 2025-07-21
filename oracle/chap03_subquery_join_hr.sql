-- 서브 쿼리

-- 100번 사원이 소속되어 있는 부서의 부서명을 알아보자.
-- 1) 100번 사원이 소속되어 있는 부서 번호를 알아낸다. (employees 테이블)
select department_id from employees where employee_id = 100; -- 90

-- 2) 1번에서 알아낸 부서번호의 부서 이름을 알아낸다 (departments 테이블)
select department_name from departments where department_id = 90; -- Executive

-- 서브쿼리를 사용하면.....
select department_name from departments 
where department_id = (select department_id from employees where employee_id = 100);


-- Executive 부서의 국가코드, 주, 시, 도로명주소를 출력해 보자.
-- 1) Executive 부서의 location_id를 조회 (Departments 테이블)
select location_id from departments
where department_name = initcap('executive');

-- 2) location_id = 1700 인 국가코드, 주, 시, 도로명주소를 출력 (Locations 테이블)
select country_id, state_province, city, street_address from locations
where location_id = 1700;

-- 서브쿼리 이용
select country_id, state_province, city, street_address from locations
where location_id = (select location_id from departments where department_name = initcap('executive'));

--select country_id, state_province, city, street_address from locations
--where location_id = (select location_id from departments where department_name = 
--    (select department_name from departments where department_id = 
--        (select department_id from employees where employee_id = 100)
--    )
--);

-- 서브쿼리의 종류
-- 1) 단일행 서브쿼리 (single row subquery)
-- : 내부 select 문장으로부터 하나의 행만 반환받으며, 연산자로 =, <, >, <=, >=, != 을 사용할 수 있다.

-- 문제)
-- 'diana'와 같은 부서에 다니는 동료들의 모든 정보를 출력하세요.
-- 1) 'diana'의 부서번호
select department_id from employees where first_name = initcap('diana'); -- 60

-- 2)
select * from employees
where department_id = (select department_id from employees where first_name = initcap('diana'));

-- 문제)
-- 사원들의 평균 급여보다 더 많은 급여를 받는 사원의 사번, 이름, 급여를 출력하세요.

-- 1)
select avg(salary) from employees; -- 6461.831775700934579439252336448598130841

-- 2)
select employee_id, first_name, salary from employees
where salary > (select avg(salary) from employees);

-- 2) 다중행 서브쿼리 (multiple-row subquery)
-- : 서브쿼리에서 반환되는 행의 갯수가 2개 이상일 때

-- 급여를 7000 이상 받는 사원이 소속된 부서와 동일한 부서에서 근무하는 사원들의 정보를 모두 출력하세요.

-- 1)
select department_id from employees where salary >= 7000;

-- 2)
select * from employees
where department_id = (select department_id from employees where salary >= 7000); -- 에러 ORA-01427: single-row subquery returns more than one row

-- 다중 서브쿼리에서 사용하는 연산자
-- 1) in : 메인쿼리의 데이터가 서브쿼리 결과 데이터 중 하나라도 일치하면 참
-- 2) any : 메인쿼리의 조건식을 만족하는 서브쿼리의 결과가 하나 이상이면 참
-- 3) all : 메인쿼리의 조건식을 서브쿼리의 결과가 모두 만족하면 참

-- 1) in : 메인쿼리의 데이터가 서브쿼리 결과 데이터 중 하나라도 일치하면 참
-- 급여를 12000 이상 받는 사원이 소속된 부서와 동일한 부서에서 근무하는 사원들의 정보를 모두 출력하세요.
select distinct department_id from employees where salary >= 12000;
-- 100, 90, 20, 110, 80

select * from employees
where department_id in (select distinct department_id from employees where salary >= 12000);

select * from employees
where department_id in (100, 90, 20, 110, 80);

-- 2) any : 메인쿼리의 조건식을 만족하는 서브쿼리의 결과가 하나 이상이면 참
--  (1) < any () : 결과적으로 12000 보다 적게 월급을 받는 사람들의 결과가 출력
select first_name, salary from employees where salary < any(4000, 6000, 9000, 12000);

--  (2) > any () : 결과적으로 4000 보다 큰 월급을 받는 사람들의 결과가 출력
select first_name, salary from employees where salary > any(4000, 6000, 9000, 12000);

--  (3) = any () : 결과적으로 in 연산자와 같은 기능을 한다.
select first_name, salary from employees where salary = any(4000, 6000, 9000, 12000);
select first_name, salary from employees where salary in (4000, 6000, 9000, 12000);

-- 3) all :메인쿼리의 조건식을 서브쿼리의 결과가 모두 만족하면 참
select first_name, salary from employees
where salary > all(11000, 3100, 2900, 2800, 2600, 2500);

-- 문제 )
-- 30번 부서에 소속된 사원 중에서 급여를 가장 적게 받는 사원보다 더 많이 받는 사원의 이름, 급여를 출력하세요.

select first_name, salary, department_id from employees
where salary > (select min(salary) from employees where department_id = 30);

select first_name, salary, department_id from employees
where department_id = 30 and salary > (select min(salary) from employees where department_id = 30);

select first_name, salary, department_id from employees
where department_id = 30;

select min(salary) from employees -- 2100 
where department_id = 30; -- 2500

-------------------------

select first_name, salary from employees
where salary > any (select salary from employees where department_id = 30);

-- 다중열 서브쿼리
select * from employees
where (department_id, salary) in (select department_id, max(salary) from employees
group by department_id);

select department_id, max(salary) from employees
group by department_id;
 
-- ================================
-- 사번이 100번인 사원의 정보(사번, 이름, 부서번호)와 그가 소속된 부서의 부서명
--select employee_id, first_name, department_id, department_name
--from employees; -- 에러: ORA-00904: "DEPARTMENT_NAME": invalid identifier

--select employee_id, first_name, department_id, department_name
--from employees, departments; -- 에러 : ORA-00918: column ambiguously defined

select employee_id, first_name, employees.department_id, department_name
from employees, departments; -- 2889행
-- 부서27, 사원 107
select 27*107 from dual;

select employee_id, first_name, employees.department_id, department_name
from employees, departments
where employees.department_id = departments.department_id;

-- CEO가 모든 직원에게 택배를 보내려 한다.
-- 모든 직원이 택배를 무사히 받을 수 있도록,
-- 사무실의 주소, 사원 정보를 출력

select e.first_name || ' ' || e.last_name, e.phone_number, 
d.department_name, 
l.street_address, l.city, l.postal_code, l.state_province, 
c.country_name, 
r.region_name
from employees e, departments d, locations l, countries c, regions r
where e.department_id = d.department_id 
and d.location_id = l.location_id
and l.country_id = c.country_id
and c.region_id = r.region_id;

--조인의 종류
--
--1.Cross Join (교차 조인) : 단순하게 두개 이상의 테이블을 곱연산한 결과

--(조인조건에 해당하는 where절이 존재하지 않기 때문에)
select * from employees; -- 107행
select count(*) from departments; -- 27행

select employee_id, first_name, employees.department_id, department_name
from employees, departments; -- 2889행

--2.Equi Join (등가 조인)
--: 조인 대상이 되는 테이블에서 공통적으로 존재하는 컬럼을 연결 ("="로 연결)하여 결과를 생성하는 조인
select e.first_name, d.department_name
from employees e, departments d
where e.department_id = d.department_id;

--3.Non-Equi Join (비등가 조인)
--: 조인할 테이블 사이의 컬럼 값이 직접적으로 일치하지 않을 때 사용하는 조인

-- scott 계정에서 emp 테이블과 salgrade 테이블 조인
select e.*, d.dname, d.loc, s.grade from emp e, dept d, salgrade s
where e.deptno = d.deptno
and e.sal >= s.losal
and e.sal <= s.hisal
and e.sal >= (select avg(sal) from emp)
order by e.sal desc, empno;

--4.Self Join
--각 사원의 매니저 이름을 출력.

select worker.employee_id, worker.first_name || ' 의 직속상사는 ' || manager.first_name || ' 입니다' as 직속상사
from employees worker, employees manager
where worker.manager_id = manager.employee_id
order by worker.employee_id;

--5.Outer Join (외부조인)
select e.first_name, d.department_name
from employees e, departments d
where e.department_id = d.department_id;
-- 위의 결과에서 178번 (Kimberely)사원은 부서번호가 null이므로 누락되어 있다.
-- 아무 부서에도 배치되지 않은 178번 사원의 정보까지 출력하고 싶다면,
-- 아래처럼 outer join을 사용한다.
-- left outer join (왼쪽 외부 조인)
select e.first_name, d.department_name
from employees e, departments d
where e.department_id = d.department_id(+);

-- right outer join (오른쪽 외부 조인)
-- 아무사원도 배치하지 않은 부서까지 보려고 하면, 아래와 같이 한다.
select e.first_name, d.department_name
from employees e, departments d
where e.department_id(+) = d.department_id;

--select e.first_name, d.department_name
--from employees e, departments d
--where e.department_id(+) = d.department_id(+); -- 에러 ORA-01468: a predicate may reference only one outer-joined table

-- ANSI(미국 국립 표준 협회) Join : 미국 국립 표준 협회에서 제정한 다른 DBMS와의 호환성을 위해 만든 것.
-- 1. ANSI Cross Join
select count(*) from employees cross join departments;

-- 2. ANSI Inner Join : Equi Join과 동일
-- join 조건을 where 절이 아니라 on 절에 기술한다.
select e.first_name, d.department_name
from employees e inner join departments d
on e.department_id = d.department_id; -- 106명 사원만 조회

select e.first_name, d.department_name
from employees e join departments d
on e.department_id = d.department_id; -- inner 생략 가능

select e.first_name, d.department_name, l.location_id
from employees e inner join departments d
on e.department_id = d.department_id
inner join locations l
on d.location_id = l.location_id;

-- 이름이 n으로 끝나는 사원의 이름, 부서이름 출력
select e.first_name, d.department_name
from employees e inner join departments d
on e.department_id = d.department_id
where e.first_name like '%n';

-- using 절을 이용하여 join 조건에 사용하는 기준열을 지정하기.
-- 조인되는 컬럼명이 동일해야 하고,
-- using절에는 테이블의 별칭을 사용하지 못하고, 괄호도 생략하지 않는다.
select e.first_name, d.department_name, department_id
from employees e inner join departments d
using(department_id);

--select e.first_name, d.department_name, department_id
--from employees e inner join departments d
--using(e.department_id); -- 에러 : ORA-01748: only simple column names allowed here

--select e.first_name, d.department_name, department_id
--from employees e inner join departments d
--using department_id; -- 에러 ORA-00906: missing left parenthesis

-- Natural Join
-- 조인되는 컬럼명이 동일할 때,
-- DBMS가 알아서 테이블을 살펴보고, 동일한 컬럼으로 Inner Join 진행
-- 단, 동일한 컬렴명이 2개 이상이 나오면 and 조건으로 Inner Join 진행
select e.employee_id, e.first_name, d.department_name
from employees e natural join departments d; -- 32명만 조회

-- 3. ANSI Outer Join 
-- left outer join (왼쪽 외부 조인)
select e.first_name, d.department_name
from employees e left outer join departments d
on e.department_id = d.department_id;

-- right outer join (오른쪽 외부 조인)
select e.first_name, d.department_name
from employees e right outer join departments d
on e.department_id = d.department_id;

-- 양쪽 테이블의 누락된 정보를 모두 조회
-- full outer join
select e.first_name, d.department_name
from employees e full outer join departments d
on e.department_id = d.department_id;