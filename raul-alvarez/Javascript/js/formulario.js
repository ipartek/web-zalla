'use strict';

window.onload = function () {

    var btnPruebas = document.getElementById('btnPruebas');

    btnPruebas.onclick = function () {
        var txtMensajes = document.getElementById('txtMensajes');

        var txtUsuario = document.getElementById('txtUsuario');
        var usuario = txtUsuario.value;
        txtMensajes.value = 'Hola ' + usuario;
        txtMensajes.placeholder='Modificado al menos una vez';
    }

};
