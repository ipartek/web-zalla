
DROP TABLE IF EXISTS pelicula;
CREATE TABLE IF NOT EXISTS pelicula(
id INT NOT NULL AUTO_INCREMENT,
titulo VARCHAR(64),
director VARCHAR(64),
actor VARCHAR(64),
PRIMARY KEY (id)
)ENGINE=InnoDB;

INSERT INTO pelicula VALUES (0,"Star-Wars","George Lucas","Harrison Ford"),
(0,"Indiana Jones","Steven Spielberg","Harrison Ford"),
(0,"Blade Runner","Ridley Scott","Harrison Ford"),
(0,"Alien","Ridley Scott","Sigourney Weaver"),
(0,"El padrino","Francis Ford Copola","Marlon Brandon"),
(0,"El hobbit","Peter Jackson","Elya Wood"),
(0,"Batman","Christopher Nolan","Christian Bale");