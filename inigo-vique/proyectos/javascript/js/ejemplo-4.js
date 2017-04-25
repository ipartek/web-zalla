'use strict'
// use strict 
// añadido a los navegadores para obligar a los navegadores a ejecutar el código en modo estricto
// por ejemplo: LAS VARIABLES TIENEN QUE SER DECLARADAS

var myBtn;

function saludo()
{
    alert('hola');
}

function doOnLoad()
{

    //saludo();

    // poner var o let es opcional
    myBtn = document.getElementById('btn-saludar');

    myBtn.onclick = saludo;
}


/*  evento de carga de página */
window.onload = doOnLoad;

// Da igual declarar las funciones antes de ser llamadas o no, los parsers las cogen
