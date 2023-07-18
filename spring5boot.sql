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

drop table board2;

insert into board2
(title, userid, thumbs, views, contents, ipaddr)
values('北, 동해상으로 탄도미사일 발사… 한 달 만에 도발 재개(2보)','abc123','33','22','북한이 12일 동해상으로 탄도미사일을 발사했다.

합동참모본부는 이날 오전 10시6분쯤 국방부 출입기자들에게 보낸 휴대전화 문자메시지를 통해 이같이 밝혔다.

북한의 탄도미사일 발사는 지난달 15일 순안 일대에서 단거리탄도미사일(SRBM) 2발을 쏜 이후 약 한 달 만이다.

군 당국은 북한이 이날 쏜 탄도미사일의 비행거리·정점고도 등 정확한 제원을 분석하고 있다.

이에 앞서 북한은 10~11일 이틀간 미군 정찰기의 통상 정찰활동을 겨냥해 3차례 담화문을 내 "격추" 등의 표현을 써가며 강도 높게 비난했다.

북한의 이날 미사일 발사는 무력시위를 통해 한미에 대한 불만을 표출하고 군사적 긴장을 끌어올리기 위한 것으로 보인다.','192.168.202.1');
insert into board2
(title, userid, thumbs, views, contents, ipaddr)
values('전세보다 월세 선호…월 100만원 넘는 오피스텔 월세 거래 2000건 돌파','22','33','22','
올해 상반기 월세 100만원을 웃도는 서울 소형 오피스텔 거래가 처음으로 2000건을 넘어선 것으로 조사됐다. 이른바 ''전세 대란''으로 인해 전세보다는 상대적으로 안전한 월세 선호 현상으로, 고액 월세 계약도 늘어나는 분위기다.

부동산 정보제공 업체 경제만랩이 국토교통부 실거래가 공개시스템을 분석한 결과 지난 1~6월 서울 소형(전용면적 60㎡이하) 오피스텔 월세 거래 1만9169건 중 월세 가격이 100만원 이상 거래는 2032건으로 나타났다.

이는 국토부가 관련 통계를 집계하기 시작한 2011년(상반기 기준) 이후 가장 많은 거래량이다.

월세 100만원 이상 서울 소형 오피스텔 거래는 2011년 상반기 47건에 불과했지만, 2014년 113건으로 100건을 넘더니 지난해 처음으로 1000건을 넘어 상승세를 보였다.

소형 오피스텔 월세 거래 중 월세 100만원 이상 거래가 차지하는 비중은 2020년 상반기 3.5%, 2021년 4.2%, 2022년 5.8%로 소폭 상승했지만, 올해에는 10.6%로 치솟아 통계 작성 이래 가장 높은 것으로 확인됐다.

서울 25개 자치구 중에서는 송파구가 313건으로 가장 많았다. 이어 영등포구 304건, 강남구 272건, 서초구 173건, 강서구 148건, 마포구 118건, 동대문구 117건 등으로 확인됐다.

올해 상반기 월세 가격이 가장 높은 소형 오피스텔은 서울 영등포구 신길동에 위치한 ''클래시안 아이비'' 전용면적 41.05㎡로 지난 4월5일 전세보증금 1000만원, 월세 350만원(4층)에 계약이 이뤄졌다.

이어 서울 영등포구 여의도동 ''시그니티 여의도'' 전용면적 45.23㎡은 지난달 9일 전세보증금 7000만원, 월세 300만원(7층)에 월세 계약됐다. 영등포구 당산동 ''한강 더채움'' 전용면적 57.69㎡의 경우 지난 3월27일 전세보증금 5000만원, 월세 270만원(7층)에 거래가 체결됐다.

황한솔 경제만랩 리서치연구원은 "전 재산과 다름없는 전세보증금을 반환받지 못한 상황을 피하기 위해 전세보다는 안전한 월세를 택하는 수요가 생기면서 고액 월세 계약도 덩달아 늘어나고 있는 분위기"라고 말했다.
','192.168.202.22');
insert into board2
(title, userid, thumbs, views, contents, ipaddr)
values('6월 취업자 수 33.3만명↑…정부 "고용 호조세 지속"(종합2보)','11','33','22','6월 취업자 수가 작년 같은 기간보다 33만3000명 증가하면서 3개월 연속 증가 폭이 낮아졌다.

정부는 "지난달 고용률과, 실업률은 6월 기준 역대 최고와 최저 수준을 보였고, 취업자 수도 28개월 연속 증가세를 유지했다. 고용 호조세가 지속되고 있다"고 평가했다.

12일 통계청이 발표한 ''2023년 6월 고용동향''에 따르면 지난달 취업자 수는 2881만2000명으로 전년 동월 대비 33만3000명 증가했다.

취업자 수는 2021년 3월 이후 28개월 연속 증가세를 나타내고 있다. 다만 증가 폭은 3개월 연속 둔화하고 있다.

취업자 수 증가 폭은 지난해 5월(93만5000명)부터 지난 2월(31만2000명)까지 꾸준히 감소하다가 지난 3월 46만9000명을 기록하며 반등했다. 이후 다시 감소세가 이어지고 있다.

서운주 통계청 사회통계국장은 "지난달에 비해 증가 폭이 축소된 이유는 보건복지업 증가 폭 축소, 운수창고업 감소 폭이 다소 확대된 영향이 있다"고 밝혔다.

이어 "청년은 취업자 수가 감소했는데, 이는 인구감소 영향도 같이 봐야 한다"며 "2022년 6월 기저효과로 10만명이 늘었던 것도 고려할 필요가 있다"고 덧붙였다.

6월 취업자 수는 고령층과 여성이 견인했다.

연령별로는 60세 이상에서 34만3000명, 50대 7만1000명, 30대에서 7만명 증가했다. 반면 20대 이하에서 11만7000명,  40대 3만4000명 감소했다.

성별로는 남자는 전년 동월 대비 1000명(0.0%) 증가하는 데 그쳤지만, 여자는 33만2000명(2.7%) 증가했다.

산업별로 보건업 및 사회복지서비스업에서 12만6000명(4.5%), 숙박 및 음식점업에서 11만6000명(5.3%), 전문과학 및 기술서비스업에서 9만8000명(7.7%) 증가했다.

다만 건설업(-6만2000명·-2.8%), 운수창고업(-3만9000명·-2.3%), 부동산업(-3만2000명·-5.6%) 등에서 줄었다. 제조업 역시 작년보다 1만명 줄어 6개월 연속 취업자 감소 현상이 나타났다.','192.168.202.11');



select count(bno) cnt, ceil(count(userid)/25) pages from board2;


select * from board2
where title like '%동해상%';


-- pds
create table pds(
    pno         int                 auto_increment,
    title       varchar(100)        not null,
    userid      varchar(18)         not null,
    regdate     datetime            default  current_timestamp,
    thumbs      int                 default 0,
    views       int                 default 0,
    contents    text                not null,
    ipaddr      varchar(15)         not null,
    primary key (pno)
);

create table pdsattach(
    pano        int             auto_increment,
    pno         int             not null,       -- 게시글 번호
    fname       varchar(200)    not null,       -- uuid 포함
    ftype       varchar(3)      not null,
    fsize       float           not null,
    fdown       int             default 0,
    primary key (pano)
);

alter table pds
    add constraint fkpuid
        foreign key (userid) references member2(userid);

alter table pdsattach
    add constraint fkpno
        foreign key (pno) references pds(pno);

select last_insert_id() from pds limit 1,1;

-- join
select * from pds p join pdsattach pa
                         using(pno) where p.pno = '34';

-- view(가상테이블)
create view ppa
as
select * from pds p join pdsattach pa
                         using(pno);

select * from ppa where pno = '34';

create table pdscomments (
  cno           int         auto_increment,
  comments      mediumtext  not null,
  userid        varchar(18) not null,
  regdate       datetime    default  current_timestamp,
  pno           int         not null,
  ref           int         not null,
  primary key (cno)
);

alter table pdscomments
    add constraint fkrefcno
        foreign key (ref) references pdscomments(cno);

alter table pdscomments
    add constraint fkpnopno
        foreign key (pno) references pds(pno);

insert into pdscomments (userid, comments, ref, pno)
    values('abc123','댓글1','1','34');
insert into pdscomments (userid, comments, ref, pno)
    values('abc123','댓글2','2','32');
insert into pdscomments (userid, comments, ref, pno)
    values('11','대댓글1','3','33');
insert into pdscomments (userid, comments, ref, pno)
    values('22','대댓글2','2','31');
insert into pdscomments (userid, comments, ref, pno)
    values('11','댓글4','5','31');

select * from pdscomments;
select * from pdscomments where pno = 34
        order by ref;
