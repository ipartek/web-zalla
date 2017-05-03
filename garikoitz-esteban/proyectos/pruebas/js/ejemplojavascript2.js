'use strict';

window.onload = function () {
    console.clear();
    //var resultado = eval(prompt('Dime qué quieres que ejecute'));


    console.log(encodeURI('Gari Esteban Dieguez='))
    console.log(decodeURI('Gari%20Esteban%20Dieguez='))

    console.log(parseInt('5', 10))
    console.log(parseFloat("7.3", 10))
    console.log(isNaN(parseInt('asdfadsf', 10)))

    var a = prompt('A');
    console.log(a);
    var b = prompt('B');
    console.log(b);

    var suma = a + b; //56
    console.log(suma);

    var x = parseInt(prompt("X"), 10); // 5
    console.log(x);
    var y = parseInt(prompt("Y"), 10); // 6
    console.log(y);
    var suma2 = x + y;
    console.log(suma2);

    var x = 5;

    console.log(x);
    console.log(x.toString());

    var digito1, digito2;

    digito1 = 5
    digito2 = 6

    var digitos = digito1.toString() + digito2.toString();

    console.log(digitos);

};



alert(resultado);
