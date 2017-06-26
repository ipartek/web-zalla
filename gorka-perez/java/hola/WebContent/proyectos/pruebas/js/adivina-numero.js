'use strict';

var num;
var numRandom;

console.log("Bienvenido a adivina el número");

numRandom = Math.floor(Math.random() * (10)) + 1;

do {
    num =  (prompt('Escribe un número de 1 a 10'), 10);
    
    if (num < 0 || num > 10) {

        console.log("Número erróneo");

    } else {

        if (num > numRandom) {
            console.log("Es menor");
        } else if (num < numRandom) {
            console.log("Es mayor");
        }
    }
} while (num !== numRandom);

console.log("Lo conseguiste!");
