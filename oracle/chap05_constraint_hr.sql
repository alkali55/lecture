-- 제약조건 (CONSTRAINTS)

drop table emp01;
drop table copyemp;

create table emp01 (
    empno number(4),
    ename varchar2(10)
);

insert into emp01 values(1000, '홍길동');
insert into emp01 values(null, '이대호');
insert into emp01 values(1000, '홍길동');

select * from emp01;

drop table emp01;

-- (1) not null
create table emp01 (
    empno number(4) not null,
    ename varchar2(10) not null
);

insert into emp01 values(1000, '홍길동');
insert into emp01 values(null, '이대호'); -- SQL 오류: ORA-01400: cannot insert NULL into ("HR"."EMP01"."EMPNO")
insert into emp01 values(1001, null); -- SQL 오류: ORA-01400: cannot insert NULL into ("HR"."EMP01"."ENAME")

-- 제약조건 확인
select owner, constraint_name, constraint_type, table_name
from user_constraints
where table_name = 'EMP01';

drop table emp01;

create table emp01 (
    empno number(4) constraint emp01_empno_nn not null,
    ename varchar2(10) not null
);

-- (2) unique
drop table emp01;
create table emp01 (
     empno number(4) not null,
     ename varchar2(10) unique
);

insert into emp01 values(1000, '홍길동');
insert into emp01 values(1001, '홍길동'); -- ORA-00001: unique constraint (HR.SYS_C007018) violated
insert into emp01 values(1002, '이대호');
insert into emp01 values(1003, null);
insert into emp01 values(1004, null); -- null은 unique 제약조건의 중복확인에서 제외됨.

select * from emp01;

-- (3) primary key : not null 이고 unique
drop table emp01;
create table emp01(
    empno number(4) primary key,
    ename varchar2(10) not null
);

insert into emp01 values(null, '홍길동'); -- SQL 오류: ORA-01400: cannot insert NULL into ("HR"."EMP01"."EMPNO")
insert into emp01 values(1000, '홍길동');
insert into emp01 values(1000, '이대호'); -- ORA-00001: unique constraint (HR.SYS_C007020) violated

insert into emp01 values(1001, '이대호');
select * from emp01;

-- (4) foreign key
-- FK 제약조건을 위반하는 경우
-- 1) 부서번호가 부서테이블에 존재하지 않는 값을 넣으려고 할 때
insert into employees values(207, '길동', '홍', 'KILDONG', NULL, SYSDATE, 'IT_PROG', 5000, NULL, 115, 60);

SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = 207;

insert into employees values(208, '길동', '홍', 'KILDONG2', NULL, SYSDATE, 'IT_PROG', 5000, NULL, 115, 470);
-- 위 문장은 에러 : ORA-02291: integrity constraint (HR.EMP_DEPT_FK) violated - parent key not found

insert into employees values(208, '대호', '이', 'KILDONG2', NULL, SYSDATE,'IT_PROG', 5000, NULL, 115, 60);

SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = 208;

-- 2) 사원이 배치된 부서를 삭제하려고 할 때
delete from departments where department_id = 60; -- ORA-02292: integrity constraint (HR.EMP_DEPT_FK) violated - child record found

-- 60번 부서의 사원들을 다른 부서로 이동
select * from employees where department_id = 60;
update employees set department_id = 210 where department_id = 60;
select * from employees where department_id = 210;
delete from departments where department_id = 60; -- ORA-02292: integrity constraint (HR.JHIST_DEPT_FK) violated - child record found

rollback;
select * from employees;
drop table emp01;
-- 사원, 부서 테이블 만들어서 살펴보자.
-- 부모테이블인 부서(dept01)테이블을 먼저 생성한다.
create table dept01(
    deptno number(2) primary key,
    dname varchar2(10) unique
);

-- 자식 테이블인 사원(emp01)테이블을 생성한다.
create table emp01(
    empno number(4) primary key,
    ename varchar2(10) not null,
    deptno number(2) references dept01(deptno)
);

-- job history 테이블을 생성해보자.
create table jhistory01 (
    empno number(4),
    start_date date not null,
    end_date date not null,
    deptno number(2),
    constraint jhistory01_combo_pk primary key(empno, start_date),
    constraint jhistory01_deptno_fk foreign key(deptno) references dept01(deptno)
);

insert into dept01 values (10, '총무부');
insert into dept01 values (20, 'IT');
insert into dept01 values (30, '인사부');

select * from dept01;

insert into emp01 values(1000, '홍길동', 10);
insert into emp01 values(1001, '이대호', 20);

select * from emp01;

insert into jhistory01 values(1000, '21-10-01', '24-10-31', 10);
insert into jhistory01 values(1001, '20-10-01', '21-10-31', 20);

select * from jhistory01;

-- 10번 부서 삭제
delete from dept01 where deptno = 10; -- ORA-02292: integrity constraint (HR.SYS_C007025) violated - child record found
delete from dept01 where deptno = 30; -- 30번 부서는 child record가 없기 때문에 삭제 가능
insert into dept01 values (30, '인사부');

-- 1000번 사원의 부서를 10 -> 30으로 이동
update emp01 set deptno = 30 where empno = 1000;

delete from dept01 where deptno = 10; -- ORA-02292: integrity constraint (HR.JHISTORY01_DEPTNO_FK) violated - child record found

delete from jhistory01 where deptno = 10; -- child record를 제거

delete from dept01 where deptno = 10;

-- 테이블 삭제
drop table dept01; -- ORA-02449: unique/primary keys in table referenced by foreign keys
drop table emp01;

drop table dept01; -- ORA-02449: unique/primary keys in table referenced by foreign keys
drop table jhistory01;

drop table dept01;

-- (5) check
create table emp01 (
    empno number(4) primary key,
    ename varchar2(10) not null,
    gender char(1) check (gender in ('M', 'F'))
);

insert into emp01 values(1000, '홍길동', 'm'); -- ORA-02290: check constraint (HR.SYS_C007031) violated
insert into emp01 values(1000, '홍길동', 'M');
insert into emp01 values(1001, '홍길순', 'F');
insert into emp01 values(1002, '홍길서', 'U'); -- ORA-02290: check constraint (HR.SYS_C007031) violated
select * from emp01;

drop table emp01;

-- 나이가 14세 ~ 150세
create table member(
    userid varchar2(10) primary key,
    passwd varchar2(20) not null,
    age number(3) check (age between 14 and 150)
);

insert into member values('hong', '1234', 10); -- ORA-02290: check constraint (HR.SYS_C007034) violated
insert into member values('hong', '1234', 20);
insert into member values('choi', '1234', 200); -- ORA-02290: check constraint (HR.SYS_C007034) violated

select * from member;

-- (6) default
create table dept01 (
    deptno number(3) primary key,
    dname varchar2(10),
    loc varchar2(16) default '서울'
);

insert into dept01 (deptno, dname) values (10, '개발부');
insert into dept01 values(20, '총무부', null); -- null 이 들어간다. (기본값 '서울'이 들어가지 않는다)
insert into dept01 values(30, '재정부', '부산');

select * from dept01;

-- 복합키 (complex primary key)
drop table member;

create table member (
    email varchar2(40),
    passwd varchar2(15) constraint member_passwd_nn not null,
    member_name nvarchar2(12) constraint member_name_nn not null,
    mobile char(13),
    addr nvarchar2(50),
    constraint member_combo_pk primary key (email, mobile)
);

-- 회원가입
insert into member values('a@abc.com', '1234', '홍길동', '010-1234-5678', null);
insert into member values('a@abc.com', '1234', '홍길순', '010-3333-1111', null);
insert into member values('a@abc.com', '1234', '홍길서', '010-1234-5678', null); -- ORA-00001: unique constraint (HR.MEMBER_COMBO_PK) violated

select * from member;

-- 로그인 처리
select * from member
where email = 'a@abc.com' and mobile = '010-1234-5678'
and passwd = '1234'; -- 홍길동 로그인 성공

select * from member
where email = 'a@abc.com' and mobile = '010-1234-5678'
and passwd = '1235'; -- 로그인 실패


-- 제약조건의 기술 방식
-- 1) 컬럼단위 (column-level)
drop table emp01;

create table emp01(
    empno number(4) primary key,
    ename varchar2(10) not null,
    job varchar2(9) unique,
    gender char(1) check (gender in ('M', 'f')),
    hire_date date default sysdate,
    deptno number(3) references dept01(deptno)
);

-- 제약조건 이름 지정
create table emp02 (
        empno number(4) constraint emp02_empno_pk primary key,
    ename varchar2(10) constraint emp02_ename_nn not null,
    job varchar2(9) constraint emp02_job_uq unique,
    gender char(1) constraint emp02_gender_ck check (gender in ('M', 'f')),
    hire_date date default sysdate,
    deptno number(3) constraint emp02_deptno_fk references dept01(deptno)
);
    
    
    
-- 2) 테이블 단위 (table-level)
create table emp03 (
    empno number(4),
    ename varchar2(10) not null, -- not null은 테이블 단위에서 기술 불가능
    job varchar2(9),
    gender char(1),
    hire_date date default sysdate, -- default는 테이블 단위에서 기술 불가능
    deptno number(3),
    primary key(empno),
    unique(job),
    check(gender in ('M', 'F')),
    foreign key(deptno) references dept01(deptno)
);


--제약조건 이름 지정
drop table emp04;

create table emp04 (
    empno number(4),
    ename varchar2(10) constraint emp04_ename_nn not null, -- not null은 테이블 단위에서 기술 불가능
    job varchar2(9),
    gender char(1),
    hire_date date default sysdate, -- default는 테이블 단위에서 기술 불가능
    deptno number(3),
    constraint emp04_empno_pk primary key(empno),
    constraint emp04_job_uq unique(job),
    constraint emp04_gender_ck check(gender in ('M', 'F')),
    constraint emp04_deptno_fk foreign key(deptno) references dept01(deptno)
);


-- 제약 조건 추가
-- gender 컬럼 추가
alter table member
add gender char(3);

desc member;

alter table member
add constraint member_gender_ck check(gender in ('남', '여')); 

select * from member;

update member set addr = '서울특별시 구로구' 
where member_name = '홍길동';

-- 주소 컬럼에 제약조건 : not null
--alter table member
--add constraint member_addr_nn not null; -- ORA-00904: : invalid identifier

alter table member
modify addr not null; -- ORA-02296: cannot enable (HR.) - null values found

update member set addr = '서울특별시 관악구'
where member_name = '홍길순';

alter table member
modify addr not null;

alter table member
modify mobile constraint member_mobile_nn not null;

-- 제약 조건 이름 변경
alter table member
rename constraint member_mobile_nn to member_phone_nn;

-- 제약 조건 제거
alter table member
drop constraint member_phone_nn;

-- 제약조건 활성, 비활성화
alter table member
enable constraint member_name_nn;

alter table member
disable constraint member_name_nn;

insert into member values('a@naver.com', '1234', null, '010-0000-1212', '서울특별시 양천구', '남');

select * from member;

alter table member
enable constraint member_name_nn; -- ORA-02293: cannot validate (HR.MEMBER_NAME_NN) - check constraint violated

update member set member_name = '홍길남'
where email = 'a@naver.com' and mobile = '010-0000-1212';

alter table member
enable constraint member_name_nn;
-- 제약조건을 비활성화하면 제약조건을 위반한 컬럼의 값도 저장될 수 있다.
-- 하지만, 제약조건을 다시 활성화하면 제약조건을 위반한 컬럼의 값 때문에
-- 다시 활성화가 되지 않는다.  이때는 제약조건을 위반한 컬럼의 값을 제약조건에 맞게 수정한 뒤
-- 활성화를 해야 한다.


-- 제약조건과 cascade옵션

drop table member;

-- 회원 테이블 생성

create table member (
    userid varchar2(12),
    pwd varchar2(15) constraint member_pwd_nn not null,
    constraint member_userid_pk primary key(userid)
);

-- 회원 가입
insert into member values('hong', '1234');
insert into member values('lee', '1234');


-- 게시판 테이블 생성
create table board(
    bno number(10),
    writer varchar2(12),
    title varchar2(40),
    constraint board_bno_pk primary key(bno),
    constraint board_writer_fk foreign key(writer) references member(userid) on delete cascade
);

-- 글작성
insert into board values(1, 'hong', '아싸1빠다');
insert into board values(2, 'lee', '1빠 놓쳤네');
insert into board values(3, 'hong', '점심모목지');
select * from board;

-- 회원탈퇴
delete from member
where userid = 'hong';

--on delete cascade 옵션 때문에 'hong'이 쓴 글이 모두 삭제
select * from member;

drop table board;
drop table member;


--회원 테이블 생성
create table member (
    userid varchar2(12),
    pwd varchar2(15) constraint member_pwd_nn not null,
    constraint member_userid_pk primary key(userid)
);

-- 회원 가입
insert into member values('hong', '1234');
insert into member values('lee', '1234');

-- 게시판 테이블 생성
create table board(
    bno number(10),
    writer varchar2(12),
    title varchar2(40),
    constraint board_bno_pk primary key(bno),
    constraint board_writer_fk foreign key(writer) references member(userid) on delete set null
);

-- 글작성
insert into board values(1, 'hong', '아싸1빠다');
insert into board values(2, 'lee', '1빠 놓쳤네');
insert into board values(3, 'hong', '점심모목지');
select * from board;

-- 회원탈퇴
delete from member
where userid = 'hong';