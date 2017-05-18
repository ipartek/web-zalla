//Inserta una línea en la siguiente posición a la input
//document.forms[0].txtDni.parentNode.nsertBefore(document.createElement("hr"), txtDni.nextSibling)

"use strict"

var form, nombre, apellidos, dni, validarPatron, sexo, dia, mes, anio, texto;
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
    //var btnEnviar = form.boton_enviar;
    //btnEnviar.onclick = validar();
    form.onsubmit = validar;
}

function validar() {
    //form.onsubmit = function () {
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
        if (!evaluarDia()) {
            dia.focus();
            return false;
        }
        if (!evaluarMes()) {
            mes.focus();
            return false;
        }
        if (!evaluarAnio()) {
            anio.focus();
            return false;
        }
        if (!evaluarIdiomas()) {
            form.idioma1.focus();
            return false;
        }
    //}
}

function evaluarNombre() {
    var nombreValor = nombre.value;
    validarPatron = patron.test(nombreValor);
    if (!validarPatron) { // || !correcto(compNombre)) {
        texto = "¡¡¡NO has introducido correctamente el nombre!!!\nEjemplo: Luis Angel";
        error(nombre, texto);
        return false;
    } else {
        return true;
    }
}

function evaluarApellidos() {
    var apellidosValor = apellidos.value;
    validarPatron = patron.test(apellidosValor);
    if (!validarPatron) { // || !correcto(compNombre)) {
        texto = "¡¡¡NO has introducido correctamente los apellidos!!!\nEjemplo: Marquez Robles";
        error(apellidos, texto);
        return false;
    } else {
        return true;
    }
}

function evaluarDni() {
    var dniValor = dni.value;
    if (!validarDni(dniValor)) {
        texto = "¡¡¡NO has introducido correctamente el dni!!!\nEjemplo: 12345678Z";
        error(dni, texto);
        return false;
    } else {
        return true;
    }
}

function evaluarSexo() {
    if (sexo.value == 0) {
        texto = "¡¡¡NO has seleccionado sexo!!!";
        error(sexo, texto);
        return false;
    } else {
        return true;
    }
}

function evaluarDia() {
    if (dia.value == 0) {
        texto = "¡¡¡NO has seleccionado un día!!!";
        error(dia, texto);
        return false;
    } else {
        return true;
    }
}

function evaluarMes() {
    if (mes.value == 0) {
        texto = "¡¡¡NO has seleccionado un mes!!!";
        error(mes, texto);
        return false;
    } else {
        return true;
    }
}

function evaluarAnio() {
    if (anio.value == 0) {
        texto = "¡¡¡NO has seleccionado un año!!!";
        error(anio, texto);
        return false;
    } else {
        return true;
    }
}

function evaluarIdiomas() {
    if (form.idioma1.checked || form.idioma2.checked || form.idioma3.checked) {
        return true;
    } else {
        texto = "¡¡¡NO has seleccionado ningún idioma!!!";
        error(form.idioma1, texto);
        return false;
    }
}

function error(elemento, texto) {
    var altoDisplay = window.innerHeight;
    var anchoDisplay = window.innerWidth;

    var divFondo = document.createElement("div");

    divFondo.id = "popupfondo";

    divFondo.style.backgroundColor = "rgba(50, 50, 50, 0.8)";
    divFondo.style.position = "fixed";
    divFondo.style.top = 0;
    divFondo.style.left = 0;
    divFondo.style.height = altoDisplay + "px";
    divFondo.style.width = anchoDisplay + "px";
    divFondo.style.zIndex = 10000;

    document.body.appendChild(divFondo);

    var x, y, alto, ancho;

    alto = altoDisplay / 2;
    ancho = anchoDisplay / 2;

    x = ancho / 2;
    y = alto / 2;

    var divMensaje = document.createElement("div");

    divMensaje.id = "popcuadromensaje";

    divMensaje.style.backgroundColor = "white";
    divMensaje.style.position = "fixed";
    divMensaje.style.top = y + "px";
    divMensaje.style.left = x + "px";
    divMensaje.style.height = alto + "px";
    divMensaje.style.width = ancho + "px";
    divMensaje.style.zIndex = 10001;
    divMensaje.style.textAlign = "center";
    divMensaje.style.fontSize = "2em";

    divFondo.appendChild(divMensaje);

    divMensaje.innerHTML = "<h1>ERROR</h1><p>"+ texto +"</p>";

    var boton = document.createElement("button");

    boton.innerHTML = "ACEPTAR";
    boton.onclick = function () {
        divFondo.parentNode.removeChild(divFondo);
        elemento.focus();
    };

    divMensaje.appendChild(boton);
}
