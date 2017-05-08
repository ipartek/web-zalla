window.onload = function() {
    var total;
    var x, y;

    x = pedirEntero("Dime la x");
    y = pedirEntero("Dime la y");
    var datoUrl = escapar("Dame el texto a convertir");

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
    var noEsEntero = isNaN(entero);

    if (dato == null) {
        return null;
    }

    if (noEsEntero) {
        escribir("Dato no valido,se necesita un entero");
        return null;
    }
    return entero;
}

function escribir(textoMensaje) {
    alert(textoMensaje);
}

function escapar(textoConvertir) {
    textoConvertir = prompt(textoConvertir);
    escribir(escape(textoConvertir));
    escribir(unescape(textoConvertir));
}
