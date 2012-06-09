drop table STUDENT;
create table STUDENT
(
  sno   VARCHAR2(10) not null,
  sname VARCHAR2(20),
  sage  NUMBER(2),
  ssex  VARCHAR2(5)
);

alter table STUDENT
  add primary key (SNO);