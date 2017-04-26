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

var n, N;
n = 2;
var nombre = 'Gari';
var nombreIntroducido = prompt('Dime tu nombre');
alert('Hola\n' + nombreIntroducido);
alert(n + 5);
alert(boton.innerHTML);
window.onload = alcargar;
