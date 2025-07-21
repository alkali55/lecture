select * from member;

insert into member values('kim', '1234');
commit;

insert into member values('choi', '1234');
savepoint afterinsertchoi;
update member set pwd = '0987' where userid = 'choi';
savepoint afterupdatechoi;
insert into board values(4, 'kim', 'hello');
savepoint afterinsertkim;

rollback to afterinsertchoi;
insert into member values('park', '1234');
update board set title = '안졸려유' where bno = 3;
commit;

insert into board values(4, 'park', '오라클');
rollback;

-- 문제
1) insert문
2) savepoint a
3) delete문
4) savepoint b
5) update문
6) rollback to a;
7) insert문
8) savepoint c
9) delete문
10) commit
-- 위의 sql문을 순서대로 수행했을 때, DB에 영구적으로 반영되는 문장은?
