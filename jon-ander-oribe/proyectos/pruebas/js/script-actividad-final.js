'use strict'

var rows = 4;
var idDinamico = 0;
var nombreDinamico = "nombre";
var descripcionDinamico = "descripcion";
var precioDinamico = 0.0;
var stockDinamico = 0;
var fechaDinamico = "fecha";
var auxfila = "";

$(function() {

    var auxiliar = $("idTabla1").value;


    $(".btnTabla1").click(function() {
        $("form").fadeToggle(1000);
        $(".btnTabla1").val("Enviar");
    });

    $(".reseteoBoton").click(function() {
        $(".btnTabla1").val("Modificar");
        $("form").fadeOut(1000);
    });



});



function cargarDatos() {

    /*

    if (document.getElementById("inpId").value != "" && document.getElementById("inpNombre").value != "") {

        document.getElementById(idDinamico).innerHTML = document.getElementById("inpId").value;

        document.getElementById(nombreDinamico).innerHTML = document.getElementById("inpNombre").value;

        document.getElementById(descripcionDinamico).innerHTML = document.getElementById("inpDescripcion").value;

        document.getElementById(precioDinamico).innerHTML = document.getElementById("inpPrecio").value;

        document.getElementById(stockDinamico).innerHTML = document.getElementById("inpStock").value;

        document.getElementById(fechaDinamico).innerHTML = document.getElementById("inpFecha").value;

    } else {
        return false;
    }
    */


    if (document.getElementById("inpId").value != "" && document.getElementById("inpNombre").value != "") {

        document.getElementById("id4").innerHTML = document.getElementById("inpId").value;

        document.getElementById("nombre4").innerHTML = document.getElementById("inpNombre").value;

        document.getElementById("descripcion4").innerHTML = document.getElementById("inpDescripcion").value;

        document.getElementById("precio4").innerHTML = document.getElementById("inpPrecio").value;

        document.getElementById("stock4").innerHTML = document.getElementById("inpStock").value;

        document.getElementById("fecha4").innerHTML = document.getElementById("inpFecha").value;

    } else {
        return false;
    }



}

function autoRellenar() {
    document.getElementById("inpId").value = 4;
    document.getElementById("inpNombre").value = "Ordenador retro";
    document.getElementById("inpDescripcion").value = "Armatoste con Pentium I";
    document.getElementById("inpPrecio").value = 23;
    document.getElementById("inpStock").value = 1;
    document.getElementById("inpFecha").value = "1987-04-05";
}

function nuevaFila() {

    var tab = document.getElementById("tabla");

    var fila = tab.insertRow();

    var celda1 = fila.insertCell(0);
    var celda2 = fila.insertCell(1);
    var celda3 = fila.insertCell(2);
    var celda4 = fila.insertCell(3);
    var celda5 = fila.insertCell(4);
    var celda6 = fila.insertCell(5);
    var celda7 = fila.insertCell(6);

    var campo1 = document.createElement("input");
    campo1.type = "button";
    campo1.value = "Modificar";
    campo1.class = "btnTabla1";

    var campo2 = document.createElement("td");
    var campo3 = campo2.cloneNode(true);
    var campo4 = campo2.cloneNode(true);
    var campo5 = campo2.cloneNode(true);
    var campo6 = campo2.cloneNode(true);
    var campo7 = campo2.cloneNode(true);


    celda1.appendChild(campo1);
    celda2.appendChild(campo2);
    celda3.appendChild(campo3);
    celda4.appendChild(campo4);
    celda5.appendChild(campo5);
    celda6.appendChild(campo6);
    celda7.appendChild(campo7);


}

function combinacionDinamica(seleccion) {

    auxfila = seleccion.id;
    idDinamico = 0;
    nombreDinamico = "";
    descripcionDinamico = "";
    precioDinamico = 0.0;
    stockDinamico = 0;
    fechaDinamico = "";


    auxfila = seleccion.id;
    idDinamico += parseInt(auxfila);
    nombreDinamico += auxfila;
    descripcionDinamico += auxfila;
    precioDinamico += parseFloat(auxfila);
    stockDinamico += parseInt(auxfila);
    fechaDinamico += auxfila;



}
