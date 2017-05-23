'use strict'

var formul, nombre, precio, spanNombre = "",
    spanPrecio = "",
    nombreCorrecto, ejecutarAccion = false,
    idProductoModificar, nombreModificar, descripcionModificar, precioModificar, stockModificar, fechaModificar, categoriaModificar, filaAuxiliar, nomDinamico, idDinamico, descDinamico, precDinamico, stkDinamico, fecDinamico, catDinamico;

$(function() {

    formul = document.forms[0];
    $("#formProductos form").toggle(0);
    $("a.anadirRegistro").on("click", insertarDatosProductos);
    $("a.modificarRegistro").on("click", modificarDatosProductos);
    $("input#btnAlta").on("click", altaRegistro);
    $("input#btnModificar").on("click", modificarRegistro);

    $("input#btnVolver").on("click", volver);

});

function insertarDatosProductos() {
    $("input#btnModificar").hide();
    $("input#btnAlta").show();
    $("table.tablaProductos").hide(1000);
    $("#formProductos form").delay(1000).show(3000);
}

function modificarDatosProductos() {
    $("input#btnAlta").hide();
    $("input#btnModificar").show();
    $("table.tablaProductos").hide(1000);
    $("#formProductos form").delay(1000).show(3000);
}

function altaRegistro() {
    nombre = $("input#txtNombre");
    spanNombre = $("span.errorNombre");
    precio = $("input#numPrecio");
    spanPrecio = $("span.errorPrecio");



    if (nombre.val() == "") {
        spanNombre[0].style.color = 'white';
        spanNombre[0].style.display = "inline-block";
    } else {
        spanNombre[0].style.display = "none";
    }

    if (precio.val() == "" || isNaN(precio.val())) {
        spanPrecio[0].style.color = "white";
        spanPrecio[0].style.display = "inline-block";
    } else {
        spanPrecio[0].style.display = "none";
    }

    if (nombre.val() != "" && (precio.val() != "" || isNaN(precio.val()))) {
        ejecutarAccion = true;
        $("#formProductos form").hide(1000);
        $("table.tablaProductos").delay(1000).show(3000);
    }
    return ejecutarAccion;

}

function seleccionarLinea(seleccion) {
    filaAuxiliar = seleccion.id;
    idDinamico = document.getElementById("id1").id + filaAuxiliar;
    nomDinamico = document.getElementById("nom1").id + filaAuxiliar;
    descDinamico = document.getElementById("desc1").id + filaAuxiliar;
    precDinamico = document.getElementById("prec1").id + filaAuxiliar;
    stkDinamico = document.getElementById("stk1").id + filaAuxiliar;
    fecDinamico = document.getElementById("fec1").id + filaAuxiliar;
    catDinamico = document.getElementById("cat1").id + filaAuxiliar;

}

function modificarRegistro() {
    nombre = $("input#txtNombre");
    spanNombre = $("span.errorNombre");
    precio = $("input#numPrecio");
    spanPrecio = $("span.errorPrecio");



    if (nombre.val() == "") {
        spanNombre[0].style.color = 'white';
        spanNombre[0].style.display = "inline-block";
    } else {
        spanNombre[0].style.display = "none";
    }

    if (precio.val() == "" || isNaN(precio.val())) {
        spanPrecio[0].style.color = "red";
        spanPrecio[0].style.display = "inline-block";
    } else {
        spanPrecio[0].style.display = "none";
    }

    if (nombre.val() != "" && (precio.val() != "" || isNaN(precio.val()))) {
        ejecutarAccion = true;
        $("#formProductos form").hide(1000);
        $("table.tablaProductos").delay(1000).show(3000);
    }
    return ejecutarAccion;
}















function volver() {
    $("#formProductos form").hide(1000);
    $("table.tablaProductos").delay(1000).show(3000);

}
