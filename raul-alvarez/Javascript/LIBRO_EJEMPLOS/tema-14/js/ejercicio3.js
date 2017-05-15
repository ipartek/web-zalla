function validacionDni() {
    var txtDni = formulario1.txtDni;
    var dni = txtDni.value;

    if (validarDni(dni)) {
        salir();
    } else {
        txtDni.focus();
        alert("El DNI es incorrecto");
        return false;

    }
}


function validar(formulario) {
    var txtError= document.getElementById("nombre");


    if (((formulario.nombre.value.length == 0) || (formulario.apellidos.value.length == 0))&& !txtError.error) {

            txtError = document.getElementById("nombre");
            txtError.error = span = document.createElement("span");
            span.className = "error";
            span.innerHTML = "   El nombre y apellido es obligatorio";
            txtError.parentNode.insertBefore(span, txtError.nextSibling);
            //alert("Los campos Nombre y Apellidos son obligatorios");
            return false;
        } else if (((formulario.nombre.value.length != 0) || (formulario.apellidos.value.length != 0)) && txtError.error) {
            txtError = document.getElementById("nombre");
            txtError.error.parentNode.removeChild(txtError.error);
            delete txtError.error;
        }


        if (formulario.txtDni.value.length == 0) {
            txtError = document.getElementById("txtDni");
            txtError.error = span = document.createElement("span");
            span.className = "error";
            span.innerHTML = "   El DNI es obligtorio";
            txtError.parentNode.insertBefore(span, txtError.nextSibling);
            //alert("Los campos Nombre y Apellidos son obligatorios");
            return false;
        } else if (formulario.txtDni.value.length != 0 && txtError.error) {
            txtError = document.getElementById("txtDni");
            txtError.error.parentNode.removeChild(txtError.error);

            //alert("El campo DNI es obligatorio");
            return false;
        }
        /* else if {
            return=true;
        }*/
        else {
            return validacionDni();
            // salir();
        }

        if ((formulario.edad.value <= 1) || (isNaN(formulario.edad.value))) {
            alert("La edad debe ser mayor de 1");
            return false;

        }





        /*if ( (formulario.dia.options[formulario.dia.selectedIndex].value==0) || (formulario.mes.options[formulario.mes.selectedIndex].value==0) || (formulario.anio.options[formulario.anio.selectedIndex].value==0) ){
        	alert("La fecha de nacimiento no es correcta");
        	return false;
        }*/

        if ((formulario.fecha.value == '')) {
            alert("La fecha de nacimiento no es correcta");
            return false;
        }

        if ((!formulario.idioma1.checked) && (!formulario.idioma2.checked) && (!formulario.idioma3.checked)) {
            alert("Al menos debe seleccionar un idioma");
            return false;
        }

        // Si hemos llegado a este punto del script es que el formulario es correcto

        //formulario.submit(); //enviamos el formulario al servidor
        alert("Formulario correcto !!"); location.reload();

    }

    function salir() {
        alert("Formulario correcto !!");
        location.reload();
    }
