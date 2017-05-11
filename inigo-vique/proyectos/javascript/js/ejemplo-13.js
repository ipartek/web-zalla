'use strict';

window.onload = function()
{

    let btnCrearElemento = document.getElementById('btn-crear-elemento');
    let btnCrearMensaje = document.getElementById('btn-crear-mensaje');
    let btnCrearModal = document.getElementById('btn-crear-modal');
    let bloqueCreaciones = document.getElementById('bloque-creaciones');
    let inText = document.getElementById('in-text');

    btnCrearMensaje.onclick = crearMensaje;
    btnCrearModal.onclick = crearModal;

    btnCrearElemento.onclick = function()
    {

        if (bloqueCreaciones.childElementCount == 1)
        {
            bloqueCreaciones.removeChild(bloqueCreaciones.children[0]);
        }

        let div = document.createElement('div');
        let h1 = document.createElement('h1');
        let p = document.createElement('p');

        div.style.backgroundColor = 'darkgray';
        div.style.padding = '2em 4em';

        h1.innerText = inText.value;
        p.innerText = inText.value.repeat(10);
        div.appendChild(h1);

        for (let i = 0; i < 25; i++)
        {
            div.appendChild(p.cloneNode(true));
        }

        bloqueCreaciones.appendChild(div);

        inText.value = '';
        inText.focus();
    };

};

function crearMensaje()
{

    if (document.getElementById('soyLaDiv'))
    {
        document.body.removeChild(document.getElementById('soyLaDiv'));
    }

    let div = document.createElement('div');

    div.id = 'soyLaDiv';

    div.style.backgroundColor = createColor();
    div.style.position = 'fixed';
    div.style.display = 'block';
    div.style.top = '30px';
    div.style.right = '30px';
    div.style.height = (screen.availHeight / 5) + 'px';
    div.style.width = (screen.availWidth / 5) + 'px';
    div.style.zIndex = '100';

    document.body.appendChild(div);
}

function createColor()
{

    let colorArray = new Array();

    for (let i = 0; i < 3; i++)
    {
        let color = parseInt(Math.random() * 255);

        colorArray.push(color);
    }

    let masterColor = 'rgba(' + colorArray[0] + ', ' + colorArray[1] + ', ' + colorArray[2] + ', 0.9)';

    return masterColor;

}

function crearModal()
{
    var divFondo = document.createElement('div');

    divFondo.id = 'divFondo';

    divFondo.style.backgroundColor = 'rgba(50,50,50,0.8)';
    divFondo.style.position = 'fixed';
    divFondo.style.display = 'block';
    divFondo.style.top = '0';
    divFondo.style.left = 0;
    divFondo.style.height = (window.innerHeight) + 'px';
    divFondo.style.width = (window.innerWidth) + 'px';
    divFondo.style.zIndex = '130';

    document.body.appendChild(divFondo);


    var x, y, alto, ancho;

    alto = window.innerHeight / 2;
    ancho = window.innerWidth / 2;

    x = ancho / 2;
    y = alto / 2;

    var divMensajes = document.createElement('div');

    divMensajes.id = 'divMensajes';

    divMensajes.style.backgroundColor = createColor();
    divMensajes.style.position = 'fixed';
    divMensajes.style.display = 'block';
    divMensajes.style.top = y + 'px';
    divMensajes.style.left = x + 'px';
    divMensajes.style.height = alto + 'px';
    divMensajes.style.width = ancho + 'px';
    divMensajes.style.zIndex = '150';
    divMensajes.style.textAlign = 'center';
    divMensajes.style.paddingTop = alto / 4 + 'px';
    divMensajes.style.boxSizing = 'border-box';
    divMensajes.style.color = 'white';
    divMensajes.style.fontSize = '1em';

    divMensajes.innerHTML = '<h1>ERES UN MENDRUGO<h1>';

    var boton = document.createElement('button');

    divMensajes.appendChild(boton);

    boton.innerText = 'CIERRAME';

    boton.onclick = () =>{
        divFondo.parentNode.removeChild(divFondo);
    }

    divFondo.appendChild(divMensajes);
    

}