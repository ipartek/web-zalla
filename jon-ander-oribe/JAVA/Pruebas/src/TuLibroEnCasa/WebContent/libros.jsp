<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="bdLibreria.beans.Libro"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tabla Libros</title>
</head>
<body>
	<%
		String user = (String) session.getAttribute("user");
		List<Libro> libros = (List<Libro>) request.getAttribute("libros");
	%>
	<h3>
		USUARIO:<%=user%></h3>
	<center>
		<form name=form2 method="post">
			<h1>Tabla de stock</h1>

			<table>
				<tr>
					<th>Opción</th>
					<th>idLibro</th>
					<th>Nombre</th>
					<th>Cantidad</th>
					<th>Edición</th>
					<th>Lanzamiento</th>
					<th>Precio</th>
					<th>Genero</th>
					<th>Autor</th>
				</tr>

				<%
					Libro libro = null;
					for (int i = 0; i < libros.size(); i++) {
						libro = libros.get(i);
				%>

				<tr>
					<td><input type="radio" name="RbidLibro"
						value="<%=libro.getIdLibro()%>"></td>
					<td><%=libro.getIdLibro()%></td>
					<td><%=libro.getTitulo()%></td>
					<td><%=libro.getCantidad()%></td>
					<td><%=libro.getEdicion()%></td>
					<td><%=libro.getLanzamiento()%></td>
					<td><%=libro.getPrecio()%></td>
					<td><%=libro.getIdGenero()%></td>
					<td><%=libro.getIdAutor()%></td>
				</tr>
				<%
					}
				%>
			</table>
		</form>
	</center>
</body>
</html>