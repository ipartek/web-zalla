<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="bdLibreria.beans.Libro"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tabla Libros</title>
<script language=JavaScript>
<!--
	function ejecutarOpcion(opcion) {
		if (opcion == 'comprar') {
			alert('Realizando compra');
			document.formStock.modo_entrada.value = 'modo_comprar';
			document.formStock.action = 'SrvCarrito';
			document.formStock.submit();
		} 
	}
	-->
</script>
</head>
<body>
	<%
		String user = (String) session.getAttribute("user");
		List<Libro> libros = (List<Libro>) request.getAttribute("libros");
	%>
	<h3>
		USUARIO:<%=user%></h3>
	<center>
		<form name=formStock method=post action=SrvCarrito>
			<h1>Tabla de stock</h1>

			<table>
				<tr>
					<th>Opción</th>
					<th>Comprar</th>
					<th>idLibro</th>
					<th>Nombre</th>
					<th>Cantidad</th>
					<th>Edición</th>
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
					<td><input type="text" name="cantidadStock" value=""></td>
					<td><%=libro.getIdLibro()%></td>
					<td><%=libro.getTitulo()%></td>
					<td><%=libro.getCantidad()%></td>
					<td><%=libro.getEditorial()%></td>
					<td><%=libro.getPrecio()%></td>
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