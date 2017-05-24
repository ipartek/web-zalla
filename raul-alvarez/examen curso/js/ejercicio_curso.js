var formulario;
$(function () {
    formulario = document.getElementById('formulario1');

    $("#cajaFormulario").css("display", "none");

    //-----------SELECCIONAR REGISTRO-----------------

    $("tbody#cuerpo tr").on('click', function () {
        
        
        //-----------valores tabla---------------------------
        

        $(".btnOcultar").css("display", "inline");

    });

    //---------MODIFICAR-------------------

    $("#btnModificar").on('click', function () {
        

        //------------fondo
        $("#titulo").text("Modificar Registro");

        var altoDisplay = window.innerHeight;
        var anchoDisplay = window.innerWidth;

        var divFondo = document.createElement("div");

        divFondo.id = "popupfondo";

        divFondo.style.backgroundColor = "hsla(122, 52%, 63%, 0.38)";
        divFondo.style.position = "fixed";
        divFondo.style.top = 0;
        divFondo.style.left = 0;
        divFondo.style.height = altoDisplay + "px";
        divFondo.style.width = anchoDisplay + "px";
        divFondo.style.zIndex = 20;

        document.body.appendChild(divFondo);



//-------------------------------------
        
                
        
        //-------------------------------


        $(divFondo).append($('#cajaFormulario'));
        
    
        
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
        //------------fondo
        $("#titulo").text("Nuevo Registro");
        var altoDisplay = window.innerHeight;
        var anchoDisplay = window.innerWidth;

        var divFondo = document.createElement("div");

        divFondo.id = "popupfondo";

        divFondo.style.backgroundColor = "hsla(122, 52%, 63%, 0.38)";
        divFondo.style.position = "fixed";
        divFondo.style.top = 0;
        divFondo.style.left = 0;
        divFondo.style.height = altoDisplay + "px";
        divFondo.style.width = anchoDisplay + "px";
        divFondo.style.zIndex = 20;

        document.body.appendChild(divFondo);




        //-------------------------------


        $(divFondo).append($('#cajaFormulario'));

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


