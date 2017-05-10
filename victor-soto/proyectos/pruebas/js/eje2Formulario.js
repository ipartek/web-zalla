'use strict'

var form;
var sexo;
var estadoCivil;

window.onload = function () {
    form = document.forms[0];
    activarEstadoCivil();
    calcularTasas();
}

function activarEstadoCivil() {
    sexo = form.sexo;
    estadoCivil = form.estadoCivil;
    var sSexo = sexo;
    sSexo.onchange = function () {
        estadoCivil.disabled = false;
    };
}

function calcularTasas() {
    var valorProfesion = "";
    var encontrado = false;
    for (var i = 0; i < form.profesion.length && !encontrado; i++) {
        if (form.profesion[i].checked) {
            alert("Hola");
            valorProfesion = form.profesion[i].value;
            encontrado = true;
        }
    }
    switch (valorProfesion) {
        case "autonomo":
            form.tasas.value = "15€";
            break;
        case "ajena":
            form.tasas.value = "20€";
            break;
        case "desempleado":
            form.tasas.value = "2€";
            break;
        case "jubilado":
            form.tasas.value = "5€";
            break;
    }

}
