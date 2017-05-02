window.onload = alCargar;

function alCargar() {
    var total;
    var x, y;

    x = pedirEntero("Dime la x");
    y = pedirEntero("Dime la y");

    total = sumar(x, y);
    if (total != null)
        escribir(total);
    else
        escribir("Ha habido un error");
}

function sumar(a, b) {
    if (isNaN(parseInt(a)) || isNaN(parseInt(b))) return null;
    return a + b;
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
    alert(textoMensaje);
}
