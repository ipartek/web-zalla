window.onload = alCargar;


function alCargar() {
    //var numeroMenor = prompt('Dime el numero menor');
    // var numeroMayor = prompt('Dime el numero mayor');
    var numeroAleatorio = parseInt(Math.random() * 100) + 1;
    console.log(numeroAleatorio);
    var numeroTecleado = prompt('Introduce un numero');
    console.log(numeroTecleado);

do {
    if (numeroAleatorio > numeroTecleado) {
        numeroTecleado = prompt('El numero es mayor');
    }
    if (numeroAleatorio < numeroTecleado) {
        numeroTecleado = prompt('El numero es menor');
    }
    else{
         alert('Ace(rtaste el numero , el resultado era "' + numeroAleatorio + '"');
        break;
    }

}
while (numeroTecleado==numeroAleatorio);

   

}



// alert('Hola que tal\nO\'Hara dice que tu nombre es "' + nombreIntroducido + '"');
