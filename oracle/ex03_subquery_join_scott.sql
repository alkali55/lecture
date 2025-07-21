--1. smith와 동일한 직급을 가진 사원의 이름과 직급 출력
--
select ename, job from emp
where job = (select job from emp where ename = upper('smith'));

--1-1) smith는 제외하고 출력
--
select ename, job from emp
where job = (select job from emp where ename = upper('smith')) and ename != upper('smith'); -- ename <> upper('smith')

--2. 부서별로 가장 급여를 많이 받는 사원의 정보를 출력
--
--select deptno, max(sal) from emp group by deptno;

select * from emp
where (deptno, sal) in (select deptno, max(sal) from emp group by deptno);

--select * from emp
--where sal in (select max(sal) from emp group by deptno); -- ?

--3. 직급이 salesman인 사원이 받는 급여 중 최소 급여 보다 많이 받는 사원의 이름과 급여를 출력하되, 부서번호가 20번인 사원은 제외하여 출력
--
select sal from emp
where job = upper('salesman'); -- 최소 1250 최대 1600

select ename, sal, deptno from emp
where sal > any (select sal from emp where job = upper('salesman')) and deptno != 20;
--4. 직급이 salesman인 사원이 받는 급여 중 최대 급여 보다 많이 받는 사원의 이름과 급여를 출력하되, 부서번호가 30번인 사원은 제외하여 출력
--
select ename, sal, deptno from emp
where sal > all (select sal from emp where job = upper('salesman')) and deptno != 30;
--5. 전체 사원 중 ALLEN과 같은 직무(JOB)인 사원들의 
--직무, 사원번호, 사원이름, 월급, 부서번호, 부서이름을 출력하세요.
--
select e.job, e.empno, e.ename, e.sal, e.deptno, d.dname
from emp e, dept d
where e.job = (select job from emp where ename = 'ALLEN') and e.deptno = d.deptno;

--6. 전체 사원의 평균 급여보다 높은 급여를 받는 사원들의 
--사원 정보, 부서정보, 급여 등급 정보(SALGRADE 테이블참고)를 출력하세요. 
--단, 출력할 때 급여가 많은 순으로 정렬하되 급여가 같을 경우 사원번호를 기준으로 오름차순 정렬하세요
--
select e.*, d.dname, d.loc, s.grade from emp e, dept d, salgrade s
where e.deptno = d.deptno
and e.sal >= s.losal
and e.sal <= s.hisal
and e.sal >= (select avg(sal) from emp)
order by e.sal desc, empno;

--select avg(sal) from emp;

--7. 10번 부서에 근무하는 사원 중 30번 부서에는 존재하지 않는 직무(JOB)을 가진 사원들의
--사원 번호, 이름, 직무, 부서번호호, 부서이름, LOC를 출력하세요.
--
--select distinct job from emp
--where deptno = 30;

select e.empno, e.ename, e.job, e.deptno, d.dname, d.loc from emp e, dept d
where e.deptno = d.deptno
and e.job not in (select distinct job from emp where deptno = 30)
and e.deptno = 10;

--8. 직무가 salesman인 사람들의 최고 급여보다 높은 급여를 받는 사원들의
--사원번호, 이름, 월급, GRADE(SALGRADE 테이블 참고)를 출력하세요.
--select max(sal) from emp
--where job = upper('salesman');

select e.empno, e.ename, e.sal, s.grade from emp e, salgrade s
where e.sal > (select max(sal) from emp where job = upper('salesman'))
--where e.sal > all (select sal from emp where job = upper('salesman'))
and e.sal >= s.losal
and e.sal <= s.hisal;


-- //////////////////////////////////////////////////////////////////////////////////////
-- //////////////////////////////////////////////////////////////////////////////////////
-- //////////////////////////////////////////////////////////////////////////////////////
-- //////////////////////////////////////////////////////////////////////////////////////

--1. 급여가 3000에서 5000사이인 직원의 이름과 소속 부서명을 출력하세요
select e.ename, d.dname, e.sal
from emp e, dept d
where e.deptno = d.deptno
and e.sal >= 3000
and e.sal <= 5000;

select e.ename, d.dname, e.sal
from emp e inner join dept d
on e.deptno = d.deptno
--using(deptno)
where e.sal >= 3000 and e.sal <= 5000;

select e.ename, d.dname, e.sal
from emp e natural join dept d
where e.sal >= 3000 and e.sal <= 5000;

--2. 직급이 manager인 사원의 이름, 부서명을 출력하세요
select e.ename, d.dname, e.job
from emp e, dept d
where e.deptno = d.deptno
and e.job = upper('manager');

select e.ename, d.dname, e.job
from emp e join dept d
on e.deptno = d.deptno
where e.job = upper('manager');

--3. accounting 부서 소속 사원의 이름과 입사일 출력하세요
select e.ename, e.hiredate, d.dname
from emp e, dept d
where e.deptno = d.deptno
and d.dname = upper('accounting');

select e.ename, e.hiredate, d.dname
from emp e natural join dept d
where d.dname = upper('accounting');

--4. 커미션을 받는 사원의 이름과 그가 속한 부서명을 출력하세요
select e.ename, d.dname
from emp e, dept d
where e.deptno = d.deptno
and e.comm is not null;

select e.ename, e.comm, d.dname
from emp e natural join dept d
where comm is not null
and comm != 0;

--5. 뉴욕에서 근무하는 사원의 이름과 급여를 출력하세요
select e.ename, e.sal, d.loc
from emp e, dept d
where e.deptno = d.deptno
and d.loc = upper('new york');

select e.ename, e.sal, d.loc
from emp e natural join dept d
where d.loc = upper('new york');

--6. 급여가 1200 이하인 사원 이름과 급여와 그가 근무하는 근무지를 출력하세요
select e.ename, e.sal, d.loc
from emp e, dept d
where e.deptno = d.deptno
and e.sal <= 1200;

select e.ename, e.sal, d.loc
from emp e join dept d
using(deptno)
where e.sal <= 1200;

--7. smith와 동일한 근무지에서 근무하는 사원의 이름을 출력하세요
select e.ename, d.loc
from emp e, dept d
where e.deptno = d.deptno
and d.loc = (select d.loc from emp e, dept d where e.deptno = d.deptno and e.ename = upper('smith'))
and e.ename != upper('smith');

select e.ename, d.loc
from emp e natural join dept d
where d.loc = (select d.loc from emp e natural join dept d where e.ename = upper('smith'))
and e.ename <> upper('smith');

--8. 매니저(mgr)가 king인 사원들의 이름과 직급을 출력하세요
select ename, job
from emp
where mgr = (select empno from emp where ename = upper('king'));

select e.ename, e.job, e.mgr, m.ename
from emp e join emp m
on e.mgr = m.empno
where m.ename = upper('king');

--9. 월급이 2000 초과인 사원들의 부서번호, 부서이름, 사원번호, 사원이름, 월급을 출력하세요
select d.deptno, d.dname, e.empno, e.ename, e.sal
from emp e, dept d
where e.deptno = d.deptno
and e.sal > 2000;

select deptno, d.dname, e.empno, e.ename, e.sal
from emp e natural join dept d
where e.sal > 2000;

--10. 각 부서별 평균 급여, 최대급여, 최소급여, 사원수를 출력하되, 부서번호, 부서이름도 같이 출력하세요.
--select avg(e.sal), max(e.sal), min(e.sal), count(*), e.deptno, max(d.dname) 부서이름
--from emp e, dept d
--where e.deptno = d.deptno
--group by e.deptno;

select avg(e.sal), max(e.sal), min(e.sal), count(*), d.deptno, d.dname
from emp e join dept d
on e.deptno = d.deptno
group by d.deptno, d.dname;

--11. 모든 부서 정보와 사원 정보를 부서번호, 사원 이름순으로 정렬하여 출력하세요
select *
from emp e full outer join dept d
on e.deptno = d.deptno
order by d.deptno, e.ename;

select e.*, d.*
from dept d inner join emp e
on e.deptno(+) = d.deptno
order by d.deptno, e.ename;

--12. 모든 부서 정보, 사원 정보, 급여 등급 정보, 각 사원의 매니저의 정보를 
-- 부서번호, 사원 번호 순서로 정렬하여 다음과 같이 출력하세요.
--(부서번호, 부서이름, 사원번호, 사원이름, losal, hisal, grade, 매니저번호, 매니저이름)
--select d.deptno, d.dname, e.empno, e.ename, s.losal, s.hisal, s.grade, e.mgr, m.ename 매니저이름
--from emp e, emp m, dept d, salgrade s
--where e.deptno(+) = d.deptno
--and e.mgr =  m.empno(+) 
--and e.sal >= s.losal
--and e.sal <= s.hisal
--order by e.deptno, e.empno;
--40번 부서 ?

select d.deptno, d.dname, e.empno, e.ename, s.losal, s.hisal, s.grade, e.mgr, m.ename 매니저이름
from emp e, dept d, emp m, salgrade s
where e.deptno(+) = d.deptno
and e.sal >= s.losal(+)
and e.sal <= s.hisal(+)
and e.mgr =  m.empno(+)
order by e.deptno, e.empno;

select d.deptno, d.dname, e.empno, e.ename, s.losal, s.hisal, s.grade, e.mgr, m.ename 매니저이름
from emp e right outer join dept d
on e.deptno = d.deptno
left outer join salgrade s
on e.sal between s.losal and s.hisal
left outer join emp m
on e.mgr = m.empno
order by d.deptno, e.empno;

