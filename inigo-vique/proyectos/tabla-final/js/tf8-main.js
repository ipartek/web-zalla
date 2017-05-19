'use strict';

var formModal,
    descriptionModal,
    formulario;

$(function()
{

    formulario = $('#product-form');
    formModal = $('#form-modal');
    descriptionModal = $('#description-modal');


    $('.btn-delete').click(function()
    {
        let rowName = $(this).parents('tr')[0].id;
        askForDelete(rowName);
    });

    $('.btn-edit').click(editEntry);
    $('.btn-addnew').click(addEntry);
    $('.btn-formback').click(closeEntry);

    $('.btn-description').click(showDescription);
    $('.btn-close-description').click(closeDescription);

    $('#go-to-page').change(goToPage);

    formulario.on('submit', validateForm);

});

function goToPage()
{
    location.href = 'tf8-tabla.html?ahoraEstoyEnLaPagina=' + $(this).val();
}

function showDescription()
{
    let row = $(this).parents('tr')[0];
    let dataBlock = $(row).children('td');
    let editName = dataBlock[0].innerText;

    descriptionModal.find('h2')[0].innerText = editName;
    descriptionModal.find('p')[0].innerText = $(this).text();

    descriptionModal.fadeIn(400);
    descriptionModal.children('#description-content').toggleClass('hidden');
}

function closeDescription()
{
    // DO ANIMATION
    descriptionModal.fadeOut(400);
    descriptionModal.children('#description-content').toggleClass('hidden');
}

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
    let editDesc = $(dataBlock[1]).children('span')[0].innerText; // Esto es obligatorio porque si pillamos el span mete un intro muy molesto que no valida con el REGEX después
    let editPrice = dataBlock[2].innerText;
    let editStock = dataBlock[3].innerText;
    let editDate = dataBlock[4].innerText;
    let editCat = dataBlock[5].innerText;

    $('#edit-id').val(editId);
    $('#edit-name').val(editName);
    $('#edit-desc').val(editDesc);
    $('#edit-price').val(editPrice);
    $('#edit-stock').val(editStock);
    $('#edit-date').val(Tools.cambiaFechas(editDate));
    $('#edit-cat').val(editCat);
    $('.error-msg').text('');

    $('input[type=submit]').val('Modificar entrada');
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

    $('#edit-name').focus();
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

    $('input[type=submit]').val('Crear nueva entrada');
    $('.btn-formdelete').hide();
    $('.btn-formdelete').prop('disabled', true);

    // DO ANIMATION
    formModal.fadeIn(400);
    formModal.children('#form-modal-content').toggleClass('hidden');

    $('#edit-name').focus();

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

    errorArray.push(Checker.name($('#edit-name').val()));
    errorArray.push(Checker.description($('#edit-desc').val()));
    errorArray.push(Checker.price($('#edit-price').val()));
    errorArray.push(Checker.stock($('#edit-stock').val()));
    errorArray.push(Checker.date($('#edit-date').val()));
    errorArray.push(Checker.category($('#edit-cat').val()));

    let areErrors = false;

    let errorMsg = 'ERROR\n';

    for (let i = errorArray.length; i >= 0; i--)
    {
        if (errorArray[i])
        {
            areErrors = true;

            let wrongInput = $('#edit-' + errorArray[i].errorPart);
            let errorMsgBlock = wrongInput.next('span').text(errorArray[i].errorMessage);

            wrongInput.addClass('red-border');
            wrongInput.on('animationend', function(){wrongInput.removeClass('red-border');});

            wrongInput.focus();
        }
    }

    if (areErrors)
    {
        //alert(errorMsg);
        return false;
    }
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
    },

    cambiaFechas: function(fecha_)
    {

        let datosFecha = fecha_.split('/');

        if (datosFecha.length != 3)
        {
            console.error('La fecha introducida no está escrita correctamente. El formato ha de ser el siguiente (DD/MM/AAAA)');
            return false;
        }

        for (let dato_ of datosFecha)
        {
            if (isNaN(parseInt(dato_)))
                return false;
        }

        // Esto es supercutre, superDOLOROSO y superPELIGROSO. A revisar en un futuro. :(
        let year = (datosFecha[2] /* ano */ < 100) ? datosFecha[2] + 2000 : datosFecha[2];

        return (year + '-' + datosFecha[1] /* mes */ + '-' + datosFecha[0] /* dia */ );

    }
};

var Checker = {

    name: function(name_)
    {
        const NAME_REGEX = /^\w(.{3,19})$/g;

        if (name_.match(NAME_REGEX) === null)
            return new Error('name', true, 'El nombre no cumple los parámetros');

        return false;
    },

    description: function(description_)
    {
        // Permite intros en la descripcion \(^o^)/
        const DESCRIPTION_REGEX = /^\w((.|\n){3,1500})$/g;

        if (description_.match(DESCRIPTION_REGEX) === null)
            return new Error('desc', true, 'La descripción no cumple los parámetros');

        return false;
    },

    price: function(price_)
    {

        let price = parseFloat(price_);

        if (isNaN(price))
            return new Error('price', true, 'No has introducido un número como precio');

        if (price <= 0)
            return new Error('price', true, 'El precio es negativo. Así no ganamos dinero');

        if (Tools.decimales(price) > 2)
            return new Error('price', true, 'El número introducido tiene más de dos decimales');

        return false;
    },

    stock: function(stock_)
    {
        let stock = parseFloat(stock_);

        if (isNaN(stock))
            return new Error('stock', true, 'El stock ha de ser un número');

        if (stock <= 0)
            return new Error('stock', true, 'El stock no puede ser negativo');

        if (Tools.decimales(stock) > 0)
            return new Error('stock', true, 'El stock no puede tener decimales');

        return false;
    },

    date: function(date_)
    {
        let date = new Date(date_);

        if (isNaN(date.getTime()))
            return new Error('date', true, 'El dato introducido no es una fecha. Recuerda escribirla de la siguiente manera (YYYY-MM-DD)');

        if (date > Date.now())
            return new Error('date', true, 'La fecha introducida ha de ser anterior a la fecha actual');

        return false;
    },

    category: function(category_)
    {
        if (category_ === null)
            return new Error('cat', true, 'Selecciona una categoría válida.');

        return false;
    },

};