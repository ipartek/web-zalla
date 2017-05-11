'use strict';

var formulario,

    tasa, nombre, apellidos;

window.onload = function()
{
    console.log('Inicio del programa');

    // llenamos formulario
    formulario = document.getElementById('datosPersonales');

    activarEstadoCivil();
    seleccionarTasas();
    mostrarDatos();
};

function activarEstadoCivil()
{
    formulario['sexo'].onchange = function()
    {
        if (this.value == 2)
        {
            // Activamos el estado civil al ser Mujer
            formulario['estadoCivil'].disabled = false;
        }
        else
        {
            // Desactivamos el estado civil al no ser Mujer
            formulario['estadoCivil'].disabled = true;
            formulario['estadoCivil'].selectedIndex = 0;
        }

    };
}

function seleccionarTasas()
{
    let formProf = formulario['profesion'];


    for (let input_ of formProf)
    {
        input_.onchange = function()
        {
            tasa = devolverTasa(input_.value);

            if (tasa != null)
            {
                formulario['tasas'].value = tasa + ' €';
            }
            else
            {
                formulario['tasas'].value = 'DATO NO INTRODUCIDO CORRECTAMENTE';
            }
        };
    }
}

function mostrarDatos()
{

    formulario['mostrar_datos'].onclick = function()
    {
        let mensaje = '';

        nombre = formulario['nombre'].value;
        apellidos = formulario['apellidos'].value;

        if (tasa == undefined)
        {
            mensaje = 'Tasa no seleccionada';
        }
        else
        {
            mensaje += nombre + ' ' + apellidos + '\nTasa: ' + tasa + ' €';
        }

        alert(mensaje);

    };

}



// UTILIDADES //
function devolverTasa(caso_)
{
    let tasa;

    switch (caso_)
    {
        case 'autonomo':
            tasa = 15;
            break;
        case 'ajena':
            tasa = 20;
            break;
        case 'paro':
            tasa = 2;
            break;
        case 'jubilado':
            tasa = 5;
            break;
        default:
            tasa = null;
            break;
    }

    return tasa;
}