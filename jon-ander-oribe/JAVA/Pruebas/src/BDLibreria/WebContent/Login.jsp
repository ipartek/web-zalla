<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Página de Login</title>
</head>
<body>
<h1>Zona de Login</h1>

<form action="/SrvLogin">
<label>Usuario</label><br>
<input type="text" name="usuario"><br>
<label>Password</label><br>
<input type="text" name="password"><br>
<input type="submit" value="Enviar">
</form>

</body>
</html>