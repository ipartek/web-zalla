"use strict"; //obligamos a javascript a ser un poco mas estricto en la sintaxis

$(document).ready(function () { //cargaremos las rutinas de jquery cuando el documento este totalmente cargado.

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
        $(".mostrar-datos").hide();

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

    /*--------------------------------------------------*/
    /*------ Validacion de formularios   ---------------*/
    /*--------------------------------------------------*/



    /*--------------------------------------------------*/
    /*------Boton de añadir es necesario validar el textarea para que tenga espacios, sino no formatea el texto   ---------*/
    /*--------------------------------------------------*/

    //Esta funcion sirve para recoger los datos de educacion o exp laboral y guardarlos en una lista ademas de mostrarlos dinamicamente. Si no hay ningun valor no deja continuar al usuario.

    $(".anadir").on("click", function (event) {
        var formularioPadre = $(this).parents("form"); //obtenemos el formulario donde esta el boton de añadir
        var desde = formularioPadre.find(".desde").val(); //recogemos el valor del campo fecha desde
        var hasta = formularioPadre.find(".hasta").val(); //recogemos el valor del campo fecha hasta
        var textareaDescripcion = formularioPadre.find(".textarea-descripcion").val(); //recogemos el valor del campo texarea descripcion

        //añadimos una linea a la lista de descripciones
        formularioPadre.find(".lista-datos").append("<li>Desde " + desde + " Hasta " + hasta + " : " + textareaDescripcion + "</li>");
        //Por ultimo mostramos los datos recogidos de los 3 campos anteriores en forma de lista mas el boton de continuar
        formularioPadre.find(".mostrar-datos").show();
    });
});
