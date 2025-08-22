CREATE DATABASE ACADEMIA_DE_GINÁSTICA;

CREATE TABLE Aluno
(
  Código_de_Matrícula INT NOT NULL,
  Data_da_Matrícula DATE NOT NULL,
  Nome VARCHAR(50) NOT NULL,
  Bairro VARCHAR(20) NOT NULL,
  Rua VARCHAR(50) NOT NULL,
  Número INT NOT NULL,
  Data_de_Nascimento DATE NOT NULL,
  Altura FLOAT NOT NULL,
  Peso FLOAT NOT NULL,
  PRIMARY KEY (Código_de_Matrícula)
);

CREATE TABLE Instrutor
(
  CREF CHAR NOT NULL,
  Nome VARCHAR(50) NOT NULL,
  RG INT NOT NULL,
  Data_Nascimento DATE NOT NULL,
  Bairro VARCHAR(20) NOT NULL,
  Rua VARCHAR(50) NOT NULL,
  Número INT NOT NULL,
  PRIMARY KEY (CREF)
);

CREATE TABLE Aluno_Telefone
(
  Telefone CHAR(14) NOT NULL,
  Código_de_Matrícula INT NOT NULL,
  PRIMARY KEY (Telefone, Código_de_Matrícula),
  FOREIGN KEY (Código_de_Matrícula) REFERENCES Aluno(Código_de_Matrícula)
);

CREATE TABLE Instrutor_Telefone
(
  Telefone INT NOT NULL,
  CREF CHAR NOT NULL,
  PRIMARY KEY (Telefone, CREF),
  FOREIGN KEY (CREF) REFERENCES Instrutor(CREF)
);

CREATE TABLE Turma
(
  Tipo_de_Atividade INT NOT NULL,
  Quantidade_de_Alunos INT NOT NULL,
  Horário_de_aula FLOAT NOT NULL,
  Duração_da_Aula FLOAT NOT NULL,
  Data_inicial DATE NOT NULL,
  Data_final DATE NOT NULL,
  Código_de_Matrícula INT,
  Titulação CHAR NOT NULL,
  PRIMARY KEY (Tipo_de_Atividade),
  FOREIGN KEY (Código_de_Matrícula) REFERENCES Aluno(Código_de_Matrícula),
  FOREIGN KEY (Titulação) REFERENCES Instrutor(CREF)
);

CREATE TABLE Matrícula
(
  Ausências_do_Aluno INT NOT NULL,
  Código_de_Matrícula INT NOT NULL,
  Tipo_de_Atividade INT NOT NULL,
  PRIMARY KEY (Ausências_do_Aluno),
  FOREIGN KEY (Código_de_Matrícula) REFERENCES Aluno(Código_de_Matrícula),
  FOREIGN KEY (Tipo_de_Atividade) REFERENCES Turma(Tipo_de_Atividade),
  UNIQUE (Código_de_Matrícula, Tipo_de_Atividade)
);