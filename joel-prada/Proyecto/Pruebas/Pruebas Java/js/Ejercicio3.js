"use strict;"

window.onload = alCargar;
//En expresiones regulares
var patronNombre = /^[a-zA-Z ]{2,30}$/;
var patronApellidos = /^[a-zA-Z ]{2,50}$/;
var patronDni = /^\d{8}[a-zA-Z]{1}$/;
var patronEdad = /^\d{1,2}$/;


function alCargar() {

    var btnValidar = document.getElementById("btnValidar");

    btnValidar.onclick = validar;
};

function validar() {
    var nombre = formulario1.nombre.value;
    var apellidos = formulario1.apellidos.value;
    var dni = formulario1.dni.value;
    var edad = formulario1.edad.value;
    var sexo = formulario1.sexo.options[formulario1.sexo.selectedIndex].value;

    var dia = formulario1.dia.options[formulario1.dia.selectedIndex].value;
    var mes = formulario1.mes.options[formulario1.mes.selectedIndex].value;
    var anio = formulario1.anio.options[formulario1.anio.selectedIndex].value;

    if (nombre.length == 0 || !patronNombre.test(nombre)) {
        alert("Introduce el NOMBRE CORRECTAMENTE");
        return false;
    }
    if (apellidos.length == 0 || !patronNombre.test(apellidos)) {
        alert("Introduce el APELLIDOS CORRECTAMENTE");
        return false;
    }
    if (dni.length == 0 || !patronDni.test(dni)) {
        alert("Introduce el DNI CORRECTAMENTE");
        return false;
    }
    if (edad.length == 0 || !patronEdad.test(edad)) {
        alert("Introduce el EDAD CORRECTAMENTE");
        return false;
    }
    if (sexo == "X") {
        alert("Introduce el SEXO CORRECTAMENTE");
        return false;
    }
    if (dia == "X") {
        alert("Introduce el DIA CORRECTAMENTE");
        return false;
    }
    if (mes == "X") {
        alert("Introduce el MES CORRECTAMENTE");
        return false;
    }
    if (anio == "X") {
        alert("Introduce el AÑO CORRECTAMENTE");
        return false;
    }
    if(!formulario1.idioma1.checked && !formulario1.idioma2.checked && !formulario1.idioma3.checked){
        alert("ELIGE ALMENOS UN IDIOMA");
        return false;
    }
    alert("EL FROMULARIO ES CORRECTO!!!!!")

}
