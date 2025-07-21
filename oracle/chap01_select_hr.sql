--1. SELECT 문 : 데이터 조회
-- SELECT * | [조회할 컬럼명1, 조회할 컬럼명2, ....]
-- FROM 테이블명;

-- COUNTRIES 테이블의 모든 컬럼 조회
select * from countries;

-- 부서테이블의 모든 컬럼 조회
SELECT * FROM DEPARTMENTS;

-- 사원 테이블의 모든 컬럼 조회
SELECT * FROM EMPLOYEES;

SELECT * FROM LOCATIONS;

-- 사원 테이블의 사원 이름만 조회
SELECT FIRST_NAME FROM EMPLOYEES;

-- 사원테이블의 사번과 사원 성만 조회
SELECT EMPLOYEE_ID, LAST_NAME FROM EMPLOYEES;

-- 부서테이블에서 부서명만 조회
SELECT DEPARTMENT_NAME FROM DEPARTMENTS;

-- 지역 (locations) 테이블에서 도로명 주소만 조회
SELECT STREET_ADDRESS FROM LOCATIONS;

-- 사원테이블에서 사원명과 급여를 조회
SELECT FIRST_NAME, SALARY FROM EMPLOYEES;

-- 사원테이블에서 사번, 이름, 입사일을 조회
SELECT EMPLOYEE_ID, FIRST_NAME, HIRE_DATE FROM EMPLOYEES;

--2. 컬럼명에 별칭을 지을 수 있다.
--	1) 컬럼명 as 별칭
select first_name as name from employees;
select employee_id as 사번, first_name as 이름 from employees;

--	2) as 생략 가능
select first_name 이름 from employees;

--	3) 별칭에 공백이 포함되어 있으면 ""(큰따옴표)로 묶는다.
--select first_name 이 름 from employees; -- 에러: FROM keyword not found where expected
select first_name "이 름" from employees;

--3. distinct : 중복된 데이터를 한번씩만 출력하게 한다.
select DISTINCT job_id from employees;

--4. where 절을 사용하여 조건절을 사용할 수 있다.
--	1) 조건식에 사용되는 연산자 (>, <, >=, <=, =, !=(not equal))
--		(not equal : !=, <>, ^= 모두 사용 가능)

-- 사원테이블에서 이름이 adam인 사원의 사번, 이름, 입사일을 조회
--select employee_id, first_name, hire_date 
--from employees 
--where first_name = 'adam'; -- 대소문자 구분

select employee_id, first_name, hire_date from employees 
where first_name = 'Adam';

-- 사원테이블에서 급여가 5000이상인 사원들의 사번, 이름, 급여를 조회

select employee_id, first_name, salary from employees
where salary >= 5000;

-- 지역(locations)테이블에서 지역번호가 1800번 이하인 지역의 모든 컬럼을 조회
select * from locations
where location_id <= 1800;

--select *
--from locations
--where 1800 >= location_id; -- 가능하지만 보편적이진 않음

-- 사원테이블에서 입사일이 2002년 이전에 입사한 사원들의 사번, 이름, 급여, 입사일을 조회
select employee_id, first_name, salary, hire_date from employees
where hire_date < '02/01/01';

--2) 조건연산자를 연결할 때 논리연산자 (and, or, not)를 사용할 수 있다.
-- 사번이 130번 보다 작거나 급여가 5000보다 큰 사원들의 사번, 급여를 조회
select employee_id, salary from employees
where employee_id < 130 or salary > 5000;

-- 급여가 5000이상이고 부서번호가 30번보다 작은 사원들의 사번, 급여, 부서번호를 출력
select employee_id, salary, department_id from employees
where salary >= 5000 and department_id < 30;

-- 부서번호가 100번이 아닌 모든 사원들의 모든 컬럼을 조회
select * from employees where department_id != 100;
select * from employees where department_id <> 100;
select * from employees where department_id ^= 100;

--3) between A and B
-- 급여가 5000이상이고 급여가 7000이하인 사원들의 이름, 급여를 조회
select first_name, salary from employees
where salary >= 5000 and salary <= 7000;

select first_name, salary from employees
where salary between 5000 and 7000;

-- 입사년도가 2003년에서 2005년인 사원들의 모든 정보를 출력
select * from employees
where hire_date between '03/01/01' and '05/12/31';

--4) in (A, B, C) : A 또는 B 또는 C
-- 부서번호가 10번 또는 50번 또는 100번인 사원들의 모든 정보를 출력
select * from employees
where department_id = 10 or department_id = 50 or department_id = 100;

select * from employees
where department_id in (10, 50, 100);

--5) 패턴을 이용하여 검색하는 like 연산자
-- 이름이 s로 시작하는 모든 사원들의 정보를 출력
select * from employees
where first_name like 'S%';

-- 이름이 n으로 끝나는 모든 사원들의 정보를 출력
select * from employees
where first_name like '%n';

-- 직무(job_id)가 AN으로 끝나는 모든 사원들의 정보를 출력
select * from employees
where job_id like '%AN';

-- 이름의 끝에서 두번째 글자가 a인 사원들의 모든 정보를 출력
select * from employees
where first_name like '%a_';

-- 이름의 세번째 글자가 r인 사원들의 모든 정보를 출력
select * from employees
where first_name like '__r%';

-- 직무 (job_id)에 _가 포함된 사원들의 모든 정보를 출력
select * from employees
where job_id like '%\_%' escape '\';

--6) null을 위한 연산자

--select * from employees
--where commission_pct != (null);

select * from employees
where commission_pct is not null;

select * from employees
where commission_pct is null;

--5. 정렬하기 위해서는 order by 절을 사용한다.
-- 기본 오름차순 (asc), 내림차순 (desc)
-- 모든 사원들의 정보를 급여기준 내림차순으로 출력
select * from employees
order by salary desc;

-- 부서번호가 50번인 사원들의 모든 정보를 출력하되,
-- 급여 오름차순으로 정렬하고, 급여가 같을 경우 이름 내림차순으로 정렬하자.
select * from employees
where department_id = 50
order by salary, first_name desc;

--select * from employees
--order by salary, first_name desc
--where department_id = 50; --에러

select salary 월급, first_name from employees
where department_id = 50
order by 월급, first_name desc;

