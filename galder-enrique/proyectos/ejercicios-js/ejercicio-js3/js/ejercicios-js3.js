'use strict'
//DEFINICION DE VARIABLES
var form, txtNombre = "",
    txtApellidos, txtDni, chkIdioma, edad, validarDia, validarMes, validarAno, salida = false,
    validarCastellano, validarIngles, validarFrances,
    bloqueMensajes, valorSexo, valorProfesion = "",
    valorTasas;

//EVENTO ONLOAD
window.onload = function() {
    form = document.forms[0];
    form.txtNombre.focus();

    txtDni = document.getElementById("txtDni");
    txtDni.onblur = validarFormDni;


    //EVENTO ONSUBMIT
    form.onsubmit = function() {

        if (!validarFecha() || !validarIdioma()) {
            return false;
        } else
        // {
        //     alert("OEEEEEEEEEEEEEE, HAS HECHO EL FORMULARIO CORRECTAMENTE!!!!!!!111UNOUNOUNO");
        // }

        //VALIDACION PARA SACAR POPUP EN CASO DE TRUE
        if (validarFormDni()) {
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

            divMensaje.innerHTML = "<h1>OJO</h1><p>¡SE VA A ENVIAR EL FORMULARIO!</p>";

            var boton = document.createElement("button");

            boton.innerHTML = "ACEPTAR";
            boton.onclick = function() {
                divFondo.parentNode.removeChild(divFondo);
                document.forms[0].submit();
            };

            divMensaje.appendChild(boton);
        }
        return false;


    };



    edad = document.getElementById("txtEdad");
    edad.onchange = soloNumero;

    btnMostrar.onclick = mostrarDatos;
}

//form.sSexo.onchange = activarEstadoCivil;

//document.getElementById("rProfesion").onchange = ponerTasas;


//VALIDACION FECHA CORRECTA
function validarFecha() {
    validarDia = document.getElementById("dia").value;
    validarMes = document.getElementById("mes").value;
    validarAno = document.getElementById("ano").value;

    if (validarDia == "..." || validarMes == "..." || validarAno == "...") {
        alert("INSERTA UNA FECHA VÁLIDA PETARDO");
        return false;
    } else {
        return true;
    }
}

//VALIDACION SELECCION DE IDIOMA
function validarIdioma() {
    validarCastellano = document.getElementById("rCastellano");
    validarIngles = document.getElementById("rIngles");
    validarFrances = document.getElementById("rFrances");

    if (rCastellano.checked == false && rIngles.checked == false && rFrances.checked == false) {
        alert("Selecciona un idioma como mínimo");
        return false;
    } else {
        return true;
    }
}

//COMPROBACION DE VALIDEZ DE EDAD 
function soloNumero() {
    edad = document.getElementById("txtEdad");
    if (edad.value <= 1 || isNaN(edad.value)) {
        alert("La edad debe ser numérica y superior a 1");
    }
}

//DATOS MOSTRADOS DESDE EL BOTON MOSTRAR
function mostrarDatos() {
    txtNombre = document.getElementById("txtNombre").value;
    txtApellidos = document.getElementById("txtApellidos").value;
    edad = document.getElementById("txtEdad").value;
    //sEstadoCivil = formulario1.sEstadoCivil
    //    .options[formulario1.sEstadoCivil.selectedIndex].text;

    if (rCastellano.checked) {
        chkIdioma = document.getElementById("rCastellano").value;
    }
    if (rIngles.checked) {
        chkIdioma += " " + document.getElementById("rIngles").value;
    }
    if (rFrances.checked) {
        chkIdioma += " " + document.getElementById("rFrances").value;
    }
    alert("NOMBRE: " + txtNombre +
        "\nAPELLIDOS: " + txtApellidos +
        "\nEDAD: " + edad + " años");
    // for (var i = 0; i < formulario1.rProfesion.length && salida != true; i++) {
    //     if (formulario1.rProfesion[i].checked) {
    //         rProfesion = formulario1.rProfesion[i].value;
    //         salida = true;
    //     }
    // }


    //valorTasas = document.getElementById("comTasas").value;


    //ACTIVACION DEL ESTADO CIVIL CUANDO SEXO = FEMENINO
    // function activarEstadoCivil() {
    //     valorSexo = formulario1.sSexo
    //         .options[formulario1.sSexo.selectedIndex].value;
    //     if (valorSexo == 1) {
    //         document.forms[0].sEstadoCivil.disabled = false;
    //     } else {
    //         document.forms[0].sEstadoCivil.disabled = true;
    //     }
    // }

    //ASIGNACION DE TASAS DEPENDIENDO DE PROFESION
    // function ponerTasas() {
    //     valorProfesion = form.rProfesion.value;
    //     switch (valorProfesion) {
    //         case "Autonomo":
    //             form.comTasas.value = "15€";
    //             break;
    //         case "Trabajador":
    //             form.comTasas.value = "20€";
    //             break;
    //         case "Desempleado":
    //             form.comTasas.value = "2€";
    //             break;
    //         case "Jubilado":
    //             form.comTasas.value = "5";
    //     }
    // }

    //bloqueMensajes = document.getElementById("bloqueMensajes").value;
    // alert("NOMBRE: " + txtNombre +
    //     "\nAPELLIDOS: " + txtApellidos +
    //     "\nESTADO CIVIL: " + sEstadoCivil +
    //     "\nIDIOMA: " + chkIdioma +
    //     "\nPROFESIÓN: " + rProfesion +
    //     "\nCOMENTARIOS: " + bloqueMensajes);
}
