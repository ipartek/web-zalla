DROP DATABASE IF EXISTS videoteca;
CREATE DATABASE IF NOT EXISTS videoteca;

USE videoteca;

SET foreign_key_checks=0;

DROP TABLE IF EXISTS pelicula;
CREATE TABLE IF NOT EXISTS pelicula(
id_Pelicula INT NOT NULL AUTO_INCREMENT,
titulo VARCHAR(64),
id_director INT,
id_actor INT,
id_genero INT,
id_soporte INT,
estreno YEAR,
PRIMARY KEY (id_Pelicula),
CONSTRAINT fk_actor FOREIGN KEY (id_actor) REFERENCES actor(id_Actor)
)ENGINE=InnoDB;

INSERT INTO pelicula VALUES (0,"Star-Wars",1,1,1,2,"1987"),
(0,"Indiana Jones",2,1,2,1,"1992"),
(0,"Blade Runner",3,1,1,1,"1975"),
(0,"Alien",3,2,2,2,"1987"),
(0,"El padrino",4,4,3,2,"1983"),
(0,"El hobbit",5,3,4,2,"2012"),
(0,"Batman",6,5,4,1,"1990");

DROP TABLE IF EXISTS actor;
CREATE TABLE IF NOT EXISTS actor(
id_Actor INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(64),
apellido VARCHAR(64),
imdb_Actor VARCHAR(64),
PRIMARY KEY(id_Actor)
)ENGINE=InnoDB;

INSERT INTO actor VALUES(0,"Harrison","Ford","nm1102273"),
(0,"Sigourney","Weaver","nm6652273"),
(0,"Elya","Wood","nm1772273"),
(0,"Marlon","Brando","nm1132273"),
(0,"Christian","Bale","nm1657273");

DROP TABLE IF EXISTS director;
CREATE TABLE IF NOT EXISTS director(
id_Director INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(64),
apellido VARCHAR(64),
imdb_Director VARCHAR(64),
PRIMARY KEY (id_Director)
)ENGINE=InnoDB;

INSERT INTO director VALUES (0,"George","Lucas","nm2202293"),
(0,"Steven","Spielberg","nm3354293"),
(0,"Ridley", "Scott","nm7756293"),
(0,"Francis", "Ford Copola","nm2445293"),
(0,"Peter","Jackson","nm2202773"),
(0,"Christopher", "Nolan","nm2554293");

DROP TABLE IF EXISTS soporte;
CREATE TABLE IF NOT EXISTS soporte(
id_Soporte INT AUTO_INCREMENT,
nombre VARCHAR(32),
descripcion VARCHAR(32),
PRIMARY KEY(id_Soporte))ENGINE=InnoDB;

INSERT INTO soporte VALUES(0,"Cinta","Formato obsoleto"),
(0,"DVD","Formato moderno"),
(0,"Blue-Ray","Formato Ultramoderno");

DROP TABLE IF EXISTS genero;
CREATE TABLE IF NOT EXISTS genero(
id_Genero INT AUTO_INCREMENT,
nombre VARCHAR(32),
descripcion VARCHAR(32),
PRIMARY KEY(id_Genero))ENGINE=InnoDB;

INSERT INTO genero VALUES (0,"CF","Futurista"),
(0,"FF","Aventuras"),
(0,"PL","Crimen"),
(0,"SH","Super-Heroes");

DROP TABLE IF EXISTS actores_por_pelicula;
CREATE TABLE IF NOT EXISTS actores_por_pelicula(
id_PeliculaInter INT,
id_ActorInter INT,
PRIMARY KEY(id_PeliculaInter,id_ActorInter),
INDEX actores_por_pelicula_fk1(id_PeliculaInter),
INDEX actores_por_pelicula_fk2(id_ActorInter),
CONSTRAINT fk_PeliculaInter FOREIGN KEY (id_PeliculaInter) REFERENCES Pelicula(id_Pelicula),
CONSTRAINT fk_ActorInter FOREIGN KEY (id_ActorInter) REFERENCES actor(id_Actor)
)ENGINE=InnoDB;

INSERT INTO actores_por_pelicula VALUES (1,1),(2,1),(3,1),(4,4),(5,3),(6,5);

DROP TABLE IF EXISTS directores_por_pelicula;
CREATE TABLE IF NOT EXISTS directores_por_pelicula(
id_PeliculaInter INT,
id_DirectorInter INT,
PRIMARY KEY(id_PeliculaInter,id_DirectorInter),
INDEX directores_por_pelicula_fk1(id_PeliculaInter),
INDEX directores_por_pelicula_fk2(id_DirectorInter),
CONSTRAINT fk_PeliculaDirectInter FOREIGN KEY (id_PeliculaInter) REFERENCES Pelicula(id_Pelicula),
CONSTRAINT fk_DirectorInter FOREIGN KEY (id_DirectorInter) REFERENCES director(id_Director)
)ENGINE=InnoDB;

INSERT INTO directores_por_pelicula VALUES (1,1),(2,1),(3,3),(4,3),(5,4),(6,5),(7,6);


 SET foreign_key_checks=1;

