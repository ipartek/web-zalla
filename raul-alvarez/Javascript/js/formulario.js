'use strict';

window.onload = function () {
    var form = document.forms[0];
     

    form.onsubmit = function () {
        //var txtDni=document.getElementById('txtDni');
       var txtMensajes = document.getElementById('txtMensajes');

        var txtDni = form['txtDni'];
        var dni = txtDni.value;
        if (validarDni(dni)) {
           txtMensajes.value="DNI correcto";
        } else {
           txtMensajes.value="DNI Incorrecto";
            return false;
        }
    };

    var btnPruebas = document.getElementById('btnPruebas');

    btnPruebas.onclick = function () {
        var txtMensajes = document.getElementById('txtMensajes');

        var txtUsuario = document.getElementById('txtUsuario');
        var usuario = txtUsuario.value;
        txtMensajes.value = 'Hola ' + usuario;
        txtMensajes.placeholder = 'Modificado al menos una vez';
    };

};
