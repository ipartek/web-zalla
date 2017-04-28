function adivina() {

    do {
        var desde = parseInt(prompt("introduce un numero desde:"));
    } while (isNaN(desde));

    do {
        var hasta = parseInt(prompt("introduce un numero hasta:"));
    }
    while (isNaN(hasta) || (hasta <= desde));

    var numerorandom = parseInt(getRandomInt(desde, hasta));
    var intentos = 0;

    //do {
    do {
        var numerousuario = parseInt(prompt("Intenta adivinar el numero : "));
    } while (isNaN(numerousuario));
    intentos++;

    if (numerousuario > numerorandom)
        alert("es menor");
    else if (numerousuario < numerorandom)
        alert("es mayor");


    //} while (numerousuario != numerorandom);


    alert("enhorabuena has acertado lo has hecho en " + intentos + " intentos");

}

function getRandomInt(min, max) {
    return Math.random() * (max - min) + min;
}
