'use strict';

var txtMensajes, form, bloque1, bloque2;
var ID_BLOQUE1 = "bloque1",
    ID_BLOQUE2 = "bloque2";

window.onload = function() {
    ocultarBloques();
    txtMensajes = document.getElementById("txtMensajes");
    //var form = document.getElementById("");
    form = document.forms[0];
    form.onsubmit = envioFormulario;


    var sBloque = form["sBloque"];
    sBloque.onchange = seleccionBloque;

    var btnPruebas = document.getElementById("btnPruebas");
    btnPruebas.onclick = pruebas;
};

function envioFormulario() {
    //var txtDni = document.getElementById("txtDni");
    var txtDni = form["txtDni"];
    var dni = txtDni.value;

    if (validarDni(dni)) {
        txtMensajes.value = "CORRECTO";
        console.log('Es correcto');
    } else {
        txtMensajes.value = "INCORRECTO";
        console.log('Es incorrecto');
        return false;
    }
}

function pruebas() {


    var txtUsuario = document.getElementById("txtUsuario").value;
    //var usuario = txtUsuario.value;
    txtMensajes.value = "Hola " + txtUsuario;

    txtMensajes.placeholder = "MODIFICADO AL MENOS UNA VEZ";
}

function seleccionBloque() {
    var sBloque = document.getElementById("sBloque");

    ocultarBloques();
    var bloque = "bloque" + sBloque.value;
    console.log(bloque)
    mostrarBloque(bloque);
}

function ocultarBloques() {
    ocultarBloque(ID_BLOQUE1);
    ocultarBloque(ID_BLOQUE2);
}

function ocultarBloque(idBloque) {
    var bloque = document.getElementById(idBloque);

    if (bloque != null) {
        bloque.style.display = "none";
    }
}

function mostrarBloque(idBloque) {
    var bloque = document.getElementById(idBloque);

    if (bloque != null) {
        bloque.style.display = "block";
    }
}
