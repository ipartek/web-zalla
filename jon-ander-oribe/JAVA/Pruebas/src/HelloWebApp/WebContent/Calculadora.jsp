<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculadora</title>
</head>
<body>

	<form action="http://localhost:8080/HelloWebApp/CalculadorController" method="post">
		<label for="valor1">Valor1</label> <input type="text" value="1"
			name="valor1" required>
		<label for="valor2">Valor2</label> <input type="text" value="1" name="valor2" required>
		
		
		<input type="submit" value="Calcular">

	</form>
	<%String resultado2=(String) request.getAttribute("resultado2"); %>
	<p>El total es de <%=resultado2%></p>
</body>
</html>