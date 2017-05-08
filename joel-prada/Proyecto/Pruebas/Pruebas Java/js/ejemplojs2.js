'use strict'; //ECMAScript 5

var boton;

window.onload = alCargar;

const IVA_ESTANDAR = 0.21;


function saludo() {

    var n;
    n = 2;

    console.clear();

    //var nombreIntroducido = prompt("Introducir nombre");

    // \n es un enter en js
    //alert("Tu nombre es\n"+ nombreIntroducido);    


    //salert(boton.innerHTML);
    console.log(n + 5);

    var estaActivado = true;

    //var precio = prompt("Introduce el valor");

    // var precioConIVA = precio * IVA_ESTANDAR;

    // console.log(precioConIVA);

    //console.log(estaActivado);

    // var suma = 2+3+4+5;

    // var a, b , c;

    //a = parseInt(prompt("a"));
    //b = parseInt(prompt("b"));
    //c = parseInt(prompt("c"));

    // var raizCuadrada = Math.sqrt(b*b - 4*a*c);

    //var x1 = (-b - raizCuadrada) / (2*a);
    //var x2 = (-b - raizCuadrada) / (2*a);

    // alert("x1 = " + x1 + ", x2 = " +x2);
    //console.log(a+b+c);

    var x = 0;

    console.log(x++);
    console.log(x);

    x = 0;

    console.log(++x);
    console.log(x);

    //Ejemplo para verdadero o falso en texto

    var arreglado = true;

    var texto = arreglado ? "Arreglado" : "Estropeado";

    console.log(texto);

    // OPERADORES //
    // a==b(SON IGUALES) a!==b("EN ESTE CASO NO SON IGUALES")
    //a>b a<b a>=b a<=b (a===b (EXACTAMENTE IGUAL))
    //a&&b a||

    var min = 0,
        max = 10;

    x = -5;

    console.log(min <= x && x <= max);

    x = 5;

    console.log(min <= x && x <= max);

    x = 15;

    console.log(min <= x && x <= max);



}

function ejemplosSentenciasControl() {
    var edad = parseInt(prompt("introduce edad"));

    if (edad >= 18 && edad <= 99) {
        if (edad >= 18) {
            console.log("pasa chaval");
        } else {
            console.log("enano lo llevas crudo");
        }
    } else {
        console.log("Estas fuera de edad");
    }

}

function pruebaNivel() {
    var nivel = parseInt(prompt("Introduce nivel"));

    switch (nivel) {
        case 1:
            console.log("nivel 1");
            break;
        case 2:
            console.log("nivel 2");
            break;
        case 3:
            console.log("nivel 3");
            break;
        default:
            console.log("Nivel desconocido");
            break;


    }
}

function pruebaWhile() {
    var n = 0;

    while (n < 10) {
        console.log(n++);
    }
}

function pruebaDoWhile() {
    do {
        var edad = parseFloat(prompt("Dime tu edad"));

        if (edad >= 18 && edad <= 200) {
            console.log("Eres mayor de edad");
        } else if (edad < 18 && edad >= 0) {
            console.log("Eres menor de edad");
        } else if (isNaN(edad)) {
            console.log("La proxima vez intentalo con un numero");
        } else {}
    } while (isNaN(edad) || edad < 0 || edad > 200);
}

function pruebaFor() {
    for (var n = 1; n <= 10; n++) {
        console.log("For: " + n);
    }

    for (var x = 5, y = 7; x + y <= 100; x *= 2, y += 3) {
        console.log(x, y);
    }
}

function pruebaEjercicio1() {

    var minimo = parseInt(prompt("Dime el minimo"));
    var maximo = parseInt(prompt("Dime el maximo"));

    //var aleatorio = parseInt(Math.random() * 100) + 1;
    // console.log(aleatorio);
    var aleatorio = parseInt((Math.random() * (maximo - minimo)) + minimo,
        10);
    console.log(aleatorio);

    var intentos = 0;

    var seguirJugando = true;

    do {




        var usuario = prompt("introduce numero");



        if (usuario == null) {
            alert("Hasta otra");
            seguirJugando = false;

        } else if (usuario > maximo || usuario < minimo) {
            alert(" Te has salido del rango " + minimo + " o " + maximo + " intentalo de nuevo");
        } else {
            usuario = parseInt(usuario);

            if (usuario < aleatorio) {
                intentos++;
                alert("El numero es mayor al suyo " + usuario);

            } else if (usuario > aleatorio) {
                intentos++;
                alert("El numero es menor al suyo " + usuario);
            } else if (isNaN(usuario)) {
                intentos++;
                alert("Pon un numero no una palabra");
            }
        }

    } while (usuario != aleatorio && seguirJugando);
    alert("El numero es el mismo " + usuario + " a tardado " + intentos + " intentos");
}


function alCargar() {
    boton = document.getElementById("btnSaludar");

    boton.onclick = saludo;

    var botonDiscoteca = document.getElementById("btnSentencias");

    botonDiscoteca.onclick = ejemplosSentenciasControl;

    var botonSwitch = document.getElementById("btnSwitch");

    botonSwitch.onclick = pruebaNivel;

    var botonWhile = document.getElementById("btnWhile");

    botonWhile.onclick = pruebaWhile;

    var botonDoWhile = document.getElementById("btnDoWhile");

    botonDoWhile.onclick = pruebaDoWhile;

    var botonFor = document.getElementById("btnFor");

    botonFor.onclick = pruebaFor;

    var botonEjercicio1 = document.getElementById("btnEjercicio1");

    botonEjercicio1.onclick = pruebaEjercicio1;
}
