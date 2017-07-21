<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina menu</title>
</head>
<body>
<!-- http://130.206.138.139:8080/TuLibroEnCasa/ -->
<%		String user = (String) session.getAttribute("user");
 %>
 <center>
<h3>USUARIO:<%=user %></h3>
<h1>Libreria Virtual:Menu</h1>

	<form name=form3 action=SrvLogin method=post>
		<input type="button" name="comprarLibro" value="Comprar Libros"><br>
		<input type="button" name="foro" value="Foro"><br>
		<input type="button" name="modificarDatos" value="Modificar"><br>
		</center>