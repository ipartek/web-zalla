<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="artupa.beans.Pedido"%>
<%
	String user = (String) session.getAttribute("user");
	List<Pedido> pedidos = (List<Pedido>) request.getAttribute("pedidos");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Web para gestion de pedidos</title>
<script language=JavaScript>
<!--
	function ejecutarOpcion(opcion) {
		if (opcion == 'alta') {
			alert('alta');
			document.formPedidos1.modo_entrada.value = 'modo_alta';
			document.formPedidos1.action = 'SrvProcesarPedido';
			document.formPedidos1.submit();
		} else {
			if (opcion == 'modificacion') {
				alert('modificacion');
				document.formPedidos1.modo_entrada.value = 'modo_modificacion';
				document.formPedidos1.action = 'SrvProcesarPedido';
				document.formPedidos1.submit();
			} else {
				alert('baja');
				document.formPedidos1.modo_entrada.value = 'modo_baja';
				document.formPedidos1.action = 'SrvEliminarPedido';
				document.formPedidos1.submit();
			}
		}
	}
	-->
</script>
</head>
<body>
	USUARIO:
	<b><%=user%></b>
	<form name=formPedidos1 method=post>
		<table>
			<tr>
				<th>Opcion</th>
				<th>DNI</th>
				<th>NUMPEDIDO</th>
				<th>DETALLE</th>

			</tr>
			<%
				Pedido pedido = null;
				for (int i = 0; i < pedidos.size(); i++) {
					pedido = pedidos.get(i);
			%>
			<tr>
				<td><input type="radio" name="dni" value="<%=pedido.getDni()%>"></td>
				<td><%=pedido.getDni()%></td>
				<td><%=pedido.getNumPedido()%></td>
				<td><%=pedido.getDetallePedido()%></td>
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