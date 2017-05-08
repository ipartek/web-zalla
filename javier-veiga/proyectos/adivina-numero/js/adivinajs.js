function adivina() {

    var seguirJugando = true;
    var numeroUsuarioValido = false;
    var desde;
    var hasta;
    var numeroRandom;
    var numeroUsuario;
    var intentos = 0;




    desde = validarEntradas(desde, false, "Introduce un numero desde:");

    if (seguirJugando) {

        hasta = validarEntradas(hasta, false, "Introduce un numero hasta:");

        if (seguirJugando) {

            numeroRandom = getRandomInt(desde, hasta);
            do {
                while (!numeroUsuarioValido && seguirJugando) {
                    numeroUsuario = validarEntradas(numeroUsuario, false, "Intenta adivinar el numero:");

                    if (numeroUsuario < desde || numeroUsuario > hasta) {
                        alert("por favor introduce un numero entre los valores previos:");
                    } else {
                        numeroUsuarioValido = true;
                    }
                }

                if (seguirJugando) {
                    intentos++;

                    if (numeroUsuario > numeroRandom) {
                        alert("es menor");
                        numeroUsuarioValido = false;
                    } else if (numeroUsuario < numeroRandom) {
                        alert("es mayor");
                        numeroUsuarioValido = false;
                    } else {
                        seguirJugando = false;
                    }
                }
            } while (seguirJugando);
        }

    }



    alert("enhorabuena has acertado lo has hecho en " + intentos + " intentos");


    function getRandomInt(min, max) {
        return parseInt(Math.random() * (max - min) + min);
    }

    function validarEntradas(numero, valido, texto) {

        while (seguirJugando && !valido) {

            numero = prompt(texto);

            if (numero === null) {
                alert("adios y gracias por jugar");
                seguirJugando = false;
            } else {
                numero = parseInt(numero);
                if (isNaN(numero)) {
                    alert("Por favor introduce un numero valido:");
                } else {
                    valido = true;
                }
            }

        }
        return numero;
    }

}
