create database ETM1
go
use ETM1
go
create table AccountUsers
(
	UserID int primary key identity,
	Username varchar(50) NOT NULL,
	[Password] varchar(100) NOT NULL,
	[Role] int NOT NULL 
)
go

Drop  table AccountUsers
insert into AccountUsers(Username, [Password], [Role])
values('admin','21232f297a57a5a743894a0e4a801fc3', 1);
insert into AccountUsers(Username, [Password], [Role])
values('user', 'e10adc3949ba59abbe56e057f20f883e', 2);
go
select *from AccountUsers
drop table Employee

create table Employee
(
	number int primary key identity ,
	name varchar(50) NOT NULL,
	birthday datetime NOT NULL,
	gender varchar(50) NOT NULL,
	addressE varchar(50) NOT NULL,
	workE varchar(100),
	workExp int NOT NULL ,
	email varchar(50)NOT NULL,
	phoneE varchar(15)
	
)

insert into Employee
values()
select *from Employee
delete from Employee where number = '6'