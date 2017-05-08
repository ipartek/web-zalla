'use strict';

window.onload = function() {
    var txtMensajes = document.getElementById('txtMensajes');
        
    var form = document.forms[0]; //document.getElementById("");
    
    form.onsubmit = function() {
        //var txtDni = document.getElementById('txtDni');
        var txtDni = form['txtDni']; // form['name']
        
        var dni = txtDni.value;
        
        if(validarDni(dni)) {
            txtMensajes.value = "DNI Correcto";
        } else {
            txtMensajes.value = "DNI INCORRECTO";
            return false;
        }
    };
    
    var btnPruebas = document.getElementById('btnPruebas');
    
    btnPruebas.onclick = function() {
        var txtUsuario = document.getElementById('txtUsuario');
        
        var usuario = txtUsuario.value;
        
        txtMensajes.value = "Hola " + usuario;
        
        txtMensajes.placeHolder = "Modificado al menos una vez";
        
        //document.getElementById('txtMensajes').value = "Hola " + //document.getElementById('txtUsuario').value;
    };
};
