<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="language" value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}" scope="session" />
<fmt:setLocale value="${language}" scope="session"/>
<fmt:bundle
	basename="artupa.i18n.Mensajes">
<html>
<head>
<title><fmt:message key="artupa.titulo"/></title>
<script language=JavaScript>
<!--
-->
</script>
</head>
<body>
<form name=form1 action=SrvValidarEntrada method=post>
<fmt:message key="artupa.nombre"/>: 
<input type=text name=user>
<br>
<fmt:message key="artupa.password"/>:
<input type=password name=password>
<br>
<input type=submit value=<fmt:message key="artupa.entrar"/>>
</form> 
</body>
</html>
</fmt:bundle>