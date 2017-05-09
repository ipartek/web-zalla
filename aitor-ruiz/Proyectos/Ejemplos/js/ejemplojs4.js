'use strict';

window.onload = function () {
    console.clear();
    
    //var resultado = eval(prompt("Dime qué quieres que ejecute"));
    //console.log(resultado);
    
    console.log(encodeURI("nombre=Javier Lete García"));
    console.log(decodeURI("nombre=Javier%20Lete%20Garc%C3%ADa"));
    console.log("formula=" + encodeURIComponent("h*h=a*a+b*b"));
    console.log("formula=" + decodeURIComponent("h*h%3Da*a%2Bb*b"));
   
    
    console.log(parseInt("5", 10));
    console.log(parseInt("7.9", 10));
    console.log(parseFloat("7.9", 10));
    console.log(isNaN(parseInt("asdfadsf", 10)));
    
    var a = prompt("A"); // 5
    console.log(a); // En NEGRO indicando TEXTO
    var b = prompt("B"); // 6
    console.log(b); // En NEGRO indicando TEXTO
    
    var suma = a + b; // 56
    
    console.log(suma); // En NEGRO indicando TEXTO
    
    var x = parseInt(prompt("X"), 10); // 5
    console.log(x); // En AZUL indicando NÚMERO
    var y = parseInt(prompt("Y"), 10); // 6
    console.log(y); // En AZUL indicando NÚMERO
    
    var suma2 = x + y; // 11
    
    console.log(suma2); // En AZUL indicando NÚMERO
    
    var x = 5;
    
    console.log(x); // 5 (AZUL)
    console.log(x.toString()); // "5" (NEGRO)
    
    var digito1, digito2;
    
    digito1 = 5;
    digito2 = 6;
    
    var digitos = digito1.toString() + digito2.toString();
    
    console.log(digitos);
    
    var valor = 2.005;
    console.log(redondear(valor));
    
    (function() {
        var x = 5;
        alert(x);
    })();
};

function redondear(valor) {
    return (Math.round(valor*100)/100).toFixed(2);
}



