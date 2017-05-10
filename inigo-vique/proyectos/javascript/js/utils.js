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


/* FUNCIONES NOMBRE */

function validarNombre(nombre_)
{
    // Comprobamos si el nombre introducido es válido:
    // http://aprende-web.net/javascript/js13_3.php  
    // 
    // - tiene exclusivamente letras (nada de número ni símbolos raros)
    // - la priemera letra tiene que estar en mayúscula
    // - permite nombres compuestos, pero la primera letra de cada uno ha de estar en mayúscula (no me gusta :( )

    if (!nombre_.match(/^([A-ZÁÉÍÓÚ]{1}[a-zñáéíóú]+[\s]*)+$/))
        return false;
    else
        return true;
}

/* FUNCIONES FECHAS */

// Funciona con el sistema de fechas de Javascript
// 0 es enero y 11 es diciembre
function validarFecha(dia_, mes_, ano_)
{

    let isValid = true;

    dia_ = parseInt(dia_, 10);
    mes_ = parseInt(mes_, 10);
    ano_ = parseInt(ano_, 10);

    if (isNaN(dia_) || isNaN(mes_) || isNaN(ano_))
    {
        return false;
    }

    if (dia_ > 31 || dia_ < 0)
    {
        return false;
    }

    if (mes_ > 11 || mes_ < 0)
    {
        return false;
    }

    switch (dia_)
    {
        case 29:
        case 30:
            //console.log('29 o 30');
            isValid = !(mes_ == 1 && (ano_ % 4 != 0));
            break;
        case 31:
            //console.log('31');
            isValid = (mes_ == 0 || mes_ == 2 || mes_ == 4 || mes_ == 6 || mes_ == 7 || mes_ == 9 || mes_ == 11);
            break;
        default:
            //console.log('otros dias');
            isValid = true;
            break;
    }

    return isValid;

}