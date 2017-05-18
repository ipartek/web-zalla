"use strict";

window.onload = function () {
    var btnIntroducir = document.getElementById("btnIntroducir");

    btnIntroducir.onclick = introducirDatos;

    var btnCrear = document.getElementById("btnCrear");

    btnCrear.onclick = crearTablas;

    var celda;
    var celda1;
    var celda2;
    var celda3;
    var celda4;
    var celda5;
    var celda6;
    var celda7;


    //  var btnCrear = document.getElementById("btnCrear");
    // btnCrear.onclick = crearFila;
};

function crearTablas() {
    var tabla = document.getElementById("tabla1");

    var contadorFila = tabla.rows.length;
    //var contadorColumna = tabla.cols.length;
    var fila = tabla.insertRow(contadorFila.length);


    celda = fila.insertCell(0);
    celda1 = fila.insertCell(1);
    celda2 = fila.insertCell(2);
    celda3 = fila.insertCell(3);
    celda4 = fila.insertCell(4);
    celda5 = fila.insertCell(5);
    celda6 = fila.insertCell(6);
    celda7 = fila.insertCell(7);


}

function introducirDatos() {
    var datoNombre = formulario1.nombre.value;
    var datoDescripcion = formulario1.descripcion.value;
    var datoPrecio = formulario1.precio.value;
    var datoStock = formulario1.stock.value;
    var datoFecha = formulario1.fecha.value;
    var datoCosa = formulario1.cosa.value;


    celda1.innerHTML = datoNombre;
    celda1.innerHTML = datoNombre;
    celda1.innerHTML = datoNombre;

    celda1.innerHTML = datoNombre;
    celda1.innerHTML = datoNombre;

    celda1.innerHTML = datoNombre;
    celda1.innerHTML = datoNombre;

}

//function
