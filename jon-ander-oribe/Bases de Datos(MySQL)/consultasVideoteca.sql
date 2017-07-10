USE videoteca;


SELECT titulo  ,CONCAT(nombre,' ',apellido) Interprete
FROM pelicula p 
JOIN actores_por_pelicula app ON p.id_Pelicula=app.id_PeliculaInter 
JOIN actor a ON app.id_ActorInter=a.id_Actor ;

