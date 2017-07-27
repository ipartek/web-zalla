<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List"%>
<%@page import="bdLibreria.beans.Libro"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Web Carrito</title>
</head>
<body>
	<%
		String user = (String) session.getAttribute("user");
		List<Libro> libros = (List<Libro>) request.getAttribute("libros");
	%>
<center><h1>Tu carrito:</h1>

<table>
				<tr>
					<th>Opción</th>
					<th>Unidades</th>
					<th>idLibro</th>
					<th>Nombre</th>
					<th>Editorial</th>
					<th>Precio Total</th>
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
					<td><input type="text" name="cantidadStock" value=""></td>
					<td>SUMA UNIDADES</td>
					<td><%=libro.getIdLibro()%></td>
					<td><%=libro.getTitulo()%></td>
					<td><%=libro.getEditorial()%></td>
					<td>SUMA PRECIO</td>
					<td><%=libro.getIdGenero()%></td>
					<td><%=libro.getIdAutor()%></td>
				</tr>
				<%
					}
				%>


			</table>
			<input type=submit name=compra_prueba value=Testeame>
			<input type=hidden name=modo_comprar><input type=button value=Comprar onclick="JavaScript:ejecutarOpcion('comprar')">
		</form>
</center>

</body>
</html>