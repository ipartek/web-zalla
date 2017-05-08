'use strict';

window.onload = function()
{

    // Cargamos el botón clear y le ponemos el clear :)
    document.getElementById('btn-clear').onclick = () => console.clear();

    // Guardamos el "input" name en una variable usuario
    let user = document.getElementById('name');
    let password = document.getElementById('password');

    // Comprobamos el contenido del usuario.
    console.group('USUARIO DESNUDO');
    console.log(user);
    console.groupEnd();

    console.group('CONTENIDO DEL USUARIO');
    console.log('user.name: ', user.name);
    console.log('user.placeholder: ', user.placeholder);
    console.groupEnd();

    let btnPruebas = document.getElementById('btn-pruebas');

    btnPruebas.onclick = function()
    {
        //console.log('FUNTZIONO (btnPruebas.onclick)'); // console.log estúpido

        //document.getElementById('texto').value = 'HOOOLA';

        if (user.value == '')
        {
            document.getElementById('texto').placeholder = 'El nombre está vacío';
        }
        else
        {
            document.getElementById('texto').value = 'Hola ' + user.value + ', encantado.';
        }


        // Esto está escrito a lo guarro, mejor hacer variables para que esté más limpios.
        // Lo mejor es parsar los bloques a variables para que queden más limpios
        // document.getElementById('texto').value = 'Hola ' + document.getElementById('name').value + ', encantado.';
    };




    /* - BASURA */

    document.getElementsByClassName('cb1')[0].onclick = function()
    {
        console.log('PULSADO');
        document.getElementsByClassName('cb1')[0].className = 'cb2';
    };


};