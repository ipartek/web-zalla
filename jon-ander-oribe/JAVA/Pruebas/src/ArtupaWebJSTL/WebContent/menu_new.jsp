<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:bundle
	basename="artupa.i18n.Mensajes">
<html>
<head>
<title><fmt:message key="artupa.titulo" /></title>
<script language=JavaScript>
<!--
	-->
</script>
</head>
<body>
	<fmt:message key="artupa.usuario" />
	:
	<b><c:out value="${sessionScope.user}" /></b>
	<form name=form1 action="SrvClientes" method=post>
		<input type=submit
			value="<fmt:message key="artupa.mantenimiento_clientes"/>">
	</form>
</body>
</html>
</fmt:bundle>