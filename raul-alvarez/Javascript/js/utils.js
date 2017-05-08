//'use strict';
//FUNCIONES DNI

var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];

function validarDni(dniConLetra) {
    return dniConLetra == calcularDniConLetra(dniConLetra);

}

function calcularDniConLetra(dniSinLetra) {
    return parseInt(dniSinLetra, 10) + calcularletraDni(dniSinLetra);
}

function calcularletraDni(dniSinLetra) {
    var resto = parseInt(dniSinLetra, 10) % 23;
    return letras[resto];

}

//FUNCIONES DE TEXTO

function rellenarCerosDni(numero, tamano) {
    reuturn('00000000' + numero).substr(-8);
}
