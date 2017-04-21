$(document).ready(function ({

    $(".mostrar-datos").click(function ({


        $("#cuadro-datos-personales").show();
        $("#cuadro-educacion").hide();
        $("#cuadro-exp-laboral").hide();
    });)

    $(".mostrar-educacion").click(function ({


        $("#cuadro-datos-personales").hide();
        $("#cuadro-educacion").show();
        $("#cuadro-exp-laboral").hide();
    });)

    $(".mostrar-exp").click(function ({


        $("#cuadro-datos-personales").hide();
        $("#cuadro-educacion").hide();
        $("#cuadro-exp-laboral").show();
    });)
}));
