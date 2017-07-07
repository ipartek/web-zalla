DROP DATABASE IF EXISTS videoteca;
CREATE DATABASE IF NOT EXISTS videoteca;

USE videoteca;

SET foreign_key_checks=0;

DROP TABLE IF EXISTS pelicula;
CREATE TABLE IF NOT EXISTS pelicula(
id_Pelicula INT NOT NULL AUTO_INCREMENT,
titulo VARCHAR(64),
director VARCHAR(64),
actor VARCHAR(64),
imdb_Director VARCHAR(20),
imdb_Actor VARCHAR(20),
id_Actor INT,
genero VARCHAR(2),
genero_desc VARCHAR(32),
PRIMARY KEY (id_Pelicula),
CONSTRAINT fk_actor FOREIGN KEY (id_Actor) REFERENCES actor(id_Actor)
)ENGINE=InnoDB;

INSERT INTO pelicula VALUES (0,"Star-Wars","George Lucas","Harrison Ford","nm2202293","nm1102273",1,"CF","Aventuras"),
(0,"Indiana Jones","Steven Spielberg","Harrison Ford","nm3354293","nm1102273",1,"CF","Aventuras"),
(0,"Blade Runner","Ridley Scott","Harrison Ford","nm7756293","nm1102273",1,"CF","Aventuras"),
(0,"Alien","Ridley Scott","Sigourney Weaver","nm7756293","nm6652273",2,"CF","Aventuras"),
(0,"El padrino","Francis Ford Copola","Marlon Brando","nm2445293","nm1132273",3,"PL","Crimen"),
(0,"El hobbit","Peter Jackson","Elya Wood","nm2202773","nm1772273",4,"CF","Aventuras"),
(0,"Batman","Christopher Nolan","Christian Bale","nm2554293","nm1657273",5,"CF","Aventuras");

DROP TABLE IF EXISTS actor;
CREATE TABLE IF NOT EXISTS actor(
id_Actor INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(64),
edad INT,
numOscars INT,
PRIMARY KEY(id_Actor)
)ENGINE=InnoDB;

INSERT INTO actor VALUES(0,"Harrison Ford",60,11),
(0,"Sigourney Weaver",54,8),
(0,"Elya Wood",38,2),
(0,"Marlon Brando",78,13),
(0,"Christian Bale",39,3);



SET foreign_key_checks=1;

