'use strict'
	var fin=document.getElementById("Finalizar");
	var bloque="laboral";
	var formul ;
	var nombre, apellidos, genero;
	var idiomas, comentario;
	var Bmostrar, Sgenero;

window.onload=Inicio;

function Inicio(){

	desaparecer();
	formul = document.getElementById("Genero");
	Bmostrar = document.getElementById("mostrar");
	formul.onchange=mostrar;

	Bmostrar.onclick=alerta;

}
function desaparecer() {
	var bloqueLAB = document.getElementById(bloque);
	bloqueLAB.style.display ='none' ; 
}
function mostrar(){
	var bloqueLAB = document.getElementById(bloque);
	bloqueLAB.style.display = 'block';
}
function alerta(){
	nombre=document.getElementById("Nombre").value;
	apellidos=document.getElementById("Apellidos").value;
	Sgenero=document.getElementById("Genero").value;
	switch (Sgenero) {
		case '1':
			genero = "Hombre";
			break;
		case '2':
			genero = "Mujer";
			break;
	}
	alert(nombre+" "+apellidos+" "+genero);
}