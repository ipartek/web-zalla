var formulario;
$(function () {
    formulario = document.getElementById('formulario1');

    $("#cajaFormulario").css("display", "none");

    //-----------SELECCIONAR REGISTRO-----------------

    $("tbody#cuerpo tr").on('click', function () {

        $(".btnOcultar").css("display", "inline");

    });

    //---------MODIFICAR-------------------

    $("#btnModificar").on('click', function () {

        $("#cajaFormulario").css("display", "block");
        $("#btnBorrar").css("display", "none");
        $("#btnAnadir").css("display", "none");


    });

    $("#btnCancelar").on('click', function () {
        $("#cajaFormulario").css("display", "none");
        $(".btnOcultar").css("display", "none");
        location.reload();
    });

    //--------BORRAR--------------------


    $("#btnBorrar").on('click', function () {

        //---------CONFIRMAR O DENEGAR-------------------

        if (confirm("Estas seguro de querer borrarlo?")) {
            alert("Registro Borrado.");
            $("#cajaFormulario").css("display", "none");
            $(".btnOcultar").css("display", "none");
        } else {
            $("#cajaFormulario").css("display", "none");
            $(".btnOcultar").css("display", "none");
        }

        //---------OCULTAR FORMULARIO Y BOTONES---------------

        $("#cajaFormulario").css("display", "none");
        $(".btnOcultar").css("display", "none");

    });

    //----------------NUEVO REGISTRO------------
    $("#btnAnadir").on('click', function () {

        $("#cajaFormulario").css("display", "block");

    });
    $("#btnenviar").on('click', function () {

        validar();
    });


    $("#btnCancelar").on('click', function () {
        $("#cajaFormulario").css("display", "none");
        $(".btnOcultar").css("display", "none");
        location.reload();
    });
});
