'use strict'
var form, txtNombre = "",
    txtApellidos, dni, chkIdioma, edad, validarDia, validarMes, validarAno, salida = false,
    validarCastellano, validarIngles, validarFrances,
    bloqueMensajes, valorSexo, valorProfesion = "",
    valorTasas;

window.onload = function() {
    form = document.forms[0];
    form.txtNombre.focus();

    form.onsubmit = function() {
        if (!validarFecha() || !validarIdioma()) {
            return false;
        } else {
            alert("OEEEEEEEEEEEEEE, HAS HECHO EL FORMULARIO CORRECTAMENTE!!!!!!!111UNOUNOUNO");
        }
    };

    edad = document.getElementById("txtEdad");
    edad.onchange = soloNumero;

    btnMostrar.onclick = mostrarDatos;
}

//form.sSexo.onchange = activarEstadoCivil;

//document.getElementById("rProfesion").onchange = ponerTasas;



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

function soloNumero() {
    edad = document.getElementById("txtEdad");
    if (edad.value <= 1 || isNaN(edad.value)) {
        alert("La edad debe ser numérica y superior a 1");
    }
}

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
        chkIdioma += " , " + document.getElementById("rIngles").value;
    }
    if (rFrances.checked) {
        chkIdioma += " , " + document.getElementById("rFrances").value;
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


    // function activarEstadoCivil() {
    //     valorSexo = formulario1.sSexo
    //         .options[formulario1.sSexo.selectedIndex].value;
    //     if (valorSexo == 1) {
    //         document.forms[0].sEstadoCivil.disabled = false;
    //     } else {
    //         document.forms[0].sEstadoCivil.disabled = true;
    //     }
    // }

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
