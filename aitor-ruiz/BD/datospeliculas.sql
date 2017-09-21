USE videoteca;
INSERT INTO pelicula(titulo,director,actor) VALUES("Blade Runner","Ridley Scott","Harrison Ford");
INSERT INTO pelicula(titulo,director,actor) VALUES("El señor de los anillos","Jackson","Vigo Mortensen");
INSERT INTO pelicula(titulo,director,actor) VALUES("Harry Potter","Tommy","Dobby");
INSERT INTO pelicula(titulo,director,actor) VALUES("Invicto","Perico","Boyka");
SELECT * FROM pelicula WHERE titulo='Invicto';