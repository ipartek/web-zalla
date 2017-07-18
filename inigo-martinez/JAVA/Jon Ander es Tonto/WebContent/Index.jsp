<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logeo Librería virtual</title>
</head>
<body>

	<%
		String usu = request.getParameter("usuario");
		String passw = request.getParameter("password");

		if (usu.equals("Root"))
			if (passw.equals("admin")) {
				out.println("OK");
			}
	%>
	<form>
		<fieldset>
			<legend>Logeo inicial</legend>
			<label for="usuario">Usuario</label> <input name="usuario"
				type="text"> <label for="password">Contrasenia</label> <input
				name="password" type="password">
		</fieldset>
	</form>
</body>
</html>