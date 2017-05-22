"use strict";

var txtMensaje, form, bloque1, bloque2;

var ID_BLOQUE1 = "bloque1",
    ID_BLOQUE2 = "bloque2";

window.onload = function () {

    ocultarBloques();


    var txtMensaje = document.getElementById("txtMensaje");
    var form = document.forms[0]; //document.getElementById("btnPruebas");

    form.onsubmit = envioFormulario;

    var sBloque = form["sBloque"];

    sBloque.onchange = seleccionBloque;



    btnPruebas.onclick = function () {
        var form = document.getElementById("");

        //con esto cogemos la cahja entera de txtUsuario
        var txtUsuario = document.getElementById("txtUsuario");

        //cogemos el contenido
        var nombreUsuario = txtUsuario.value;
        //alert(nombreUsuario);
        var txtMensaje = document.getElementById("txtMensaje");
        txtMensaje.value = "holaaaa " + nombreUsuario;

        //PLACE HOLDER APARECE CUANDO EL CUADRADO DE TEXTO ESTA VACIO
        txtMensaje.placeholder = "MODIFICADO AL MENOS UNA VEZ";

        //TAMBIEN SE PUEDE HACER DE ESTA MANERA MAS CORTA
        //document.getElementById("txtUsuario").value = "Hola "+
        //document.getElementById("txtUsuario").vale;

    }
};

function envioFormulario() {
    //var txtDni = document.getElementById("txtDni");
    var txtDni = form["txtDni"];
    var dni = txtDni.value;
    if (validarDni(dni)) {
        txtMensaje.value = "DNI Correcto";
    } else {
        txtMensaje.value = "DNI Incorrecto";
        return false;
    }

}

function seleccionBloque() {
    var sBloque = document.getElementById("sBloque");

    ocultarBloques();

    var bloque = "bloque" + sBloque.value;
    console.log(bloque);
    mostrarBloque(bloque);
}

function ocultarBloques() {
    ocultarBloque(ID_BLOQUE1);
    ocultarBloque(ID_BLOQUE2);

}

function ocultarBloque(idBloque) {
    var bloque = document.getElementById(idBloque);
    bloque.style.display = "none";
}

function mostrarBloque(idBloque) {
    var bloque = document.getElementById(idBloque);
    
    if(bloque == null){
        txtMensaje.value = "Elije un bloque";
    }else{
        bloque.style.display = "block";
    }
    
}
