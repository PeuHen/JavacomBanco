create database app;

use app;

create table produto(
valor double not null,
descricao varchar(255) not null
);

select * from produto;

create table cliente(
nome varchar(255),
telefone varchar(255),
email varchar(255),
idade int
);

select * from cliente;

