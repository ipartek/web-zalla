'use strict'

window.onload = function () {

    var form = document.forms[0];

    form.onsubmit = function () {
        /*var nombreValor = form["nombre"].value;
        var patron = /^([A-Z]{1}[a-zñáéíóú]+[\s]*)+$/;
        var validarPatron = patron.test(nombreValor);
        if (!validarPatron) { // || !correcto(compNombre)) {
            alert("No has introducido correctamente el nombre \nEjemplo: Luis Angel");
            form["nombre"].focus();
            return false;
        }*/
        var nombre = form["nombre"];
        if (!evaluarNombre(nombre)) {
            nombre.focus();
            return false;
        }
        var apellidos = form["apellidos"];
        if (!evaluarNombre(apellidos)) {
            apelldos.focus();
            return false;
        }
    };

}

function evaluarNombre(nombre) {
    var nombreValor = nombre.value;
    var patron = /^([A-Z]{1}[a-zñáéíóú]+[\s]*)+$/;
    var validarPatron = patron.test(nombreValor);
    if (!validarPatron) { // || !correcto(compNombre)) {
        alert("No has introducido correctamente el nombre \nEjemplo: Luis Angel");
        return false;
    } else {
        return true;
    }
}
