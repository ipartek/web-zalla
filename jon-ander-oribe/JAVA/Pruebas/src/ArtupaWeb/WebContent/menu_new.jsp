<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="language" value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}" scope="session" />
<fmt:setLocale value="${language}" scope="session"/>
<fmt:bundle
	basename="artupa.i18n.Mensajes">

<html>
<head>
<title>Esta es la web de Artupa</title>
<script language=JavaScript>
<!--
-->
</script>
</head>
<body>
USUARIO: <b><c:out value="${sessionScope.user}"/></b><br>
PASSWORD: <b><c:out value="${sessionScope.password}"/></b>
<form name=form1 action=SrvClientes method=post>
<input type=submit value="Mantenimiento de Clientes">
</form> 
<form name=formPedidos action=SrvPedidos method=post> <!-- Lanzamos desde aqui el acceso a pedidos -->
<input type=submit value="Mantenimiento de Pedidos"></form>
</body>
</html>
</fmt:bundle>