"use strict";

window.onload =

    function () {



        document.getElementById("mostrardatos").onclick = function () {

            var nombre = document.getElementById("nombre").value;
            var apellidos = document.getElementById("apellidos").value;
            var productos = document.getElementById("productos").text;
            var idiomas = document.getElementsByClassName("idiomas");
            console.log(idiomas);
            var stringIdiomas;
            var cliente = document.getElementsByName("cliente");
            var clienteSeleccionada;
            var comentarios = document.getElementById("comentarios").value;

            for (var i = 0; i < cliente.length; i++) {
                if (cliente[i].checked)
                    clienteSeleccionada = cliente[i].value;
            }

            for (var j = 0; j < idiomas.length; j++) {
                if (idiomas[j].checked)
                    stringIdiomas = stringIdiomas + idiomas[j].value + " ";
                console.log(stringIdiomas);
            }

            alert("los datos introducidos son :\n Nombre: " + nombre +
                "\n Apellidos: " + apellidos +
                "\n producto: " + productos +
                "\n Idiomas: " + stringIdiomas +
                "\n cliente: " + clienteSeleccionada +
                "\n Comentarios: " + comentarios);
        }
    }
