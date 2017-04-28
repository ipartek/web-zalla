function adivina() {
    var desde = parseInt(prompt("introduce un numero desde:"));
    var hasta = parseInt(prompt("introduce un numero hasta:"));

    var numerorandom = getRandomInt(desde, hasta);
    var intentos = 0;
    do {

        var numerousuario = parseInt(prompt("Intenta adivinar el numero : "));
        intentos++;

        if (numerousuario > numerorandom)
            alert("es menor");
        else if (numerousuario < numerorandom)
            alert("es mayor");


    } while (numerousuario != numerorandom);

    
    alert("enhorabuena has acertado lo has hecho en " + intentos + " intentos");

}

function getRandomInt(min, max) {
    return Math.random() * (max - min) + min;
}
