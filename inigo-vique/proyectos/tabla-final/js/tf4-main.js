'use strict';

$(function()
{
    console.info('Iniciamos el programa');

    $('.btn-delete').click(askForDelete);

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