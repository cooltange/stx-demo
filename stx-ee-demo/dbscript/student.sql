prompt PL/SQL Developer import file
prompt Created on 2012年5月7日 by Administrator
set feedback off
set define off
prompt Creating STUDENT...
create table STUDENT
(
  sno   VARCHAR2(10) not null,
  sname VARCHAR2(20),
  sage  NUMBER(2),
  ssex  VARCHAR2(5)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table STUDENT
  add primary key (SNO)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Disabling triggers for STUDENT...
alter table STUDENT disable all triggers;
prompt Deleting STUDENT...
delete from STUDENT;
commit;
prompt Loading STUDENT...
insert into STUDENT (sno, sname, sage, ssex)
values ('s013', '王麻子', 20, '男');
insert into STUDENT (sno, sname, sage, ssex)
values ('s011', '王小五', 22, '女');
insert into STUDENT (sno, sname, sage, ssex)
values ('s012', '王五', 28, '男');
insert into STUDENT (sno, sname, sage, ssex)
values ('s002', '李四', 23, '男');
insert into STUDENT (sno, sname, sage, ssex)
values ('s003', '吴鹏', 25, '男');
insert into STUDENT (sno, sname, sage, ssex)
values ('s004', '琴沁', 20, '女');
insert into STUDENT (sno, sname, sage, ssex)
values ('s005', '王丽', 20, '女');
insert into STUDENT (sno, sname, sage, ssex)
values ('s006', '李波', 21, '男');
insert into STUDENT (sno, sname, sage, ssex)
values ('s007', '刘玉', 21, '男');
insert into STUDENT (sno, sname, sage, ssex)
values ('s008', '萧蓉', 21, '女');
insert into STUDENT (sno, sname, sage, ssex)
values ('s010', '陈美', 22, '女');
commit;
prompt 11 records loaded
prompt Enabling triggers for STUDENT...
alter table STUDENT enable all triggers;
set feedback on
set define on
prompt Done.
