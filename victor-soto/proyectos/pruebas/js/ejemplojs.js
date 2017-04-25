'use strict';

var boton;

window.onload = alCargar; //Permite la llamada sin los parentesis

function alCargar() {
    saludo();
    boton = document.getElementById('btnSaludar');
    boton.onclick = saludo;
    boton.style.color = 'red';
    document.getElementsByClassName("despues")[0].style.backgroundColor = 'red';
}

function saludo() {
    var n;
    n = 2;

    //Declaración de variable de texto
    var nombre = 'Javier'; //"Javier" Se puede escribir tanto con un ' como con "

    nombre = prompt('Dime tu nombre'); //Cuadro donde introduces el contenido y se guarda en la variable

    alert('Hola ' + nombre);
    alert('Hola Pepe');
    //alert(boton.innerHTML);

}

/*
function prueba() {
    document.getElementById("antes").style.color = "#CCCCCC";
    document.getElementsByClassName("despues")[0].style.backgroundColor = "#EE0000";
}*/
