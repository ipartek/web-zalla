'use strict';

var formModal,
    formulario;

$(function()
{

    formulario = $('#product-form');
    formModal = $('#form-modal');

    $('.btn-delete').click(function()
    {
        let rowName = $(this).parents('tr')[0].id;
        askForDelete(rowName);
    });

    $('.btn-edit').click(editEntry);

    $('.btn-addnew').click(addEntry);

    $('.btn-formback').click(closeEntry);

    console.log('fdauio');
    formulario.on('submit', validateForm);
    console.log('fdafasdf ');

});

function askForDelete(idName_)
{
    let doDelete = confirm('¿Desea borrar la fila con id ' + idName_ + ' mandando todos sus datos a hacer puñetas?');
    if (doDelete)
    {
        window.location.reload();
    }
}

function editEntry()
{

    // Seleccionar
    let row = $(this).parents('tr')[0];

    let dataBlock = $(row).children('td');

    let editId = $(row).children('th')[0].innerText;
    let editName = dataBlock[0].innerText;
    let editDesc = dataBlock[1].innerText;
    let editPrice = dataBlock[2].innerText;
    let editStock = dataBlock[3].innerText;
    let editDate = dataBlock[4].innerText;
    let editCat = dataBlock[5].innerText;

    $('#edit-id').val(editId);
    $('#edit-name').val(editName);
    $('#edit-desc').val(editDesc);
    $('#edit-price').val(editPrice);
    $('#edit-stock').val(editStock);
    $('#edit-date').val(editDate);
    $('#edit-cat').val(editCat);

    $('.btn-formdelete').show();
    $('.btn-formdelete').prop('disabled', false);
    $('.btn-formdelete').off('click');
    $('.btn-formdelete').click(function()
    {
        askForDelete(editId);
    });


    // DO ANIMATION
    formModal.fadeIn(400);
    formModal.children('#form-modal-content').toggleClass('hidden');

}

function addEntry()
{
    $('#edit-id').val(11);
    $('#edit-name').val('');
    $('#edit-desc').val('');
    $('#edit-price').val('');
    $('#edit-stock').val('');
    $('#edit-date').val('');
    $('#edit-cat').val('');

    $('.btn-formdelete').hide();
    $('.btn-formdelete').prop('disabled', true);

    formModal.fadeIn(400);
    formModal.children('#form-modal-content').toggleClass('hidden');
}

function closeEntry()
{
    // DO ANIMATION
    formModal.fadeOut(400);
    formModal.children('#form-modal-content').toggleClass('hidden');
}

function validateForm()
{

    if ($('#edit-name').val().match(/^\w(.{3,19})$/g) === null)
    {
        alert('El nombre está mal primo');
        return false;
    }

    if ($('#edit-desc').val().match(/^\w(.{3,500})$/g) === null)
    {
        alert('La descripción está mal premoh');
        return false;
    }

    if (isNaN(parseFloat($('#edit-price').val())))
    {
        alert('Esto no es un número nanoh');
        return false;
    }

    if (isNaN(parseInt($('#edit-stock').val())))
    {
        alert('Esto no es un número nanoh');
        return false;
    }



    return false;

}