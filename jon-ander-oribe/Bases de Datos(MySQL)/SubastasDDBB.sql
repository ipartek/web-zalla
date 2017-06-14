CREATE DATABASE IF NOT EXISTS SubastasDDBB;
USE SubastasDDBB;

CREATE TABLE IF NOT EXISTS usuarios(
id int(1) NOT NULL,
nombre varchar(20) default NULL,
credito double(8,0) default NULL,
PRIMARY KEY(id)
)ENGINE=InnoDB;

INSERT INTO `usuarios` (`id`,`nombre`,`credito`) VALUES
(0, "Mariano", 3400),(1, "Cristina", 7405),(2, "Pedro", 2840),
(3, "Ghao-Pin", 12000),(4, "Magnate del petroleo", 300),
(5, "Artista anonimo", 210)

