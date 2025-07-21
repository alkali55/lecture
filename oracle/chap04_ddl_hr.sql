-- DDL (DATA DEFINITION LANGUAGE)
-- CREATE TABLE

-- 서브쿼리를 이용한 테이블 생성 (제약조건은 복사되지 않음)
CREATE TABLE copyEMP
as (select * from employees);


CREATE TABLE COPYEMP2
AS SELECT * FROM EMPLOYEES
WHERE 1 = 0;

INSERT INTO COPYEMP2 VALUES(100, '길동', '홍', 'HONG', '010.1234.5678', '25/02/18', 'IT', 5000, 0.4, NULL, 60);
SELECT * FROM COPYEMP2;


CREATE TABLE COPYEMP3
AS SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, HIRE_DATE FROM EMPLOYEES
WHERE DEPARTMENT_ID = 60;

INSERT INTO COPYEMP3 VALUES(108, '길동', 5000, '25/02/18');
SELECT * FROM COPYEMP3;

-- 테이블 삭제
DROP TABLE COPYEMP;
DROP TABLE COPYEMP2;
DROP TABLE COPYEMP3;

--MEMBER01 테이블 생성
CREATE TABLE MEMBER01(
    USERID VARCHAR2(12),
    PASSWD VARCHAR2(16),
    USERNAME VARCHAR2(12),
    MOBILE VARCHAR2(13),
    BIRTHDAY DATE,
    GENDER CHAR(1)
);

INSERT INTO MEMBER01 VALUES('hong1234', '1234', '홍길동', '010-1234-5678', '1998-01-01', 'M');
INSERT INTO MEMBER01 VALUES('lee1234', '1234', '이대호', '010-5555-1122', '1998-01-01', 'M');

-- SQL 오류: ORA-00947: not enough values
--INSERT INTO MEMBER01 VALUES('choi1234', '1234', '최수현', '010-5555-3344', '2000-01-01');

-- SQL 오류: ORA-00913: too many values
--INSERT INTO MEMBER01 VALUES('choi1234', '1234', '최수현', '010-5555-3344', '2000-01-01', 'M', 'U');

-- 원하는 컬럼에만 데이터를 넣기
INSERT INTO MEMBER01(USERID, PASSWD, USERNAME) VALUES('choi1234', '1234', '최수현');

-- SQL 오류: ORA-12899: value too large for column "HR"."MEMBER01"."USERNAME" (actual: 21, maximum: 12)
--INSERT INTO MEMBER01(USERID, PASSWD, USERNAME) VALUES('park1234', '1234', '김수한무거북이');

SELECT * FROM MEMBER01;

-- (2) alter table : 테이블 구조 수정
create table emp01 (
    empno number(4),
    ename varchar2(10),
    sal number(6),
    hiredate date
);

-- 1) add 컬럼명 데이터타입 : 새로운 컬럼을 추가
desc emp01;
alter table emp01
add (job varchar2(10));

-- member01테이블에 hobby라는 컬럼을 가변문자열(크기50) 저장할 수 있도록 추가 하세요.
alter table member01
add hobby varchar(50);
desc member01;

-- 2) modify : 기존 컬럼 수정
-- 데이터가 없고, ename컬럼의 사이즈를 10 -> 6
alter table emp01
modify ename varchar2(6);

-- member01테이블 birthday 컬럼의 데이터 타입을 date -> varchar2(15)
--ORA-01439: column to be modified must be empty to change datatype
--alter table member01
--modify birthday varchar2(15);

-- member01테이블 userid 컬럼의 사이즈를 varchar2(12) -> varchar2(6)
-- userid 중 최대길이 8바이트
--ORA-01441: cannot decrease column length because some value is too big
--alter table member01
--modify userid varchar2(6);

alter table member01
modify userid varchar2(10); -- 변경가능

select * from member01;

-- userid 컬럼 사이즈는 현재 10 -> 26
alter table member01
modify userid varchar2(26); -- 변경가능

-- 3) drop column : 기존 컬럼 삭제
alter table member01
drop column birthday;

-- 4) rename column 기존이름 to 새로운이름 : 컬럼명 변경
alter table member01
rename column userid to memberid;

desc member01;



-- (3) 테이블 이름 변경
-- rename 기존테이블명 to 새로운 테이블명
-- member01 이라는 테이블 이름을 members 라는 이름으로 변경
rename member01 to members;
desc members;

-- (4) 테이블의 데이터 삭제
-- truncate table 테이블명
truncate table members;

-- (5) 테이블 삭제
-- drop table 테이블명
drop table emp01;
drop table members;