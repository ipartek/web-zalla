window.onload = function () {

    var mostrar_datos = document.getElementById('mostrar_datos');
    mostrar_datos.onclick = function () {
        var nombre = "NOMBRE: " + document.datosPersonales.nombre.value;

        var apellidos = "APELLIDOS: " + document.datosPersonales.apellidos.value;

        var estadoCivil = "ESTADO CIVIL: " + document.datosPersonales.estadoCivil.options[datosPersonales.estadoCivil.selectedIndex].text;

        var idiomas = "IDIOMAS: ";
        if (datosPersonales.idioma1.checked)
            idiomas = idiomas + datosPersonales.idioma1.value;
        if (datosPersonales.idioma2.checked)
            idiomas = idiomas + datosPersonales.idioma2.value;
        if (datosPersonales.idioma3.checked)
            idiomas = idiomas + datosPersonales.idioma3.value;


        var profesion = "PROFESION: ";
        profesion += document.datosPersonales.profesion.value;

        var comentario = "COMENTARIO: " + document.datosPersonales.comentario.value;

        alert(nombre + "\n" + apellidos + "\n" + estadoCivil + "\n" + idiomas + "\n" + profesion + "\n" + comentario);


    };

}
