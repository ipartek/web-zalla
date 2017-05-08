// Para que Jquery no de por culo
/* globals $ */

var header = document.getElementsByTagName('HEADER'),
    footer = document.getElementsByTagName('FOOTER'),
    main = document.getElementsByTagName('MAIN');

function modificador()
{
    //console.log(header[0].clientHeight);

    let height = window.innerHeight - footer[0].clientHeight - header[0].clientHeight;

    let leftImage = $('.left-image');

    $(leftImage).height(70);
    let blockHeight = $(leftImage.parent()).height();
    $(leftImage).height(blockHeight);

    main[0].style.height = height + 'px';
}


window.onload = function()
{

    modificador();
    window.onresize = modificador;

};