--1. emp01 테이블을 제거한 후 다음과 같은 구조로 emp01테이블을 생성하세요
-- empno 숫자 4자리
-- ename 가변길이문자(10)
-- job 가변길이문자(9)
-- mgr 숫자 4자리
-- hiredate 날짜
-- sal 숫자 전체 7자리 소숫점 둘째 자리 
-- comm 숫자 전체 7자리 소숫점 둘째 자리 
-- deptno 숫자 2자리

CREATE TABLE EMP01 (
    EMPNO NUMBER(4),
    ENAME VARCHAR2(10),
    JOB VARCHAR2(9),
    MGR NUMBER(4),
    HIREDATE DATE,
    SAL NUMBER(7, 2),
    COMM NUMBER(7, 2),
    DEPTNO NUMBER(2)
);

--2. emp01테이블에 다음과 같은 데이터를 추가하세요
--
--- 7369 smith clerk 7839 80/12/17 800 null 20
--
INSERT INTO EMP01 VALUES(7369, 'smith', 'clerk', 7839, '80/12/17', 800, null, 20);

--- 7499 allen salseman 7369 87/12/20 1600 300 30
--
INSERT INTO EMP01 VALUES(7499, 'allen', 'salseman', 7369, '87/12/20', 1600, 300, 30);
--- 7839 king president null null 5000 null null
--
INSERT INTO EMP01 VALUES(7839, 'king', 'president', null, null, 5000, null, null);

--3. emp01테이블의 모든 사원의 급여를 10% 인상하세요
--
UPDATE EMP01 SET SAL = SAL * 1.1;
--4. emp01 테이블에서 king의 입사일을 오늘 날짜로 수정하세요
--
UPDATE EMP01 SET HIREDATE = SYSDATE
WHERE ENAME = 'king';
--5. emp01 테이블에서 1985년 이후에 입사한 모든 직원을 삭제하세요
--
DELETE FROM EMP01
WHERE HIREDATE > '85/12/31';

--6. emp01테이블에서 커미션을 받지 못하는 모든 직원을 삭제하세요.
DELETE FROM EMP01
WHERE COMM IS NULL;

SELECT * FROM EMP01;