-- 쿼리문 저장

-- 1. friends 테이블 생성
-- friendNo (pk), 숫자 (4)
-- friendName 문자열(15), nullable = N
-- mobile     문자열(13) unique
-- addr       문자열(50)

create table friends (
    friendNo number(4) primary key,
    friendName varchar2(15) not null,
    mobile varchar2(13) unique,
    addr varchar2(50)
);

-- 친구 저장
insert into friends values(1, '홍길동', '010-1111-2222', '서울시 구로구');

-- 전체 친구 조회
select * from friends;

commit;

-- 다음 pk 값
select max(friendNo) from friends;

-- 전화번호 중복 체크
select count(*) from friends where mobile = '010-1111-2222';

-- 이름으로 검색
select * from friends where friendname like '%대%';

update friends set friendname = '홍길남' where mobile = '010-1111-3333';
rollback;