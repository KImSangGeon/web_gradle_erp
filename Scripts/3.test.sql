select * from employee;
select * from department;
select * from title;

select titleNo, titleName from title;

select * from title where titleno=1;

insert into title values(7, '인턴1');

delete from title where titleNo =6;

update title set titlename = '인턴왕' where titleNo =7;