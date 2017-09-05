<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%@page import="artupa.beans.Usuario"%>
<%
	String user = (String) session.getAttribute("user");
	String modo_entrada = request.getParameter("modo_entrada");
	String opcion = null;
	Usuario cliente = null;
	if (modo_entrada.equals("modo_alta")) {
		opcion = "alta";
	} else {
		opcion = "modificacion";
		cliente = (Usuario) request.getAttribute("cliente");
	}
%>

<!-- Pasar a JSTL el JSP -->

<c:out value="${sessionScope.user}"/>
<c:set value="entrada" scope="session" value="${session.modo_entrada}"/>
<c:out value="${entrada}"/>


<html>
<head>
<title>Esta es la web de Artupa</title>
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
	USUARIO:
	<b><c:out value="${sessionScope.user}" /></b>
	<form name=form1 method=post>


		<c:choose>
			<c:when test="${modo_entrada.equals("modo_entrada"))}">
DNI: <input type=text name=dni>
				<br>
NOMBRE: <input type=text name=nombre size=30>
				<br>
APELLIDO: <input type=text name=apellido size=30>
				<br>
EDAD: <input type=text name=edad>
				<br>
DIRECCI�N: <input type=text name=direccion size=30>
				<br>
C�DIGO POSTAL: <input type=text name=codPostal>
				<br>
LOCALIDAD: <input type=text name=localidad size=30>
				<br>
TEL�FONO: <input type=text name=telefono size=30>
			</c:when>
			<c:otherwise>

DNI: <input type=text name=dni value="<c:out value="cliente.dni"/>"> style="color:red" readonly>
<br>
NOMBRE: <input type=text name=nombre size=30
					value="<c:out value="cliente.nombre"/>">
				<br>
APELLIDO: <input type=text name=apellido size=30
					value="<c:out value="cliente.apellido"/>">
				<br>
EDAD: <input type=text name=edad value="<c:out value="cliente.edad"/>">
				<br>
DIRECCI�N: <input type=text name=direccion size=30
					value="<c:out value="cliente.direccion"/>">
				<br>
C�DIGO POSTAL: <input type=text name=codPostal
					value="<c:out value="cliente.codPostal"/>">
				<br>
LOCALIDAD: <input type=text name=localidad size=30
					value="<c:out value="cliente.localidad"/>">
				<br>
TEL�FONO: <input type=text name=telefono
					value="<c:out value="cliente.telefono"/>">
			</c:otherwise>
		</c:choose>

		<input type=hidden name=modo_entrada
			value=<c:out value="${sessionScope.opcion}"/>> <input
			type=button value=Grabar
			onclick="JavaScript:ejecutarOpcion('<c:out value="${sessionScope.opcion}"/>')">
	</form>
</body>
</html>