"use strict";

window.onload = alCargar;
var almacenTasas;
var cambioTasas;


function alCargar() {
    //var sexoMarcado = datospersonales.sexo.va

    var desplegableSexo = document.getElementById("sexo");

    desplegableSexo.onchange = estadoCivilHabilitado;

    var cambioTasas = datosPersonales.profesion;
    
    var btnMostrar = document.getElementById("btnMostrar");
    
    btnMostrar.onclick = mostrarDatos;



    for (var i = 0; i < cambioTasas.length; i++) {

        cambioTasas[i].onclick = calcularTasas;
          
          
    }
}
function mostrarDatos(){
    var nombre = "Nombre: "+datosPersonales.nombre.value;
    var apellidos = "Apellidos: "+datosPersonales.apellidos.value;
    
    var tasas = "Tasas: "+datosPersonales.tasas.value;
    
    var mensajePantalla = nombre+"\n"+apellidos+"\n"+tasas+"\n";
    
    alert(mensajePantalla);
}

function calcularTasas() {

    //for (var i = 0; i < cambioTasas.length; i++) {
    //if (cambioTasas[i].checked) {
        //       alert("que pasa");
        //   }
        // }
    almacenTasas = this.id;

        switch (almacenTasas) {
            case "profesion1":
                datosPersonales.tasas.value = "15€";
                break;
            case "profesion2":
                datosPersonales.tasas.value = "20€";
                break;
            case "profesion3":
                datosPersonales.tasas.value = "2€";
                break;
            case "profesion4":
                datosPersonales.tasas.value = "5€";
                break;
        }

    //}

}

function estadoCivilHabilitado() {
    var valorSexo = datosPersonales.sexo.options[datosPersonales.sexo.selectedIndex].value;
    if (valorSexo == 2) {
        //datosPersonales.estadoCivil.disabled = true;
        //alert("casa");"estadoCivil"
        document.getElementById("estadoCivil").disabled = false;
    } else {
        //datosPersonales.estadoCivil.disabled = false;
        document.getElementById("estadoCivil").disabled = true;
    }
}
