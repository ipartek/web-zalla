'use strict'

var form;
var sexo;
var estadoCivil;
var profesion;

window.onload = function () {
    form = document.forms[0];
    activarEstadoCivil();
    profesion = form.profesion;
    this.onchange = calcularTasas;
    //Hacerlo sin método
    /*profesion = form.profesion;
    this.onchange = function () {
        switch (profesion.value) {
            case "autonomo":
                form.tasas.value = "15€";
                break;
            case "ajena":
                form.tasas.value = "20€";
                break;
            case "paro":
                form.tasas.value = "2€";
                break;
            case "jubilado":
                form.tasas.value = "5€";
                break;
        }
    }*/
    var btnMostrar = form.mostrar_datos;
    btnMostrar.onclick = mostrarDatos;
}

function activarEstadoCivil() {
    sexo = form.sexo;
    estadoCivil = form.estadoCivil;
    var sSexo = sexo;
    sSexo.onchange = function () {
        estadoCivil.disabled = false;
    };
}

function calcularTasas() {
    switch (profesion.value) {
        case "autonomo":
            form.tasas.value = "15€";
            break;
        case "ajena":
            form.tasas.value = "20€";
            break;
        case "paro":
            form.tasas.value = "2€";
            break;
        case "jubilado":
            form.tasas.value = "5€";
            break;
    }
    //Otra manera de realizar este método
    /*var ckbox1 = document.getElementById("profesion1");
    var ckbox2 = document.getElementById("profesion2");
    var ckbox3 = document.getElementById("profesion3");
    var ckbox4 = document.getElementById("profesion4");
    ckbox1.onchange = function(){
        form.tasas.value = "15€";
    }    
    ckbox2.onchange = function(){
        form.tasas.value = "20€";
    }
    ckbox3.onchange = function(){
        form.tasas.value = "2€";
    }
    ckbox4.onchange = function(){
        form.tasas.value = "5€";
    }*/
}

function mostrarDatos() {
    var valNombre = "NOMBRE: " + form.nombre.value;
    var valApellidos = "APELLIDOS " + form.apellidos.value;
    var valTasas = "TASAS: " + form.tasas.value;
    var texto = valNombre + "\n" + valApellidos + "\n" + valTasas;
    alert(texto);
}
