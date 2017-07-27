<%@page import="artupa.beans.Cliente"%>
<%@page import="artupa.beans.Pedido"%>
<%
	String user = (String) session.getAttribute("user");
	String modo_entrada = request.getParameter("modo_entrada");
	String opcion = null;	
	Cliente cliente = (Cliente) request.getAttribute("cliente");
	Pedido pedido = null;

	if (modo_entrada.equals("modo_alta")) {
		opcion = "alta";

	} else {
		opcion = "modif";
		pedido = (Pedido) request.getAttribute("pedido");

	}
%>
<html>
<head>
<title>Esta es la web de Artupa</title>
<script language=JavaScript>
<!--
function ejecutarOpcion(opcion)
{
	if (opcion == 'alta')
	{
		document.form1.modo_entrada.value='modo_alta';
		document.form1.action='SrvActualizarPedido';
		document.form1.submit();		
	}
	else 
	{
		document.form1.modo_entrada.value='modo_modificacion';
		document.form1.action='SrvActualizarPedido'
		document.form1.submit();
	}
	-->
</script>
</head>
<body>
	USUARIO:
	<b><%=user%></b>
	<form name=form1 method=post>
		<%
		if (modo_entrada.equals("modo_alta")) {
		%>
		
		DNI<input type=text name=dni value="<%=cliente.getDni()%>" style="color:red" readonly>
		<br> 
		NUMPEDIDO:<input type=text name=numPedido size=30>
	    <br> 
		DETALLEPEDIDO:<input type=text name=detallePedido size=30>
		<%
		} else {
		%>
		DNI<input type=text name=dni value="<%=cliente.getDni()%>" style="color:red" readonly>
		<br> 
		NUMPEDIDO:<input type=text name=numPedido size=30 value="<%=pedido.getNumPedido()%>">
		<br> 
		DETALLEPEDIDO: <input type=text name=detallePedido size=30 value="<%=pedido.getDetallePedido()%>">
		<%
			}
		%>
		
		<input type=hidden name=modo_entrada value=<%=opcion%>>
		<input type=button value=Grabar onclick="JavaScript:ejecutarOpcion('<%=opcion%>')">
	</form>
</body>
</html>