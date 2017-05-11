window.onload = function () {
    var mostrar_datos = document.getElementById("mostrar_datos");

    mostrar_datos.onclick = function () {
        var nombre = "NOMBRE: " + datosPersonales.nombre.value;
        var apellidos = "APELLIDOS: " + datosPersonales.apellidos.value;
        var tasas = "TASA: " + datosPersonales.tasas.value;

        var nombreFocus = document.datosPersonales.nombre.focus();

        document.datosPersonales.estadoCivil.disabled = true;

        var sexo = document.datosPersonales.sexo;

        sexo.onchange = activarEstadoCivil;

        //var pos = 0;
        //datosPersonales.profesion[pos].onclick = valorTasas;
        //pos++;
        //datosPersonales.profesion[pos].onclick = valorTasas;
        //pos++;
        //datosPersonales.profesion[pos].onclick = valorTasas;
        //pos++;
        //datosPersonales.profesion[pos].onclick = valorTasas;

        for (var pos = 0; pos < datosPersonales.profesion.length; pos++)
            datosPersonales.profesion[pos].onclick = valorTasas;


    }

}

function activarEstadoCivil() {
    var valorSexo = document.datosPersonales.sexo.options[datosPersonales.sexo.selectedIndex].value

    if (valorSexo == 2) {
        document.datosPersonales.estadoCivil.disabled = false;
    } else { //if(valorSexo == {1 || valorSexo == 0) 
        document.datosPersonales.estadoCivil.disabled = true;
    }

}

function valorTasas() {

    switch (this.id) { //datosPersonales.profesion.value) {
        case "profesion1":
            datosPersonales.tasas.value = "15€";
            break;
        case "profesion2":
            datosPersonales.tasas.value = "20€";
            break;
        case "profesion3":
            datosPersonales.tasas.value = "2€";
            break;
        case "profesion4":
            datosPersonales.tasas.value = "5€";
            break;
    }

}



alert(nombre + "\n" + apellidos + "\n" + tasas);
