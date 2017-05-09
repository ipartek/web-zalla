function mostrarDatos() {

    var nombreYApellidos = "NOMBRE: " + document.getElementById("nombre").value + "\n";
    nombreYApellidos += "APELLIDOS: " + datosPersonales.apellidos.value;

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

    for (i = 0; i < datosPersonales.profesion.length && salida != true; i++) {
        if (datosPersonales.profesion[i].checked) {
            profesion += datosPersonales.profesion[i].value;
            salida = true;
        }
    }

    var texto = "TEXTO: " + document.getElementById("comentarios").value;


    var msgFinal = nombreYApellidos + "\n" + estadoCivil + "\n" + idioma + "\n" + profesion + "\n" + texto;
    alert(msgFinal);

}
