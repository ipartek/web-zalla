var campo;
var btn
var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];
var form
window.onload = function() {
    // getElementById('btnOtros').onclick = escribeMsg();
    form = document.forms[0];
    campo = document.getElementById("txtMsg");
    btn = document.getElementById('btnOtros');
    var dni = form.dni;
    form.onsubmit = validacionDni;
    dni.onblur = validacionDni;
    sBloques = form.bloques;
    sBloques.onchange = ocultaBloques;
    var bloque = document.getElementById('bloque1')
    bloque.style.display = 'none';
    var bloque = document.getElementById('bloque2')
    bloque.style.display = 'none';
    form.onsubmit = validacionDni;

    function validacionDni() {

        var dniTxt = dni.value;
        if (validarDni(dniTxt)) {
            escribeMsg('El DNI introducido es correcto.');
        } else {
            escribeMsg('La letra del DNI no es correcta.');
            return false;
        }
    }

    function ocultaBloques() {
        var bloque = document.getElementById('bloque1')
        bloque.style.display = 'none';
        var bloque = document.getElementById('bloque2')
        bloque.style.display = 'none';
        muestraBloque();
    }

    function muestraBloque() {
        var nombreBloque = document.getElementById('bloques').value;
        console.log(nombreBloque)
        var bloque = document.getElementById(nombreBloque);
        bloque.style.display = 'block';
    }
}
