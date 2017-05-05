'use strict';

var arr1 = new Array();
console.log(arr1.length);

var arr5 = new Array(5);
console.log(arr5.length);

var arrPrerrellenado = new Array("hola", new Date(), 5);
console.log(arrPrerrellenado);

var diasMeses = new Array(31, 28, 30, 31);
console.log(diasMeses);

var nombreMeses = new Array("enero", "febrero", "marzo", "abril", "mayo");
console.log(nombreMeses);

var pos = new Date().getMonth();

var nombremes = nombreMeses[pos];
console.log(nombremes);

arrPrerrellenado[1] = "cambiado";
arrPrerrellenado[3] = "NUEVO";
arrPrerrellenado["YEPA"] = "otro";
arrPrerrellenado[20] = "4";
console.log(arrPrerrellenado);

console.clear();

var tablero = new Array(8);
var tablero2 = new Array(8);

for (var i = 0; i < 8; i++) {
    tablero[1] = new Array(8);
}

tablero[1][3] = "PEON";
console.log(tablero);
console.log(tablero[1][3]);

tablero2 = [
    ['t', 'c', 'a', 'r', 'R', 'a', 'c', 't'],
    ['p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '],
    ['p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'],
    ['t', 'c', 'a', 'r', 'R', 'a', 'c', 't']
];
tablero2[1][4] = ' ';
tablero2[3][4] = 'p';
var contenidoFila;

for (var fila = 0; fila < tablero2.length; fila++) {
    contenidoFila = '';
    for (var columna = 0; columna < tablero2[fila].length; columna++) {
        contenidoFila += tablero2[fila][columna] + ' ';

    }
    console.log(contenidoFila);
}
