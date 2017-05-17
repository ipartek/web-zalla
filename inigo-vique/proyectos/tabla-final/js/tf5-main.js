'use strict';

var formModal;

$(function()
{
    console.info('Iniciamos el programa');

    formModal = $('#form-modal');

    $('.btn-delete').click(askForDelete);
    $('.btn-edit').click(editEntry);
    $('.btn-formback').click(closeEntry);

});

function askForDelete()
{
    // cogemos el id de la fila en la que estamos
    let rowName = $(this).parents('tr')[0].id;
    //console.log(rowName);

    let doDelete = confirm('¿Desea borrar la fila con id ' + rowName + ' mandando todos sus datos a hacer puñetas?');
    if (doDelete)
    {
        window.location.reload();
    }
}

function editEntry()
{

    /*
    formModal.fadeTo(500, 1.0, function()
    {
        formModal.show();
    });
    formModal.children('#form-modal-content').animate(
    {
        "margin-top": "5vh"
    }, 600);
    */

    console.log('pulsado');

    formModal.toggleClass('no-display').after(function()
    {

        formModal.toggleClass('opaque');

        setTimeout(function()
        {
            formModal.toggleClass('transparent');
        }, 1);

    });





}

function closeEntry()
{
    /*
    formModal.fadeTo(500, 0.0, function()
    {
        formModal.hide();
    });
    formModal.children('#form-modal-content').animate(
    {
        "margin-top": "-7vh"
    }, 400);
    */

    console.log('estoy');

    formModal.toggleClass('opaque');
    formModal.toggleClass('transparent');
    formModal.one('transitionend', function(e)
    {
        $(this).toggleClass('no-display');
    });

}