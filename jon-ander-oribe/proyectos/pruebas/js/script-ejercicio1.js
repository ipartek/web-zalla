    var btnSubmit = document.getElementById("enviar_datos");

    function mostrarDatos() {


        var nombreYApellidos = "NOMBRE: " + document.getElementById("nombre").value + "\n";
        nombreYApellidos += "APELLIDOS: " + datosPersonales.apellidos.value;
        var sexo = "SEXO: " + datosPersonales.sexo.options[datosPersonales.sexo.selectedIndex].text;
        var estadoCivil = "ESTADO CIVIL: " + datosPersonales.estadoCivil.options[datosPersonales.estadoCivil.selectedIndex].text;
        var idioma = "IDIOMAS: ";
        var edad = "EDAD: " + document.getElementById("edad").value;


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


        var msgFinal = nombreYApellidos + "\n" + edad + "\n" + sexo + "\n" + estadoCivil + "\n" + idioma + "\n" + profesion + "\n" + tasas + "\n" + texto;
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

    function validarEdad() {
        if (document.getElementById("edad").value < 1 || (isNaN(document.getElementById("edad").value))) {
            document.getElementById("edad").value = "Intentelo de nuevo";
            alert("Error");
            document.getElementById("edad").focus();

        }
    }

    function validarIdiomas() {
        if (document.forms[0].idioma1.checked == false && document.forms[0].idioma2.checked == false && document.forms[0].idioma3.checked == false) {
            alert("Rellena idiomas");
        }
    }

    function validarFecha() {
        if (document.getElementById("dia").value == "..." || document.getElementById("mes").value == "..." || document.getElementById("ano").value == "...") {
            alert("Falta una fecha valida");
        }
    }

    function autoRellenar() {

        document.getElementById("nombre").value = "Tipo";
        document.getElementById("apellidos").value = "De Incognito";
        datosPersonales.sexo.selectedIndex = 1;
        document.getElementById("edad").value = 23;
        document.getElementById("dni").value = "73654748D";
        document.getElementById("comentarios").value = "Texto de relleno";
        document.getElementById("idioma2").checked = true;
        document.getElementById("idioma3").checked = true;
        document.getElementById("profesion2").checked = true;
        document.getElementById("dia").selectedIndex = 2;
        document.getElementById("mes").selectedIndex = 2;
        document.getElementById("ano").selectedIndex = 1;




    }

    function validarTodo() {

    }

    /**********FUNCIONA DE AQUI PARA ARRIBA********/

    btnSubmit.onclick = comprobar;

    function comprobar() { alert("EEEEEOOO"); }
