-- CREATE DATABASE atividade9;

USE atividade9;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS ALUNOS;
DROP TABLE IF EXISTS CURSO;
DROP TABLE IF EXISTS EXALUNOS;

SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE CURSO(
codigo CHAR(2) PRIMARY KEY,
descricao VARCHAR(30),
turma VARCHAR(10),
ano INT
) engine InnoDB;

CREATE TABLE ALUNOS(
nome VARCHAR(40) PRIMARY KEY,
endereco VARCHAR(60),
telefone CHAR(8),
curso CHAR(2),
indconclusao CHAR(1),
FOREIGN KEY (curso) REFERENCES CURSO (codigo)
) engine InnoDB;

CREATE TABLE EXALUNOS(
nome VARCHAR(40) PRIMARY KEY,
endereco VARCHAR(60),
telefone CHAR(8),
curso CHAR(2),
indconclusao CHAR(1),
FOREIGN KEY (curso) REFERENCES CURSO (codigo)
) engine InnoDB;

INSERT INTO CURSO (codigo, descricao, turma, ano) VALUES ("1A","Sistemas de Informação","Matutino","2002");
INSERT INTO CURSO (codigo, descricao, turma, ano) VALUES ("2A","Ciências da Computação","Matutino","2003");
INSERT INTO CURSO (codigo, descricao, turma, ano) VALUES ("3A","Engenharia da Computação","Matutino","2004");
INSERT INTO CURSO (codigo, descricao, turma, ano) VALUES ("1B","Sistemas de Informação","Noturno","2003");

INSERT INTO ALUNOS (nome, endereco, telefone, curso, indconclusao) VALUES ("João", "Rua XV, n° 91","444-3333","2A","N");
INSERT INTO ALUNOS (nome, endereco, telefone, curso, indconclusao) VALUES ("Maria", "Rua Tiradentes, n° 99","555-4422","3A","S");
INSERT INTO ALUNOS (nome, endereco, telefone, curso, indconclusao) VALUES ("Pedro", "Rua Dona Francisca, n° 05","454-3399","1B","N");
INSERT INTO ALUNOS (nome, endereco, telefone, curso, indconclusao) VALUES ("Paulo", "Rua 7 de Setembro, n° 132","222-367","2A","S");

INSERT INTO EXALUNOS (nome, endereco, telefone, curso, indconclusao) VALUES ("José", "Rua Princesa Isabel, 91","444-0001","1A","N");
INSERT INTO EXALUNOS (nome, endereco, telefone, curso, indconclusao) VALUES ("Tiago", "Rua Machado de Assis, 732","555-3033","1A","S");
INSERT INTO EXALUNOS (nome, endereco, telefone, curso, indconclusao) VALUES ("Manoel", "Rua Tom Jobim, 345","555-5898","1A","S");
INSERT INTO EXALUNOS (nome, endereco, telefone, curso, indconclusao) VALUES ("João", "Rua XV, n° 91","444-3333","1A","S");

-- a)Listar todos os dados dos alunos, onde ind_conclusão = S
SELECT * FROM ALUNOS WHERE indconclusao = "N";
-- b)Listar todos os dados dos ex-alunos, onde ind_conclusão = S
SELECT * FROM EXALUNOS WHERE indconclusao = "S";
-- c)Listar todos os dados do aluno, onde nome = José
SELECT * FROM ALUNOS WHERE nome = "José";
-- d)Listar apenas os nomes do alunos
SELECT nome FROM ALUNOS;
-- e)Listar apenas os nomes e o endereço dos alunos
SELECT nome, endereco FROM ALUNOS;
-- f)Listar apenas os nomes e o endereço dos ex-alunos
SELECT nome, endereco FROM EXALUNOS;
-- g)Listar apenas os nomes e o endereço dos alunos, onde curso = 2A
SELECT nome, endereco FROM ALUNOS WHERE curso = "2A";
-- h) Listar apenas os nomes e o endereço dos ex-alunos, onde curso = 1A 
SELECT nome, endereco FROM EXALUNOS WHERE curso = "1A";
-- i) Listar os nomes, telefone e o endereço dos alunos, onde curso = 1B
SELECT nome, telefone, endereco FROM ALUNOS WHERE curso = "1B";
-- j) Listar apenas os nomes, telefone dos alunos, onde ind_conclusão = N
SELECT nome, telefone FROM ALUNOS WHERE indconclusao = "N";
-- k) Listar apenas os nomes, telefone dos ex-alunos, onde ind_conclusão = N
SELECT nome, telefone FROM EXALUNOS WHERE indconclusao = "N";
-- l) Listar o código e descrição do curso onde código = 1B
SELECT codigo, descricao FROM CURSO WHERE codigo = "1B";
-- m) Listar o código e descrição do curso onde ano seja antes de 2003
SELECT codigo, descricao FROM CURSO WHERE ano < 2003;
