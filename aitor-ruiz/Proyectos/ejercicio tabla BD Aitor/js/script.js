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





});

var id;
var nombre;
var descripcion;
var precio;
var stock;
var fecha

document.getElementById("inpId").value = id;
document.getElementById("inpNombre").value = nombre;
document.getElementById("inpDescripcion").value = descripcion;
document.getElementById("inpPrecio").value = precio;
document.;
getElementById("inpStock").value = stock;
document.getElementById("inpFecha").value = fecha;

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
    document.getElementById("inpNombre").value = "Magdalenas chocolate";
    document.getElementById("inpDescripcion").value = "Increibles";
    document.getElementById("inpPrecio").value = 12;
    document.getElementById("inpStock").value = 17;
    document.getElementById("inpFecha").value = "2017-05-18";
}
