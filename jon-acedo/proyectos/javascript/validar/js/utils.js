var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];
var campo;

function escribeMsg(texto) {
    campo = document.getElementById('txtMsg');
    campo.value = texto;
};

function validarDni(dniConLetra) {
    var validado = dniConLetra == calcularDniConLetra(dniConLetra);
    return validado;
};

function calcularDniConLetra(dni) {
    dni = parseInt(dni, 10);
    console.log(dni);
    var conLetra = rellenaCeros(parseInt(dni, 10)) + calcularLetraDni(dni);
    return conLetra;
};

function calcularLetraDni(dni) {
    var resto = parseInt(dni, 10) % 23;
    var letra = letras[resto];
    return letra;
};

function rellenaCeros(numero) {

    return ('00000000' + numero).slice(-8);
};
