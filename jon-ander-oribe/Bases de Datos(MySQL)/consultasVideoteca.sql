USE videoteca;


SELECT titulo ,CONCAT(a.nombre,' ',a.apellido) Interprete,CONCAT(d.nombre,' ',d.apellido) Director
FROM pelicula p 
JOIN actores_por_pelicula app ON p.id_Pelicula=app.id_PeliculaInter 
JOIN actor a ON app.id_ActorInter=a.id_Actor
JOIN directores_por_pelicula dp ON p.id_Pelicula=dp.id_PeliculaInter
JOIN director d ON dp.id_DirectorInter=d.id_Director ;

