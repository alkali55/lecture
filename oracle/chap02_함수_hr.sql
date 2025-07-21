-- 함수
select 5 + 3 from employees;
select 5 + 3 from dual;

-- (1) 문자 함수
-- 1) lower()
select 'DataBase' , lower('DataBase') from dual;

-- 이름이 lex인 사원의 모든 정보를 조회
select * from employees where first_name = 'lex';
select * from employees where lower(first_name) = 'lex';

-- 2) upper()
select 'DataBase' , upper('DataBase') from dual;
select * from employees where upper(last_name)  = 'KING';

-- 3) initcap()
select 'database', initcap('database') from dual;
select * from employees where first_name = initcap('lex');

-- 4) concat()
select concat('data', 'base') from dual;
--select concat('data', 'base', 'oracle') from dual; -- ORA-00909: invalid number of arguments -- 문자열 2개만 가능
select concat('data', concat('base', 'oracle')) from dual;

select 'data' || 'base' || 'oracle'  from dual;

-- 모든 사원의 이름과 성을 합하여 성, 이름으로 출력하고, 컬럼명을 full_name으로 하세요.
select last_name || ', ' || first_name full_name from employees;

--5) length()
select length('database') from dual;
select length('데이터베이스') from dual;

select lengthb('database') from dual;
select lengthb('데이터베이스') from dual;

-- 이름이 6글자 이하인 사원들의 이름을 소문자로 출력하는 쿼리문을 작성하세요.
select lower(first_name) from employees
where length(first_name) <= 6;

-- 6) instr()
-- instr(대상문자열, 찾을문자, [시작위치], [n번째 찾기])
select instr('database', 'b') from dual; -- 5
select instr('database', 'a') from dual; -- 2
select instr('database', 'c') from dual; -- 찾는 문자가 없으면 0을 반환
select instr('database', 'a', 3) from dual; -- 4
select instr('database', 'a', 3, 1) from dual; -- 4
select instr('database', 'a', 3, 2) from dual; -- 6

-- 7) substr()
-- substr(대상문자열, 시작위치, 추출할갯수)
select substr('database', 1) from dual;
select substr('database', 1, 3) from dual;
select substr('database', -4, 3) from dual;

-- 입사연도가 2005년인 사원들의 모든 정보를 출력
select * from employees
where substr(hire_date, 1, 2) = 05;

-- 8) trim()
select trim('a' from 'aaaDataBaseaa') from dual; -- DataBase
select trim(' ' from '        Data Base   ') from dual; -- Data Base
select trim('     database ') from dual;

-- 8-1) ltrim()
select '00011000', ltrim('00011000', '0') from dual;

-- 8-2) rtrim()
select '00011000', rtrim('00011000', '0') from dual;

-- 8-3) trim(삭제옵션 삭제할문자 대상문자열)
-- 삭제옵션: leading(왼쪽 문자 삭제), trailing(오른쪽 문자 삭제), both(왼쪽, 오른쪽 모두)
select '[' || trim('_' from '__database__') || ']' from dual;
select '[' || trim(leading '_' from '__database__') || ']' from dual;
select '[' || trim(trailing '_' from '__database__') || ']' from dual;
select '[' || trim(both '_' from '__database__') || ']' from dual;

-- 9) replace
-- replace(대상문자열, 교체할문자, [대체할문자])
select '010-5555-1234' , replace('010-5555-1234', '-', ' ') from dual;
select '010-5555-1234' , replace('010-5555-1234', '-') from dual;

-- 10) lpad, rpad
select lpad('DataBase', 10, '$') from dual;
select lpad('DataBase', 10) from dual;

select rpad('DataBase', 10, '@') from dual;

--
SELECT REGEXP_COUNT('DATABASE' , 'A') FROM DUAL;
SELECT LEVEL FROM DUAL
CONNECT BY LEVEL <= 5;

SELECT LEVEL, INSTR('DATABASE', 'A', 1, LEVEL) FROM DUAL
CONNECT BY LEVEL <= REGEXP_COUNT('DATABASE' , 'A');

-- (2) 숫자 함수
-- 1) abs()
select abs(-15) from dual;
select abs(15) from dual;

-- 2) floor()
select floor(3.141592) from dual; --3

-- 2-1) ceil()
select ceil(3.141592) from dual; --4

-- 3) round()
select round(3.641592) from dual;
select round(3.141592, 2) from dual;
select round(3.147592, 2) from dual;
select round(3.141592, 4) from dual;
select round(314.1592, -2) from dual;

-- 4) trunc()
select trunc(3.141592, 2) from dual;
select trunc(3.141592, 4) from dual;
select trunc(314.1592, -2) from dual;
select trunc(314.1592) from dual;

-- 5) mod()
select mod(34, 2) from dual;
select mod(34, 3) from dual;

-- 6) sign()
select sign(10) from dual;
select sign(-10) from dual;
select sign(0) from dual;

-- 7) power()
select power(2, 3) from dual; -- 2^3 | 2**3

-- 8) sqrt()
select sqrt(10) from dual;
select sqrt(16) from dual;
select power(16, 0.5) from dual;

-- 문제) 사원들의 연봉(커미션 포함)을 구하려고 한다
-- 연봉 = 월급 * 12 * (1 + 커미션)
-- 연봉을 구해 소수점 이하 2자리까지만 출력
-- 연봉 컬럼의 컬럼명은 annual salary라고 출력하세요
-- 사번, 이름, 연봉 컬럼 출력

select employee_id, first_name, round(salary * 12 * concat(1, commission_pct), 2) "anuual salary" from employees;

-- (3) 날짜 함수
-- 1) 현재 날짜를 반환하는 sysdate
select sysdate from dual; -- 25/02/13
select sysdate + 1 내일 from dual;

-- 사원들의 입사일로부터 현재까지 입사한지 몇일 지났는지 구해보자.
select first_name, (sysdate - hire_date) as 입사일로부터며칠 from employees;

-- 2) months_between() 두 날짜 사이 간격 (개월수)을 계산하는 함수
select first_name, hire_date, floor(months_between(sysdate, hire_date)) as 근무개월수 from employees;

-- 3) add_months() : 개월 수를 더하는 함수
select first_name, hire_date, add_months(hire_date, 3) from employees;

-- 4) next_day() : 해당 요일에 가장 가까운 날짜를 반환하는 함수
select sysdate, next_day(sysdate, '금요일') from dual;

-- 5) last_day() : 해당 월의 마지막 날짜를 반환
select sysdate, last_day(sysdate) from dual;

-- 6) round() : 특정 기준으로 반올림
select sysdate, round(sysdate, 'month') from dual;

-- 7) trunc() : 특정 기준으로 버림
select sysdate, trunc(sysdate, 'month') from dual;



-- (4) 변환 함수 : 문자, 숫자, 날짜 값을 서로 다른 타입으로 변환
-- 1) to_char() : 문자형으로 변환
-- 날짜 -> 문자
--select 1234 from dual; -- 숫자는 오른쪽으로 정렬
--select '1234' from dual; -- 문자는 왼쪽으로 정렬
select sysdate, to_char(sysdate, 'yyyy-mm-dd') from dual;

select sysdate, to_char(sysdate, 'yyyy-mm-dd dy am HH:mi:ss') from dual;
select sysdate, to_char(sysdate, 'yyyy-mm-dd dy am HH12:mi:ss') from dual;
select sysdate, to_char(sysdate, 'yyyy-mm-dd dy am HH24:mi:ss') from dual;

-- 숫자 -> 문자
-- 9: 자릿수를 나타내고, 자릿수가 맞지 않으면 채우지 않는다.
select to_char(123456, '99999999') from dual;

-- 0: 자릿수를 나타내고, 자릿수가 맞지 않으면 0으로 채운다.
select to_char(123456, '00000000') from dual;

-- L (로케일, 현지 통화)
select first_name, salary, to_char(salary, 'L999,999') from employees;
select first_name, salary, to_char(salary, '$999,999') from employees;
select first_name, salary, to_char(salary, 'L000,000,000') from employees;

--
select sysdate, 
    to_char(sysdate, 'MM') as MM, 
    to_char(sysdate, 'MON', 'nls_date_language=korean') as mon_kor,
    to_char(sysdate, 'MONTH', 'nls_date_language=english') as mon_eng,
    to_char(sysdate, 'MON', 'nls_date_language=japanese') as mon_jap
    from dual;

-- 2) to_date() : 날짜형으로 변환
select first_name, hire_date from employees
where hire_date = '06/01/03';

desc employees;

select first_name, hire_date from employees where hire_date = 20060103;
-- 위의 쿼리문은 에러! ORA-00932: inconsistent datatypes: expected DATE got NUMBER

select first_name, hire_date from employees 
where hire_date = to_date(20060103, 'yyyymmdd');

-- 문자 -> 날짜
select to_date('2010-07-14', 'yyyy-mm-dd') from dual;
select to_date('2010-07-14') from dual;

-- 3) to_number() : 숫자 형으로 변환
select '10000' + '20000' from dual; -- 30000
--select '10,000' + '20,000' from dual; 오류 ORA-01722: invalid number

select to_number('10,000', '999,999') + to_number('20,000', '999,999') from dual;


--(5) 기타 함수
-- 1) nvl()
-- 문제) 사원들의 연봉(커미션 포함)을 구하려고 한다
-- 연봉 = 월급 * 12 * (1 + 커미션)
-- 연봉을 구해 소수점 이하 2자리까지만 출력
-- 연봉 컬럼의 컬럼명은 annual salary라고 출력하세요
-- 사번, 이름, 연봉 컬럼 출력

select employee_id, first_name, round(salary * 12 * (1 + nvl(commission_pct, 0)), 2) "anuual salary" from employees;

-- 1-1) nvl2()
select employee_id, salary, nvl2(commission_pct, commission_pct, 0) from employees;

-- 2) decode()
select first_name, department_id, decode(department_id, 
    90, 'Executive',
    60, 'IT',
    100, 'Finance',
    'default'
) as "부서명" from employees;

-- 3) case() 함수
select first_name, department_id,
case when department_id = 90 then 'Executive'
     when department_id = 60 then 'IT'
     when department_id = 100 then 'Finance'
     else 'default'
end
as "부서명" from employees;


-- 2. 그룹함수
-- 1) sum() : 합계를 구하는 함수
select sum(salary) from employees;

-- 2) avg() : 평균을 구하는 함수
select avg(salary) from employees;
select to_char(round(avg(salary), 2), '$999,999.99') from employees;

-- 3) max() : 최대값
select max(salary) from employees;

-- 4) min() : 최소값
select min(salary) from employees;

-- 5) count() : 행의 갯수를 세어주는 함수
-- ****** count 함수는 null인 데이터는 세지 않는다!
select count(*) as "전체 직원수" from employees; -- 107
select count(commission_pct) from employees; -- 35
select count(department_id) from employees; -- 106

-- 6) stddev() : 표준편차
select stddev(salary) from employees;

-- 7) variance() : 분산
select variance(salary) from employees;
select sqrt(variance(salary)) from employees;

-- group by 절

-- 소속 부서별 급여 총액과 급여 평균
select department_id, sum (salary), avg(salary)
from employees
group by department_id;
--order by avg(salary) desc;

-- 직무별 급여 총액과 급여 평균
select job_id, sum(salary), avg(salary)
from employees
group by job_id;

select job_id, sum(salary) 합계, avg(salary)
from employees
group by job_id
order by 합계;

-- 급여평균이 5000이상인 경우에 소속 부서별 급여 총액과 급여 평균
select department_id, sum(salary), avg(salary)
from employees
where avg(salary) >= 5000
group by department_id; -- 에러: ORA-00934: group function is not allowed here
-- 그룹화를 시킨 컬럼은 where절로 조건을 제한하지 못한다.

-- having 절 : 그룹화를 시킨 컬럼에 조건을 부여할 때 쓴다.
select department_id, sum(salary), avg(salary)
from employees
having avg(salary) >= 5000
group by department_id;

-- 부서번호가 50번과 100번사이에 있는 부서만 모아서
select department_id, sum(salary), avg(salary)
from employees
where department_id between 50 and 100
group by department_id;

-- 직무별 급여 최대값과 급여최소값을 구하되,
-- 최대급여가 7000이상인 직무만 출력하세요.

select job_id, max(salary), min(salary) from employees
group by job_id
having max(salary) >= 7000;

select job_id, count(job_id) as cnt_job_id, department_id, sum(salary), avg(salary)
from employees
where department_id between 50 and 100
group by job_id, department_id
having avg(salary) >= 7000
order by cnt_job_id;

select department_id, job_id, count(job_id) as cnt_job_id, sum(salary), avg(salary)
from employees
group by job_id, department_id -- 순서 바뀌어도 결과는 똑같은 듯(?)
order by cnt_job_id;

select department_id, job_id from employees
order by job_id;