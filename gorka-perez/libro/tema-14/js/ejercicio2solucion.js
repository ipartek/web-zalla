"use strict";

window.onload = function () {
    var i;

    document.getElementById("nombre").focus();
    document.getElementById("estadoCivil").disabled = true;
    document.getElementById("mostrar_datos").onclick = mostrar;
    document.getElementById("sexo").onchange = habilitarEstadoCivil;
    document.getElementById("profesion1").onclick = calcularTasa;
    document.getElementById("profesion2").onclick = calcularTasa;
    document.getElementById("profesion3").onclick = calcularTasa;
    document.getElementById("profesion4").onclick = calcularTasa;

};

function habilitarEstadoCivil() {

    if (datosPersonales.sexo.options[datosPersonales.sexo.selectedIndex].value == 2) {
        document.getElementById("estadoCivil").disabled = false;
    }
}

function calcularTasa() {
    if (document.getElementById("profesion1").checked) {
        document.getElementById("tasas").value = "15€";
    }
    if (document.getElementById("profesion2").checked) {
        document.getElementById("tasas").value = "20€";
    }
    if (document.getElementById("profesion3").checked) {
        document.getElementById("tasas").value = "2€";
    }
    if (document.getElementById("profesion4").checked) {
        document.getElementById("tasas").value = "5€";
    }
}

function mostrar() {

    var mensaje;

    mensaje = "Nombre: " + document.getElementById("nombre").value + "\n";
    mensaje += "Apellidos: " + document.getElementById("apellidos").value + "\n";
    mensaje += "Tasa: " + document.getElementById("tasas").value;

    alert(mensaje);
}
