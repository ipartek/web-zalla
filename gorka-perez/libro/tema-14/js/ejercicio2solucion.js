"use strict";
window.onload = function () {


    document.getElementById("nombre").focus();
    document.getElementById("sexo").onchange = habilitarEstadoCivil();



    if (document.getElementById("profesion1").checked) {
        document.getElementById("tasas").value = '15€';
    }
    if (document.getElementById("profesion2").checked) {
        document.getElementById("tasas").value = '20€';
    }
    if (document.getElementById("profesion3").checked) {
        document.getElementById("tasas").value = '2€';
    }
    if (document.getElementById("profesion4").checked) {
        document.getElementById("tasas").value = '5€';
    }
}

function habilitarEstadoCivil() {

    if (document.getElementById("sexo").value === 2) {
        document.getElementById("estadoCivil").disabled = false;
    } else {
        document.getElementById("estadoCivil").disabled = true;
    }
