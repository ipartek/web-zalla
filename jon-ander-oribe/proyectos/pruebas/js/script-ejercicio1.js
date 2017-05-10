function mostrarDatos() {


    var nombreYApellidos = "NOMBRE: " + document.getElementById("nombre").value + "\n";
    nombreYApellidos += "APELLIDOS: " + datosPersonales.apellidos.value;
    var sexo = "SEXO: " + datosPersonales.sexo.options[datosPersonales.sexo.selectedIndex].text;
    var estadoCivil = "ESTADO CIVIL: " + datosPersonales.estadoCivil.options[datosPersonales.estadoCivil.selectedIndex].text;
    var idioma = "IDIOMAS: ";

    if (idioma1.checked) {
        idioma += document.getElementById("idioma1").value;
    }
    if (idioma2.checked) {
        idioma += "," + document.getElementById("idioma2").value;
    }
    if (idioma3.checked) {
        idioma += "," + document.getElementById("idioma3").value;
    }

    var profesion = "PROFESION: ";
    var salida = false;
    var tasas = "TASAS: ";

    for (i = 0; i < datosPersonales.profesion.length && salida != true; i++) {
        if (datosPersonales.profesion[i].checked) {

            profesion += datosPersonales.profesion[i].value;
            var recorrido = i;



            switch (recorrido) {
                case 0:
                    document.forms[0].tasas.value = "Autonomo: 15 euros";
                    tasas = "Autonomo: 15 euros";
                    break;
                case 1:
                    document.forms[0].tasas.value = "Cuenta ajena: 20 euros";
                    tasas = "Trabajador por cuenta ajena: 20 euros";
                    break;
                case 2:
                    document.forms[0].tasas.value = "Desempleado: 2 euros";
                    tasas = "Desempleado: 2 euros"
                    break;
                case 3:
                    document.forms[0].tasas.value = "Jubilado: 5 euros";
                    tasas = "Jubilado: 5 euros";
                    break;
            }
            salida = true;
        }
    }




    var texto = "TEXTO: " + document.getElementById("comentarios").value;


    var msgFinal = nombreYApellidos + "\n" + sexo + "\n" + estadoCivil + "\n" + idioma + "\n" + profesion + "\n" + tasas + "\n" + texto;
    alert(msgFinal);

}


window.onload = function() {
    document.forms[0].nombre.focus();
}

function esFemenino() {
    if (document.forms[0].sexo.options.selectedIndex == 2) {
        document.getElementById("EstadoCivil").disabled = false;
    } else {
        document.getElementById("EstadoCivil").disabled = true;
        document.getElementById("EstadoCivil").value = 0;
    }
}
