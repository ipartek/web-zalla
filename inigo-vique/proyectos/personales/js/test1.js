'use strict';

window.onload = () =>
{

    let leftBtns = document.getElementsByClassName('click-left');

    for (let leftBtn_ of leftBtns)
    {
        leftBtn_.onclick = moveLeft;
        
    }

};

function moveLeft()
{
    console.log( this.parentNode.className);
    this.parentNode.className = 'left';

    this.parenNode.addEventListener("animationend");
}