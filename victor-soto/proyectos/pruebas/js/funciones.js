//Funciones de texto


//Funciones de DNI

var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];

function validarDNI(dniConLetra) {
    if (dniConLetra.match(/\d{8}[a-zA-Z]/))
        var esValido;
    esValido = dniConLetra == calcularDNIConLetra(dniConLetra);
    return esValido;
}

function calcularDNIConLetra(dniSinLetra) {
    var dniConLetra
        //parseInt separa los elementos numéricos de las letras
    deniConLetra = rellenarCerosDNI(parseInt(dniSinLetra, 10) + calcularLetraDNI(dniSinLetra));
    return dniConLetra;
}

function calcularLetraDNI(dniSinLetra) {

    var letraDni;
    var resto = parseInt(dniSinLetra, 10) % 23;

    letraDni = letras[resto];
    return letraDni;
}

function rellenarCerosDNI(numero, tamano) {
    return ("00000000" + numero).slice(-8);
}
