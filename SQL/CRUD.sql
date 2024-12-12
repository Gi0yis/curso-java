-- CREATE SCHEMA `zona_fit_db`;

USE zona_fit_db;

/* CREATE TABLE `cliente` (
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(45) NULL,
apellido VARCHAR(45) NULL,
menbresia INT NULL,
PRIMARY KEY (id),
UNIQUE INDEX menbresia_UNIQUE (menbresia ASC) VISIBLE
); */

-- CRUD - Create(INSERT) - Read(SELECT) - Update(UPDATE) - Delete(DELETE)

SELECT * FROM cliente;

INSERT INTO `cliente` (nombre, apellido, menbresia) 
VALUES ('Carlos', 'Moreno', 300);

UPDATE cliente SET apellido = 'Juarez', menbresia = 200 WHERE id = 2;

DELETE FROM cliente WHERE id = 4;