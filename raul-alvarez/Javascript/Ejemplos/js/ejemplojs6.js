'use strict';

var arr = new Array();
console.log(arr.length);

var arr5 = new Array(5);
console.log(arr5.length);

var arrPrerrellenado = new Array("Hola", new Date(), 5); //Se puede pero...
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

console.clear();

var tablero = new Array(8);

for(var i = 0; i < 8; i++) {
    tablero[i] = new Array();
}

tablero[1][3] = 'PEON';
console.log(tablero);

tablero = [
    ['t','c','a','r','R','a','c','t'],
    ['p','p','p','p','p','p','p','p'],
    [' ',' ',' ',' ',' ',' ',' ',' '],
    [' ',' ',' ',' ',' ',' ',' ',' '],
    [' ',' ',' ',' ',' ',' ',' ',' '],
    [' ',' ',' ',' ',' ',' ',' ',' '],
    ['p','p','p','p','p','p','p','p'],
    ['t','c','a','r','R','a','c','t']
];

tablero[1][4] = ' ';
tablero[3][4] = 'p';

console.log(tablero);

var contenidoFila;

for(var fila = 0; fila < tablero.length; fila++) {
    contenidoFila = '';
    
    for(var columna = 0; columna < tablero[fila].length; columna++) {
        contenidoFila += tablero[fila][columna] + ' ';
        //contenidoFila = contenidoFila + tablero[fila][columna];
    }
    
    console.log(contenidoFila);
}

console.log([1,2,3].concat([0,9,8]));

console.log(eval([1,2,3,4,5,6,7,8,9].join('*')));

console.log([1,2,3].reverse());

console.log(['Pedro', 'Javier', 'Susana'].sort());

function comparaNumeros(a,b) {
    return a - b;
}

console.log([3,90,2,1,5,76,8].sort(comparaNumeros));

for(var i = 0; i < nombresMeses.length; i++){
    console.log(nombresMeses[i]);
}

//FIN Suficiente

for(var i in nombresMeses) {
    console.log(nombresMeses[i]);
}

for(var nombreMes of nombresMeses) {
    console.log(nombreMes);
}

function cadaMes(nombreMes, indice, arr) {
    console.log("cadaMes", nombreMes, indice, arr);
}

nombresMeses.forEach(cadaMes);

nombresMeses.forEach(function(nombreMes, indice, arr) {
    console.log("cadaMes", nombreMes, indice, arr);
});

nombresMeses.forEach(
    (nombreMes, indice, arr) => {
        console.log("cadaMes", nombreMes, indice, arr);
        console.log("OTRO");
    }
);

Array.prototype.miForEach = function(funcion){
    for(var i = 0; i < this.length; i++){
        funcion(this[i], i, this);
    }
};

nombresMeses.miForEach(cadaMes);


function escribirEnLog(texto) {
    console.log(texto);
}

function escribirEnAlerta(texto) {
    alert(texto);
}

//escribirEnLog("alkdjfalsk");
//escribirEnAlerta("alsdkjflkads");

var escribir;

escribir = escribirEnLog;

escribir("En LOG");

escribir = escribirEnAlerta;

escribir("En ALERTA");