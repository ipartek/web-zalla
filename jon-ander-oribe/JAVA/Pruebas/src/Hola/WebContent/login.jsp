<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pantalla de Login</title>
</head>
<body>
	<form action="http://localhost:8080/Hola/cicloVida" method="post">
		<label>Usuario</label> <input type="text" name="usuario" value="Paco"
			required> <label>Contraseña</label> <input type=text
			name="contrasenia" value="1234" required> <input
			type="submit" value="enviar">
	</form>

	<%
		String resultadoNombre = (String) request
				.getAttribute("resultadoNombre");
		String resultadoContrasenia = (String) request
				.getAttribute("resultadoContrasenia");
		
		String sesionNombre= (String) session.getAttribute("nombre");
		String sesionPassword=(String) session.getAttribute("password");
		
	
		String alMenu=(String) request.getAttribute("alMenu");
		String wee= (String) request.getAttribute("wee");
		

		
	
	%>
	
	<p>
		Datos:
		<%=resultadoNombre%>
		<%=resultadoContrasenia%>
		<%=sesionNombre %>
		<%=sesionPassword %>

	</p>
	<p>Aqui va el link al menu</p>
	<a href="menu.jsp">
	<%=alMenu %>
	<%=wee %>
	</a>
</body>
</html>