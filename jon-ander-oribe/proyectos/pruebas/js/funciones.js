/**********************************************************************************
 */


var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E']



function validarDNI(dniConLetra) {
    if (dniConLetra.match(/\d{8}[a-zA-Z]/))

        var esValido = dniConLetra == calcularDniConLetra(dniConLetra);
    return esValido;
}

function calcularDniConLetra(dni) {
    return parseInt(dni, 10) + calcularLetraDni(dni);
}

function calcularLetraDNI(dni) {

    var resto = parseInt(dni, 10) % 23;
    return letras[resto];
}

function rellenarCerosDni(numero) {
    return ('00000000' + numero).substring(-8);
}
