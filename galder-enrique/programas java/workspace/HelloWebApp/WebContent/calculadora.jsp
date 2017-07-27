<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculadora</title>
</head>
<body>
	<form action="/HelloWebApp/calculadora" method="post">
		<label>Primer Número</label>
		<input type="number" required="required" name="numero1">
		<label>Segundo Número</label>
		<input type="number" required="required" name="numero2">
		<input type="submit" value="Calcular">
	</form>
	<% 
	//Esto es codigo java y lo puedo juntar con HTML, porque se compila en el servidor
	//recibir atributo enviado desde el HomeController
	String resultadoSuma = (String)request.getAttribute("resultadoSuma");
	String resultadoDivision = (String)request.getAttribute("resultadoDivision");
				if(resultadoSuma!=null){
	%>
					<p>La suma es = <%=resultadoSuma%></p>
					<p>La división es = <%=resultadoDivision%></p>
					
	<%
		}//end if
	%>

</body>
</html>