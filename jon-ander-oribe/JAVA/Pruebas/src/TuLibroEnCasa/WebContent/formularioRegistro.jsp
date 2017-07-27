<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registro Usuarios</title>
</head>
<body>

	<h1>Libreria Virtual Clon: Registro de Usuario</h1>

	<form name=form2 action=SrvRegistro method=post>
		<label>Nombre</label><br> <input type=text name=nombre><br>
		<label>Primer Apellido</label><br> <input type=text name=primerApellido><br>
		<label>Segundo Apellido</label><br><input type=text name=segundoApellido><br>
		<label>DNI</label><br> <input type=text name=dni><br>
		<label>Direccion</label><br> <input type=text name=direccion><br>
		<label>Fecha de Nacimiento</label><br><input type=date step=7 min=1914-09-08 name=fechaDeNacimiento><br>
		<label>E-mail</label><br> <input type=text name=mail><br>
		<label>Usuario</label><br> <input type=text name=nombreUsuario><br>
		<label>Clave</label><br><input type=text name=password><br>
		<label>Confirmar Clave</label><br> <input type=text name=confirmPassword><br>
		
		<input type=submit value=Enviar>
	</form>

</body>
</html>