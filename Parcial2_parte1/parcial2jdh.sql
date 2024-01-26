CREATE DATABASE parcial2jdh;
USE parcial2jdh;

CREATE TABLE persona(
id int PRIMARY KEY AUTO_INCREMENT,
tipo_documento VARCHAR(20) NOT NULL,
documento VARCHAR(20) NOT NULL UNIQUE,
nombre VARCHAR(50) NOT NULL,
estado_credito ENUM('En estudio', 'Aceptado', 'Rechazado', 'Cancelado'),
valor_credito VARCHAR(20) NOT NULL);

INSERT INTO persona (tipo_documento, documento, nombre, estado_credito, valor_credito) VALUES ('CC', '10393932', 'Juan', 'En estudio', '2000');
SELECT * FROM persona