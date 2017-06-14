CREATE DATABASE IF NOT EXISTS SubastasDDBB;
USE SubastasDDBB;

CREATE TABLE IF NOT EXISTS usuarios(
id int(1) NOT NULL auto_increment,
nombre varchar(20) default NULL,
credito double(8,0) default NULL,
PRIMARY KEY(id)
)ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS subastas(
id int(1) NOT NULL,
nombre varchar(50) NOT NULL,
estado boolean NOT NULL,
puja double(8,0) NOT NULL,
PRIMARY KEY(id)
)ENGINE=InnoDB;

INSERT INTO `usuarios` (`nombre`,`credito`) VALUES
( "Cristina", 7405),( "Pedro", 2840),
( "Ghao-Pin", 12000),("Magnate del petroleo", 300),
( "Artista anonimo", 210),("Mariano", 3400);

INSERT INTO `subastas` (`id`,`nombre`,`estado`,`puja`) VALUES 
(1,"Jarron Minh", true, 0.0),
(2,"Brujula Mágica", true, 350),
(3,"Joya ridiculamente brillante",true, 280),
(4,"Monton de estiercol", false, 12);

