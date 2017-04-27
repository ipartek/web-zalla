'use strict'; //ECMAScript 5
window.onload = alCargar;

function alCargar() {
    var cont = 0;
    var sup = undefined;
    var inf = undefined;

    do {
        inf = parseInt(prompt("Introduce el número inferior"));
        if (isNaN(inf)) {
            alert('No has introducido un número');
            //inf = prompt("No has introducido el numero bien\n Introduce el número inferior");
        }
    } while (isNaN(inf));
    do {
        sup = parseInt(prompt("Introduce el número superior"));
        if (isNaN(sup)) {
            alert('No has introducido un número');
            //sup = prompt("No has introducido el numero bien\n Introduce el número superior");
        }
    } while (isNaN(sup));
    //while (sup == inf) {
    //    inf = prompt("NIntroduce el número inferior");
    //    sup = prompt("Introduce el número superior");
    //}
    var numero = parseInt(Math.random() * (sup - inf + 1) + inf;
        var tuNum = prompt("Introduce un número del " + inf + " al " + sup);

        while (numero != tuNum) {
            if (isNaN(tuNum)) {
                tuNum = prompt("No has introducido el numero bien\n Introduce un número del " + inf + " al " + sup);
            } else if ((tuNum < 1 || tuNum > 100) && !isNaN(tuNum)) {

                tuNum = prompt("No has introducido el numero bien\n Introduce un número del " + inf + " al " + sup);
            } else if (numero > tuNum) {
                tuNum = prompt("El número es mayor");

            } else if (numero < tuNum) {
                tuNum = prompt("El número es menor");

            }
            cont++;
        }

        alert('ACERTASTE!!! El numero era ' + numero + " has empleado " + cont);


    }
