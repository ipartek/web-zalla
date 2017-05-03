'use strict';

function alCargar()
{
    document.getElementById('butn1').onclick = primeraSuma;
    document.getElementById('butn2').onclick = segundaSuma;
    document.getElementById('butn3').onclick = terceraSuma;
    document.getElementById('butn4').onclick = function()
    {  
        alert('jajaja no hago nada memelo');
    };
}

function primeraSuma()
{
    let total;
    let x, y;

    x = parseInt(prompt("Dime la X"));
    y = parseInt(prompt("Dime la Y"));

    total = sumar(x, y);

    if (total != null)
    {
        alert(total);
    }
    else
    {
        alert('Ha habido un ERROR');
    }
}

function segundaSuma()
{
    let total;
    let x, y;

    x = pedirEntero("Dime la X");
    y = pedirEntero("Dime la Y");

    total = sumar(x, y);

    if (total != null)
        escribir('El resultado es ' + total);
    else
        escribir('Ha habido un ERROR');
}

function terceraSuma()
{
    let total;
    let x, y;

    x = pedirEnteroRepetir("Dime la X");
    y = pedirEnteroRepetir("Dime la Y");

    total = sumar(x, y);

    if (total != null)
        escribir('El resultado es ' + total);
    else
        escribir('Ha habido un ERROR');
}


function sumar(a, b)
{

    if (isNaN(parseInt(a)) || isNaN(parseInt(b)))
    {
        return null;
    }

    return a + b;
}

function pedirEntero(textoMensaje_)
{
    let dato = prompt(textoMensaje_);
    let entero = parseInt(dato);

    if (isNaN(entero))
        return null;

    return entero;
}

function pedirEnteroRepetir(textoMensaje_)
{
    let dato, entero;
    let noEsEntero;

    do {
        dato = prompt("ESTE CUADRO SOLO ACEPTA ENTEROS\n" + textoMensaje_);

        if (dato == null)
            return null;

        entero = parseInt(dato);

        noEsEntero = isNaN(entero);

        if (noEsEntero /* isNaN(entero) */ )
            escribir('El dato que has escrito no era un entero o has dejado el hueco vacío');


    } while (isNaN(entero));

    return entero;
}

function escribir(textoMensaje_)
{
    alert(textoMensaje_);
}

window.onload = alCargar;