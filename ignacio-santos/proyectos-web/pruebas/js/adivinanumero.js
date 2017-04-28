//window.onload = pruebaElNumero;

var numeroCorrecto = parseInt((Math.random() * 100) + 1, 10) //el numero aleatorio*100(xq da 0,algo) y más unopara que sea entre 1 y 100 (todo ello en base 10)

function cambiaElEncabezado() {
    document.getElementById('encabezado');

}

function pruebaElNumero() {
    //alert(numeroCorrecto);
    alert('Bienvenido al juego adivina el número');
    var numero = prompt("Adivina el número entre el 0 y el 100");
    if (numero == numeroCorrecto) { //el numero introducido es igual al correcto
        alert('Correcto!! Has necesitado muchos intentos');

    } else {

        if (numero < numeroCorrecto) { //el numero introducido es menor al correcto
            alert('Incorrecto!! El número es mayor que ' + numero);
            pruebaElNumero()
        } else { //el numero introducido es mayor al correcto
            alert('El número es menor que ' + numero);
            pruebaElNumero()

        }
    }
}

function pruebaElSegundoNumero() {
    //alert(numeroCorrecto);
    alert('Bienvenido al juego adivina el número');
    var numero2 = prompt("Adivina el número entre el 0 y el 100");
    if (numero == numeroCorrecto) {
        alert('Correcto!! Has necesitado muchos intentos');

    } else {

        if (numero < numeroCorrecto) {
            alert('Incorrecto!! El número es mayor que ' + numero);
            pruebaElNumero()
        } else {
            alert('El número es menor que ' + numero);
            pruebaElNumero()

        }
    }
}
