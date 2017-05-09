'use strict';

var txtMensajes, form, bloque1, bloque2;

var ID_BLOQUE1 = "bloque1",
    ID_BLOQUE2 = "bloque2";

window.onload = function () {
    ocultarBloques();

    txtMensajes = document.getElementById('txtMensajes');
    form = document.forms[0]; //document.getElementById("");

    form.onsubmit = envioFormulario;

    var sBloque = form['sBloque'];
    sBloque.onchange = seleccionBloque;

    var btnPruebas = document.getElementById('btnPruebas');
    btnPruebas.onclick = pruebas;
<<<<<<< HEAD
    
    var txtDni = form.txtDni;
    txtDni.onfocus = function() {
        txtDni.value = "";
        //txtDni.select();
    };
    
    txtDni.onblur = function() {
        validacionDni();
    };
    
    var chkMensajes = form.chkMensajes;
    chkMensajes.onchange = function() {
        if(chkMensajes.checked) //if(chkMensajes.checked == true)
            mostrarBloque("bloqueMensajes");
        else
            ocultarBloque("bloqueMensajes");
    };
    
    var rGenero = form.rGenero;
    for(var i = 0; i < rGenero.length; i++) {
        rGenero[i].onclick = function() {
            txtMensajes.value = this.value;
        };
    }
=======
>>>>>>> 9d90b5e28fe48b49d84cb68615751da195b6ef54
};

function envioFormulario() {
    //var txtDni = document.getElementById('txtDni');
    var txtDni = form['txtDni']; // form['name']

    var dni = txtDni.value;

    if (validarDni(dni)) {
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
<<<<<<< HEAD
    
    console.debug("DEBUG");
    console.info("INFO");
    console.log("LOG");
    console.warn("WARN");
    console.error("ERROR");
    
    document.forms[0].txtDni.focus();
    
    var opcion = new Option("PRESELECCIONADA NUEVA", "YEPA", true, true);
    
    form.sBloque.add(opcion);
=======
>>>>>>> 9d90b5e28fe48b49d84cb68615751da195b6ef54
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
<<<<<<< HEAD
    
    if(bloque != null && bloque.style.display != "none") {
        bloque.displayAnterior = bloque.style.display;
        bloque.style.display = "none";
    }
=======

    bloque.style.display = "none";
>>>>>>> 9d90b5e28fe48b49d84cb68615751da195b6ef54
}

function mostrarBloque(idBloque) {
    var bloque = document.getElementById(idBloque);
<<<<<<< HEAD
    
    if(bloque != null) {
        bloque.style.display = bloque.displayAnterior; //"block";
    } else {
        console.warn("No existe el bloque " + idBloque);
    }
}
=======

    bloque.style.display = "block";
}
>>>>>>> 9d90b5e28fe48b49d84cb68615751da195b6ef54
