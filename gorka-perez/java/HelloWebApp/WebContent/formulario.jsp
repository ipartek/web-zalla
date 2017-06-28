<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calcular edad jubilación</title>
</head>
<body>

	<h1>Calcular edad jubilación</h1>

	<form action="http://localhost:8080/HelloWebApp/"
		method="post">

		<label for="name">Edad</label> 
		<input type="text" required value="18" name="edad">
		<input type="submit" value="Calcular">

	</form>



	<%
		//código java que se puede juntar con html, porque se compila en el servidor

		//Recibir atributo enviado desde el HomeController
		String resultado = (String) request.getAttribute("resultado");
		if (resultado != null) {
	%>
	<p>Te faltan <%=resultado%> años para jubilarte</p>
	<%
		}
	%>
	

</body>
</html>