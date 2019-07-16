create table mem(
  num int not null primary key auto_increment,
  name varchar(20) not null,
  age int not null,
  addr varchar(50) not null,
  tel varchar(20) not null,
  email varchar(50) not null
);
select * from mem;
insert into mem(name,age,addr,tel,email) 
 values('홍길동',34,'광주','010-1111-1111','bit@empas.com');  
