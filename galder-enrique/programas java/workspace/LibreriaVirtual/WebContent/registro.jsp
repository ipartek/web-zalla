<%
	String user = (String)session.getAttribute("user");
%>
<html>
<head>
<title>Esta es la web de Registro de Usuarios</title>
<script language=JavaScript>
<!--
-->
</script>
</head>
<body>
<h1>Librería virtual: Regustro de Usuario</h1>
<h2>Datos Personales</h2>
<form name=form1 action=SrvInsertarRegistro method=post>
<label for="nombre">Nombre</label>
<input type=text name="nombre">
<br>
<label for="primerApellido">Primer Apellido</label>
<input type=text name="primerApellido">
<br>
<label for="segundoApellido">Segundo Apellido</label>
<input type=text name="segundoApellido">
<br>
<label for="dni">DNI</label>
<input type=text name="dni" placeholder="00000000F">
<br>
<label for="direccion">Dirección</label>
<input type=text name="direccion">
<br>
<label for="fechaNacimiento">Fecha de Nacimiento</label>
<input type=text name="fechaNacimiento" placeholder="yyyy/mm/dd">
<br>
<label for="email">E-mail</label>
<input type=text name="email" placeholder="aaaaaaaaaaa@aaaaaaa.aaa">
<br>
<h2>Datos de Login</h2>
<label for="usuario"><b>Usuario</b></label>
<input type=text name="usuario">
<br>
<label for="password">Clave</label>
<input type=password name="password" minlength="6" maxlength="12">
<br>
<label for="passwordConf">Confirmar Clave</label>
<input type=password name="passwordConf" minlength="6" maxlength="12">
<br>
<input type="submit" value="Alta Usuario">

</form> 
</body>
</html>