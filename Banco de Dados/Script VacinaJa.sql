#Usando o Banco

USE VacinaJa;


#Criando Tabelas

CREATE TABLE Paciente (
	id int PRIMARY KEY AUTO_INCREMENT,
    nome varchar(50) NOT NULL,
    idade int(3) NOT NULL,
    areaSaude boolean NOT NULL,
    endereco varchar(200) NOT NULL,
    dataVacinacao date,
    prioridade int(2) not null
);

CREATE TABLE Usuario(
	id	INT PRIMARY KEY auto_increment,
    nome varchar(50) NOT NULL,
	cpf varchar(16) UNIQUE NOT NULL,
    dataRegistro timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP NOT NULL,
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
INSERT INTO PACIENTE(nome, idade, areaSaude, endereco, prioridade)
			VALUES('teste',71,true,'Rua vitorio ramalho',3);

INSERT INTO USUARIO(nome,cpf,email,perfil, senha)
	VALUES('Pedro','47368677873','leonardo@testevacinaja.com','Administrador','123456');
    
select * from usuario;
                
select * from usuario where cpf = '834.022.930-30' AND senha = '123456';
select nome from usuario where cpf = '834.022.930-30';