"use strict"

var form, nombre, apellidos, dni, validarPatron, sexo;
var patron = /^([A-Z]{1}[a-zñáéíóú]+[\s]*)+$/;
var patronDni = /^\d{8}[a-zA-Z]$/;

window.onload = function () {
    form = document.forms[0];
    nombre = form.nombre;
    apellidos = form.apellidos;
    dni = form.txtDni;
    sexo = form.sexo;
    var btnEnviar = form.boton_enviar;
    btnEnviar.onclick = validar();
}

function validar() {
    form.onsubmit = function () {
        if (!evaluarNombre()) {
            nombre.focus();
            return false;
        }
        if (!evaluarApellidos()) {
            apellidos.focus();
            return false;    
        }
        if (!evaluarDni()) {
            dni.focus();
            return false;
        }
        if (!evaluarSexo()) {
            sexo.focus();
            return false;
        }
    }
}

function evaluarNombre() {
    var nombreValor = nombre.value;
    validarPatron = patron.test(nombreValor);
    if (!validarPatron) { // || !correcto(compNombre)) {
        alert("¡¡¡NO has introducido correctamente el nombre!!!\nEjemplo: Luis Angel");
        return false;
    } else {
        return true;
    }
}

function evaluarApellidos() {
    var apellidosValor = apellidos.value;
    validarPatron = patron.test(apellidosValor);
    if (!validarPatron) { // || !correcto(compNombre)) {
        alert("¡¡¡NO has introducido correctamente los apellidos!!!\nEjemplo: Marquez Robles");
        return false;
    } else {
        return true;
    }
}

function evaluarDni() {
    var dniValor = dni.value;
    if (!validarDni(dniValor)) {
        alert("¡¡¡NO has introducido correctamente el dni!!!\nEjemplo: 12345678Z");
        return false;
    } else {
        return true;
    }
}

function evaluarSexo() {
    if (sexo.value == 0) {
        alert("¡¡¡NO has seleccionado sexo!!!");
        return false;
    } else {
        return true;
    }
}
