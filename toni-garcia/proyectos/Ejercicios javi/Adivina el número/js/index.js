window.onload = alCargar;

function alCargar() {
    alert("Bienvenido al juego adivina el número");

    var minimo = parseInt(prompt("Dime el mínimo"));
    var maximo = parseInt(prompt("Dime el máximo"));
    
    var numeroPreestablecido = parseInt((Math.random() * (maximo - minimo)) + minimo, 10);
    
    var intentos = 0;
    
    console.log(numeroPreestablecido);

    alert("Acabo de pensar un número");

    //Principio de repetición

    var seguirJugando = true;

    do {
        var numero = prompt("Introduce un número");

        if (numero == null) {
            alert("Hasta otra");
            seguirJugando = false;
        } else if (isNaN(parseInt(numero))) {
            alert("La próxima vez escribe un número");
        } else {

            numero = parseInt(numero);

            if(numero > maximo || numero < minimo) {
                alert("Te has salido del rango " + minimo + " a " + maximo);
            } else if (numeroPreestablecido > numero) { //if(numero < numeroPreestablecido)
                alert("Es mayor");
                intentos++;
            } else if (numeroPreestablecido == numero) {
                alert("Has acertado");
                intentos++;
                alert("Has necesitado " + intentos + " intentos");
            } else {
                alert("Es menor");
                intentos++;
            }
        }
    }
    while (numero != numeroPreestablecido && seguirJugando);
    //Fin de repetición

}
