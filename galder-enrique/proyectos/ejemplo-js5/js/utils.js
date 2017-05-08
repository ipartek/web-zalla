function rellenarCerosDni(numero){
	return ("00000000" + numero).substr(-8);
}

var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];

function validarDni(dniConLetra){

	if(dniConLetra.match(/\d{8}[A-Z]/))
	return dniConLetra == calcularDniConLetra(dniConLetra);
}

function calcularDniConLetra(dni){
	return rellenarCerosDni(parseInt(dni, 10)) + calcularLetraDni(dni);
}

function calcularLetraDni(dni){
	var resto = parseInt(dni, 10) % 23;
	return letras[resto];
}