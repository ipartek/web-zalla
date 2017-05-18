"use strict";

window.onload = function () {

    document.getElementById("nombre").focus();

    document.getElementById("sexo").onchange = function () {
        if (this.value == "2")
            document.getElementById("estado-civil").removeAttribute("disabled");
    }

    var profesion = document.getElementsByName("profesion");
    var tasas = document.getElementById("tasas");

    for (var i = 0; i < profesion.length; i++)
        profesion[i].onchange = function () {
            if (this.value == "autonomo")
                tasas.value = "15€";
            else if (this.value == "ajena")
                tasas.value = "20€";
            else if (this.value == "paro")
                tasas.value = "2€";
            else
                tasas.value = "5€";
        }

    document.getElementById("mostrar-datos").onclick = function () {
        var nombre = document.getElementById("nombre").value;
        var apellidos = document.getElementById("apellidos").value;

        alert("Nombre : " + nombre +
            "\nApellidos : " + apellidos +
            "\nTasas : " + tasas.value);

    }

}
