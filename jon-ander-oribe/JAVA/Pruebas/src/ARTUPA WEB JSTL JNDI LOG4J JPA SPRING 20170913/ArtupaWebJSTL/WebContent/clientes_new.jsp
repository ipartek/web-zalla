<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:bundle basename="artupa.i18n.Mensajes">
	<html>
<head>
<title><fmt:message key="artupa.titulo" /></title>
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
	<fmt:message key="artupa.global" />
	:
	<b><c:out value="${applicationScope.global}" /></b>
	<br />
	<fmt:message key="artupa.usuario" />
	:
	<b><c:out value="${sessionScope.user}" /></b>
	<form name=form1 method=post>
		<table>
			<tr>
				<th><fmt:message key="artupa.clientes.opcion" /></th>
				<th><fmt:message key="artupa.clientes.dni" /></th>
				<th><fmt:message key="artupa.clientes.nombre" /></th>
				<th><fmt:message key="artupa.clientes.apellido" /></th>
				<th><fmt:message key="artupa.clientes.edad" /></th>
			</tr>
			<c:forEach items="${clientes}" var="cliente">
			<tr>
				<td><input type="radio" name="dni"
					value="${cliente.dni}"></td>
				<td>${cliente.dni}</td>
				<td>${cliente.nombre}</td>
				<td>${cliente.apellido}</td>
				<td>${cliente.edad}</td>
			</tr>
			</c:forEach>
		</table>
		<input type=hidden name=modo_entrada> <input type=button
			value=<fmt:message key="artupa.clientes.nuevo" /> onclick="JavaScript:ejecutarOpcion('alta')"> <input
			type=button value=<fmt:message key="artupa.clientes.modificar" />
			onclick="JavaScript:ejecutarOpcion('modificacion')"> <input
			type=button value=<fmt:message key="artupa.clientes.eliminar" />
			onclick="JavaScript:ejecutarOpcion('baja')">
	</form>
</body>
	</html>
</fmt:bundle>