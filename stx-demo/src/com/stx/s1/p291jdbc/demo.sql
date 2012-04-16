/*******�������******/
create table student(
	sno varchar2(10) primary key,
	sname varchar2(20),
	sage number(2),
	ssex varchar2(5)
);
create table teacher(
	tno varchar2(10) primary key,
	tname varchar2(20)
);
create table course(
	cno varchar2(10),
	cname varchar2(20),
	tno varchar2(20),
	constraint pk_course primary key (cno)
);
create table sc(
	sno varchar2(10),
	cno varchar2(10),
	score number(4,2),
	constraint pk_sc primary key (sno,cno)
);

/*******��ʼ��ѧ���������******/
insert into student values ('s001','����',23,'��');
insert into student values ('s002','����',23,'��');
insert into student values ('s003','����',25,'��');
insert into student values ('s004','����',20,'Ů');
insert into student values ('s005','����',20,'Ů');
insert into student values ('s006','�',21,'��');
insert into student values ('s007','����',21,'��');
insert into student values ('s008','����',21,'Ů');
insert into student values ('s009','������',23,'Ů');
insert into student values ('s010','����',22,'Ů');
commit;
/******************��ʼ����ʦ��***********************/
insert into teacher values ('t001', '����');
insert into teacher values ('t002', '����');
insert into teacher values ('t003', '�ĺ�');
commit;
/***************��ʼ���γ̱�****************************/
insert into course values ('c001','J2SE','t002');
insert into course values ('c002','Java Web','t002');
insert into course values ('c003','SSH','t001');
insert into course values ('c004','Oracle','t001');
insert into course values ('c005','SQL SERVER 2005','t003');
insert into course values ('c006','C#','t003');
insert into course values ('c007','JavaScript','t002');
insert into course values ('c008','DIV+CSS','t001');
insert into course values ('c009','PHP','t003');
insert into course values ('c010','EJB3.0','t002');
commit;
/***************��ʼ���ɼ���***********************/
insert into sc values ('s001','c001',78.9);
insert into sc values ('s002','c001',80.9);
insert into sc values ('s003','c001',81.9);
insert into sc values ('s004','c001',60.9);
insert into sc values ('s001','c002',82.9);
insert into sc values ('s002','c002',72.9);
insert into sc values ('s003','c002',81.9);
insert into sc values ('s001','c003','59');
commit;
 