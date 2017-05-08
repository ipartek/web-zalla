var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];

function validarDni(dniConLetra)
{
    var esValido = dniConLetra == calcularDniConLetra(dniConLetra);
    return esValido;
}

function calcularDniConLetra(dni)
{
    var dniConLetra = parseInt(dni, 10) + calcularLetraDni(dni);
    return dniConLetra;
}

function calcularLetraDni(dni)
{
    var resto = parseInt(dni, 10) % 23;
    var letraDni = letras[resto];
    return letraDni;
}