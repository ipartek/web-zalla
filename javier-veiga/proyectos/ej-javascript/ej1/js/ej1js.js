"use strict";

window.onload =

    function () {



        document.getElementById("mostrar-datos").onclick = function () {

            var nombre = document.getElementById("nombre").value;
            var apellidos = document.getElementById("apellidos").value;
            var estadoCivil = document.getElementById("estado-civil").text;
            var idiomas = document.getElementsByClassName("idiomas");
            console.log(idiomas);
            var stringIdiomas;
            var profesiones = document.getElementsByName("profesion");
            var profesionSeleccionada;
            var comentarios = document.getElementById("comentarios").value;

            for (var i = 0; i < profesiones.length; i++) {
                if (profesiones[i].checked)
                    profesionSeleccionada = profesiones[i].value;
            }

            for (var j = 0; j < idiomas.length; j++) {
                if (idiomas[j].checked)
                    stringIdiomas = stringIdiomas + idiomas[j].value + " ";
                console.log(stringIdiomas);
            }

            alert("los datos introducidos son :\n Nombre: " + nombre +
                "\n Apellidos: " + apellidos +
                "\n Estado civil: " + estadoCivil +
                "\n Idiomas: " + stringIdiomas +
                "\n Profesion: " + profesionSeleccionada +
                "\n Comentarios: " + comentarios);
        }
    }
