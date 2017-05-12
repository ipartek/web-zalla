"use strict;"

window.onload = alCargar;

var patronNombre = new RegExp("[a-zA-Z ]");

function alCargar(){
    
    var btnValidar = document.getElementById("btnValidar");
    
    btnValidar.onclick = validar;
};

function validar(){
    var nombre = formulario1.nombre.value;
    var dni = formulario1.dni.value;
    if (nombre.length == 0 || !patronNombre.test(nombre.value)){
        alert("Introduce el nombre correctamente");
        return false;
    }
}