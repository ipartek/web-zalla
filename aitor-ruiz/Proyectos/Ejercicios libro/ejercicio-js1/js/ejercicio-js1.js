'use strict'
var form;
var txtNombre;
var txtApellidos;
var sEstadoCivil;
var chkIdioma;
var rProfesion;
var salida = false;
var bloqueMensajes;
window.onload = function() {
    form = document.forms[0];
    btnMostrar.onclick = mostrarDatos;
}

function mostrarDatos() {
    txtNombre = document.getElementById("txtNombre").value;
    txtApellidos = document.getElementById("txtApellidos").value;
    sEstadoCivil = formulario1.sEstadoCivil
        .options[formulario1.sEstadoCivil.selectedIndex].text;

    if (rCastellano.checked) {
        chkIdioma = document.getElementById("rCastellano").value;
    }
    if (rIngles.checked) {
        chkIdioma += " , " + document.getElementById("rIngles").value;
    }
    if (rFrances.checked) {
        chkIdioma += " , " + document.getElementById("rFrances").value;
    }

    for (var i = 0; i < formulario1.rProfesion.length && salida != true; i++) {
        if (formulario1.rProfesion[i].checked) {
            rProfesion = formulario1.rProfesion[i].value;
            salida = true;
        }
    }

    bloqueMensajes = document.getElementById("bloqueMensajes").value;

    alert("NOMBRE: " + txtNombre +
        "\nAPELLIDOS: " + txtApellidos +
        "\nESTADO CIVIL: " + sEstadoCivil +
        "\nIDIOMA: " + chkIdioma +
        "\nPROFESIÓN: " + rProfesion +
        "\nCOMENTARIOS: " + bloqueMensajes);
}
