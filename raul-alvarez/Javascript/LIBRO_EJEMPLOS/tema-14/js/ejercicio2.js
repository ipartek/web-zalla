var genero = "";
var txt_Tasas;
var profesiones = "";
var botonEnviar = "";
var reiniciarPagina = "";

window.onload = function () {
    datosPersonales.nombre.focus();

    genero = document.getElementById("bloqueOcultar");
    genero.style.display = "none";

    document.getElementById("sexo").onchange = function () {
        activarEstadoCivil();
    };
    txt_Tasas = document.getElementById("txtTasas");
    txt_Tasas.style.display = "none";

    document.getElementById("profesiones").onchange = function () {
        calcularTasas();
    };
    txtTasas = document.getElementById("tasas");

    botonEnviar = document.getElementById("enviar_datos");
    botonEnviar.onclick = mostrarMensaje;   

};

function activarEstadoCivil() {
    var valorSexo = datosPersonales.sexo.options[datosPersonales.sexo.selectedIndex].value;

    if (valorSexo != 2) {
        genero = document.getElementById("bloqueOcultar");
        genero.style.display = "none";

    } else {
        genero = document.getElementById("bloqueOcultar");
        genero.style.display = "block";
    }
}

function calcularTasas() {
    var valorProfesion = "";
    var encontrado = false;

    for (var i = 0; i < datosPersonales.profesion.length && !encontrado; i++) {
        if (datosPersonales.profesion[i].checked) {
            valorProfesion = datosPersonales.profesion[i].value;
            encontrado = true;
        }
    }

    switch (valorProfesion) {

        case "autonomo":
            txt_Tasas = document.getElementById("txtTasas");
            txt_Tasas.style.display = "block";
            datosPersonales.tasas.value = "15€";
            break;
        case "ajena":
            txt_Tasas = document.getElementById("txtTasas");
            txt_Tasas.style.display = "block";
            datosPersonales.tasas.value = "20€";
            break;
        case "paro":
            txt_Tasas = document.getElementById("txtTasas");
            txt_Tasas.style.display = "block";
            datosPersonales.tasas.value = "2€";
            break;
        case "jubilado":
            txt_Tasas = document.getElementById("txtTasas");
            txt_Tasas.style.display = "block";
            datosPersonales.tasas.value = "5€";
            break;
    }

}

function mostrarMensaje() {
    var nombreyApellidos = "NOMBRE: " + datosPersonales.nombre.value + "\n";
    nombreyApellidos += "APELLIDOS: " + datosPersonales.apellidos.value;
    var mensajeFinal = nombreyApellidos + "\nTASAS: " + datosPersonales.tasas.value;
    alert(mensajeFinal);
    location.reload();
}
