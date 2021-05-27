#Usando o Banco

USE VacinaJa;

#Criando Tabelas

CREATE TABLE Paciente (
	id int PRIMARY KEY AUTO_INCREMENT,
    nome varchar(50) NOT NULL,
    idade int(3) NOT NULL,
    area_saude boolean NOT NULL,
    endereco varchar(30) NOT NULL,
    data_vacinacao date NOT NULL
);

CREATE TABLE Usuario(
	ID	INT PRIMARY KEY auto_increment,
    cpf varchar(16) UNIQUE NOT NULL,
    nome varchar(50) NOT NULL,
    data_registro timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP NOT NULL,
    email varchar(30) ,
    perfil varchar(20) NOT NULL
);

#DROP TABLE USUARIO;
#DROP TABLE PACIENTE;

#MOSTRANDO AS TABELAS

DESCRIBE Paciente;
DESCRIBE USUARIO;
