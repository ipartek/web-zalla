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

function ejemplosSentenciasControl() {
    var edad = parseInt(prompt('Dime tu edad'));

    if (edad >= 0 && edad <= 99) {
        if (edad >= 18) {
            console.log("PASA");
            console.log("Bienvenido a la discoteca");
        } else {
            console.log("ENANO... LO LLEVAS CRUDO");
        }
    } else {
        console.log("LA PROXIMA VEZ INTRODUCE UNA EDAD REAL EN NÚMERO, PEAZO ...");
    }

    var nivel = 6;

    switch (nivel) {
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
            console.log("Nivel desconocido");
    }

    var mes = 4,
        dias;

    if (mes >= 1 && mes <= 12) {
        switch (mes) {
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
        }
    } else {
        console.log("MES NO VÁLIDO");
    }

    if (mes < 1 || mes > 12) {
        console.log("MES NO VÁLIDO");
    } else if (mes == 2) {
        dias = 28;
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        dias = 30;
    } else {
        dias = 31;
    }
    
    var n = 0;
    
    while(n < 2) {
        //console.log(n = n + 1);
        console.log(++n);
        //alert(n);
    }
    
    do {
        edad = parseFloat(prompt("Dime tu edad"));
        
        if(edad >= 18 && edad <= 200){
            console.log("Eres mayor de edad y tienes " + edad + " años");
        } else if(edad < 18 && edad >= 0) {
            console.log("Eres menor de edad con " + edad + " años");
        } else if(isNaN(edad)) {
            console.log("La próxima vez intenta con un número listillo");
        } else
            console.log("No me creo tu edad");
        
    } while(isNaN(edad) || edad < 0 || edad > 200);
    
    var m = 1;
    while(m <= 10) {
        console.log("While: " + m);
        m++;
    }
    
    for(var n = 1; n <= 10; n++){
        console.log("For: " + n);
        
        if(n % 5 == 0) {
            console.log("ENCONTRADO");
            break;
        }
    }
    
    var encontrado = false;
    
    for(var n = 1; n <= 10 && !encontrado; n++){
        console.log("For: " + n);
        
        if(n % 5 == 0) {
            console.log("ENCONTRADO");
            encontrado = true;
        }
    }
    
    for(var x = 5, y = 7; x * y <= 100; x *= 2, y += 3){
        console.log(x, y);
    }
    
    for(var n = 1; n <= 10; n++){
        
        if(n % 5 == 0) {
            console.log("ENCONTRADO");
            continue;
        }

        console.log("For: " + n);
    }
    
    for(var n = 1; n <= 10; n++){
        
        if(n % 5 == 0) {
            console.log("ENCONTRADO");
        } else {
            console.log("For: " + n);
        }
    }

    
//    while(true){
//        
//    }
//    
//    for(;;){
//        
//    }
        
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
