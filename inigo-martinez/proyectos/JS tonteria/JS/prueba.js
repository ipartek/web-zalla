'use strict';
var num, intervMax,intervMin , intentos, intento;
var acertar=false;
window.onload= alCargar;


function alCargar(){

	console.log("Inserta el máximo del intervalo para jugar.");
	intervMax=parseInt(prompt("Inserta el Máximo del intervalo para jugar."));
	console.log("Inserta el mínimo del intervalo para jugar.");
	intervMin=parseInt(prompt("Inserta el mínimo del intervalo para jugar."));
	alert(intervMin+" , "+intervMax);
	num = parseInt((Math.random()*(intervMax-intervMin))+intervMin);
	console.log("Empezamos...");
	intentar();
}
function intentar(){

	while(!acertar){
		alert("Introduce el número que crees que es" + num);
		intento=prompt("Introduce el número que crees que es.");
		if(intento==num){
			alert("ACERTASTE");
			acertar=true;
		}else{
			alert("Fallaste, pero estuviste cerca.");
			intentos++;
			if(intento>num){
				alert("Mi número es menor que "+intento);
			}else{
				alert("Mi número es mayor que "+intento);
			}
		}
	}

}