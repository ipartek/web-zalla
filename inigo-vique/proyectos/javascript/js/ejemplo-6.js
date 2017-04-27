'use strict';

function activateButtons()
{
    document.getElementById('btn-1').onclick = f_btn1;
    document.getElementById('btn-2').onclick = f_btn2;
    document.getElementById('btn-3').onclick = f_btn3;
    document.getElementById('btn-4').onclick = f_btn4;
    document.getElementById('btn-5').onclick = f_btn5;
    document.getElementById('btn-6').onclick = f_btn6;
    document.getElementById('btn-7').onclick = f_btn7;
    document.getElementById('btn-8').onclick = f_btn8;
    document.getElementById('btn-9').onclick = f_btn9;
    document.getElementById('btn-10').onclick = f_btn10;
    document.getElementById('btn-11').onclick = f_btn11;
    document.getElementById('btn-12').onclick = f_btn12;
    document.getElementById('btn-13').onclick = f_btn13;
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

function f_btn6()
{
    console.info("IF CON ELSE IF");

    let edad = prompt("dame tu edad");

    if (edad >= 18)
    {
        console.log("PASA");
        console.log(" BIENVENIDO A LA DISCO ");
    }
    else if (edad <= 99)
    {
        console.log(" DEMASIADO VIEJO ");
    }
    else
    {
        console.log(" ¡NO PASAS MENDRUGO º(`o´)º! ");
    }

}

function f_btn7()
{

    console.info("SWITCH");

    let nivel = 3;

    switch (nivel)
    {
        case 1:
            console.log("Nivel 1");
            break;
        case 2:
            console.log("Nivel 2");
            break;
        case 3:
            console.log("Nivel 3");
            break;
        default:
            console.log("NIVEL DESCONOCIDO");
            break;
    }

    // NUNCA OLVIDAR EL BREAK
    // Se entra por el case y se sale por el break. Se ejecuta todo hasta que encuentre
    // un break;

}

function f_btn8()
{
    console.info("SWITCH CON GRUPOS MULTIPLES");

    let mes = 9,
        dias;

    switch (mes)
    {
        case 2:
            dias = 28;
            break;

        case 4:
        case 6:
        case 9:
        case 11:
            dias = 30;
            break;

        default:
            dias = 31;
            break;
    }

    // UML - Diagramas de flujo
    console.log(dias);
}

function f_btn9()
{
    console.info("WHILE");

    let n = 1;

    while (n <= 10)
    {
        // CUIDADO CON LOS BUCLES INFINITOS;
        console.log(n++);
    }
}

function f_btn10()
{
    console.info("DO WHILE");

    // LA FUNCIÓN SIEMPRE SE HACE AL MENOS UNA VEZ.

    do {
        var edad = parseFloat(prompt('introduce una edad'));

        if (edad >= 18 && edad <= 110)
            console.log('Eres mayor de edad');
        else if (edad < 18 && edad >= 0)
            console.log('Eres menor de edad');
        else if (isNaN(edad))
        {
            console.log("Esto no es un numero");
        }
        else
            console.log('Edad falsa');

    }
    while (isNaN(edad) || edad < 0 || edad > 110);
}

function f_btn11()
{
    console.info("FOR");

    for (let i = 1; i <= 10; i++)
    {
        console.log("FOR PRIMERO: " + i);
    }

    // Pueden declararse multiples variables y multiples operaciones.
    // MOLA pero es una guarrada :)
    for (let i = 2, j = 1; i * j <= 100; i += 2, j++)
    {
        console.log("FOR SEGUNDO: " + i + "   " + j);
    }

    for (let i = 1; i <= 10; i++)
    {
        console.log("FOR TERCERO: " + i);

        if (i == 5)
        {
            // rompe la cadena
            // Todo el código por debajo de éste no se lee, el for
            // se rompe.
            break;
        }
        // USAR EL BREAK ES PELIGROSO. Solo usos excepcionales
    }

    for (let i = 1; i <= 10; i++)
    {

        if (i == 5)
        {
            console.log("ENCONTRADO");
            continue;
            // no hace nada de codigo a partir de aqui pero
            // no sale del bucle
        }

        console.log("FOR CUARTO: " + i);

        // USAR EL BREAK ES PELIGROSO. Solo usos excepcionales
    }



    // En un FOR se pueden omitir las tres partes
    /*
     *  for(;;)
     *  {
     *      // BUCLE INFINITO. Si no le das la condicion es un true
     *  }
     * 
     *  while(true)
     *  {
     *      // BUCLE INFINITO. Es lo mismo que el anterior;
     *  }
     * 
     */

}

function f_btn12()
{
    console.info("CONFIRM");

    console.log(confirm("COMO TE LLAMAS"));
}

function f_btn13()
{
    console.log(Math.random());
}

window.onload = activateButtons;