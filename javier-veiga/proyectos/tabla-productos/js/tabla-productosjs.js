"use strict";

$(document).ready(function () {

    var formulario = $("#form-principal");
    var filas = $("tbody tr");

    formulario.hide();

    $(".crear").on("click", funcCrear);
    $(".modificar").on("click", funcModificar);
    $(".borrar").on("click", funcBorrar);
    $("#enviar").on("submit", modificarRegistro);

    function funcBorrar() {
        console.log("funcion de borrar " + $(this));
        $(this).siblings(".clase-alta").text("no");
    }

    function funcCrear() {

        $("h2").text("Crear registro de producto.");

        formulario.find("#identificador").val(filas.length + 1);

        formulario.show();


    }

    function funcModificar() {

        $("h2").text("Modificar registro de producto.");
        formulario.find("#identificador").val($(this).siblings(".clase-id").text());
        formulario.find("#nombre").val($(this).siblings(".clase-nombre").text());
        formulario.find("#familia").val($(this).siblings(".clase-familia").text());
        formulario.find("#precio").val($(this).siblings(".clase-precio").text());
        console.log($(this).siblings(".clase-alta").text());

        if ($(this).siblings(".clase-alta").text() === "si") {
            $("#alta-si").prop("checked", true);
            $("#alta-no").removeAttr("checked");
        } else if ($(this).siblings(".clase-alta").text() === "no") {
            $("#alta-no").prop("checked", true);
            $("#alta-si").removeAttr("checked");
        }
        formulario.show();

    }

    function modificarRegistro(e) {

        //Esta estructura podramos usarla si queremos modificar dinamicamente la tabla con jquery.
        //Deberemos cambiar el evento submit por click y despues validar el formulario con jquery
        //Pero si queremos que lo haga el servidor deberemos hacer la llamadas AJAX pertinentes y dejar el evento submit.


        /*//obtenemos la id del registro a modificar
        e.preventDefault();
        var idFilas = parseInt($("#identificador").val(), 10) - 1;

        console.log(idFilas);

        //generamos un array con todas las filas del body de la tabla

        var fila = $(filas[idFilas]);

        //rellenamos cada campo del registro con los datos del formulario

        fila.find(".clase-nombre").text($("#nombre").val());
        fila.find(".clase-familia").text($("#familia").val());
        fila.find(".clase-precio").text($("#precio").val());
        if ($("#alta-si").prop("checked"))
            fila.find(".clase-alta").text("si");
        if ($("#alta-no").prop("checked"))
            fila.find(".clase-alta").text("no");*/


        $("#form-principal").hide();

    }


});
