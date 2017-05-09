/* globals validarDni, validarNombre */
'use strict';

var formulario;

window.onload = function()
{
    // Guardamos el formulario en una variable
    formulario = document.getElementById('formulario1');

    formulario.onsubmit = comprobarFormulario;

    formulario['btn-no-required'].onclick = limpiarRequired;
};

function limpiarRequired()
{
    let limpiamos = confirm('Se borrarán todos los required de los campos. ¿Estás seguro?');

    if (limpiamos)
    {
        for (let inputs_ of formulario)
        {
            inputs_.required = false;
        }
    }
}

function comprobarFormulario()
{
    // Guardamos los errores en un array
    let errors = new Array();


    // NOMBRE
    let nombre = formulario['nombre'].value;
    if (nombre == '')
        errors.push('El nombre introducido no es correcto');


    // APELLIDOS
    let apellidos = formulario['apellidos'].value;
    if (apellidos == '')
        errors.push('No has introducido apellidos');


    // DNI
    let dni = formulario['dni'].value;
    if (dni == '' || !validarDni(dni))
        errors.push('El dni introducido no es correcto');


    // EDAD
    let edad = formulario['edad'].value;
    if (edad < 1 || edad > 120)
        errors.push('La edad introducida no es válida');


    // FECHA
    let dia = formulario['dia'].value,
        mes = formulario['mes'].value,
        ano = formulario['anio'].value;

    if (dia == 'X' || mes == 'X' || ano == 'X')
        errors.push('La fecha introducida no es válida');

    // IDIOMAS
    let isLanguage = false;
    for (let i = 1; i <= 3; i++)
    {
        if (document.getElementById('idioma' + i).checked)
        {
            isLanguage = true;
        }
    }
    if (!isLanguage)
        errors.push('Selecciona al menos un idioma');



    if (errors.length == 0)
    {
        alert('Todo correcto, puedes continuar');
    }
    else
    {
        let errorMSG = '¡ERROR!¡ERROR!¡ERROR!¡ERROR!\n\nTienes ' + errors.length + ' errores.\n\n';

        for (let error_ of errors)
        {
            errorMSG += '  ->  ' + error_ + '\n';
        }

        alert(errorMSG);
        return false;
    }


}