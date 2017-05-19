// VALIDACION DE DNI-s, VALIDACION DE LA LETRA DEL DNI Y COTEJANDOLO CON EL NUMERO
function rellenarCerosDni(numero) {
    return ("00000000" + numero).substr(-8);
}

var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
    'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'
];

function validarDni(dniConLetra) {

    if (dniConLetra.match(/\d{8}[A-Z]/))
        return dniConLetra == calcularDniConLetra(dniConLetra);
}

function calcularDniConLetra(dni) {
    return rellenarCerosDni(parseInt(dni, 10)) + calcularLetraDni(dni);
}

function calcularLetraDni(dni) {
    var resto = parseInt(dni, 10) % 23;
    return letras[resto];
}

//VALIDACION DNI EN SUBMIT Y ONBLUR PARA INDICAR QUE EL DNI NO ES CORRECTO
function validarFormDni() {
    var ejecutarAction = false,
        dniCorrecto;
    dniCorrecto = ejecutarAction = validarDni(txtDni.value);

    if (!dniCorrecto && !txtDni.error) {
        txtDni.error = span = document.createElement("span");
        span.className = "error";
        span.innerHTML = "El DNI no es correcto";

        txtDni.parentNode.appendChild(span);
    } else if (dniCorrecto && txtDni.error) {
        txtDni.error.parentNode.removeChild(txtDni.error);
        delete txtDni.error; //txtDni.error = undefined; //txtDni.removeAttribute("error");
    }

    return ejecutarAction;
}
