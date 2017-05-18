window.onload = function () {

    document.forms[0].onsubmit = function () {
        if ((this.nombre.value.length == 0) || (this.apellidos.value.length == 0)) {
            alert("Debe introducir Nombre y Apellidos");

            return false;
        }
        if (this.dni.value.length == 0) {
            alert("Debe introducir su DNI valido");
            return false;
        }

        if ((this.edad.value.length <= 1) || (isNaN(this.edad.value))) {
            alert("La edad debe ser mayor a 1 caracter");
            return false;
        }
        if ((this.dia.options[this.dia.selectedIndex].value == 0) || (this.mes.options[this.mes.selectedIndex].value == 0) || (this.anio.options[this.anio.selectedIndex].value == 0)) {
            alert("La fecha de nacimiento no es correcta");
            return false;
        }
        if (!(this.idioma1.checked) || (this.idioma2.checked) || (this.idioma3.checked)) {
            alert("Debe elegir un idioma como minimo");
            return false;
        }

        alert("Identificación correcta!!");

    };
};
