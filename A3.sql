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
vacina varchar (10) not null
);

create table agendVET(
dia DATE primary key not null unique,
08HR varchar (50),
09HR varchar (50),
10HR varchar (50),
11HR varchar (50)
);

create table agendPET(
dia DATE primary key not null unique,
13HR varchar (50),
14HR varchar (50),
15HR varchar (50),
16HR varchar (50),
17HR varchar (50)
);

create table administrador(
numreg int primary key not null unique,
nome varchar (30)
);

insert into cliente (cpf, nome) vales ('1023', 'Jenison');

insert into agendVET (dia)  values (STR_TO_DATE('03/07/2023','%d/%m/%Y'));
insert into agendVET (dia)  values (STR_TO_DATE('04/07/2023','%d/%m/%Y'));
insert into agendVET (dia)  values (STR_TO_DATE('05/07/2023','%d/%m/%Y'));
insert into agendVET (dia)  values (STR_TO_DATE('06/07/2023','%d/%m/%Y'));
update agendVET set 09HR = 'Ozzy- Com Vacina' where dia = '2023-07-04';
update agendVET set 09HR = 'Bruce- Sem Vacina' where dia = '2023-07-05';
update agendVET set 10HR = 'Theo- Sem Vacina' where dia = '2023-07-05';
update agendVET set 11HR = 'Mike- Com Vacina' where dia = '2023-07-05';
update agendVET set 09HR = 'Simba- Com Vacina' where dia = '2023-07-06';

insert into agendPET (dia)  values (STR_TO_DATE('05/07/2023','%d/%m/%Y'));
insert into agendPET (dia)  values (STR_TO_DATE('06/07/2023','%d/%m/%Y'));
insert into agendPET (dia)  values (STR_TO_DATE('07/07/2023','%d/%m/%Y'));
update agendPET set 16HR = 'Zeca- Com Tosa' where dia = '2023-07-05';
update agendPET set 13HR = 'Buddy- Com Tosa' where dia = '2023-07-06';
update agendPET set 17HR = 'Frederico- Sem Tosa' where dia = '2023-07-06';
update agendPET set 14HR = 'Bidu- Com Tosa' where dia = '2023-07-07';
update agendPET set 15HR = 'Scooby' where dia = '2023-07-07';
update agendPET set 16HR = 'Lord- Sem Tosa' where dia = '2023-07-07';
update agendPET set 17HR = 'Apolo- Com Tosa' where dia = '2023-07-07';

insert into administrador (numreg, nome) values (1, 'Jenison');
insert into administrador (numreg, nome) values (2, 'Katrine');
insert into administrador (numreg, nome) values (3, 'Manuela');
insert into administrador (numreg, nome) values (4, 'Pedro');
insert into administrador (numreg, nome) values (5, 'Richard');
insert into administrador (numreg, nome) values (6, 'Thaynara');
insert into administrador (numreg, nome) values (7, 'Vitor');

Select * from animal;
SELECT * FROM cliente;
select * from agendVET;
select * from agendPET;
select * from administrador;



