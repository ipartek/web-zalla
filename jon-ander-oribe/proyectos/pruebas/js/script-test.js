'use strict'; //ECMAScript 5

/*function saludo() { alert("Hola mundo!"); }

function alCargar() {
    saludo();

    var boton = document.getElementById("btnSaludar");
    boton.onclick = saludo;
}

window.onload = alCargar;
*/
//Ejemplos:

var x = 0;
x += 1;
x -= 1;
x *= 1;

var arreglado = true;
var texto = arreglado ? "Arreglado" : "Estropeado";

var txtMensajes = document.getElementById('txtMensajes');
var form = document.forms[0];
form.onsubmit = function() {
    var txtDni = form['txtDni'];
    var dni = txtDni.value;

    if (validarDni(dni)) {
        txtMensajes.value = "DNI correcto";
    } else {
        txtMensajes.value = "DNI incorrecto";
        return false;
    }
}

var sBloque = form['sBloque'];
sBloque.onchange = seleccionBloque();

/*FUNCIONES OCULTAR*/

function seleccionBloque() {
    return document.getElementById();

}

function ocultar(idBloque) {
    var bloque = document.getElementById("idBloque1");
    bloque.style.display = "none";
}
