create database db_petshop;
use db_petshop;

create table cliente (
cpf varchar (11) not null unique primary key,
nome varchar (30) not null, 
endereco varchar (50) not null,
email varchar (50) not null,
telefone varchar (20) not null
);

create table animal(
codigo int primary key auto_increment not null unique,
nomepet varchar (30) not null,
raca varchar (20) not null,
porte varchar (20) not null,
idade varchar (5) not null,
peso varchar (5) not null,
vacina varchar (10) not null,
cpf_ varchar (11) not null
);

create table agendVET(
dia DATE primary key not null unique,
8_AM varchar (50),
9_AM varchar (50),
10_AM varchar (50),
11_AM varchar (50)
);

create table agendPET(
dia DATE primary key not null unique,
13_PM varchar (50),
14_PM varchar (50),
15_PM varchar (50),
16_PM varchar (50),
17_PM varchar (50)
);

create table administrador(
numreg int primary key not null unique,
nome varchar (30)
);

insert into agendVET (dia)  values (STR_TO_DATE('03/07/2023','%d/%m/%Y'));
insert into agendVET (dia)  values (STR_TO_DATE('04/07/2023','%d/%m/%Y'));
insert into agendVET (dia)  values (STR_TO_DATE('05/07/2023','%d/%m/%Y'));
insert into agendVET (dia)  values (STR_TO_DATE('06/07/2023','%d/%m/%Y'));
update agendVET set 9_AM = 'Ozzy' where dia = '2023-07-04';
update agendVET set 11_AM = 'Mell' where dia = '2023-07-04';
update agendVET set 9_AM = 'Bruce' where dia = '2023-07-05';
update agendVET set 10_AM = 'Theo' where dia = '2023-07-05';
update agendVET set 11_AM = 'Mike' where dia = '2023-07-05';
update agendVET set 9_AM = 'Simba' where dia = '2023-07-06';

insert into agendPET (dia)  values (STR_TO_DATE('05/07/2023','%d/%m/%Y'));
insert into agendPET (dia)  values (STR_TO_DATE('06/07/2023','%d/%m/%Y'));
insert into agendPET (dia)  values (STR_TO_DATE('07/07/2023','%d/%m/%Y'));
update agendPET set 16_PM = 'Zeca' where dia = '2023-07-05';
update agendPET set 13_PM = 'Buddy' where dia = '2023-07-06';
update agendPET set 17_PM = 'Frederico' where dia = '2023-07-06';
update agendPET set 14_PM = 'Bidu' where dia = '2023-07-07';
update agendPET set 15_PM = 'Scooby' where dia = '2023-07-07';
update agendPET set 16_PM = 'Lord' where dia = '2023-07-07';
update agendPET set 17_PM = 'Apolo' where dia = '2023-07-07';

insert into administrador (numreg, nome) values (1151, 'Jenison Schmitt');
insert into administrador (numreg, nome) values (2789, 'Katrine Corrêa');
insert into administrador (numreg, nome) values (3578, 'Manuela Toews');
insert into administrador (numreg, nome) values (4156, 'Pedro Pilla');
insert into administrador (numreg, nome) values (5795, 'Richard Santos');
insert into administrador (numreg, nome) values (6175, 'Thaynara Leverge');
insert into administrador (numreg, nome) values (7796, 'Vitor Oliveira');

Select * from animal;
SELECT * FROM cliente;
select * from agendVET;
select * from agendPET;
select * from administrador;





