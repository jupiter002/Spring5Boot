-- member
create table member2 (
  mno       int             auto_increment,
  userid    varchar(18)     unique,
  passwd    varchar(18)     not null,
  name      varchar(10)     not null,
  email     varchar(50)     unique,
  zipcode   char(7)         not null,
  addr1     varchar(100)    not null,
  addr2     varchar(100)    not null,
  phone     char(13)        not null,
  regdate   datetime        default current_timestamp,
  primary key (mno)
);
insert into member2
(userid, passwd, name, email, zipcode, addr1, addr2, phone)
values('abc123','987xyz','jupiter','jupiter@abc123.co.kr','123-456','서울 관악구','asdasda','123-4567-876');

select * from member2;

-- board
create table board2(
    bno         int                 auto_increment,
    title       varchar(100)        not null,
    userid      varchar(18)         not null,
    regdate     datetime            default  current_timestamp,
    thumbs      int                 default 0,
    views       int                 default 0,
    contents    text                not null,
    ipaddr      varchar(15)         not null,
    primary key (bno)
    -- ,foreign key (userid) references member2(userid)
);

alter table board2
    add constraint fkuid
        foreign key (userid) references member2(userid);

insert into board2
    (title, userid, thumbs, views, contents, ipaddr)
        values('남북 70년 약속 깨지나… 北','abc123','33','22','김여정 북한 노동당 중앙위 부부장이 담화에서 남측, 남조선 대신 “대한민국 군부”라고 표현했다.','192.168.202.1');
insert into board2
(title, userid, thumbs, views, contents, ipaddr)
values('앞을 보기 어려울 정도 많은 비','22','33','22','서울 동남·동북·서북권 호우경보 추가 발효','192.168.202.22');
insert into board2
(title, userid, thumbs, views, contents, ipaddr)
values('극한직업’이 된 교직…','11','33','22','지쳐가는 교사들','192.168.202.11');



select count(bno) cnt, ceil(count(userid)/25) pages from board2;

