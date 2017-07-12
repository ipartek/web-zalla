<%
	String user = (String)session.getAttribute("user");
%>
<html>
<head>
<title>Esta es la web de Artupa</title>
<script language=JavaScript>
<!--
-->
</script>
</head>
<body>
USUARIO: <b><%=user%></b>
<form name=form1 action=SrvClientes method=post>
<input type=submit value="Mantenimiento de Clientes">
</form> 
<form name=formPedidos action=SrvPedidos method=post> <!-- Lanzamos desde aqui el acceso a pedidos -->
<input type=submit value="Mantenimiento de Pedidos"></form>
</body>
</html>