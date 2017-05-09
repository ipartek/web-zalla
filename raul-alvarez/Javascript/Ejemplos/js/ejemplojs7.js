'use strict';

var txtMensajes, form, bloque1, bloque2;

var ID_BLOQUE1 = "bloque1", ID_BLOQUE2 = "bloque2";

window.onload = function() {
    ocultarBloques();
    
    txtMensajes = document.getElementById('txtMensajes');
    form = document.forms[0]; //document.getElementById("");
    
    form.onsubmit = validacionDni;
    
    var sBloque = form.sBloque; //form['sBloque']
    sBloque.onchange = seleccionBloque;
    
    var btnPruebas = document.getElementById('btnPruebas');
    btnPruebas.onclick = pruebas;
    
    var txtDni = form.txtDni;
    txtDni.onfocus = function() {
        txtDni.value = "";
        //txtDni.select();
    };
    
    txtDni.onblur = function() {
        validacionDni();
    };
};

function validacionDni() {
    //var txtDni = document.getElementById('txtDni');
    var txtDni = form.txtDni; //form['txtDni']; // form['name']

    var dni = txtDni.value;

    if(validarDni(dni)) {
        txtMensajes.value = "DNI Correcto";
    } else {
        txtMensajes.value = "DNI INCORRECTO";
        return false;
    }
}

function pruebas() {
    var txtUsuario = document.getElementById('txtUsuario');

    var usuario = txtUsuario.value;

    txtMensajes.value = "Hola " + usuario;

    txtMensajes.placeHolder = "Modificado al menos una vez";

    //document.getElementById('txtMensajes').value = "Hola " + //document.getElementById('txtUsuario').value;
    
    console.debug("DEBUG");
    console.info("INFO");
    console.log("LOG");
    console.warn("WARN");
    console.error("ERROR");
    
    document.forms[0].txtDni.focus();
}

function seleccionBloque() {
    var sBloque = document.getElementById("sBloque");
    
    ocultarBloques();
    
    var bloque = "bloque" + sBloque.value;
    console.log(bloque)
    mostrarBloque(bloque);
}

function ocultarBloques() {
    ocultarBloque(ID_BLOQUE1);
    ocultarBloque(ID_BLOQUE2);
}

function ocultarBloque(idBloque) {
    var bloque = document.getElementById(idBloque);
    
    if(bloque != null) {
        bloque.style.display = "none";
    }
}

function mostrarBloque(idBloque) {
    var bloque = document.getElementById(idBloque);
    
    if(bloque != null) {
        bloque.style.display = "block";
    } else {
        console.warn("No existe el bloque " + idBloque);
    }
}