"use strict";

function saludo() {
    var n;
    n = 2;
    var nombre = "toni";

    alert('hola javascript');
    alert('hola pepe');

}

function alcargar() {
    saludo();
    var boton = document.getElementById('btnsaludar');
    boton.onclick = saludo;
}
window.onload = alcargar;
