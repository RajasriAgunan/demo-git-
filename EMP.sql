create table emplofme;
insert into emplofme(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(8369,'SMITH','CLERK',8902,'1990-12-18',800.0,null,20);
insert into Emplofme(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(8499,'ANYA','SALESMAN',8698,'1991-02-20',1600.0,300.00,30);
insert into emplofme(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(8521,'SETH','SALESMAN',8698,'1991-02-22',1250.0,500.00,30);
insert into emplofme(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(8566,'MAHADEV','MANAGER',8839,'1991-04-02',2985.00,null,20);
insert into emplofme(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(8654,'MOMIN','SALESMAN',8698,'1991-09-28',1250.00,1400.00,30);
insert into emplofme(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(8698,'BINA','MANAGER',8839,'1991-05-01',2850.00,null,30);
insert into emplofme(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(8882,'SHIVANSH','MANAGER',8839,'1991-06-09',2450.00,null,10);
insert into emplofme(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(8888,'SCOTT','ANALYST',8566,'1992-12-09',3000.00,null,20);
insert into emplofme(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(8839,'AMIR','PRESIDENT',NULL,'1991-11-18',5000.00,null,10);
insert into emplofme(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(8844,'KULDEEP','SALESMAN',8698,'1991-09-08',1500.00,0.00,30);
use w3schools;
show tables;
select * from emplofme;
select ename,sal from emplofme where sal>='2200';
select * from emplofme where comm is null;
select ename,sal from emplofme where sal not between 2200 and 4000;
select ename,job,sal from emplofme where not job ='manager';
select ename from emplofme where ename like '__a%';
select ename from emplofme where ename like '%t';