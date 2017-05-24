"use strict";
window.onload = alCargar;



function pruebaArrayMuestra() {
    var arr = new Array();
    console.log(arr.length);

    var arr5 = new Array(5);
    console.log(arr5.length);

    var arrPrerrellenado = new Array("hola", new Date(), 5);
    console.log(arrPrerrellenado);

    var diasMeses = new Array(31, 28, 31, 30, 31);
    console.log(diasMeses);

    var nombresMeses = new Array("enero", "febrero", "marzo", "abril", "mayo");
    console.log(nombresMeses);

    var pos = new Date().getMonth();

    //el mes 4 es el mayo ya que el 0 es enero
    var nombreMes = nombresMeses[pos];
    console.log(nombreMes);

    arrPrerrellenado[1] = "CAMBIADO";
    arrPrerrellenado[3] = "NUEVO";
    arrPrerrellenado["YEPA"] = "OTRO";
    arrPrerrellenado[20] = "4";

    console.log(arrPrerrellenado);


    function cadaMes (nombreMes, indice, arr) {
        console.log("cadaMes", nombreMes, indice, arr);
    }

    nombresMeses.forEach(cadaMes);







}

function pruebaTablero() {
    var tablero = new Array(8);

    for (var i = 0; i < 8; i++) {
        tablero[i] = new Array(8);
    }
    tablero[1][3] = "PEON";

    tablero = [
        ["T", "C", "A", "r", "R", "A", "C", "T"],
        ["P", "P", "P", "P", "P", "P", "P", "P"],
        [" ", " ", " ", " ", " ", " ", " ", " "],
        [" ", " ", " ", " ", " ", " ", " ", " "],
        [" ", " ", " ", " ", " ", " ", " ", " "],
        [" ", " ", " ", " ", " ", " ", " ", " "],
        ["P", "P", "P", "P", "P", "P", "P", "P"],
        ["T", "C", "A", "r", "R", "A", "C", "T"],
        ];

    tablero[1][4] = " ";
    tablero[3][4] = "P";

    console.log(tablero);

    var contenidoFila = " ";

    for (var fila = 0; fila < tablero.length; fila++) {
        contenidoFila = " ";
        for (var columna = 0; columna < tablero[fila].length; columna++) {
            contenidoFila += tablero[fila][columna] + " ";
            //contenidoFila = contenidoFila + tablero[fila][columna]
        }
        console.log(contenidoFila);
    }


}

var frutas = ['Manzana', 'Plátano'];

console.log(frutas.length); 


function alCargar() {

    var botonArrayTablero = document.getElementById("btnTableroArray");

    botonArrayTablero.onclick = pruebaTablero;

    var botonArrayMuestra = document.getElementById("btnArrayMuestra");

    botonArrayMuestra.onclick = pruebaArrayMuestra;


}
