<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calcular edad de jubilacion</title>
</head>
<body>

	<h1>Calcular la edad de jubilacion</h1>
	<form action="http://localhost:8080/HelloWebApp/" method="post">
		<label for="edad">Edad</label> <input type="text" value="18"
			name="edad" required> <input type="submit" value="Calcular">

	</form>


	<%
		//Esto es JAVA pero puedo juntarlo con HTML porque compila en el SERVER 

		//Atributo enviado desde HomeController
		String resultado = (String) request.getAttribute("resultado");
		if (resultado != null) {
	%>
	<p>
		Te faltan
		<%=resultado%>
		años para jubilarte
	</p>
	<%
		}//end:if 
		else {
	%>
	<p>Esto PETA</p>
	<%
		}
	%>
</body>
</html>