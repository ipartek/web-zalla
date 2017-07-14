<%
	String user = (String)session.getAttribute("user");
%>
<html>
	<head>
		<title>Esta es la web de Artupa</title>
		<script src="/ArtupaWeb/js/menu.js"></script>
	</head>
	<body>
	USUARIO: <b><%=user%></b>
		<form name=form1 action=SrvClientes method=post>
			<input type=button value="Mantenimiento de Clientes" onclick="JavaScript:direccionar('clientes')">
			<input type=button value="Mantenimiento de Pedidos" onclick="JavaScript:direccionar('pedidos')">
		</form> 
	</body>
</html>