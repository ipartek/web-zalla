"use strict"; //obligamos a javascript a ser un poco mas estricto en la sintaxis




$(document).ready(function () { //cargaremos las rutinas de jquery cuando el documento este totalmente cargado.


    //inicializamos la pagina y ocultamos los dos cuadros secundarios mas el boton del formulario

    var validoCuadroEdu = false;
    var validoCuadroExp = false;
    var validoCuadroDatos = true;
    var validoBtnSiguiente = false;

    mostrarOcultar($("#cuadro-datos-personales"), validoCuadroDatos);
    mostrarOcultar($("#cuadro-educacion"), validoCuadroEdu);
    mostrarOcultar($("#cuadro-exp-laboral"), validoCuadroExp);
    deshabilitarBoton($("#cuadro-datos-personales").find(".btn-siguiente btn"), validoBtnSiguiente);


    //usamos esta funcion para mostrar u ocultar partes de la pagina dependiendo de un valor logico
    function mostrarOcultar(bloque, valido) {

        if (valido)
            bloque.show();
        else
            bloque.hide();
    }

    function deshabilitarBoton(boton, valido) {
        if (valido)
            boton.removeAttribute("disabled");
        else
            boton.attr("disabled", "disabled");
    }



    /*--------------------------------------------------*/
    /*--------   transicion entre secciones    ---------*/
    /*--------------------------------------------------*/



    //dependiendo de que boton pulsemos mostraremos u ocultaremos un cuadro en concreto.

    //mostramos el cuadro de datos personales
    $(".mostrar-datos").on("click", function (event) {

        validoCuadroDatos = true;
        validoCuadroEdu = false;
        validoCuadroExp = false;
        validoBtnSiguiente = true;

        mostrarOcultar($("#cuadro-datos-personales"), validoCuadroDatos);
        mostrarOcultar($("#cuadro-educacion"), validoCuadroEdu);
        mostrarOcultar($("#cuadro-exp-laboral"), validoCuadroExp);
        deshabilitarBoton($("#cuadro-datos-personales").find(".btn-siguiente btn"), validoBtnSiguiente);


    });
    //mostramos el cuadro de educacion
    $(".mostrar-educacion").on("click", function (event) {

        validoCuadroDatos = false;
        validoCuadroEdu = true;
        validoCuadroExp = false;
        validoBtnSiguiente = false;

        mostrarOcultar($("#cuadro-datos-personales"), validoCuadroDatos);
        mostrarOcultar($("#cuadro-educacion"), validoCuadroEdu);
        mostrarOcultar($("#cuadro-exp-laboral"), validoCuadroExp);
        deshabilitarBoton($("#cuadro-educacion").find(".btn-siguiente btn"), validoBtnSiguiente);


    });
    //mostramos el cuadro de experiencia laboral
    $(".mostrar-exp").on("click", function (event) {

        validoCuadroDatos = false;
        validoCuadroEdu = false;
        validoCuadroExp = true;
        validoBtnSiguiente = false;

        mostrarOcultar($("#cuadro-datos-personales"), validoCuadroDatos);
        mostrarOcultar($("#cuadro-educacion"), validoCuadroEdu);
        mostrarOcultar($("#cuadro-exp-laboral"), validoCuadroExp);
        deshabilitarBoton($("#cuadro-exp-laboral").find(".btn-siguiente btn"), validoBtnSiguiente);


    });

    /*--------------------------------------------------*/
    /*------ fin transicion entre secciones    ---------*/
    /*--------------------------------------------------*/

    /*--------------------------------------------------*/
    /*------ Validacion de formulario    ---------------*/
    /*--------------------------------------------------*/

    //Esta funcion sirve para recoger el valor de aquellos input que hemos puesto como requeridos en su atributo class y al eliminarles el foco o cambiarlos o levantar una tecla comprueban que el valor introducido sea compatible con el atributo pattern que le hemos puesto en html5. Si el valor es valido muestran el boton para continuar, si el valor es erroneo esconden dicho boton.

    $(".required").on("blur change keyup", validarCampos);


    function validarCampos() {

        //declaracion de variables que en realidad es el acceso a los elementos del DOM mediante jquery
        var patron = $(this).attr("pattern");
        var valor = $(this).val();
        var articulo = $(this).parents(".form-group");
        var seccion = $(this).parents(".seccion-campos");
        var icono = $(this).next("i");


        //Comparo los valores recogidos para añadir o eliminar las clases de bootstrap de estados de campos de formulario

        if (valor.length === 0 || valor.match(patron) === null) {
            articulo.addClass("has-error");
            icono.addClass("glyphicon-remove");
            articulo.find(".error-msg").removeAttr("hidden");

        } else {
            articulo.removeClass("has-error");
            icono.removeClass("glyphicon-remove");
            articulo.find(".error-msg").attr("hidden", "hidden");

        }

        //necesito saber si algun campo es erroneo para poder mostrar u ocultar el boton por eso recojo dentro de la variable logica validoBtnSiguiente un falso si algun campo es erroneo o un true si todos estan bien
        validoBtnSiguiente = validarSeccion(seccion);


        //Por ultimo llamo a la funcion para mostrar u ocultar dependiendo del valor anteriormente recogido
        deshabilitarBoton(seccion.find(".btn-siguiente btn"), validoBtnSiguiente);

    } //fin validar campos



    //Esta funcion recibe el objeto formulario y devuelve un valor logico true si todos los valores del formulario son correctos o devuelve false si algun valor requerido no es correcto.

    function validarSeccion(seccion) {

        var valido = true;

        //para todos los elementos de la seccion que tengan un error o sean requeridos debo validar el valor
        seccion.find(".required").each(function () {

            console.log($(this));

            if ($(this).parents(".form-group").attr("class").match("has-error") || $(this).val().length === 0) {
                valido = false;
                return valido;
            }
        });

        return valido;


    } //fin validar seccion


    /*--------------------------------------------------*/
    /*------Boton de añadir es necesario validar el textarea para que tenga espacios, sino no formatea el texto   ---------*/
    /*--------------------------------------------------*/

    //Esta funcion sirve para recoger los datos de educacion o exp laboral y guardarlos en una lista ademas de mostrarlos dinamicamente. Si no hay ningun valor no deja continuar al usuario.

    $(".anadir").on("click", function (event) {
        var seccion = $(this).parents(".seccion-campos"); //obtenemos la seccion donde esta el boton de añadir
        var desde = seccion.find(".desde").val(); //recogemos el valor del campo fecha desde
        var hasta = seccion.find(".hasta").val(); //recogemos el valor del campo fecha hasta
        var textareaDescripcion = seccion.find(".textarea-descripcion").val(); //recogemos el valor del campo texarea descripcion

        //añadimos una linea a la lista de descripciones
        seccion.find(".lista-datos").append("<li>Desde " + desde + " Hasta " + hasta + " : " + textareaDescripcion + "</li>");
        //Por ultimo mostramos los datos recogidos de los 3 campos anteriores en forma de lista mas el boton de continuar
        mostrarOcultar(seccion.find(".mostrar-datos"), true);
    });
});
