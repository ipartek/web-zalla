'use strict';
window.onload = alCargar;


function alCargar() {
     document.getElementById('btnPartida').onclick = partida;
}



function partida() {
    //var numeroMenor = prompt('Dime el numero menor');
    // var numeroMayor = prompt('Dime el numero mayor');
    var numeroAleatorio = parseInt(Math.random() * 100) + 1;
    console.log(numeroAleatorio);
    var numeroTecleado = parseInt(prompt('Introduce un numero del 1 al 100'));
    console.log(numeroTecleado);
    var numeroIntentos = 0;

    do {
        if (isNaN(numeroTecleado)) {
            alert('Solo numeros')
            numeroTecleado = numeroAleatorio + 1;
            console.log(numeroTecleado);
        } else {
            if (numeroTecleado >= 1 && numeroTecleado <= 100) {

                if (numeroAleatorio > numeroTecleado) {
                    numeroTecleado = parseInt(prompt('El numero es mayor,sigue intentandolo'));
                }
                if (numeroAleatorio < numeroTecleado) {
                    numeroTecleado = parseInt(prompt('El numero es menor,sigue intentandolo'));
                }

            } else {
                console.log('Solo numeros del 1 al 100')
                 numeroTecleado = parseInt(prompt('Solo numeros del 1 al 100' ));
                numeroIntentos++;
            }

        }
        numeroIntentos++;
    }
    while (numeroTecleado != numeroAleatorio);
    alert('Acertaste el numero , el resultado era "' + numeroAleatorio + '"');
    alert('Necesitaste "' + numeroIntentos + '" intentos');
}
