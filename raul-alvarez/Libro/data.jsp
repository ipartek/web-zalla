<!DOCTYPE html>
	<html lang="es">
	<head>
		<meta charset="UTF-8">
		<title>Document</title>
	</head>
	<body>
		<%
		  String nombre=request.getParameter("nombre");
		boolean correcto=true;
		if (!nombre.equals("JUAN"))
		{
	correcto=false;
}
		%>

	</body>
	</html>	