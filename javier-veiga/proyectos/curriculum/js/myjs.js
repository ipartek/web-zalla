$(document).ready(function () {

    /*--------------------------------------------------*/
    /*--------  transicion entre formularios   ---------*/
    /*--------------------------------------------------*/

    //ocultamos los dos cuadros secundarios
    $("#cuadro-educacion").hide();
    $("#cuadro-exp-laboral").hide();


    //dependiendo de que boton pulsemos mostraremos u ocultaremos un cuadro en concreto.

    //mostramos el cuadro de datos personales
    $(".mostrar-datos").on("click", function (event) {

        $("#cuadro-datos-personales").show();
        $("#cuadro-educacion").hide();
        $("#cuadro-exp-laboral").hide();

    });
    //mostramos el cuadro de educacion
    $(".mostrar-educacion").on("click", function (event) {

        $("#cuadro-educacion").show();
        $("#cuadro-datos-personales").hide();
        $("#cuadro-exp-laboral").hide();
        $(".datos-edu").hide();

    });
    //mostramos el cuadro de experiencia laboral
    $(".mostrar-exp").on("click", function (event) {

        $("#cuadro-exp-laboral").show();
        $("#cuadro-datos-personales").hide();
        $("#cuadro-educacion").hide();

    });

    /*--------------------------------------------------*/
    /*------fin transicion entre formularios   ---------*/
    /*--------------------------------------------------*/

    $(".anadir").on("click", function (event) {
        var desde = $("#desde-edu").val();
        var hasta = $("#hasta-edu").val();
        var edutextarea = $("#educacion").val();
        $("#lista-edu").append("<li>Desde " + desde + " Hasta " + hasta + " : " + edutextarea + "</li>");
        $("li").css("width", "80%");
        $(".datos-edu").show();
    });
});
