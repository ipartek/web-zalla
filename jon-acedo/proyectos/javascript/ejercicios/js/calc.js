window.onload = function() {
    var form = document.forms[0];
    form.activo.value = 'dato1'
    form.uno.onclick = uno;
    form.dos.onclick = dos;
    form.tres.onclick = tres;
    form.cuatro.onclick = cuatro;
    form.cinco.onclick = cinco;
    form.seis.onclick = seis;
    form.siete.onclick = siete;
    form.ocho.onclick = ocho;
    form.nueve.onclick = nueve;
    form.cero.onclick = cero;
    form.sumar.onclick = suma;
    form.restar.onclick = resta;
    form.multiplicar.onclick = multiplicacion;
    form.dividir.onclick = division;
    form.igual.onclick = calcular;
    form.borrar.onclick = reseteo;
    form.coma.onclick = flotante;
    form.pi.onclick = pi;
    form.retroceso.onclick = atras;
    form.masmenos.onclick = invertir;
}

function suma() {
    operador('sumar');
    return false;
}

function resta() {
    operador('restar');
    return false;
}

function multiplicacion() {
    operador('multiplicar');
    return false;
}

function division() {
    operador('dividir');
    return false;
}

function atras() {

    var form = document.forms[0];
    var cadena;
    if (form.activo.value == 'dato1') {
        cadena = form.dato1.value;
        cadena = cadena.slice(0, -1);
        form.dato1.value = cadena;
        form.dato.value = cadena;
    } else {
        cadena = form.dato2.value;
        cadena = cadena.slice(0, -1);
        form.dato2.value = cadena;
        form.dato.value = cadena;
    }
    return false;

}

function invertir() {
    var form = document.forms[0];
    var cadena;
    if (form.activo.value == 'dato1') {
        cadena = parseFloat(form.dato1.value, 10) * -1;
        cadena = cadena.toString();
        form.dato1.value = cadena;
        form.dato.value = cadena;
        return false;
    } else {
        cadena = parseFloat(form.dato2.value, 10) * -1;
        cadena = cadena.toString();
        form.dato2.value = cadena;
        form.dato.value = cadena;
        return false;
    }

}

function reseteo() {
    var form = document.forms[0];
    form.activo.value = '';
    form.dato1.value = '';
    form.dato2.value = '';
    form.activo.value = 'dato1';
    form.dato.value = '';

}

function pi() {
    var form = document.forms[0];
    if (form.activo.value == 'dato1') {
        form.dato1.value = '3.14159265359'
        form.dato.value = '3.14159265359'
    } else {
        {
            form.dato2.value = '3.14159265359'
            form.dato.value = '3.14159265359'
        }
    }
}

function flotante() {
    muestraDatos('.');
    return false;
}

function uno() {
    //var form = document.forms[0];
    muestraDatos('1');
    return false;
}

function dos() {
    muestraDatos('2');
    return false;
}

function tres() {
    muestraDatos('3');
    return false;
}

function cuatro() {
    muestraDatos('4');
    return false;
}

function cinco() {
    muestraDatos('5');
    return false;
}

function seis() {
    muestraDatos('6');
    return false;
}

function siete() {
    muestraDatos('7');
    return false;
}

function ocho() {
    muestraDatos('8');
    return false;
}

function nueve() {
    muestraDatos('9');
    return false;
}

function cero() {
    muestraDatos('0');
    return false;
}

function operador(op) {
    var form = document.forms[0];
    form.operador.value = op;
    form.dato.value = '';
    form.activo.value = 'dato2'
}

function muestraDatos(dato) {
    var form = document.forms[0];
    form.dato.value += dato;
    if (form.activo.value == 'dato1') {
        form.dato1.value += dato;
    } else {
        form.dato2.value += dato;
    }
}

function calcular() {
    var form = document.forms[0];
    console.log(form.activo.value);
    console.log(form.dato1.value);
    console.log(form.dato2.value);
    console.log(form.operador.value);
    var resultado;
    switch (form.operador.value) {
        case 'sumar':
            resultado = parseFloat(form.dato1.value, 10) + parseFloat(form.dato2.value, 10);
            break;
        case 'restar':
            resultado = parseFloat(form.dato1.value, 10) - parseFloat(form.dato2.value, 10);
            break;
        case 'multiplicar':
            resultado = parseFloat(form.dato1.value, 10) * parseFloat(form.dato2.value, 10);
            break;
        case 'dividir':
            resultado = parseFloat(form.dato1.value, 10) / parseFloat(form.dato2.value, 10);
            break;

    }
    form.dato.value = resultado;
    form.operador.value = '';
    form.dato1.value = resultado;
    form.dato2.value = '';
    form.activo.value = 'dato1';
    console.log(form.activo.value);
    console.log(form.dato1.value);
    console.log(form.dato2.value);
    console.log(form.operador.value);
    return false;
}
