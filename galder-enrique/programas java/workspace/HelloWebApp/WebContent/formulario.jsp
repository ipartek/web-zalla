<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calcular Edad Jubilación</title>
</head>
<body>
	<h1>Calcular Edad Jubilación</h1>

	<form action="/HelloWebApp/home" method="post">
		<label for="name">Edad</label>
		<input type="text" required="required" value="18" name="edad">
		<input type="submit" value="Calcular">
	</form>
	<% 
	//Esto es codigo java y lo puedo juntar con HTML, porque se compila en el servidor
	//recibir atributo enviado desde el HomeController
	String resultado = (String)request.getAttribute("resultado");
				if(resultado!=null){
	%>
					<p>Te faltan <%=resultado%> años para jubilarte</p>
	<%
		}//end if
	%>
	

</body>
</html>