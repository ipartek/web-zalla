'use strict'
//Colección de elementos. Array dinamico. No tiene limitaciones ni de elementos, ni de tipos
var arr = new Array();
console.log(arr.length);

var arr5 = new Array(5);
console.log(arr5.length);

var arrPrerrellenado = new Array("Hola", new Date(), 5);
console.log(arrPrerrellenado);

var diasMeses = new Array(31, 28, 31, 30, 31);
console.log(diasMeses);

var nombresMeses = new Array("Enero", "Febrero", "Marzo", "Abril", "Mayo");
console.log(nombresMeses);

var pos = new Date().getMonth();

var nombreMes = nombresMeses[pos];
console.log(nombreMes);

arrPrerrellenado[1] = "CAMBIADO";
arrPrerrellenado[3] = "NUEVO";
arrPrerrellenado["YEPA"] = "OTRO";
arrPrerrellenado[20] = 4;
arrPrerrellenado["YEPA2"] = "OTRO";
arrPrerrellenado[25] = new Date();

console.log(arrPrerrellenado);


//Array de arrays
var tablero = new Array(8);
for (var i = 0; i < 8; i++) {
    tablero[i] = new Array(8);
}

tablero = [
    ['t', 'c', 'a', 'r', 'R', 'a', 'c', 't'],
    ['p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'],
    ['', '', '', '', '', '', '', ''],
    ['', '', '', '', '', '', '', ''],
    ['', '', '', '', '', '', '', ''],
    ['', '', '', '', '', '', '', ''],
    ['p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'],
    ['t', 'c', 'a', 'r', 'R', 'a', 'c', 't']
]

for (var i = 0; i < 8; i++) {
    console.log(tablero[i]);
}

var contenidoFila;
for (var fila = 0; fila < tablero.length; fila++) {
    contenidoFila = '';
    for (var columna = 0; columna < tablero[fila].length; columna++) {
        contenidoFila += tablero[fila][columna] + ' ';
        //contenidoFila = contenidoFila + tablero[fila][columna];
    }
    console.log(contenidoFila);
}

//Concatenar dos arrays .concat
[1, 2, 3].concat([0, 9, 8]);
//Concatena un array convirtiendolo a texto .join() internamente se le pone el parámetro por el que se quiere que se le pase
[1, 2, 3].join() //Establecería una cadena de texto separado por coma "1,2,3"
eval([1, 2, 3]).join('+'); //Modifica la coma por un + y evalua la operación
//Da la vuelta a un array
[1, 2, 3].reverse();
//Ordena alfabeticamente el texto. Le pasamos la función (sin numeros) que queremos utilizar para que ordene la lista
[1, 76, 3].sort(comparaNumeros);
//Dado dos números a,b hazme la resta entre ellos a-b
[2, 67, 5, 4].sort((a, b) => a - b);

function comparaNumeros(a, b) {
    return a - b;
}


//for each funcion creada para mpstrar un elemento concreto de un array
for (var 1 = 0; i < nombreMeses.length; i++) {
    console.log(nombreMeses[i]);
}

for each(var nombreMes of nombresMeses) {
    console.log(nombreMes);
}
