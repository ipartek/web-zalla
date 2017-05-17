$(function() {
    $('#borrar').on('click', function(){
        $('input[type=text]:nth-child(2)').val('BORRADO');
    });
    
    $('#conmutar').click(function() {
        $('input[id!=conmutar]').toggle(1000); //.fadeOut(1000).fadeIn(1000); //.fadeToggle(1000); //.toggle(1000);//.hide(); //.show()
        $('<span class="errorTexto">Error</span>').insertAfter($('#nombre'));
        
        $('input[type=text]').toggleClass('errorCuadro'); //addClass('asd')
    });
    
    $('form').on('submit', function() {
        alert($('#nombre').val());
        
        $('#opciones option').each(function() {
            //alert(this.value);
            alert($(this).val());
        });

    });
    
});
