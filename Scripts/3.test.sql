select * from employee;
select * from department;
select * from title;

select titleNo, titleName from title;

select * from title where titleno=1;

insert into title values(8, '인턴1');

delete from title where titleNo =6;

update title set titlename = '인턴왕' where titleNo =7;

select deptNo, deptName, floor from department;

select deptNo, deptName, floor from department where deptNo =3;

insert into department values(5, '인사',  2);

update department set deptName = '발라드' , floor =7 where deptno =5;



delete from department where deptno =5;
