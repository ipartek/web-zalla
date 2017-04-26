'use strict'; //ECMAScript 5

function saludo() { alert("Hola mundo!"); }

function alCargar() {
    saludo();

    var boton = document.getElementById("btnSaludar");
    boton.onclick = saludo;
}

window.onload = alCargar;

//Ejemplos:

var x = 0;
x += 1;
x -= 1;
x *= 1;

var arreglado = true;
var texto = arreglado ? "Arreglado" : "Estropeado";
