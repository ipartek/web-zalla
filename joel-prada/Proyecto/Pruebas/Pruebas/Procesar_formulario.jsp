


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
<%
String usuario = request.getParameter("usuario");
boolean correcto = true;
if(!nombre.equals("Juan")){
    correcto=false;
}
%>
<%
if(correcto){
%>usua
Hola <%=usuario%>!!!
<%

}else{
%> No AUTORIZADO TRONCO
<%
}
%> 
   
    
</body>
</html>