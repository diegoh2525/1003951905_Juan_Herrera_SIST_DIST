DROP DATABASE IF EXISTS parcial1;

CREATE DATABASE parcial1;

USE parcial1;

CREATE TABLE usuarios(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(20) NOT NULL,
    tipo ENUM('administrador', 'visitante')
); 

CREATE TABLE categorias(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre_categoria VARCHAR(50) NOT NULL
);

CREATE TABLE salas(
    id INT PRIMARY KEY AUTO_INCREMENT,
    numero VARCHAR(2) NOT NULL
);

CREATE TABLE libros(
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    categoria_id INT,
    sala_id INT,
    CONSTRAINT fk_libros_categoria_id_categoria_id FOREIGN KEY (categoria_id) REFERENCES categorias(id),
    CONSTRAINT fk_libros_sala_id_sala_id FOREIGN KEY (sala_id) REFERENCES salas(id)
);

CREATE TABLE prestamos(
    id INT PRIMARY KEY AUTO_INCREMENT,
    usuario_id INT UNIQUE,
    libro_id INT,
    fecha_prestamo VARCHAR(50) NOT NULL,
    fecha_devuelta VARCHAR(50) NOT NULL,
    CONSTRAINT fk_prestamos_usuario_id_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
    CONSTRAINT fk_prestamos_libro_id_libro_id FOREIGN KEY (libro_id) REFERENCES libros(id)
);


INSERT INTO usuarios (nombre, tipo) VALUES
('juan','administrador'),
('alfredo', 'visitante'),
('jhon', 'visitante');

SELECT * FROM usuarios

INSERT INTO categorias (nombre_categoria) VALUES
('ingenieria'),
('ciencia'),
('fisica');

SELECT * FROM categorias

INSERT INTO salas (numero) VALUES
('1'),
('2'),
('3');

SELECT * FROM salas

INSERT INTO libros (titulo, categoria_id, sala_id) VALUES
('ingenieria ambiental',1,1),
('Ciencias 1',2,2),
('fisica 1',3,3);

 SELECT * FROM libros
 
 INSERT INTO prestamos (usuario_id, libro_id, fecha_prestamo, fecha_devuelta) VALUES
(1,1,'10-02-2024','12-02-2024'),
(2,2,'14-02-2024','16-06-2024'),
(3,3,'16-02-2024','19-03-2024');

SELECT * FROM prestamos