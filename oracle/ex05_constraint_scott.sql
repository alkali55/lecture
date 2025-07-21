create table member(
    id varchar2(20) constraint member_id_pk primary key,
    password varchar2(40) constraint member_password_nn not null,
    regno varchar2(13) constraint member_regno_uq unique constraint member_regno_nn not null,
    mobile varchar2(13) constraint member_mobile_uq unique,
    address varchar2(100)
);


create table book(
    code number(4) constraint book_code_pk primary key,
    title varchar2(50) constraint book_title_nn not null,
    count number(6),
    price number(10),
    publish varchar2(50)
);

create table bookOrder(
    no varchar2(10) constraint bookOrder_no_pk primary key,
    id varchar2(20) constraint bookOrder_id_fk references member(id) constraint bookOrder_id_nn not null,
    code number(4) constraint bookOrder_code_fk references book(code) constraint bookOrder_code_nn not null,
    count number(6),
    orderDate date
);
