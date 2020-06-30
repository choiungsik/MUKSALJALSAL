create table timecheck
(num number(1));

select * from timecheck;

select explain from menu;

update menu set explain = '<html><body>부드러운 등심에<br><br>숙주볶음과  소스를 곁들인<br><br>등심스테이크의 최고봉</body></html>'  where menunum = 14;

drop table timecheck;


delete from people;

select * from sales;