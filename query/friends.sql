-- CREATE TABLE `jis`.`friends` (
--   `friendNo` INT NOT NULL AUTO_INCREMENT,
--   `friendName` VARCHAR(45) NOT NULL,
--   `mobile` VARCHAR(13) NULL,
--   `addr` VARCHAR(100) NULL,
--   PRIMARY KEY (`friendNo`),
--   UNIQUE INDEX `mobile_UNIQUE` (`mobile` ASC) VISIBLE);

-- 친구 저장
use jis;
insert into friends(friendName, mobile, addr)
values('홍길동', '010-1111-2222', '서울시 구로구');

-- 전체 친구 조회
select * from friends;

-- 친구 저장

-- insert into friends(friendName, mobile, addr) values(?, ?, ?);

-- 전화번호 중복체크
select mobile from friends where mobile = '010-1111-2222';

-- 친구 이름으로 검색
select * from friends where friendName like '%찬%';