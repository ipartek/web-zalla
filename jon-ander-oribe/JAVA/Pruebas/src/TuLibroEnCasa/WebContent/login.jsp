<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Página de Login</title>
</head>
<body>
	<h1>Librería Virtual Clonica:Acceso</h1>

	<%
		String user = (String) session.getAttribute("user");
		String password = (String) session.getAttribute("password");
	%>

	<form name=form1 action=SrvLogin method=post>
		<label>Usuario</label><br> <input type=text name=user><br>
		<label>Password</label><br> <input type=text name=password><br>
		<input type=submit value=Enviar>
	</form>
	
	<p>Si no estas registrado <a href="formularioRegistro.jsp">pincha aqui</a></p>
<%=user %>
<%=password %>
</body>
</html>