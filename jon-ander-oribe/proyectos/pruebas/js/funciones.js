var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E']

function validarDNI(dni) {

    return dniConLetra == calcularDniConLetra(dniSinLetra);
}

function calcularDniConLetra(dni) {
    return parseInt(dni, 10) + calcularLetraDni(dni);
}

function calcularLetraDNI(dni) {

    var resto = parseInt(dni, 10) % 23;
    return letras[resto];
}
