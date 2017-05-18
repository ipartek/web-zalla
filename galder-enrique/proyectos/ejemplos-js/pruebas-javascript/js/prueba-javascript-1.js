'use strict';

var numerojuego;
var intentos = 0;
var intervmax = 0;
var intervmin = 0;
var seguirjugando = true;

//var boton = document.getElementById('btnempezar');
//boton.onclick = numerorandom;
// function mostrar() {
//     document.getElementById("minmax").style.visibility = "visible";

// }

function numerorandom() {
    //document.getElementById("maximo").value = "Establece el número máximo";
    intervmax = prompt("Indica el rango máximo");
    console.log(intervmax + " es el valor máximo");

    //document.getElementById("minimo").value = "Establece el número mínimo";
    intervmin = prompt("Indica el rango mínimo");
    console.log(intervmin + " es el valor mínimo");
    numerojuego = parseInt((Math.random() * (intervmax - intervmin)) + parseInt(intervmin), 10);

    console.log(numerojuego);
    juego();
}

function juego() {


    console.log(numero);
    do {
        var numero = prompt("Dime un Número entre " + intervmin + " y " + intervmax);
        if (numero == null) {
            alert("Hasta otra");
            seguirjugando = false;

        } else if (isNaN(numero)) {
            alert("Mete un número zoquete");
            //juego();
        } else {

            numero = parseInt(numero);

            if (numero > intervmax || numero < intervmin) {
                alert("Introduce un número entre " + intervmin + " y " + intervmax);
            } else if (numero > numerojuego) {
                console.log("Es menor\n");
                console.log(numero + " es " + numerojuego);
                alert("Es menor");
                intentos++;
                //juego();
            } else if (numero == numerojuego) {
                console.log("HAS ACERTADO\n");
                intentos++;
                console.log("Has necesitado " + intentos + " intento(s)");

            } else {
                console.log("Es mayor\n");
                console.log(numero + " es " + numerojuego);
                alert("Es mayor");
                intentos++;
                //juego();
            }
        }
    }


    while (numero != numerojuego && seguirjugando);
    console.log("seguirjugando es " + seguirjugando);
}





//window.onload = numerorandom;

// function ejemplosentenciacontrol() {
//     var edad = prompt("Dime tu edad");
//     if (edad > 0 && edad <= 99) {


//         if (edad >= 18) {
//             alert("PASA");
//             console.log(edad);
//         } else {
//             alert("Lo llevas clarinete");
//             console.log(edad);
//         }
//     } else {
//         alert("Introduce una edad válida")
//         ejemplosentenciacontrol;
//     }
// }
