<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="bdLibreria.beans.Usuario"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Web con listado de usuarios</title>
<script language=JavaScript>
<!--
	function ejecutarOpcion(opcion) {
		if (opcion == 'alta') {
			alert('alta');
			document.form1.modo_entrada.value = 'modo_alta';
			document.form1.action = 'SrvProcesarUsuario';
			document.form1.submit();
		} else {
			if (opcion == 'modificacion') {
				alert('modificacion');
				document.form1.modo_entrada.value = 'modo_modificacion';
				document.form1.action = 'SrvProcesarUsuario';
				document.form1.submit();
			} else {
				alert('baja');
				document.form1.modo_entrada.value = 'modo_baja';
				document.form1.action = 'SrvEliminar';
				document.form1.submit();
			}
		}
	}
	-->
</script>
</head>
<body>
	<%
		String user = (String) session.getAttribute("user");
		List<Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarios");
	%>

	<h1>Listado de usuarios</h1>

	USUARIO:
	<b><%=user%></b>
	<form name=form1 method=post>
		<table>
			<tr>
				<th>Opción</th>
				<th>DNI</th>
				<th>NOMBRE</th>
				<th>PRIMER APELLIDO</th>
				<th>SEGUNDO APELLIO</th>
				<th>DIRECCION</th>
				<th>FECHA_DE_NACIMIENTO</th>
				<th>E-MAIL</th>
				<th>NOMBRE_USUARIO</th>
				<th>PASSWORD</th>
				<th>PASSWORD_CONFIRMACION</th>
			</tr>
			<%
				Usuario usuario = null;
				for (int i = 0; i < usuarios.size(); i++) {
					usuario = usuarios.get(i);
			%>
			<tr>
				<td><input type="radio" name="Rbdni"
					value="<%=usuario.getDni()%>"></td>
				<td><%=usuario.getDni()%></td>
				<td><%=usuario.getNombre()%></td>
				<td><%=usuario.getPrimerApellido()%></td>
				<td><%=usuario.getSegundoApellido()%></td>
				<td><%=usuario.getDireccion()%></td>
				<td><%=usuario.getFechaDeNacimiento()%></td>
				<td><%=usuario.getMail()%></td>
				<td><%=usuario.getNombreUsuario()%></td>
				<td><%=usuario.getPassword()%></td>
				<td><%=usuario.getConfirmPassword()%></td>
			</tr>
			<%
				}
			%>
		</table>
		<input type=hidden name=modo_entrada> <input type=button
			value=Modificar onclick="JavaScript:ejecutarOpcion('modificacion')">
		<input type=button value=Eliminar
			onclick="JavaScript:ejecutarOpcion('baja')">
	</form>

</body>
</html>