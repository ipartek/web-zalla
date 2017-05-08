'use strict';
var arr = new Array();
console.log(arr.length);

var arr5 = new Array(5);
console.log(arr5.length);

var arrPrerrellenado = new Array("Hola", new Date(), 5);
console.log(arrPrerrellenado);

var diasMeses = new Array(30, 28, 31, 30, 31);
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
console.log(arrPrerrellenado);


console.clear();
var tablero = new Array(8);
for(var i=0; i<8; i++){
	tablero[i] = new Array(8);
}
console.log(tablero);

tablero=[
	["t","c","a","r","R","a","c","t"],
	["p","p","p","p","p","p","p","p"],
	[" "," "," "," "," "," "," "," "],
	[" "," "," "," "," "," "," "," "],
	[" "," "," "," "," "," "," "," "],
	[" "," "," "," "," "," "," "," "],	
	["p","p","p","p","p","p","p","p"],
	["t","c","a","r","R","a","c","t"]

];

var contenidoFila;

for (var fila = 0; fila<tablero.length; fila++) {

	contenidoFila ="";

	for (var columna = 0; columna<tablero[fila].length;columna++) {
		contenidoFila += tablero[fila][columna];


	}
	console.log(contenidoFila);
}

console.log(tablero);