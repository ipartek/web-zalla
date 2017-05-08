'use strict';
window.onload = alCargar;


function alCargar() {
    document.getElementById('btnPartida').onclick = partidaAleatoria;
    document.getElementById('btnPartMenorMayor').onclick = partidaMenorMayor;
}



function partidaAleatoria() {
    //var numeroMenor = prompt('Dime el numero menor');
    // var numeroMayor = prompt('Dime el numero mayor');
    var numeroAleatorio = parseInt(Math.random() * 100) + 1;
    console.log(numeroAleatorio + '  aleatorio');
    var numeroTecleado = parseInt(prompt('Introduce un numero del 1 al 100'));
    console.log(numeroTecleado + '  tecleado');
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
                numeroTecleado = parseInt(prompt('Solo numeros del 1 al 100'));
                numeroIntentos++;
            }

        }
        numeroIntentos++;
    }
    while (numeroTecleado != numeroAleatorio);
    alert('Acertaste el numero , el resultado era "' + numeroAleatorio + '"');
    alert('Necesitaste "' + numeroIntentos + '" intentos');
}



function partidaMenorMayor() {
    var numeroMenor = parseInt(prompt('Dime el numero menor'));
    console.log(numeroMenor + '  Menor');
    var numeroMayor = parseInt(prompt('Dime el numero mayor'));
    console.log(numeroMayor + '  Mayor');
    var numeroAleatorio = parseInt(Math.random() * (numeroMayor - numeroMenor) + numeroMenor);
    console.log(numeroAleatorio + '  aleatorio');

    var numeroTecleado = parseInt(prompt('Introduce un numero del ' + numeroMenor + ' al ' + numeroMayor));
    console.log(numeroTecleado);

    var numeroIntentos = 0;


    do {
        if (isNaN(numeroMayor <= numeroMenor)) {
            alert('El numero superior tiene que ser mayor que ' + numeroMenor);
            numeroMayor = parseInt(prompt('Dime un numero mayor que ' + numeroMenor));
            console.log(numeroMayor + '  Mayor');
            var numeroAleatorio = parseInt(Math.random() * (numeroMayor - numeroMenor) + numeroMenor);
            console.log(numeroAleatorio + '  aleatorio');



        } else {




            if (isNaN(numeroTecleado)) {
                alert('Solo numeros del ' + numeroMenor + ' al ' + numeroMayor)
                numeroTecleado = numeroAleatorio + 1;
                console.log(numeroTecleado);
            } else {
                if (numeroTecleado >= numeroMenor && numeroTecleado <= numeroMayor) {

                    if (numeroAleatorio > numeroTecleado) {
                        numeroTecleado = parseInt(prompt('El numero es mayor,sigue intentandolo'));
                    }
                    if (numeroAleatorio < numeroTecleado) {
                        numeroTecleado = parseInt(prompt('El numero es menor,sigue intentandolo'));
                    }

                } else {
                    alert('Solo numeros del ' + numeroMenor + ' al ' + numeroMayor);
                    console.log('Solo numeros del ' + numeroMenor + ' al ' + numeroMayor);
                    numeroTecleado = parseInt(prompt('Solo numeros del ' + numeroMenor + ' al ' + numeroMayor));
                    numeroIntentos++;

                }

            }
        }
        numeroIntentos++;
    }
    while (numeroTecleado != numeroAleatorio);
    alert('Acertaste el numero , el resultado era "' + numeroAleatorio + '"');
    alert('Necesitaste "' + numeroIntentos + '" intentos');
}
