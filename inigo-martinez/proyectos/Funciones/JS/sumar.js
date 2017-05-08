var rehacer = true;
var inserciones=0;
'use strict';
window.onload = alCargar;

function alCargar() {
    var a, b;
    while (rehacer) {
    	inserciones+=1;
        a = introInt(inserciones);
        inserciones+=1;
        b = introInt(inserciones);
        if (!comprovación(a, b)) {
            alert("La suma entre " + a + " y " + b + " es: " + sumar(a, b));
        }
    }
}

function introInt(pos) {
    return parseInt(prompt("Introduce el "+posicionNum(pos)+" valor:"));
}

function posicionNum(posicion){
	switch(posicion){
		case 1:
			return "primer";
		case 2:
			return "segundo";
		default:
			return "siguiente";
	}
}

function sumar(x, y) {
    rehacer = false;
    return x + y;
}

function comprovación(x, y) {
    if (isNaN(x) || isNaN(y)) {
        alert("Uno de los números no es correcto");
        return true;
    }
}
