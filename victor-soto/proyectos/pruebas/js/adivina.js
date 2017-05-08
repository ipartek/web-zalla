'use strict'; //ECMAScript 5
//window.onload = alCargar;

function alCargar() {
    var cont = 1;
    var sup, inf;
    var seguirJugando = true;
    var elemento = document.getElementById("texto");
    elemento.addEventListener("mouseover", mouseOver);
    elemento.addEventListener("mouseout", mouseOut);

    do {
        inf = prompt("Introduce el número INFERIOR");
        if (inf == null) {
            alert('Has cancelado el juego ADIOS!!!');
            seguirJugando = false;
        } else if (isNaN(parseInt(inf))) {
            alert('No has introducido un número');
        }
    } while (isNaN(parseInt(inf)) && seguirJugando);
    inf = parseInt(inf);
    if (seguirJugando) {
        do {
            sup = prompt("Introduce el número SUPERIOR");
            if (sup == null) {
                alert('Has cancelado el juego ADIOS!!!');
                seguirJugando = false;
            } else if (isNaN(parseInt(sup))) {
                alert('No has introducido un número');
            } else if (sup <= inf) {
                alert('El número debe ser superior al INFERIOR');
            }
        }
        while ((isNaN(parseInt(sup)) && seguirJugando) || sup <= inf);
        sup = parseInt(sup);
        if (seguirJugando) {
            var numero = parseInt((Math.random() * (sup - inf + 1)) + inf, 10); //El último 10 indica que es potencia de 10
            var tuNum;
            tuNum = prompt("Introduce un número del " + inf + " al " + sup);
            do {
                if (tuNum == null) {
                    alert('Has cancelado el juego ADIOS!!!');
                    seguirJugando = false;
                } else if (isNaN(tuNum)) {
                    tuNum = prompt("No has introducido el numero bien\n Introduce un número del " + inf + " al " + sup);
                } else if ((tuNum < 1 || tuNum > 100) && !isNaN(tuNum)) {
                    tuNum = prompt("No has introducido el numero bien\n Introduce un número del " + inf + " al " + sup);
                } else if (tuNum < inf || tuNum > sup) {
                    tuNum = prompt("El número debe estar entre " + inf + " y " + sup);
                } else if (numero > tuNum) {
                    tuNum = prompt("El número es mayor");

                } else if (numero < tuNum) {
                    tuNum = prompt("El número es menor");
                }
                cont++;
            } while (numero != tuNum && seguirJugando)
            if (tuNum != null) {
                //alert("ACERTASTE!!! El numero era " + numero + " has empleado " + cont + " intento");
                elemento.innerHTML = "ACERTASTE!!! El numero era " + numero + " y has empleado " + cont + " intento(s)";

                //onLoad();
            }
        }
    }
}

function mouseOver() {
    document.getElementById("texto").style.color = "red";
}

function mouseOut() {
    document.getElementById("texto").style.color = "green";
}


//function onLoad() {
//    setTimeout(function() {
//        window.location.reload(1);
//    }, 5000);
//}
