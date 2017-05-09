'use strict';
/* globals validarDni */

var txtMensajes, form;

const ID_BLOQUE1 = 'bloque1',
    ID_BLOQUE2 = 'bloque2';


function seleccionBloque()
{
    let sBloque = form['s-bloque'];

    ocultarBloques();

    mostrarBloque("bloque" + sBloque.value);

}

function ocultarBloques()
{
    ocultarBloque(ID_BLOQUE1);
    ocultarBloque(ID_BLOQUE2);
}

function ocultarBloque(idBloque_)
{
    let bloque = document.getElementById(idBloque_);

    if (bloque != null)
    {
        bloque.style.display = "none";
    }
}

function mostrarBloque(idBloque_)
{
    let bloque = document.getElementById(idBloque_);

    if (bloque == null)
    {
        txtMensajes.value = 'Opción no válida \uD83C\uDF44';
    }
    else
    {
        txtMensajes.value = '';
        bloque.style.display = "block";
    }
}

function envioForm()
{
    // alert('On Submit');

    // Recogemos el elemento del formulario.  Podemos hacerlo a través de getElementById
    // o a través del name introduciéndolo en el array del form.  Esta opción está bien
    // porque permite hacerlo formulario a formulario
    let txtDni = form['txt-dni'];
    let dni = txtDni.value;

    if (validarDni(dni))
    {
        //alert('Correcto');
        txtMensajes.value = 'Correcto';
        // Envía el formulario
    }
    else
    {
        //alert('Incorrecto');
        txtMensajes.value = 'DNI Incorrecto';
        // Con un return false cancela el envío del formulario
        return false;
    }
}

function pruebasForm()
{

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

    //console.log('FUNTZIONO (btnPruebas.onclick)'); // console.log estúpido
    //document.getElementById('texto').value = 'HOOOLA';

    if (user.value == '')
    {
        txtMensajes.value = 'El nombre está vacío 😠';
    }
    else
    {
        txtMensajes.value = 'Hola ' + user.value + ', encantado.';
    }

    // Esto está escrito a lo guarro, mejor hacer variables para que esté más limpios.
    // Lo mejor es parsar los bloques a variables para que queden más limpios
    // document.getElementById('texto').value = 'Hola ' + document.getElementById('name').value + ', encantado.';


}

function cubitoMove()
{
    let cubito = document.getElementById('cubito');

    cubito.onclick = function()
    {
        if (cubito.className == 'cb1')
        {
            cubito.className = 'cb2';
        }
        else
        {
            cubito.className = 'cb1';
        }
    };
}

window.onload = function()
{

    // al cargar página ocultamos los elementos
    ocultarBloques();

    // Rellenamos variables
    txtMensajes = document.getElementById('texto');
    form = document.forms[0];

    // Cargamos el botón clear y le ponemos el clear :)
    document.getElementById('btn-clear').onclick = () => console.clear();

    // Funcion Pruebas
    let btnPruebas = document.getElementById('btn-pruebas');
    btnPruebas.onclick = pruebasForm;



    /*--- VAMOS A ATACAR AL FORMULARIO ---*/

    // Podemos recoger todos los formularios y luego elegir el único que tenemos
    // Es una forma rápida de llegar hasta él si no hay más formularios implicados.

    // El evento onsubmit ocurre antes de enviar los datos, pero una vez termine el código
    // continua con el formulario
    form.onsubmit = envioForm;


    let sBloque = form['s-bloque'];
    sBloque.onchange = seleccionBloque;

    // eventos de navegador seleccionar objetos...
    // Pero no tiene que se por hacer eventos del ratón, puede ser con tabulador, javascript...
    // Es MIL veces mejor :)
    sBloque.onfocus = () =>
    {
        console.log('enfoco');
    };

    sBloque.onblur = () =>
    {
        console.log('desenfoco');
    };

    form['txt-dni'].onblur = function(){
        
        if ( validarDni(form['txt-dni'].value))
        {
            txtMensajes.value = 'DNI CORRECTO';
        }
        else
        {
            txtMensajes.value = 'DNI INCORRECTO';
        }
    }



    cubitoMove();



};

// ESTO SE USA MUY POCO
window.onunload = function()
{
    // no permite alertas en el unload porque es muy peligroso.
    alert('no me cierres');
};