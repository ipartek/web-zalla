<%@page import="java.util.List"%>
<%@page import="artupa.beans.Pedido"%>
<%
	String user = (String) session.getAttribute("user");
	List<Pedido> pedidos = (List<Pedido>) request.getAttribute("pedidos");
%>
<html>
<head>
<title>Esta es la web de Artupa</title>
<script language=JavaScript>
<!--
	function ejecutarOpcion(opcion) {
		if (opcion == 'alta') {
			alert('alta');
			document.form1.modo_entrada.value = 'modo_alta';
			document.form1.action = 'SrvProcesarPedido';
			document.form1.submit();
		} else {
			if (opcion == 'modificacion') {
				alert('modificacion');
				document.form1.modo_entrada.value = 'modo_modificacion';
				document.form1.action = 'SrvProcesarPedido';
				document.form1.submit();
			} else {
				alert('baja');
				document.form1.modo_entrada.value = 'modo_baja';
				document.form1.action = 'SrvEliminarPedido';
				document.form1.submit();
			}
		}
	}
	-->
</script>
</head>
<body>
	USUARIO:
	<b><%=user%></b>
	<form name=form1 method=post>
		<table>
			<tr>
				<th>Opción</th>
				<th>DNI</th>
				<th>NOMBRE</th>
				<th>APELLIDO</th>
				<th>EDAD</th>
			</tr>
			<%
				Pedido pedido = null;
				for (int i = 0; i < pedidos.size(); i++) {
					pedido = pedidos.get(i);
			%>
			<tr>
				<td><input type="radio" name="dni"
					value="<%=pedido.getDni()%>"></td>
				<td><%=pedido.getDni()%></td>
				<td><%=pedido.getNombre()%></td>
				<td><%=pedido.getApellido()%></td>
				<td><%=pedido.getEdad()%></td>
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
</body>
</html>