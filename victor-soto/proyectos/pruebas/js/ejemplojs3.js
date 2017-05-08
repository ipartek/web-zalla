window.onload = alCargar;

function alCargar() {
    var total, x, y;
    x = pedirEnteroRepetir("Dime la X");
    y = pedirEnteroRepetir("Dime la Y");
    total = sumar(x, y);
    if (total != null) {
        escribir("El numero total es " + total);
    } else {
        escribir("Ha habido un error");
    }
}

function pedirEnteroRepetir(textoMensaje) {
    var dato, entero;
    var noEsEntero;
    do {
        dato = prompt(textoMensaje);
        if (dato == null)
            return null;
        entero = parseInt(dato);
        noEsEntero = isNaN(entero);

        if (noEsEntero)
            alert("El dato que has escrito no era entero");
    } while (noEsEntero);

    return entero;
}

function sumar(a, b) {
    if (isNaN(parseInt(a)) || isNaN(parseInt(b))) {
        return null;
    } else {
        return a + b;
    }
}

function pedirEntero(textoMensaje) {
    var dato = prompt(textoMensaje);
    var entero = parseInt(dato);
    if (isNaN(entero)) {
        return null;
    }
    return entero;
}

function escribir(textoMensaje) {
    console.log(textoMensaje);
}
