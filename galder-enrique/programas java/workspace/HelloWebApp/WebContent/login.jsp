<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>

	<form action="/HelloWebApp/login" method="post">
		<label>Usuario</label>
		<input type="text" required="required" name="usuario">
		<label>Contraseña</label>
		<input type="password" required="required" name="password">
		<input type="submit" value="Login">
	</form>
	<% 
	//Esto es codigo java y lo puedo juntar con HTML, porque se compila en el servidor
	//recibir atributo enviado desde el HomeController
	String correcto = (String)request.getAttribute("correcto");
	String usuario = (String)session.getAttribute("user");
				if(correcto=="true"){
	%>
					<p>Usuario correcto</p>
					<p>Bienvenido <%=usuario%></p>
					<a href="/HelloWebApp/king-kong/index.html">Ir al menú</a>
	<%
				}else{
	%>
					<p>Usuario incorrecto</p>
	<%
		}//end if
	%>
	

</body>
</html>