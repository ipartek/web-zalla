Document.write("Bienvenido a adivina el número");

var encontrado = false;
var num;
var numRandom;

numRandom = Math.floor(Math.random() * (10)) + 1;

while (!encontrado) {
    num = parseInt(prompt('Escribe un número de 1 a 100'));

    if (num = numRandom) {
        encontrado = true;
        Document.write("Lo conseguiste!");
    } else {
        if (num > numRandom) {
            Document.write("Es menor");
        } else {
            Document.write("Es mayor");
        }
    }


}
