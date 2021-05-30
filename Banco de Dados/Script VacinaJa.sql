#Usando o Banco

USE VacinaJa;


#Criando Tabelas

CREATE TABLE Paciente (
	id int PRIMARY KEY AUTO_INCREMENT,
    nome varchar(50) NOT NULL,
    idade int(3) NOT NULL,
    area_saude boolean NOT NULL,
    endereco varchar(30) NOT NULL,
    data_vacinacao date
);

CREATE TABLE Usuario(
	ID	INT PRIMARY KEY auto_increment,
    nome varchar(50) NOT NULL,
	cpf varchar(16) UNIQUE NOT NULL,
    data_registro timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP NOT NULL,
    email varchar(30) ,
    perfil varchar(20) NOT NULL,
    senha varchar(16) not null
);

#DROP TABLE USUARIO;
#DROP TABLE PACIENTE;

#MOSTRANDO AS TABELAS

DESCRIBE Paciente;
DESCRIBE USUARIO;


#Inserir dados na tabela:
INSERT INTO PACIENTE(nome, idade, area_saude, endereco)
			VALUES('Leonardo',24,0,'Rua vitorio ramalho');

INSERT INTO USUARIO(nome,cpf,email,perfil)
	VALUES('Leonardo','834.022.930-30','leonardo@testevacinaja.com','Administrador');
    
select * from paciente;
    
