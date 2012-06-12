
drop table STUDENT cascade constraints;

create table STUDENT
(
  sno       VARCHAR2(10) not null,
  sname     VARCHAR2(20),
  sage      NUMBER(2),
  ssex      VARCHAR2(5),
  spassword VARCHAR2(20) not null
);

alter table STUDENT
  add primary key (SNO);
  
insert into STUDENT (sno, sname, sage, ssex, spassword)
values ('s013', '王麻子', 20, '男', '123456');
insert into STUDENT (sno, sname, sage, ssex, spassword)
values ('s002', '王五', 33, '女', '123456');
insert into STUDENT (sno, sname, sage, ssex, spassword)
values ('s011', '王小五', 22, '女', '123456');
insert into STUDENT (sno, sname, sage, ssex, spassword)
values ('s012', '王五', 28, '男', '12345678');
insert into STUDENT (sno, sname, sage, ssex, spassword)
values ('s003', '吴鹏', 25, '男', '123456');
insert into STUDENT (sno, sname, sage, ssex, spassword)
values ('s004', '琴沁', 20, '女', '123456');
insert into STUDENT (sno, sname, sage, ssex, spassword)
values ('s005', '王丽', 20, '女', '123456');
insert into STUDENT (sno, sname, sage, ssex, spassword)
values ('s008', '萧蓉', 23, '男', '12345678');
insert into STUDENT (sno, sname, sage, ssex, spassword)
values ('s009', '陈萧晓', 23, '女', '123456');
insert into STUDENT (sno, sname, sage, ssex, spassword)
values ('s006', '李波', 21, '男', '123456');
insert into STUDENT (sno, sname, sage, ssex, spassword)
values ('s007', '刘玉', 21, '男', '123456');
insert into STUDENT (sno, sname, sage, ssex, spassword)
values ('s010', '陈美', 22, '女', '123456');
commit;