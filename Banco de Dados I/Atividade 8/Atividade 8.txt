-- CREATE DATABASE atividade8;
USE atividade8;

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS CIDADE;
DROP TABLE IF EXISTS ESTADO;
DROP TABLE IF EXISTS BAIRRO;
DROP TABLE IF EXISTS VENDEDOR;
DROP TABLE IF EXISTS COMPRADOR2;
DROP TABLE IF EXISTS IMOVEL;
DROP TABLE IF EXISTS OFERTA;

SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE ESTADO(
siglaestado CHAR(2) PRIMARY KEY,
nomeestado VARCHAR(20)
) engine InnoDB;

CREATE TABLE CIDADE(
codigocidade INT PRIMARY KEY,
nomecidade VARCHAR(20),
siglaestado CHAR(2),
FOREIGN KEY (siglaestado) REFERENCES ESTADO (siglaestado)
) engine InnoDB;

CREATE TABLE BAIRRO(
codigobairro INT PRIMARY KEY,
nomebairro VARCHAR(20),
codigocidade INT,
siglaestado CHAR (2),
FOREIGN KEY (codigocidade) REFERENCES CIDADE (codigocidade),
FOREIGN KEY (siglaestado) REFERENCES ESTADO (siglaestado)
) engine InnoDB;

CREATE TABLE VENDEDOR(
codigovendedor INT PRIMARY KEY,
nomevendedor VARCHAR(40),
nomeendereco VARCHAR(40),
numerocpf CHAR(11),
nomecidade VARCHAR(20),
nomebairro VARCHAR(20),
siglaestado CHAR(2),
telefone VARCHAR(20),
email VARCHAR(80)
) engine InnoDB;

CREATE TABLE COMPRADOR2(
codigocomprador INT PRIMARY KEY,
nomecomprador VARCHAR(40),
nomeendereco VARCHAR(40),
numerocpf CHAR(11),
nomecidade VARCHAR(20),
nomebairro VARCHAR(20),
siglaestado CHAR(2),
telefone VARCHAR(20),
email VARCHAR(80)
) engine InnoDB;

CREATE TABLE IMOVEL(
codigoimovel INT PRIMARY KEY,
codigovendedor INT,
codigobairro INT,
codigocidade INT,
siglaestado CHAR(2),
nomeendereco VARCHAR(20),
numeroareautil DECIMAL(10,2),
numeroareatotal DECIMAL(10,2),
dsimovel VARCHAR(300),
valorpreco DECIMAL(16,2),
numeroofertas INT,
stvendido CHAR(1),
datalancamento DATE,
imovelindicado INT,
FOREIGN KEY (codigovendedor) REFERENCES VENDEDOR (codigovendedor),
FOREIGN KEY (siglaestado) REFERENCES ESTADO (siglaestado),
FOREIGN KEY (codigocidade) REFERENCES CIDADE (codigocidade),
FOREIGN KEY (codigobairro) REFERENCES BAIRRO (codigobairro)
) engine InnoDB;

CREATE TABLE OFERTA(
codigocomprador INT,
codigoimovel INT,
valoroferta DECIMAL (16,2),
dataoferta DATE,
PRIMARY KEY (codigocomprador, codigoimovel),
FOREIGN KEY (codigoimovel) REFERENCES IMOVEL (codigoimovel),
FOREIGN KEY (codigocomprador) REFERENCES COMPRADOR2 (codigocomprador)
) engine InnoDB;

-- a) Inserir Estado

INSERT INTO ESTADO (siglaestado, nomeestado) VALUES ("SC","Santa Catarina");
INSERT INTO ESTADO (siglaestado, nomeestado) VALUES ("RJ","Rio de Janeiro");
INSERT INTO ESTADO (siglaestado, nomeestado) VALUES ("SP","São Paulo");

-- b) Inserir Cidade

INSERT INTO CIDADE (codigocidade, nomecidade, siglaestado) VALUES ("1","Joinville","SC");
INSERT INTO CIDADE (codigocidade, nomecidade, siglaestado) VALUES ("2","Rio de Janeiro","RJ");
INSERT INTO CIDADE (codigocidade, nomecidade, siglaestado) VALUES ("3","São Paulo","SP");

-- c) Inserir Bairro

INSERT INTO BAIRRO (codigobairro, nomebairro, codigocidade, siglaestado) VALUES ("1","Centro","1","SC");
INSERT INTO BAIRRO (codigobairro, nomebairro, codigocidade, siglaestado) VALUES ("2","Glória","2","RJ");
INSERT INTO BAIRRO (codigobairro, nomebairro, codigocidade, siglaestado) VALUES ("3","Bom Retiro","3","SP");

-- d) Inserir Vendedor

INSERT INTO VENDEDOR (codigovendedor, nomevendedor, nomeendereco, numerocpf, nomecidade, nomebairro, siglaestado, telefone, email) 
VALUES ("1","Gabriel","Av. Mauro Ramos, 1125", "07847044900","Florianópolis","Centro","SC","48996658244","Gab.vendas@gmail.com");
INSERT INTO VENDEDOR (codigovendedor, nomevendedor, nomeendereco, numerocpf, nomecidade, nomebairro, siglaestado, telefone, email) 
VALUES ("2","Julio","Av. Atlantica, 067", "97954678177","Rio de Janeiro","Glória","RJ","21952467789","Julio.comercio@gmail.com");
INSERT INTO VENDEDOR (codigovendedor, nomevendedor, nomeendereco, numerocpf, nomecidade, nomebairro, siglaestado, telefone, email) 
VALUES ("3","Lucia","Rua Paulista, 724", "45672990874","São Paulo","Bom Retiro","SP","11972218652","Lucia.lojas@gmail.com");

-- e) Inserir imóvel

INSERT INTO IMOVEL (codigoimovel, codigovendedor, codigobairro, codigocidade, siglaestado, nomeendereco, numeroareautil, numeroareatotal,
dsimovel, valorpreco, numeroofertas, stvendido, datalancamento, imovelindicado)
VALUES ("1","1","1","1","SC","Rua Jade Magalhães",120.00,300.00,"Terreno limpo e adaptado",40000000,0,"N", CURDATE(), NULL);
INSERT INTO IMOVEL (codigoimovel, codigovendedor, codigobairro, codigocidade, siglaestado, nomeendereco, numeroareautil, numeroareatotal,
dsimovel, valorpreco, numeroofertas, stvendido, datalancamento, imovelindicado)
VALUES ("2","2","2","2","RJ","Rua São Januário",150.00,270.00,"Espaço bem aproveitado e terreno plano",6000000,0,"N", CURDATE(), NULL);
INSERT INTO IMOVEL (codigoimovel, codigovendedor, codigobairro, codigocidade, siglaestado, nomeendereco, numeroareautil, numeroareatotal,
dsimovel, valorpreco, numeroofertas, stvendido, datalancamento, imovelindicado)
VALUES ("3","3","3","3","SP","Rua Santa Paulina",130.00,250.00,"Espaço seguro e bem localizado",65000000,0,"N", CURDATE(), NULL);

-- f) Inserir Comprador2

INSERT INTO COMPRADOR2 (codigocomprador, nomecomprador, nomeendereco, numerocpf, nomecidade, nomebairro, siglaestado, telefone, email)
VALUES (1, 'Ana Costa', 'Rua das Acácias, 50', '45678901234', 'Joinville', 'Centro', 'SC', '47988888888', 'ana@email.com');
INSERT INTO COMPRADOR2 (codigocomprador, nomecomprador, nomeendereco, numerocpf, nomecidade, nomebairro, siglaestado, telefone, email)
VALUES (2, 'Bruno Rocha', 'Av. Brasil, 100', '56789012345', 'Rio de Janeiro', 'Glória', 'RJ', '21977777777', 'bruno@email.com');
INSERT INTO COMPRADOR2 (codigocomprador, nomecomprador, nomeendereco, numerocpf, nomecidade, nomebairro, siglaestado, telefone, email)
VALUES (3, 'Clara Mendes', 'Rua das Laranjeiras, 200', '67890123456', 'São Paulo', 'Bom Retiro', 'SP', '11966666666', 'clara@email.com');

-- g) Inserir ofertas

INSERT INTO OFERTA (codigocomprador, codigoimovel, valoroferta, dataoferta) VALUES (1, 1, 190000.00, CURDATE());
INSERT INTO OFERTA (codigocomprador, codigoimovel, valoroferta, dataoferta) VALUES (2, 2, 95000.00, CURDATE());
INSERT INTO OFERTA (codigocomprador, codigoimovel, valoroferta, dataoferta) VALUES (3, 3, 480000.00, CURDATE());

-- UPDATES
-- h) Aumente o preço dos imóveis em 10%
UPDATE IMOVEL SET valorpreco = valorpreco * 1.10;

-- i) Reduzir preço dos imóveis do vendedor 1 em 5%
UPDATE IMOVEL SET valorpreco = valorpreco * 0.95 WHERE codigovendedor = 1;

-- j) Aumentar ofertas do comprador 2 em 5%
UPDATE OFERTA SET valoroferta = valoroferta * 1.05 WHERE codigocomprador = 2;

-- k) Alterar endereço comprador 3 para "Rua Ananás, 45" e o estado para "RJ"
UPDATE COMPRADOR2 SET nomeendereco = "Rua Ananás, 45" WHERE codigocomprador = 3;
UPDATE COMPRADOR2 SET siglaestado = "RJ" WHERE codigocomprador = 3;

-- l) Altere oferta do comprador 2 no imóvel 2 para 101.000
UPDATE OFERTA SET valoroferta = 101.000 WHERE codigocomprador = 2;

-- m) Exclua oferta do comprador 1 no imóvel 1
DELETE FROM OFERTA WHERE codigocomprador = 1 AND codigoimovel = 1;

-- n) Exclua a cidade 3 do estado de SP
DELETE FROM OFERTA WHERE codigoimovel = 3;
DELETE FROM IMOVEL WHERE siglaestado = "SP" AND codigocidade = 3;
DELETE FROM BAIRRO WHERE siglaestado = "SP" AND codigocidade = 3;
DELETE FROM CIDADE WHERE siglaestado = "SP" AND codigocidade = 3;