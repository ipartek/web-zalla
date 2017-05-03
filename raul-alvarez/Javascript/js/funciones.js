window.onload = alCargar;

function alCargar() {
    var total, x, y;
    x = pedirEnteroRepetir("dime el valor de la x ");
    escribir( "el valor de la x es "+x);
    y = pedirEnteroRepetir("dime dime el valor de la y ");
    escribir("el valor de la y es "+y);

    total = sumar(x, y);

    if (total != null) {
        escribir("la suma de " + x + " + " + y + " es " + total);

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
    do {
        dato = prompt(" ESTE CUADRO SOLO ACEPTA ENTEROS \n" + textoMensaje);

        if (dato == null) {
            return null;
        } else {

            entero = parseInt(dato);

            noEsEntero = isNaN(entero);
            if (noEsEntero) {
                escribir("el dato que has escrito no era entero");
            }
        }


    }
    while (isNaN(entero));
    return entero;
}

function escribir(textoMenje) {
    console.log(textoMenje);
    alert(textoMenje);
}
