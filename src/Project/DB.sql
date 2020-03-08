use lesson;

create table assortment(
id_assort int primary key auto_increment,
product varchar(50) unique not null,
price int);

insert into assortment values 
(null, "Bread", 15),
(null, "Milk", 7),
(null, "Kefir", 5),
(null, "Fish", 15),
(null, "Drink", 8);

create table customers(
id_cust int primary key auto_increment,
name varchar(50));

insert into customers values 
(null, "Vasiliy"),
(null, "Elena"),
(null, "Boris");


create table basket(
id_cust int,
id_assort int);


insert into basket values 
(1, 1),
(1, 3),
(2, 2),
(2, 4);


