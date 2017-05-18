'use strict'
var form;
var txtNombre = "";
var txtApellidos;
var sEstadoCivil;
var chkIdioma;
var rProfesion;
var salida = false;
var bloqueMensajes;
var valorSexo;
var valorProfesion = "";
var valorTasas;
window.onload = function() {
    form = document.forms[0];
    form.txtNombre.focus();

    form.sSexo.onchange = activarEstadoCivil;

    document.getElementById("rProfesion").onchange = ponerTasas;

    btnMostrar.onclick = mostrarDatos;
}

function activarEstadoCivil() {
    valorSexo = formulario1.sSexo
        .options[formulario1.sSexo.selectedIndex].value;
    if (valorSexo == 1) {
        document.forms[0].sEstadoCivil.disabled = false;
    } else {
        document.forms[0].sEstadoCivil.disabled = true;
    }
}

function ponerTasas() {
    valorProfesion = form.rProfesion.value;
    switch (valorProfesion) {
        case "Autonomo":
            form.comTasas.value = "15€";
            break;
        case "Trabajador":
            form.comTasas.value = "20€";
            break;
        case "Desempleado":
            form.comTasas.value = "2€";
            break;
        case "Jubilado":
            form.comTasas.value = "5";
    }
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


    valorTasas = document.getElementById("comTasas").value;

    alert("NOMBRE: " + txtNombre +
        "\nAPELLIDOS: " + txtApellidos +
        "\nTASAS: " + valorTasas);
    //bloqueMensajes = document.getElementById("bloqueMensajes").value;
    // alert("NOMBRE: " + txtNombre +
    //     "\nAPELLIDOS: " + txtApellidos +
    //     "\nESTADO CIVIL: " + sEstadoCivil +
    //     "\nIDIOMA: " + chkIdioma +
    //     "\nPROFESIÓN: " + rProfesion +
    //     "\nCOMENTARIOS: " + bloqueMensajes);
}
