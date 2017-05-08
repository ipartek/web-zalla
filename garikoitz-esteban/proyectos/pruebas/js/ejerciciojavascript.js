'use strict';

var numero;
var numeroRandom;
var seguirJugando = true;

var intentos = 0;


alert("Bienvenido al juego");


prompt('¡Hey hola!, ¿Cual es tu nombre de juego?');

alert('Este juego consiste en adivinar el número\n Tendrás que adivinarlo desde el minimo y el maximo asignado por ti.\n ¡SUERTE!');
var maximo = parseInt(prompt('Dime el maximo'));
var minimo = parseInt(prompt('Dime el minimo'));
numeroRandom = parseInt((Math.random() * (maximo - minimo)) + minimo, 10);
console.log(numeroRandom);
do {
    numero = prompt('¿Que número crees que estoy pensando?');

    if (numero < minimo || numero > maximo) {
        alert('No es un número valido.\n No es un número del 0-100');
    }

    if (numero == null) {
        alert('Que pena...');
        seguirJugando = false;
    } else if (isNaN(parseInt(numero))) {
        alert('La proxima vez escribe un número.');
    } else {
        numero = parseInt(numero);

        if (numero > maximo || numero < minimo) {
            alert('Te has salido del rango' + minimo + 'a' + maximo);
        }

        if (numero < numeroRandom) {
            alert('Lo siento, no es el número que estaba pensando.\n Intentalo con un número mayor.');
            intentos++;
        } else if (numero > numeroRandom) {
            alert('Lo siento, no es el número que estaba pensando.\n Intentalo con un número menor.');
            intentos++;
        }
    }
}
while (numero !== numeroRandom && seguirJugando);

intentos++;
