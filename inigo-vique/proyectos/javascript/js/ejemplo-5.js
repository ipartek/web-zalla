'use strict';

function inicial()
{
    let n;
    n = 2;

    let texto = 'Javier' ; // || "Javier"

    console.log(texto);
}

function doOnLoad()
{
    let myBtn = document.getElementById('btn-main');
    myBtn.onclick = inicial;
}


window.onload = doOnLoad;