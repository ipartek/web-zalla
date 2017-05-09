'use strict';

window.onload = alCargar;

function alCargar() {
    var total, x, y;

    x = pedirEnteroRepetir("Dime la X");
    y = pedirEnteroRepetir("Dime la Y");

    total = sumar(x, y);

    if (total != null) {
        escribir("La suma de " + x + " y " + y + " es " + total);
    } else {
        escribir("Ha habido un error");
    }
}

function sumar(a, b) {
    if (isNaN(parseInt(a)) || isNaN(parseInt(b))) {
        return null;
    } else {
        return a + b;
    }
}

function pedirEnteroRepetir(textoMensaje) {
    var dato, entero;
    var noEsEntero;
    do {
        dato = prompt("ESTE CUADRO SOLO ACEPTA ENTEROS\n" + textoMensaje);
        
        if(dato == null)
            return null;
        
        entero = parseInt(dato);
        
        noEsEntero = isNaN(entero);
        
        if(noEsEntero)
            escribir("El dato que has escrito no era entero");
            
    } while(noEsEntero);
    
    return entero;
}


function pedirEntero(textoMensaje) {
    var dato = prompt("ESTE CUADRO SOLO ACEPTA ENTEROS\n" + textoMensaje);
    var entero = parseInt(dato);

    if (isNaN(entero)) {
        return null;
    } else {
        return entero;
    }
}

function escribir(textoMensaje) {
    alert(textoMensaje);
}
