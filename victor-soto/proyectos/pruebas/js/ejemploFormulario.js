'use strict'

var txtMensajes, form, bloque1, bloque2;
const ID_BLOQUE1 = "bloque1";
const ID_BLOQUE2 = "bloque2";

window.onload = function() {
    ocultarBloques();
    //Si no se especifica al formulario con un id o class, al llamar a la etiqueta
    //docuemtn.forms es considerado como un array de formularios
    form = document.forms[0]; //document.getElementById("");
    //Cuando eynvie los datos llama a la función y reinicia todo
    form.onsubmit = function() {
        //var txtDNI = document.getElementById("txtDNI");
        //Se puede acceder a cualquier elemento del formulario a traves del nombre del elemento
        var txtDNI = form["txtDNI"];

        var dni = txtDNI.value;

        if (validarDNI(dni)) {
            txtMensajes.value = "Correcto";
        } else {
            txtMensajes.value = "INCORRECTO";
            return false;
        }
    };

    var usuario = document.getElementById("usuario");
    //var pass = document.getElementById("pass");

    var sBloque = form["sBloque"];
    sBloque.onselect = seleccionBloque()

    sBloque.onselect = function() {

    }

    var btnPruebas = document.getElementById("btnPruebas");
    btnPruebas.onclick = function() {
        txtMensajes = document.getElementById("txtMensajes");
        txtMensajes.value = "Hola " + usuario.value + " " + document.getElementById("pass").value;

        usuario.placeholder = "Hold the door";
    }

    function seleccionBloque() {
        var sBloque = document.getElementById("sBloque");

        //mostrarBloque(ID_BLOQUE1);
        ocultarBloques();

        var bloque = "bloque" + sBloque.value;
        mostrarBloque(bloque);
    }

    function ocultarBloques() {
        ocultarBloque("bloque1");
        ocultarBloque("bloque2");
    }

    function ocultarBloque(idBloque) {
        var bloque = document.getElementById(idBloque);

        if (bloque != null) {
            bloque.style.display = "none";
        } else {
            //Orden de prioridad de los mensajes que aparecen por consola
            //Error > Warning o Info > Log > Debug
            console.error("CAGADA");
            console.warn("No he existe el bloque seleccionado");
            console.log("LOG");
            console.info("Informacion");
            console.debug("DEBUG"); //Error concreto
        }
    }

    function mostrarBloque(idBloque) {
        var bloque = document.getElementById(idBloque);

        bloque.style.display = "none";
    }
}
