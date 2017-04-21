/*  #3

* Mostrar de inicio sólo los días.
* Al hacer click en un día, se despliegan las horas (pero el contenido de cada hora permanece cerrado).
* Al hacer clic, en una hora, se despliegan los conciertos de esa hora
* Al hacer click en otra hora u otro día, se despliega lo que corresponda, manteniendo los anteriores días/horas abiertos
* Crear 2 botones o enlaces (desde js, en el html no deben existir)
* Uno de ellos servirá para desplegar todos los días y todas las horas de golpe
* Otro de ellos servirá para ocultar todos los días y todas las horas que estén abiertas

*/

window.onload = function() {
    $('h1').after('<ul><li id="mostrar">Mostrar Todo</li><li id="ocultar">Ocultar todo</li></ul>');
    $('.hora-concierto').hide();
    $('.hora-titulo').hide();

    $('.dia-header').on('click', function() {
        $(this).parent().find('.hora-concierto').fadeOut();
        $(this).parent().find('.hora-titulo').fadeToggle();
    });

    $('.hora-titulo').on('click', function() {
        $(this).parent().find('.hora-concierto').fadeToggle();
    });

    $('#mostrar').on('click', function() {
        $('.hora-concierto').fadeIn();
        $('.hora-titulo').fadeIn();
    });

    $('#ocultar').on('click', function() {
        $('.hora-concierto').fadeOut();
        $('.hora-titulo').fadeOut();
    });

}
