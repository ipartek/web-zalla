'use strict';

/* -- FUNCIONES PREDEFINIDAS -- */

window.onload = function()
{
    console.info('La prueba empieza ya :)');

    // eval() recoge cualquier texto que le pases y lo ejecuta como lineas
    // de javascript
    // ¡NO USAR!

    // eval(prompt('Dime qué quieres que ejecute'));


    console.group('escape');

    console.error('DEPRECATED - ESTÁ OBSOLETO');

    // escape
    // Transforma el texto para que se pueda colocar dentro de una URL
    // es ANSI, así que está anticuado.
    console.debug(escape('Pépí àñamirço pârsimu'));


    // unescape
    // Lo convierte en el texto original
    console.log(unescape('P%E9p%ED%20%E0%F1amir%E7o%20p%E2rsimu'));

    console.groupEnd();

    // -- //

    console.group('encode URI');

    // URI = identificador de recursos uniforme.

    // encode URI 
    // Necesita más caracteres para convertir el texto a UNICODE (UTF-8), pero es
    // correcto para URLs.  No reemplaza los caracteres especiales para enviar
    // las querystrings
    console.debug(encodeURI('Pépí àñamirço pârsimu'));

    // decode URI 
    // La inversa del anterior :)
    console.log(decodeURI('P%C3%A9p%C3%AD%20%C3%A0%C3%B1amir%C3%A7o%20p%C3%A2rsimu'));

    // existe encodeURIComponent.  ¡MIRAR!

    console.groupEnd();

    // -- //

    console.group('parses and co');

    console.log(parseInt("0101", 10));
    console.log(parseInt("5", 10));
    console.log(parseFloat('45132.45', 10));
    console.log(isNaN(parseInt('GURURURU')));

    console.groupEnd();

    // toFixed(x) se utiliza para redondear

    console.group('To Fixed y MathROund');

    console.log((4.563127).toFixed(4));
    console.log((4.000001).toFixed(4));
    console.log((4.005).toFixed(2));
    console.log((4.006).toFixed(2));

    // NO REDONDEA EL 5 :/
    // Es preferible hacerlo con Math Round

    console.info('MATH ROUND :)');
    console.log(Math.round(4.005 * 100) / 100);
    console.log(redondear(4.005));

    console.groupEnd();

};

function redondear (valor_ )
{
    return (Math.round(valor_ * 100) / 100 ).toFixed(2);
}

(function() {
    console.debug('QUÉ ES');

    var soyNumero = 4156;

    // Función Anónima.
    // Al ponerle los paréntesis detrás se ejecuta

    // ¿Para qué?
    // El código podría estar escrito suelto y también funcionaría. Para crear una función anónima.
    // Se utiliza para crear una zona de aislamiento de variables, para que no puedan acceder a su contenido
    // desde fuera.

})();
