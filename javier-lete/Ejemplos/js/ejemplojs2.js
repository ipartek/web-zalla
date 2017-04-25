'use strict';

var boton;

window.onload = alCargar;

function saludo() {
    /*
    Ejemplo de programación básica
    Vamos a ver variables y sentencias de control
    */
    
    var n;
    n = 2;
    
    // Declaración de variable de texto
    var nombre = 'Javier'; //"Javier";
    
    nombre = prompt('Dime tu nombre');
    
    alert('Hola ' + nombre); // Hola Javier
    alert(n + 5); // 7
    
    alert(boton.innerHTML);
}


function alCargar() {
    //saludo();
    
    boton = document.getElementById('btnSaludar');
    
    boton.onclick = saludo;
    //document.getElementById('btnSaludar').onclick = saludo;
}

