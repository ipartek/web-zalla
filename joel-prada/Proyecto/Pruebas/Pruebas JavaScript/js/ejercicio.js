"use strict";

window.onload = alCargar;

function alCargar(){
    var botonMostrar = document.getElementById("btnMostrar");
    botonMostrar.onclick = mostrarDatos;
}

function mostrarDatos(){
    var nombre = "Nombre: "+datosPersonales.nombre.value;
    var apellidos = "Apellidos: "+datosPersonales.apellidos.value;
    var sexo = "Sexo: "+datosPersonales.sexo.value;
    var estadoCivil = "Estado Civil: "+datosPersonales.estadoCivil.value;
   // var idioma = "Idioma: "+datosPersonales.idioma.value;
    //var profesion = "Profesión: "+datosPersonales.profesion.value;
    var comentario = "Comentario: "+"\n"+datosPersonales.comentarios.value;
    
    
    
    if(datosPersonales.idioma1.cheked){
        var idioma = "Idioma: "+datosPersonales.idioma1.value;
    }else if(datosPersonales.idioma2.cheked){
        var idioma = "Idioma: "+datosPersonales.idioma2.value;
    }else{
        var idioma = "Idioma: "+datosPersonales.idioma3.value;
    }
    
    if(datosPersonales.profesion1.cheked){
        var profesion = "Profesion: "+datosPersonales.profesion1.value;
    }else if(datosPersonales.profesion2.cheked){
         var profesion = "Profesion: "+datosPersonales.profesion2.value;
    }else if(datosPersonales.profesion3.cheked){
        var profesion = "Profesion: "+datosPersonales.profesion3.value;
    }else{
         var profesion = "Profesion: "+datosPersonales.profesion4.value;
    }
    
    var mensajeFinal = nombre+"\n"+ apellidos+"\n"+sexo+"\n"+ estadoCivil+"\n"+profesion+"\n"+comentario+"\n";
    alert(mensajeFinal);
    
}