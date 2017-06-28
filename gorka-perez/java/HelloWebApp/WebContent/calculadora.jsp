<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculadora</title>
</head>
<body>

	<h1>Calculadora para retards</h1>
	<label for="name">Operador1</label>
	<input type="number" required value="0" name="Operador1">
	<label for="name">Operador2</label>
	<input type="number" required value="0" name="Operador2">



	<%
		//código java que se puede juntar con html, porque se compila en el servidor

		//Recibir atributo enviado desde Calcular
		String resultado = (String) request.getAttribute("resultado");
		if (resultado != null) {
	%>
	<label for="name">Resultado</label>
	<input type="text" value=<%=resultado%> name="Resultado">
	
	<%
		}
	%>


</body>
</html>