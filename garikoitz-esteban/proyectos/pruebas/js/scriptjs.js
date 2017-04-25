'use strict';
var boton;


function saludo() {
    alert("Hola desde JavaScript");
    alert("Hola Logsly");
}

function alcargar() {
    saludo();
    boton = document.getElementById('btnsaludar')
    boton.onclick = saludo;
    //document.getElementByID('btnsaludar').onclick=saludo;
}

window.onload = alcargar;
