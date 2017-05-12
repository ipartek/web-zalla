"use strict"

var form, nombre, apellidos, dni, validarPatron, sexo, dia, mes, anio;
var patron = /^([A-Z]{1}[a-zñáéíóú]+[\s]*)+$/;
var patronDni = /^\d{8}[a-zA-Z]$/;

window.onload = function () {
    form = document.forms[0];
    nombre = form.nombre;
    apellidos = form.apellidos;
    dni = form.txtDni;
    sexo = form.sexo;
    dia = form.dia;
    mes = form.mes;
    anio = form.anio;
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
        if(!evaluarDia()){
            dia.focus();
            return false;
        }
        if(!evaluarMes()){
            mes.focus();
            return false;
        }
        if(!evaluarAnio()){
            anio.focus();
            return false;
        }
        if (!evaluarIdiomas()) {
            form.idioma1.focus();
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

function evaluarDia(){
    if(dia.value == 0){
        alert("¡¡¡NO has seleccionado un día!!!");
        return false;
    } else {
        return true;
    }
}

function evaluarMes(){
    if(mes.value == 0){
        alert("¡¡¡NO has seleccionado un mes!!!");
        return false;
    } else {
        return true;
    }
}

function evaluarAnio(){
    if(anio.value == 0){
        alert("¡¡¡NO has seleccionado un año!!!");
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
