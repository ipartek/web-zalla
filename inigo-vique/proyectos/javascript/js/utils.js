/* Fichero de utilidades */

'use strict';

/* FUNCIONES DE DNI */

var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];

function validarDni(dniConLetra_)
{

    // El método match permite un REGEX para saber si el texto introducido encaja con el patrón.
    // Los REGEX se escriben en JS entre "/REGEX/" 
    if (!dniConLetra_.match(/\d{8}[a-zA-Z]/))
    {
        return false;
    }

    let esValido = dniConLetra_ == calcularDniConLetra(dniConLetra_);

    return esValido;
}

function calcularDniConLetra(dniSinLetra_)
{
    // mejor no hacer un parseInt, porque el DNI puede tener un cero por delante que desaparecería,
    // por el momento nos sirve así

    let dniConLetra = rellenarCerosDni(parseInt(dniSinLetra_, 10)) + calcularLetraDni(dniSinLetra_);

    console.log(dniConLetra);

    return dniConLetra;
}

function calcularLetraDni(dniSinLetra_)
{
    // Calcular DNI:
    // Se divide el número entre 23 y el resto se sustituye por una letra que se determina por inspección mediante la tabla anterior.

    let resto = parseInt(dniSinLetra_, 10) % 23;

    console.log(resto);

    let letra = letras[resto];

    return letra;
}

function rellenarCerosDni(numero_, tamano_ = 8)
{
    return ('00000000' + numero_).substr(-tamano_);
}