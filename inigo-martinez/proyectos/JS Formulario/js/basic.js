'use strict'
var fin = document.getElementById("Finalizar");
var bloque = "laboral";
var formul;
var nombre, apellidos, genero;
var idiomas="", comentario, tasa;
var Bmostrar, Sgenero;
var sCheckB, auxsCheckB;
var sumValores;
var fsProfesion, iTasa;

window.onload = Inicio;

function Inicio() {
	document.getElementById("Nombre").focus();
	document.getElementById("Tasa").disabled= true;
    desaparecer();
    formul = document.getElementById("Genero");
    Bmostrar = document.getElementById("mostrar");
    fsProfesion=document.getElementById("rProfesion");

    formul.onchange = mostrar;
    fsProfesion.onchange=mostrarTasas;

    Bmostrar.onclick = alerta;

}

function desaparecer() {
    var bloqueLAB = document.getElementById(bloque);
    bloqueLAB.style.display = 'none';
}

function mostrar() {
    desaparecer();
    var bloqueLAB = document.getElementById(bloque);
    Sgenero = document.getElementById("Genero").value;
    if (Sgenero == 1 || Sgenero == 2) {
        bloqueLAB.style.display = 'block';
    }
}
function mostrarTasas(){
	var rVProfesion=document.forms[0].profesion;
	var iTasa=document.getElementById("Tasa");
	iTasa.style.textAlign ="right";
	switch (rVProfesion.value) {
		case '0':
			iTasa.value= 15+" €";
			break;
		case '1':
			iTasa.value= 25+" €";
			break;
		default:
			alert("NO ENTRO JAJAJAJAJA, SALUDOS")
			break;
	}

}
function alerta() {
    nombre = document.getElementById("Nombre").value;
    apellidos = document.getElementById("Apellidos").value;
    Sgenero = document.getElementById("Genero").value;
    switch (Sgenero) {
        case '1':
            genero = "Hombre";
            break;
        case '2':
            genero = "Mujer";
    }

    sCheckB = document.getElementsByName("Idiomas");
    if (sCheckB.checked) {
        sumValores = 1;
    }
    var cont = 0;
    do {
        sCheckB = document.getElementById("castellano");
        cont += 1;
        switch (cont) {
            case 1:
                if (sCheckB.checked) {
                    idiomas = "castellano";
                    sCheckB = document.getElementById("ingles");
                    auxsCheckB = document.getElementById("euskera");
                    if (sCheckB.checked || auxsCheckB.checked) {
                        idiomas += ", ";
                    }
                }
                break;
            case 2:
            sCheckB = document.getElementById("ingles");
                if (sCheckB.checked) {
                    idiomas += "inglés";
                }
                sCheckB = document.getElementById("euskera");
                if (sCheckB.checked)
                    idiomas += ", ";
                break;
            case 3:
            sCheckB = document.getElementById("euskera");
                if (sCheckB.checked)
                    idiomas += "euskera";
        }
    }
    while (cont <= 3 && sumValores != 0);

    comentario = document.getElementById("TAComentario").value;
    tasa=document.getElementById("Tasa").value;

    alert(nombre + " " + apellidos + " " + genero + "\n" + idiomas + "\n" + comentario +"\nSustasas son: "+ tasa);

}
