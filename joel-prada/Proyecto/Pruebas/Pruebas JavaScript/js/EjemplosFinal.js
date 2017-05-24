"use strict";
var celda;
var celda1;
var celda2;
var celda3;
var celda4;
var celda5;
var celda6;
var celda7;

window.onload = function () {
    var btnIntroducir = document.getElementById("btnIntroducir");

    btnIntroducir.onclick = introducirDatos;

    var btnCrear = document.getElementById("btnCrear");

    btnCrear.onclick = crearTablas;
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
    var patronDatoNombre = /^[a-zA-Z ]{2,30}$/;
    var patronDatoDescripcion = /^[a-zA-Z ]{2,30}$/;
    var patronDatoPrecio = /^[1-9 ]{1,5}$/;
    var patronDatoStock = /^[1-9 ]{1,3}$/;
    var patronDatoFecha = /^(0?[1-9]|[12][0-9]|3[01])[\/](0?[1-9]|1[012])[/\\/](19|20)\d{2}$/;

    var datoModificar = document.getElementById("modificar");
    var datoNombre = formulario1.nombre.value;
    var datoDescripcion = formulario1.descripcion.value;
    var datoPrecio = formulario1.precio.value;
    var datoStock = formulario1.stock.value;
    var datoFecha = formulario1.fecha.value;
    var datoCosa = formulario1.cosa.value;
    var datoBorrar = document.getElementById("borrar");

    if (datoNombre.length == 0 || !patronDatoNombre.test(datoNombre)) {
        alert("Introduce el NOMBRE CORRECTAMENTE");
        return false;
    }
    if (datoDescripcion.length == 0 || !patronDatoDescripcion.test(datoDescripcion)) {
        alert("Introduce la DESCRIPCION CORRECTAMENTE");
        return false;
    }
    if (datoPrecio.length == 0 || !patronDatoPrecio.test(datoPrecio)) {
        alert("Introduce el PRECIO CORRECTAMENTE");
        return false;
    }
    if (datoStock.length == 0 || !patronDatoStock.test(datoStock)) {
        alert("Introduce el STOCK CORRECTAMENTE");
        return false;
    }
    if (datoFecha.length == 0 || !patronDatoFecha.test(datoFecha)) {
        alert("Introduce la FECHA CORRECTAMENTE\n"+ "Ejemplo: 26/04/1988");
        
        return false;
    }
    

    celda.appendChild(datoModificar.cloneNode());
    celda1.innerHTML = datoNombre;
    celda2.innerHTML = datoDescripcion;
    celda3.innerHTML = datoPrecio;
    celda4.innerHTML = datoStock;
    celda5.innerHTML = datoFecha;
    celda6.innerHTML = datoCosa;
    celda7.appendChild(datoBorrar.cloneNode());

}

//function
