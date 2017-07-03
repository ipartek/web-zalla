<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% 
	String resultado = "";
	if(request.getAttribute("resultado")!=null){
		resultado = (String)request.getAttribute("resultado");		
	}
	%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculadora</title>
</head>
<body>
	<h1>Calculadora</h1>
	
	<form action="calcular" method ="post">
		<p><label for="param1">numero 1:</label>
		<input type="text" name="param1" id="param1">
		</p>
		
		<p><label for="param2">numero 2:</label>
		<input type="text" name="param2" id="param2">
		</p>
		
		<input type="submit" value="Sumar">
	</form>
	
	<%=resultado %>
</body>
</html>