'use strict';

var boton;
const iva_estandar = '.021'
console.clear();
window.onload = alCargar;

function saludo() {

    //Ejemplo de programación básica
    //Vamos a ver variables y sentencias de control

    nombre = prompt('Dime tu nombre');

    console.log('Hola que tal \ntu nombre es ' + nombre);
    console.log(numero, Numero);
}

function ejemplosSentenciaControl() {
    console.clear();
    var edad = parseInt(prompt('dime tu edad ?'));
    if (edad >= = 0 && edad <= = 99) {
        if (edad >= 18) {
            console.log("pasa");
            console.log(" Bienvenido a la discoteca");
        } else {
            console.log("Enano ... lo llevas claro");
        }
    } else {
        console.log("La proxima vez introduza un edad real");
    }

}
/*function conOperadores{
    
    var numero, Numero = 3;
    numero = 5000.3;

    // Declaración de variable de texto
    var nombre = 'Javier'; //"Javier";

   

    //console.log(boton.innerHTML);

    var precio = 100.0;
    var precioConIva = precio * 0.21;

    console.log(precioConIva)

    //respuesta a verdadero o falso

    var arreglado = true;
    var texto = arreglado ? "Arreglado" : "Estropeado";
    console.log(texto);

    // comparar valores
    // a==b igual a!=b distinto  a<b a>b a<=b a>=b a===b a!==b
    // a&&b (y)  a||b (o) !!1 convierte el 1 en true !a negado de la variable
    
    var min = 0,
        max = 10;
    var x = 5;
    console.log(min <= x && x <= max);
    parse

}*/



function alCargar() {
    //saludo();

    var botonSaludar = document.getElementById('btnSaludar');

    botonSaludar.onclick = ejemplosSentenciaControl;
    boton = botonSaludar;
    //document.getElementById('btnSaludar').onclick = saludo;
}
