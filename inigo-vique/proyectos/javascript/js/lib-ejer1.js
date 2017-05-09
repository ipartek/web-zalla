'use strict';

var formulario;

function mostrarDatos()
{
    console.log('Inicio de muestra de datos');

    // sistema para comprobar que los datos introducidos son correctos
    let flag = false;
    // mensaje que se mostrará en el alert
    let mensaje = '';



    // Nombre y apellidos
    let nombre = formulario['nombre'].value;
    let apellidos = formulario['apellidos'].value;

    mensaje += nombre + ' ' + apellidos + '\n';




    // Estado Civil
    let estadoCivil = formulario['estadoCivil'].selectedOptions[0].innerText;

    mensaje += estadoCivil + '\n';




    // Idiomas
    let idiomas = '';
    for (let i = 1; i <= 3; i++)
    {
        if (document.getElementById('idioma' + i).checked)
        {
            idiomas += document.getElementById('idioma' + i).value + ', ';
        }
    }

    mensaje += idiomas.slice(0, -2) + '\n';





    // Profesión
    let profesion = '';
    for (let profOption_ of formulario['profesion'])
    {
        if (profOption_.checked)
        {
            profesion = profOption_.value;
            flag = true;
            break;
        }
    }

    mensaje += profesion + '\n';



    // Comentarios
    mensaje += formulario['comentarios'].value;



    if (flag)
    {
        alert(mensaje);
    }
    else{
        alert('No has introducido profesión');
    }
}

window.onload = function()
{
    console.log('Llenamos variables');
    formulario = document.getElementById('datosPersonales');

    console.log('Activamos botón');
    document.getElementById('mostrar_datos').onclick = mostrarDatos;
};