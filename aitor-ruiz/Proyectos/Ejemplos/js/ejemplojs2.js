'use strict'; //ECMAScript 5

var boton;

const IVA_ESTANDAR = 0.21;

window.onload = alCargar;

function saludar() {
    var nombreIntroducido = prompt('Dime tu nombre');

    alert('Hola que tal\nO\'Hara dice que tu nombre es "' + nombreIntroducido + '"'); // Hola Javier
}

function ejemplosHastaOperadores() {
    /*
    Ejemplo de programación básica
    Vamos a ver variables y sentencias de control
    */

    console.clear();

    var numero, Numero = 3,
        otra;

    console.log(numero, Numero, otra);

    numero = 50000.3;

    console.log(numero, Numero, otra);

    // Declaración de variable de texto
    var nombre = 'Javier'; //"Javier";

    var niño = "Asier";

    console.log(numero + 5); // 7

    numero = "Pepe";

    console.log(numero);

    console.log(boton);

    console.log("C:\\nuevos\\trabajos");

    console.log(boton.innerHTML);

    var estaActivado = true; // false

    console.log(estaActivado);

    var precio = 100.0;
    var precioConIva = precio * IVA_ESTANDAR;

    console.log(precioConIva);

    var _for = 4;

    // a+b a-b a*b a/b a%b (resto de división entera) enteros o decimales
    // Math.pow(a,b) (a elevado a b)
    // a&b a|b a^b ~a (operadores a nivel de bits)

    var suma = 2 + 3 + 4 + 5;

    var a, b, c;

    //    a = parseInt(prompt('a'), 10);
    //    b = parseInt(prompt('b'), 10);
    //    c = parseInt(prompt('c'), 10);

    var raizCuadrada = Math.sqrt(b * b - 4 * a * c);

    var x1 = (-b + raizCuadrada) / (2 * a);
    var x2 = (-b - raizCuadrada) / (2 * a);

    //    alert('x1 = ' + x1 + ', x2 = ' + x2);

    console.log(a + b + c);

    a = b = c;

    var x = 0;

    //x = x + 1;

    //x += 1;

    console.log(x++);
    console.log(x);

    x = 0;

    console.log(++x);
    console.log(x);

    //x = x * 2;

    x *= 2;

    var arreglado = false;

    var texto = arreglado ? "Arreglado" : "Estropeado";

    console.log(texto);

    // a==b a!=b a>b a<b a>=b a<=b a===b a!==b
    // a&&b a||b !a

    var min = 0,
        max = 10;

    x = -5;

    console.log(min <= x && x <= max);

    x = 5;

    console.log(min <= x && x <= max);

    x = 15;

    console.log(min <= x && x <= max);
}

function ejemplosSentenciasControl() 
{
    var edad = parseInt(prompt('Dime tu edad'));

    if(edad >= 0 && edad <= 99)
    {
        if (edad >= 18)
        {
            console.log("PASA");
            console.log("Bienvenido a la discoteca");
        } 
        else 
        {
            console.log("ENANO... LO LLEVAS CRUDO");
        }
    }
    else    
    {
        console.log("LA PROXIMA VEZ INTRODUCE UNA EDAD REAL EN NÚMERO, PEAZO ...");
    }
    
}

function alCargar() {
    //saludar();

    var botonSaludar = document.getElementById('btnSaludar');

    botonSaludar.onclick = saludar;
    //document.getElementById('btnSaludar').onclick = saludar;

    boton = botonSaludar;

    //ejemplosHastaOperadores();
    ejemplosSentenciasControl();
}

/*for (var =1 ; n<=10; n++)
    console.log("For :" +n);*/



function AdivinarNum{
    
    var min = parseInt(prompt('Dame un número mímino'));
    var max = parseInt(prompt('Dame un número máximo'));
    var numerorandom = getRandomInt0(min,max);
    var intentos=0;
    do{
       var numerousuario = parseInt(prompt('Intenta adivinar el número')); 
        intentos++;
            
        
        if  (numerousuario > numerorandom)
            {
                alert("El número introducido es mayor")
            }
            
        else {
            alert("El número introducido es menor")
        }
        while (numerousuario =! numerorandom)
    }
}