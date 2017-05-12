window.onload = function() {
    mostrar_datos = document.getElementById('mostrar_datos');
    mostrar_datos.onclick = muestraDatos;
};

function muestraDatos() {
    var form = document.forms[0];
    var cadena;
    var estado;
    var idiomas = '';
    var profesion = '';

    switch (parseInt(form.estadoCivil.value, 10)) {
        case 0:
            estado = "no seleccionado";
            break;
        case 1:
            estado = "soltero";
            break;
        case 2:
            estado = "casado";
            break;
        case 3:
            estado = "divorciado";
            break;
        case 4:
            estado = "viudo";
            break;
        default:
            estado = "no seleccionado";
    }

    if (form.idioma1.checked) {
        idiomas += '\n -Castellano.'
    }

    if (form.idioma2.checked) {
        idiomas += '\n -Inglés.'
    }

    if (form.idioma3.checked) {
        idiomas += '\n -Francés.'
    }

    for (i = 0; i < form.profesion.length; i++) {
        if (form.profesion[i].checked) {
            profesion += form.profesion[i].value;
        }
    }

    if (profesion == 'ajena') {
        profesion = "Trabajador por cuenta ajena";
    }

    cadena = 'nombre: ' + form.nombre.value + '\nApellidos: ' + form.apellidos.value + '\nEstado civil: ' + estado;

    if (idiomas != '') {
        cadena += '\n Idiomas: ' + idiomas;
    }

    if (profesion != '') {
        cadena += '\n Profesion: ' + profesion;
    }

    cadena += '\nComentarios: \n' + form.comentarios.value;

    alert(cadena);
}
