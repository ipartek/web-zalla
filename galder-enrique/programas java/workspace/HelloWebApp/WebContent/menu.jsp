<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MENU PRINCIPAL</title>
</head>
<body>
	<h1>Registro</h1>
	
		<ul>
		<li></li>
		</ul>

	<form action="/HelloWebApp/LoginController" method="post">
		<label>Usuario</label>
		<input type="text" required="required" name="usuarioRegistro">
		<label>Contraseña</label>
		<input type="password" required="required" name="passwordRegistro">
		<input type="submit" value="Login">
	</form>
	
	

</body>
</html>