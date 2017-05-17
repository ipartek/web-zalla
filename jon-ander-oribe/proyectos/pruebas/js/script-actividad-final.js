'use strict'

$(function() {
    $(".btnTabla1").click(function() {
        $("form").fadeToggle(1000);
        $(".btnTabla1").val("Enviar");
    });

    $(".reseteoBoton").click(function() {
        $(".btnTabla1").val("Modificar");
        $("form").fadeOut(1000);
    });

    $(".btnTabla2").click(function() {
        $("form").fadeToggle(1000);
        $(".btnTabla2").val("Enviar");
    });

    $(".reseteoBoton").click(function() {
        $(".btnTabla2").val("Modificar");
        $("form").fadeOut(1000);
    });

    $(".btnTabla3").click(function() {
        $("form").fadeToggle(1000);
        $(".btnTabla3").val("Enviar");
    });

    $(".reseteoBoton").click(function() {
        $(".btnTabla3").val("Modificar");
        $("form").fadeOut(1000);
    });

    $(".btnTabla4").click(function() {
        $("form").fadeToggle(1000);
        $(".btnTabla4").val("Enviar");
    });

    $(".reseteoBoton").click(function() {
        $(".btnTabla4").val("Modificar");
        $("form").fadeOut(1000);
    });

    $(".btnTabla5").click(function() {
        $("form").fadeToggle(1000);
        $(".btnTabla5").val("Enviar");
    });

    $(".reseteoBoton").click(function() {
        $(".btnTabla5").val("Modificar");
        $("form").fadeOut(1000);
    });

});

var id;
var nombre;
var descripcion;
var precio;
var stock;
var fechaAlta;

document.getElementById("inpId").value = id;
document.getElementById("inpNombre").value = nombre;
document.getElementById("inpDescripcion").value = descripcion;
document.getElementById("inpPrecio").value = precio;
document.getElementById("inpStock").value = stock;
document.getElementById("inpFecha").value = fechaAlta;

function cargarDatos() {
    document.getElementById("id4").innerHTML = document.getElementById("inpId").value;
    document.getElementById("nombre4").innerHTML = document.getElementById("inpNombre").value;
    document.getElementById("descripcion4").innerHTML = document.getElementById("inpDescripcion").value;
    document.getElementById("precio4").innerHTML = document.getElementById("inpPrecio").value;
    document.getElementById("stock4").innerHTML = document.getElementById("inpStock").value;
    document.getElementById("fecha4").innerHTML = document.getElementById("inpFecha").value;

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
    campo1.class = "btnTabla5";

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
