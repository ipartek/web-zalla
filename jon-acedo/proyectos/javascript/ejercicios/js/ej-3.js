window.onload = function() {
    var form = document.forms[0];

    form.onsubmit = validar;
}

function validar() {
    var form = document.forms[0];
    var cadena = 'Falta rellenar los siguientes campos:';
    var noValida = 0;

    if (form.nombre.value == '') {
        cadena += '\n - Nombre.';
        noValida++;
    }
    if (form.apellidos.value == '') {
        cadena += '\n - Apellidos.';
        noValida++;
    }
    if (form.dni.value == '') {
        cadena += '\n - dni.';
        noValida++;
    }
    if (form.edad.value == '' || isNaN(form.edad.value) || parseInt(form.edad.value, 10) <= 18) {
        cadena += '\n - Edad (Mayor de 18, solo números).';
        noValida++;
    }
    if (form.dia.value == "X") {
        cadena += '\n - Día de nacimiento.';
        noValida++;
    }
    if (form.mes.value == "X") {
        cadena += '\n - Mes de nacimiento.';
        noValida++;
    }
    if (form.anio.value == "X") {
        cadena += '\n - Año de nacimiento.';
        noValida++;
    }
    if (!form.idioma1.checked && !form.idioma2.checked && !form.idioma3.checked) {
        cadena += '\n - Al menos un idioma.';
        noValida++;
    }
    if (noValida > 0) {
        alert(cadena);
        return false;
    }
}
