-- 模拟转账示例 对应 数据库脚本

prompt PL/SQL Developer import file
prompt Created on 2012年4月16日 by Administrator
set feedback off
set define off
prompt Creating ACCOUNT...
create table ACCOUNT
(
  ano     INTEGER not null,
  balance NUMBER(6,2)
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

prompt Disabling triggers for ACCOUNT...
alter table ACCOUNT disable all triggers;
prompt Deleting ACCOUNT...
delete from ACCOUNT;
commit;
prompt Loading ACCOUNT...
insert into ACCOUNT (ano, balance)
values (1, 1800);
insert into ACCOUNT (ano, balance)
values (2, 1200);
commit;
prompt 2 records loaded
prompt Enabling triggers for ACCOUNT...
alter table ACCOUNT enable all triggers;
set feedback on
set define on
prompt Done.
