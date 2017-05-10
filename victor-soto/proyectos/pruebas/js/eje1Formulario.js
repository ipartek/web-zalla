'use strict'

var form; //document.forms[0];
var nombre; //form["nombre"];
var apellidos; //form["apellidos"];
var estadoCivil; //form["estadoCivil"];
var profesion; //form["profesion"];
var comentarios; //form["comentarios"];
var patron = /^([A-Z]{1}[a-zñáéíóú]+[\s]*)+$/;
var validarPatron;

window.onload = function () {
    form = document.forms[0];
    nombre = form.nombre; //["nombre"];
    apellidos = form.apellidos; //["apellidos"];
    estadoCivil = form.estadoCivil; //["estadoCivil"];
    profesion = form.profesion; //["profesion"];
    comentarios = form.comentarios; //["comentarios"];


    var sEstado = estadoCivil; //form['sBloque']
    sEstado.onchange = function () {
        comentarios.disabled = false;
    };

    form.onsubmit = function () {

        if (!evaluarNombre(nombre)) {
            nombre.focus();
            return false;
        }
        if (!evaluarApellidos(apellidos)) {
            apellidos.focus();
            return false;
        }
        if (!evaluarEstado()) {
            estadoCivil.focus();
            return false;
        }
        if (!evaluarIdiomas()) {
            form.idioma1.focus();
            return false;
        }
        if (!evaluarProfesion()) {
            form.profesion1.focus();
            return false;
        }
        if (!evaluarComentarios()) {
            comentarios.focus();
            return false;
        }
    };
}

function evaluarNombre(nombre) {
    var nombreValor = nombre.value;
    validarPatron = patron.test(nombreValor);
    if (!validarPatron) { // || !correcto(compNombre)) {
        alert("¡¡¡NO has introducido correctamente el nombre!!!\nEjemplo: Luis Angel");
        return false;
    } else {
        return true;
    }
}

function evaluarApellidos(apellidos) {
    var apellidosValor = apellidos.value;
    validarPatron = patron.test(apellidosValor);
    if (!validarPatron) { // || !correcto(compNombre)) {
        alert("¡¡¡NO has introducido correctamente los apellidoS!!!\nEjemplo: Marquez Robles");
        return false;
    } else {
        return true;
    }
}

function evaluarEstado() {
    if (estadoCivil.value == 0) {
        alert("¡¡¡NO has seleccionado un estado civil!!!");
        return false;
    } else {
        return true;
    }
}

function evaluarIdiomas() {
    if (form.idioma1.checked || form.idioma2.checked || form.idioma3.checked) {
        return true;
    } else {
        alert("¡¡¡NO has seleccionado ningún idioma!!!");
        return false;
    }
}

function evaluarProfesion() {
    if (profesion.value == "") {
        alert("¡¡¡NO has seleccionado profesión!!!");
        return false;
    } else {
        return true;
    }
}

function evaluarComentarios() {
    if (comentarios.value == "") {
        alert("¡¡¡NO has puesto un comentario!!!");
        return false;
    } else {
        return true;
    }
}

function mostrarDatos() {
    var valNombre = "NOMBRE: " + nombre.value;
    var valApellidos = "APELLIDOS " + apellidos.value;
    var valEstado = "ESTADO: " + estadoCivil.options[estadoCivil.selectedIndex].text;
    var valIdioma;
    if (form.idioma1.checked)
        valIdioma = "IDIOMA: " + form.idioma1.value;
    if (form.idioma2.checked)
        valIdioma = valIdioma + ", " + form.idioma2.value;
    if (form.idioma3.checked)
        valIdioma = valIdioma + ", " + form.idioma3.value;
    var valProfesion = "PROFESIÓN: " + profesion.value;
    var valComentarios = "COMENTARIOS: " + comentarios.value;
    var texto = valNombre + "\n" + valApellidos + "\n" + valEstado + "\n" + valIdioma + "\n" + valProfesion + "\n" + valComentarios;
    alert(texto);
}
