use libros;


delete from categoria;
delete from editorial;
delete from libro;
delete from autor;
delete from user;




insert into categoria(idCategoria, nomCategoria) values 
(1, 'Terror'),
(2, 'Drama'),
(3, 'Ciencia Ficción'),
(4, 'Comedia'),
(5, 'Animación');

insert into editorial(idEditorial, nomEditorial) values 
(1,'Plaza y Janés'),
(2,'Planeta'),
(3,'Anaya'),
(4,'Santillana'),
(5,'Ediciones S.M.');


insert into autor(idAutor,nombre,apellidos) values
(1,'Agatha','Christie'),
(2,'Stephen','King'),
(3,'Bram','Stoker'),
(4,'Julio','Verne'),
(5,'Orson','Welles');

insert into libro(ISBN,titulo,autor,categoria,editorial,precio,stock) values
('00001','La niebla',2,1,3,20.20,10),
('00002','Asesinato en Mesopotamia',1,1,1,10.10,100),
('00003','Drácula',3,4,5,18.13,5),
('00004','La guerra de los mundos',5,5,2,358.69,1),
('00005','Viaje al centro de la tierra',4,3,5,8.99,1000);

insert into user (DNI,nombre,primerApellido,segundoApellido,direccion,fechaNacimiento,email,usuario,clave,confClave) values
(00000001,'Galder','Enrique','Vergara','La paz 1','1986-07-19','galderenrique@hotmail.com','galder','galder','galder'),
(00000002,'Eneko','Enrique','Vergara','La paz 1','1971-10-15','enekoenrique@hotmail.com','eneko','eneko','eneko');











