var arr = new Array();
console.log(arr.length);

var arr5 = new Array(5);
console.log(arr5.length);

var arrPrerrellenado = new Array("Hola", new Date(), 5) //Se puede pero...
var diasMeses = new Array(31, 28, 30);
var nombreMeses = new Array("Enero", "Febrero");

var tablero = new Array(8);
for (int i = 0; i < 8; i++) {
    tablero[i] = new Array(8);
}
console.log(tablero);

var orden = [4, 2, 67, 5, 4].sort((a, b) => a - b); //Expresión lambda

console.log(orden);

var orden2 = [4, 2, 67, 5, 4].sort(function(a, b) {
    return a - b;
});

console.log(orden2);

for each(var nombreMes in nombreMeses) { //No soportado por Chrome
    console.log(nombreMes);
}

for (var i in nombreMeses) {
    console.log(nombreMes[i]);
}
