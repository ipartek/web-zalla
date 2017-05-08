'use strict'

window.onload = function() {
    var usuario = document.getElementById("usuario");
    //var pass = document.getElementById("pass");

    var btnPruebas = document.getElementById("btnPruebas");
    btnPruebas.onclick = function() {
        var txtMensajes = document.getElementById("txtMensajes");
        txtMensajes.value = "Hola " + usuario.value + " " + document.getElementById("pass").value;

        usuario.placeholder = "Hold the door";
    }
}
