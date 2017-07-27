<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="libreriavirtual.beans.Libro"%>
<%
	String user = (String) session.getAttribute("user");
	List<Libro> listaLibros = (List<Libro>)session.getAttribute("libros");
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin t&iacute;tulo</title>
</head>

<body>
	USUARIO:
	<b><%=user%></b>
	<center>
		<form id="form1" name="form1" method="post" action="/TuLibroEnCasa/servlet/SrvSeleccionarLibros">
<h2>RESULTADOS DE LA B&Uacute;SQUEDA</h2>
<br />
<br />
<table width="721">
	<tr>
        <td>&nbsp;</td>
        <td><b>Cantidad</b></td>
        <td><b>ISBN</b></td>
        <td><b>T&iacute;tulo</b></td>
        <td><b>Autor</b></td>
        <td><b>Categor&iacute;a</b></td>
        <td><b>Editorial</b></td>    
        <td><b>Precio Unidad</b></td>
        <td><b>Stock</b></td>
	</tr>
	<% 
	Libro libro = null;
	for(int i=0; i<listaLibros.size(); i++){ 
		libro = listaLibros.get(i);
	%>
	
	
    <tr>
        <td><input name="isbn" type="checkbox" value="1111111111151" /></td>
        <td><input name="cantidad_1111111111151" type="text" size="4" maxlength="4"/></td>
        <td><%libro.getIsbn(); %></td>
        <td><%libro.getTitulo(); %></td>
        <td><%libro.getCod_autor(); %></td>
        <td><%libro.getCod_categoria(); %></td>
        <td><%libro.getCod_editorial(); %></td>
        <td><%libro.getPrecio(); %></td>
        <td><%libro.getStock(); %></td>
	</tr>
	<% 
	}
	%>
	
		
	</center>
</body>
</html>
