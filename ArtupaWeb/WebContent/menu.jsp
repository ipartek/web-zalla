<%
	String user = (String)session.getAttribute("user");
%>
<html>
<head>
<title>Esta es la web de Artupa</title>
<script src="js/index.js"></script>
</head>
<body>
USUARIO: <b><%=user%></b>
<form name=form1 action=SrvClientes method=post>
<input id="inputCli" type=submit value="Mantenimiento de Clientes">
<input id="inputPed" type=submit value="Mantenimiento de Pedidos">
</form> 
</body>
</html>