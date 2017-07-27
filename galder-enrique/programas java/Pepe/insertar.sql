use pelis;

delete from actores_en_peliculas;
delete from directores_en_peliculas;
delete from genero;
delete from soporte;
delete from director;
delete from actor;
delete from pelicula;



insert into actor(nombre, apellidos, imdb) values 
('Harrison', 'Ford', 'nm1000148'),
('Tom', 'Hanks', 'nm2000148'),
('Woody', 'Harrelson', 'nm3000148'),
('Scarlet', 'Johansson', 'nm4000148'),
('Will', 'Smith', 'nm5000148');

insert into director(nombre, apellidos, imdb) values 
('Ridley','Scott','nm6000148'),
('James','Cameron','nm7000148'),
('James','Wan','nm8000148'),
('M.Night','Shyamalan','nm9000148'),
('Fernando','Trueba','nm1000148');


insert into soporte(nombre) values
('VID'),
('RAY'),
('DVD'),
('RAR'),
('MKV');

insert into genero(nombre) values
('Accion'),
('Drama'),
('Terror'),
('Aventuras'),
('Comedia');




insert into pelicula(titulo, idSoporte, idGenero) values
('Blade Runner',1,1),
('El planeta de los simios',2,2),
('Sully',3,3),
('Independence day',4,4),
('Ghost in the shell',5,5);

select idActor from actor;
select idPelicula from pelicula;


insert into actores_en_peliculas(idPelicula, idActor) values
(1,1),
(2,3),
(3,3),
(4,5),
(5,4)
;
insert into directores_en_peliculas(idPelicula, idDirector) values
(1,1),
(2,2),
(3,3),
(4,4),
(5,5)
;

drop index cambio_pelicula on pelicula;
alter table pelicula add index cambio_pelicula(titulo,idSoporte);



