<%@page import="artupa.beans.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="artupa.beans.Pedido"%>
<%
	String user = (String) session.getAttribute("user");
	Cliente cliente = (Cliente) request.getAttribute("cliente");
	List<Pedido> Pedidos = (List<Pedido>) request.getAttribute("pedidos");
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
				<th>NUMERO PEDIDO</th>
				<th>DETALLE PEDIDO</th>

			</tr>
			<%
				Pedido pedido = null;
				for (int i = 0; i < Pedidos.size(); i++) {
					pedido = Pedidos.get(i);
			%>
			<tr>
				<td><input type="radio" name="dni" value="<%=pedido.getDni()%>"></td>
				<td><%=pedido.getNumPedido()%></td>
				<td><%=pedido.getDetallePedido()%></td>
			</tr>
			<%
				}
			%>
		</table>
		<input type=hidden name=modo_entrada> <input type=hidden
			name=dniCliente value="<%=cliente.getDni()%>"> <input
			type=button value=Nuevo onclick="JavaScript:ejecutarOpcion('alta')">
		<input type=button value=Modificar
			onclick="JavaScript:ejecutarOpcion('modificacion')"> <input
			type=button value=Eliminar
			onclick="JavaScript:ejecutarOpcion('baja')">
	</form>
</body>
</html>