window.onload = function() {
    var form = document.forms[0];
    mostrar_datos = document.getElementById('mostrar_datos');
    mostrar_datos.onclick = muestraDatos;
    form.nombre.focus();
    form.estadoCivil.disabled = true;
    form.sexo.onchange = activaEstado;
    form.tasas.disabled = true;
    form.profesion1.onclick = muestraTasas;
    form.profesion2.onclick = muestraTasas;
    form.profesion3.onclick = muestraTasas;
    form.profesion4.onclick = muestraTasas;
}

function activaEstado() {
    var form = document.forms[0];
    if (parseInt(form.sexo.value, 10) == 2) {
        form.estadoCivil.disabled = false;
    } else {
        form.estadoCivil.disabled = true;
    }
}

function muestraDatos() {
    var form = document.forms[0];
    var cadena;
    cadena = 'Tasas para ' + form.nombre.value + ' ' + form.apellidos.value + ': \n' + form.tasas.value;
    alert(cadena);

}

function muestraTasas() {

    var tasa = [15, 20, 5, 2]
    var form = document.forms[0];
    var campo;
    var radio;
    for (i = 1; i <= tasa.length; i++) {
        campo = 'profesion' + i
        radio = document.getElementById(campo)
        if (radio.checked == true)
            form.tasas.value = tasa[i - 1] + ' Euros';
    }

}
