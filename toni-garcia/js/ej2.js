"use strict";

window.onload =

    function () {



        document.getElementById("mostrardatos").onclick = function () {

            var nombreempleado = document.getElementById("nombreempleado").value;
            var numeroempleado = document.getElementById("numerodeempleado").value;
            var productoaeditar = document.getElementById("productoaeditar").text;

            var tipodeacciones = document.getElementsByName("tipodeaccion");
            var tipodeaccionSeleccionadas;
            var comentarios = document.getElementById("comentarios").value;

            for (var i = 0; i < tipodeacciones.length; i++) {
                if (tipodeacciones[i].checked)
                    tipodeaccionSeleccionadas = tipodeacciones[i].value;
            }



            alert("los datos introducidos son :\n nombeempleado: " + nombreempleado +
                "\n numeroempleado: " + numeroempleado + "\n productoaeditar: " + productoaeditar +
                "\n tipodeaccion: " + tipodeaccionSeleccionadas +
                "\n Comentarios: " + comentarios);
        }
    }
