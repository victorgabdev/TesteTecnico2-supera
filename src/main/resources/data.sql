CREATE TABLE conta
(
    id_conta IDENTITY NOT NULL PRIMARY KEY,
    nome_responsavel VARCHAR(50) NOT NULL
);


CREATE TABLE transferencia
(
    id IDENTITY NOT NULL PRIMARY KEY,
    data_transferencia TIMESTAMP WITH TIME ZONE NOT NULL,
    valor NUMERIC (20,2) NOT NULL,
    tipo VARCHAR(15) NOT NULL,
    nome_operador_transacao VARCHAR (50),
    conta_id INT NOT NULL,

        CONSTRAINT FK_CONTA
        FOREIGN KEY (conta_id)
        REFERENCES conta(id_conta)
);

INSERT INTO conta (id_conta, nome_responsavel) VALUES (1,'Fulano');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (2,'Sicrano');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (3, 'Beltrano');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (4, 'Maria');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (5, 'João');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (6, 'Pedro');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (7, 'Ana');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (8, 'José');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (9, 'Carla');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (10, 'Rafael');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (11, 'Lúcia');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (12, 'Roberto');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (13, 'Mariana');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (14, 'Gustavo');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (15, 'Camila');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (16, 'Ricardo');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (17, 'Patrícia');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (18, 'Anderson');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (19, 'Bianca');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (20, 'Lucas');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (21, 'Carolina');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (22, 'Fernando');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (23, 'Isabela');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (24, 'Márcio');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (25, 'Juliana');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (26, 'Renato');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (27, 'Aline');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (28, 'Thiago');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (29, 'Larissa');
INSERT INTO conta (id_conta, nome_responsavel) VALUES (30, 'Paulo');

INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (1,'2019-01-01 12:00:00+03',30895.46,'DEPOSITO', null, 1);
INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (2,'2019-02-03 09:53:27+03',12.24,'DEPOSITO', null,2);
INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (3,'2019-05-04 08:12:45+03',-500.50,'SAQUE', null,1);
INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (4,'2019-08-07 08:12:45+03',-530.50,'SAQUE', null,2);
INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (5,'2020-06-08 10:15:01+03',3241.23,'TRANSFERENCIA', 'Beltrano',1);
INSERT INTO transferencia (id,data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (6,'2021-04-01 12:12:04+03',25173.09,'TRANSFERENCIA', 'Ronnyscley',2);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (7, '2021-04-01 12:12:04+03', 147.09, 'TRANSFERENCIA', 'Operador 7', 3);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (8, '2021-04-01 12:12:04+03', 428.39, 'TRANSFERENCIA', 'Operador 8', 3);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (9, '2021-04-01 12:12:04+03', 870.98, 'TRANSFERENCIA', 'Operador 9', 3);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (10, '2021-04-01 12:12:04+03', 622.08, 'TRANSFERENCIA', 'Operador 10', 4);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (11, '2021-04-01 12:12:04+03', 249.58, 'TRANSFERENCIA', 'Operador 11', 4);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (12, '2021-04-01 12:12:04+03', 652.84, 'TRANSFERENCIA', 'Operador 12', 4);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (13, '2021-04-01 12:12:04+03', 26.07, 'TRANSFERENCIA', 'Operador 13', 5);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (14, '2021-04-01 12:12:04+03', 659.98, 'TRANSFERENCIA', 'Operador 14', 5);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (15, '2021-04-01 12:12:04+03', 619.53, 'TRANSFERENCIA', 'Operador 15', 5);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (16, '2021-04-01 12:12:04+03', 700.65, 'TRANSFERENCIA', 'Operador 16', 6);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (17, '2021-04-01 12:12:04+03', 970.57, 'TRANSFERENCIA', 'Operador 17', 6);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (18, '2021-04-01 12:12:04+03', 250.89, 'TRANSFERENCIA', 'Operador 18', 6);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (19, '2021-04-01 12:12:04+03', 610.37, 'TRANSFERENCIA', 'Operador 19', 7);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (20, '2021-04-01 12:12:04+03', 484.87, 'TRANSFERENCIA', 'Operador 20', 7);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (21, '2021-04-01 12:12:04+03', 734.16, 'TRANSFERENCIA', 'Operador 21', 7);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (22, '2021-04-01 12:12:04+03', 470.26, 'TRANSFERENCIA', 'Operador 22', 8);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (23, '2021-04-01 12:12:04+03', 406.28, 'TRANSFERENCIA', 'Operador 23', 8);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (24, '2021-04-01 12:12:04+03', 417.90, 'TRANSFERENCIA', 'Operador 24', 8);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (25, '2021-04-01 12:12:04+03', 806.68, 'TRANSFERENCIA', 'Operador 25', 9);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (26, '2021-04-01 12:12:04+03', 272.63, 'TRANSFERENCIA', 'Operador 26', 9);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (27, '2021-04-01 12:12:04+03', 309.38, 'TRANSFERENCIA', 'Operador 27', 9);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (28, '2021-04-01 12:12:04+03', 147.78, 'TRANSFERENCIA', 'Operador 28', 10);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (29, '2021-04-01 12:12:04+03', 151.62, 'TRANSFERENCIA', 'Operador 29', 10);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (30, '2021-04-01 12:12:04+03', 760.86, 'TRANSFERENCIA', 'Operador 30', 10);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (31, '2021-04-01 12:12:04+03', 74.84, 'TRANSFERENCIA', 'Operador 31', 11);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (32, '2021-04-01 12:12:04+03', 197.54, 'TRANSFERENCIA', 'Operador 32', 11);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (33, '2021-04-01 12:12:04+03', 991.24, 'TRANSFERENCIA', 'Operador 33', 11);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (34, '2021-04-01 12:12:04+03', 43.17, 'TRANSFERENCIA', 'Operador 34', 12);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (35, '2021-04-01 12:12:04+03', 926.35, 'TRANSFERENCIA', 'Operador 35', 12);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (36, '2021-04-01 12:12:04+03', 407.68, 'TRANSFERENCIA', 'Operador 36', 12);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (37, '2021-04-01 12:12:04+03', 9.79, 'TRANSFERENCIA', 'Operador 37', 13);
INSERT INTO transferencia (id, data_transferencia, valor, tipo, nome_operador_transacao, conta_id) VALUES (38, '2021-04-01 12:12:04+03', 314.95, 'TRANSFERENCIA', 'Operador 38', 13);