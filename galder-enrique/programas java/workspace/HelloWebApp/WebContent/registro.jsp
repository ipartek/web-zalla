<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registrarse</title>
</head>
<body>
	<h1>Registro</h1>

	<form action="/HelloWebApp/login" method="post">
		<label>Usuario</label>
		<input type="text" required="required" name="usuarioRegistro">
		<label>Contraseña</label>
		<input type="password" required="required" name="passwordRegistro">
		<input type="submit" value="Login">
	</form>
	<% 
	//Esto es codigo java y lo puedo juntar con HTML, porque se compila en el servidor
	//recibir atributo enviado desde el HomeController
	String correcto = (String)request.getAttribute("correcto");
				if(correcto=="false"){
	%>
					<p>Usuario repetido. Pruebe a utilizar variantes del usuario.</p>
	<%
				}//end if
	%>
	

</body>
</html>