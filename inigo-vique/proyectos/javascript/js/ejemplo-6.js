'use strict'

function activateButtons()
{
    document.getElementById('btn-1').onclick = f_btn1;
    document.getElementById('btn-2').onclick = f_btn2;
    document.getElementById('btn-3').onclick = f_btn3;
    document.getElementById('btn-4').onclick = f_btn4;
    document.getElementById('btn-5').onclick = f_btn5;
}

function f_btn1()
{
    console.info("ESTRUCTURA IF");

    let estaEncendido = true;

    if (estaEncendido)
        console.log("ENCENDIDO");
}

function f_btn2()
{
    console.info("CON PROMPT");

    let edad = prompt("dame tu edad");

    if (edad >= 18)
        console.log("PASA");
}

function f_btn3()
{
    console.info("CON PROMPT Y ELSE");

    let edad = prompt("dame tu edad");

    if (edad >= 18)
        console.log("PASA");
    else
        console.log(" ¡NO PASAS MENDRUGO º(`o´)º! ");
}

function f_btn4()
{
    console.info("IF SIN LLAVES MAL");

    let edad = prompt("dame tu edad");

    if (edad >= 18)
        console.log("PASA");
    console.log(" BIENVENIDO A LA DISCO ");

    // esto sería así
    /*
     *  if (edad >= 18)
     *  {
     *      console.log("PASA");
     *  }  
     *  console.log(" ¡NO PASAS MENDRUGO º(`o´)º! ");
     */
}

function f_btn5()
{
    console.info("IF CON LLAVES MAL");

    let edad = prompt("dame tu edad");

    if (edad >= 18)
    {
        console.log("PASA");
        console.log(" BIENVENIDO A LA DISCO ");
    }
    else
    {
        console.log(" ¡NO PASAS MENDRUGO º(`o´)º! ");
    }

}

window.onload = activateButtons;