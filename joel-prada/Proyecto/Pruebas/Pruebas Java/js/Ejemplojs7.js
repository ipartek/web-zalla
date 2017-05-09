"use strict";

window.onload = function (){
   // var usuario = document.getElementById("usuario");
   
    var btnPruebas = document.getElementById("btnPruebas");
    
    
    
    btnPruebas.onclick= function (){
        
        //con esto cogemos la cahja entera de txtUsuario
        var txtUsuario = document.getElementById("txtUsuario");
        
        //cogemos el contenido
        var nombreUsuario = txtUsuario.value;
        //alert(nombreUsuario);
        var txtMensaje = document.getElementById("txtMensaje");
        txtMensaje.value ="holaaaa "+nombreUsuario;
        
        //PLACE HOLDER APARECE CUANDO EL CUADRADO DE TEXTO ESTA VACIO
        txtMensaje.placeholder = "MODIFICADO AL MENOS UNA VEZ";
        
        //TAMBIEN SE PUEDE HACER DE ESTA MANERA MAS CORTA
        //document.getElementById("txtUsuario").value = "Hola "+
        //document.getElementById("txtUsuario").vale;
        
    }
};