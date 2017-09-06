<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:bundle basename="artupa.i18n.Mensajes">
	<c:set var="modo_entrada" value="${param.modo_entrada}" scope="request" />
	<c:set var="opcion" value="" scope="request" />
	<html>
<head>
<title><fmt:message key="artupa.titulo"/></title>
<script language=JavaScript>
<!--
	function ejecutarOpcion(opcion) {
		if (opcion == 'alta') {
			document.form1.modo_entrada.value = 'modo_alta';
			document.form1.action = 'SrvActualizarCliente';
			document.form1.submit();
		} else {
			document.form1.modo_entrada.value = 'modo_modificacion';
			document.form1.action = 'SrvActualizarCliente';
			document.form1.submit();
		}
	}
	-->
</script>
</head>
<body>
	<fmt:message key="artupa.usuario" />
	:
	<b><c:out value="${sessionScope.user}" /></b>
	<form name=form1 method=post>
		<c:choose>
			<c:when test="${modo_entrada=='modo_alta'}">
				<c:set var="opcion" value="alta" scope="request" />
				<fmt:message key="artupa.cliente.dni" />: <input type=text name=dni>
				<br>
				<fmt:message key="artupa.cliente.nombre" />: <input type=text
					name=nombre size=30>
				<br>
				<fmt:message key="artupa.cliente.apellido" />: <input type=text
					name=apellido size=30>
				<br>
				<fmt:message key="artupa.cliente.edad" />: <input type=text
					name=edad>
				<br>
				<fmt:message key="artupa.cliente.direccion" />: <input type=text
					name=direccion size=30>
				<br>
				<fmt:message key="artupa.cliente.codPostal" />: <input
					type=text name=codPostal>
				<br>
				<fmt:message key="artupa.cliente.localidad" />: <input type=text
					name=localidad size=30>
				<br>
				<fmt:message key="artupa.cliente.telefono" />: <input type=text
					name=telefono size=30>
			</c:when>
			<c:otherwise>
				<c:set var="opcion" value="modificacion" scope="request" />
				<fmt:message key="artupa.cliente.dni" />: <input type=text
					name=dni value="${cliente.dni}" style="color: red" readonly>
				<br>
				<fmt:message key="artupa.cliente.nombre" />: <input type=text
					name=nombre size=30 value="${cliente.nombre}">
				<br>
				<fmt:message key="artupa.cliente.apellido" />: <input type=text
					name=apellido size=30 value="${cliente.apellido}">
				<br>
				<fmt:message key="artupa.cliente.edad" />: <input type=text
					name=edad value="${cliente.edad}">
				<br>
				<fmt:message key="artupa.cliente.nombre" />: <input type=text
					name=direccion size=30 value="${cliente.direccion}">
				<br>
				<fmt:message key="artupa.cliente.codPostal" />: <input type=text
					name=codPostal value="${cliente.codPostal}">
				<br>
				<fmt:message key="artupa.cliente.localidad" />: <input type=text
					name=localidad size=30 value="${cliente.localidad}">
				<br>
				<fmt:message key="artupa.cliente.telefono" />: <input type=text
					name=telefono value="${cliente.dni}">
			</c:otherwise>
		</c:choose>
		<input type=hidden name=modo_entrada value=${opcion}> <input
			type=button value=Grabar
			onclick="JavaScript:ejecutarOpcion('${opcion}')">
	</form>
</body>
	</html>
</fmt:bundle>