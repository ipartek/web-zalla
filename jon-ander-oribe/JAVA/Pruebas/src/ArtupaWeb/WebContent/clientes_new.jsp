<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@page import="java.util.List"%>
<%@page import="artupa.beans.Usuario"%>
<%
	String user = (String) session.getAttribute("user");
	List<Usuario> clientes = (List<Usuario>) request.getAttribute("clientes");
%>

<!-- MODIFICAR TODO EL JSP -->

<html>
<head>
<title>Esta es la web de Artupa</title>
<script language=JavaScript>
<!--
	function ejecutarOpcion(opcion) {
		if (opcion == 'alta') {
			alert('alta');
			document.form1.modo_entrada.value = 'modo_alta';
			document.form1.action = 'SrvProcesarCliente';
			document.form1.submit();
		} else {
			if (opcion == 'modificacion') {
				alert('modificacion');
				document.form1.modo_entrada.value = 'modo_modificacion';
				document.form1.action = 'SrvProcesarCliente';
				document.form1.submit();
			} else {
				alert('baja');
				document.form1.modo_entrada.value = 'modo_baja';
				document.form1.action = 'SrvEliminarCliente';
				document.form1.submit();
			}
		}
	}
	-->
</script>
</head>
<body>
	USUARIO:
	<b><c:out value="${sessionScope.nombre}" /></b>
	<form name=form1 method=post>
		<table>
			<tr>
				<th>Opci�n</th>
				<th>DNI</th>
				<th>NOMBRE</th>
				<th>APELLIDO</th>
				<th>EDAD</th>
			</tr>
			<%
				Usuario cliente = null;
				for (int i = 0; i < clientes.size(); i++) {
					cliente = clientes.get(i);
			%>
			<tr>
				<td><input type="radio" name="dni"
					value="<%=cliente.getDni()%>"></td>
				<td><%=cliente.getDni()%></td>
				<td><%=cliente.getNombre()%></td>
				<td><%=cliente.getApellido()%></td>
				<td><%=cliente.getEdad()%></td>
			</tr>
			<%
				}
			%>
		</table>
		<input type=hidden name=modo_entrada> <input type=button
			value=Nuevo onclick="JavaScript:ejecutarOpcion('alta')"> <input
			type=button value=Modificar
			onclick="JavaScript:ejecutarOpcion('modificacion')"> <input
			type=button value=Eliminar
			onclick="JavaScript:ejecutarOpcion('baja')">
	</form>
	<c:out value="Hello world! - From JSTL" />
</body>
</html>