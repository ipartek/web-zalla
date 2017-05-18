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
    $('.error-msg').text('');

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
    $('.error-msg').text('');

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

    $('.error-msg').text('');

    let errorArray = new Array();

    errorArray.push(checkName($('#edit-name').val()));
    errorArray.push(checkDescription($('#edit-desc').val()));
    errorArray.push(checkPrice($('#edit-price').val()));
    errorArray.push(checkStock($('#edit-stock').val()));
    errorArray.push(checkDate($('#edit-date').val()));
    errorArray.push(checkCategory($('#edit-cat').val()));

    let areErrors = false;

    let errorMsg = 'ERROR\n';

    for (let i = errorArray.length; i >= 0; i--)
    {
        if (errorArray[i])
        {
            areErrors = true;
            errorMsg += errorArray[i].errorMessage + '\n';

            let errorMsgBlock = $('#edit-' + errorArray[i].errorPart).next('span').text(errorArray[i].errorMessage);

            console.log('#edit-' + errorArray[i].errorPart);

            $('#edit-' + errorArray[i].errorPart).focus();
        }
    }

    if (areErrors)
    {
        //alert(errorMsg);
        return false;
    }


}

function checkName(name_)
{
    const NAME_REGEX = /^\w(.{3,19})$/g;

    if (name_.match(NAME_REGEX) === null)
        return new Error('name', true, 'El nombre no cumple los parámetros');

    return false;
}

function checkDescription(description_)
{
    const NAME_REGEX = /^\w(.{3,500})$/g;

    if (description_.match(NAME_REGEX) === null)
        return new Error('desc', true, 'La descripción no cumple los parámetros');

    return false;
}

function checkPrice(price_)
{

    let price = parseFloat(price_);

    if (isNaN(price))
        return new Error('price', true, 'No has introducido un número como precio');

    if (price <= 0)
        return new Error('price', true, 'El precio es negativo. Así no ganamos dinero');

    if (Tools.decimales(price) > 2)
        return new Error('price', true, 'El número introducido tiene más de dos decimales');

    return false;
}

function checkStock(stock_)
{
    let stock = parseFloat(stock_);

    if (isNaN(stock))
        return new Error('stock', true, 'El stock ha de ser un número');

    if (stock <= 0)
        return new Error('stock', true, 'El stock no puede ser negativo');

    if (Tools.decimales(stock) > 0)
        return new Error('stock', true, 'El stock no puede tener decimales');

    return false;
}

function checkDate(date_)
{
    let date = new Date(date_);

    if (isNaN(date.getTime()))
        return new Error('date', true, 'El dato introducido no es una fecha. Recuerda escribirla de la siguiente manera (YYYY-MM-DD)');

    if (date > Date.now())
        return new Error('date', true, 'La fecha introducida ha de ser anterior a la fecha actual');

    return false;
}

function checkCategory(category_)
{
    if (category_ === null)
        return new Error('cat', true, 'Introduce una categoría.');

    return false;
}



function Error(errorPart_, errorAnswer_ = false, errorMessage_ = '')
{
    this.errorPart = errorPart_;
    this.errorAnswer = errorAnswer_;
    this.errorMessage = errorMessage_;
}

/* HERRAMIENTAS */

var Tools = {

    decimales: function(num)
    {
        var match = ('' + num).match(/(?:\.(\d+))?(?:[eE]([+-]?\d+))?$/);
        // si no hay match, no hay punto y no hay decimal
        if (!match)
        {
            return 0;
        }
        return Math.max(
            0,
            // numero de digitos a la derecha del decimal.
            (match[1] ? match[1].length : 0)
            // Ajustado para notación científica.
            -
            (match[2] ? +match[2] : 0));
    }
};