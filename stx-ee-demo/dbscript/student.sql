prompt PL/SQL Developer import file
prompt Created on 2012��5��7�� by Administrator
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
values ('s013', '������', 20, '��');
insert into STUDENT (sno, sname, sage, ssex)
values ('s011', '��С��', 22, 'Ů');
insert into STUDENT (sno, sname, sage, ssex)
values ('s012', '����', 28, '��');
insert into STUDENT (sno, sname, sage, ssex)
values ('s002', '����', 23, '��');
insert into STUDENT (sno, sname, sage, ssex)
values ('s003', '����', 25, '��');
insert into STUDENT (sno, sname, sage, ssex)
values ('s004', '����', 20, 'Ů');
insert into STUDENT (sno, sname, sage, ssex)
values ('s005', '����', 20, 'Ů');
insert into STUDENT (sno, sname, sage, ssex)
values ('s006', '�', 21, '��');
insert into STUDENT (sno, sname, sage, ssex)
values ('s007', '����', 21, '��');
insert into STUDENT (sno, sname, sage, ssex)
values ('s008', '����', 21, 'Ů');
insert into STUDENT (sno, sname, sage, ssex)
values ('s010', '����', 22, 'Ů');
commit;
prompt 11 records loaded
prompt Enabling triggers for STUDENT...
alter table STUDENT enable all triggers;
set feedback on
set define on
prompt Done.
