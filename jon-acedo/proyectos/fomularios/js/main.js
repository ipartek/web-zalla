window.onload = function() {
    $('#ocultar').hide();
    $('#muestra-flags').on('click', function() {
        $('#ocultar').slideToggle();
    });
    $('#ocultar').mouseleave(function() {
        $('#ocultar').slideUp();
    });
    $('#uk').on('click', function() {
        $('#telefono').val('+44');
        $('#ocultar').slideToggle();
        $('#muestra-flags').html('<img src="img/uk.png" alt="">')
    });
    $('#sp').on('click', function() {
        $('#telefono').val('+34');
        $('#ocultar').slideToggle();
        $('#muestra-flags').html('<img src="img/spain.png" alt="">')
    });
    $('#fr').on('click', function() {
        $('#telefono').val('+36');
        $('#ocultar').slideToggle();
        $('#muestra-flags').html('<img src="img/france.png" alt="">')
    });


}
