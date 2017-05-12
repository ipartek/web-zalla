/* globals $ */

'use strict';

// Para escribir en Jquery se pone por delante un $.

// Esto es el window.onload de Jquery
$(function()
{

    // seleccionamos la etiqueta form
    $('form');

    // seleccionamos el elemento con el id nombre
    $('#nombre');

    // seleccionamos el elemento con clase
    $('.btn-de-envio');

    // Podemos seleccionar múltiples. Todas las opciones dentro del select
    $('#mi-select option');

    console.group('FOREACH JQUERY');
    // Esto es un foreach
    $('#mi-select option').each(function()
    {
        console.log(this.value);
    });
    console.groupEnd();

    // Puede haber varios elementos con la etiqueta form. Si hay más de uno crea un array
    // y la funcion se la aplica a todos, sin tener que hacer un form sobre todos los elementos.
    $('form').on('submit', function()
    {
        alert($('#nombre').val());
    });

    // Podemos pillar objetos añadiendo los corchetes. Es guay :).
    // Además, podemos usar pseudoclases de CSS para seleccionar elementos
    $('.btn-borrar-inputs').on('click', function()
    {
        $('input[type=text]:nth-child(2)').val('TEXTO');
    });

    $('.btn-otro').on('click', function()
    {
        // Les aplica un display="none" a los elementos seleccionados al pulsar .hide();
        $('input[type=text]').hide();
    });

    $('.btn-conmutar').on('click', function()
    {
        // Les aplica un display="none" a los elementos seleccionados al pulsar .hide();
        $('input[class!=btn-conmutar]').toggle(1000);
    });

});