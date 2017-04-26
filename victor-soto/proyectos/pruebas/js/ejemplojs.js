'use strict'; //ECMAScript 5

var boton;

const IVA_ESTANDAR = 0.21; //Constante. Se suelen poner en mayusuculas

window.onload = alCargar; //Permite la llamada sin los parentesis

function alCargar() {
    //saludo();
    boton = document.getElementById('btnSaludar');
    boton.onclick = saludo;
    boton.style.color = 'red';
    document.getElementsByClassName("despues")[0].style.backgroundColor = 'red';
    sentenciasControl();
}

function saludo() {
    var n;
    n = 2;

    //Declaración de variable de texto
    var nombre = 'Javier'; //"Javier" Se puede escribir tanto con un ' como con "

    nombre = prompt('Dime tu nombre'); //Cuadro donde introduces el contenido y se guarda en la variable

    console.log('Hola ' + nombre); //Texto que aparece en la consola para mostrar la ejecución
    console.log('Hola Pepe');
    console.log(boton); //Muestra el objeto de manera literal. Todo el contenido que tenga
    //alert(boton.innerHTML);

    //console.log(numero, Numero); //Muestra el contenido de las dos variables

    console.clear(); //Limpia la consola

    console.log("C:\\nuevos\\trabajos"); //Se deben de poner dos "\" para poder mostrar la ruta por consola.
    //Si no se realiza así "\n" lo consideraría enter

    // \n enter
    // \' permite meter apostrofes
    // % resto

    // a&b a|b a^b ~a
    // & and. Multiplicación lógica de bits
    // | suma lógica
    // ^ xor
    // ~ ponme un número detras y... calcula el número contrario de un positivo uno más en negativo
    //si es en negativo uno menos en positivo (~5 resultado -6. ~-5 resultado 4)

    //parseInt(prompt('b'), 10); Coge el texto y lo convierte en número entero de base 10.
    //Lo que este dentro del primer campo parseInt('', 10) el primer campo tiene que ir entre "'"
    //para especificar que es texto, sino ya sería número.
}

function ejemploOperadores() {
    // x = x * 2; es lo mismo que x *= 2;

    var x = 0;

    //x++ aumenta la cantidad de la variable en 1

    console.log(x++); //Posincremento. Primero muestra el valor y luego lo incrementa
    console.log(x);


    x = 0;

    console.log(++x); //Preincremento. Primero incrementa el valor y luego lo muestra
    console.log(x);

    var arreglado = true;
    //Si arreglado (Operador para esa condición "?")
    //igual a true "Arreglado", else "Estropeado"
    var texto = arreglado ? "Arreglado" : "Estropeado";

    console.log(texto);

    //==      igual a
    //!=      distinto de
    //>       mayor que
    //>=      mayor que o igual a
    //<       menor que
    //<=      menor que o igual a
    //===	  estrictamente igual. Similar al == de Java
    //!==	  estrictamente diferente
    //&&	  iguales
    //||	  uno u otro
    //!		  contrario

    //!!	  convierte cosas a booleano

    // 0 == "0" daria true. Transforma el texto como número y al ser iguales devuelve true

    var prueba = 1;

    if (prueba > -1 && prueba < 16) {
        prueba = "Correcto";
    } else {
        prueba = "Incorrecto";
    }

    console.log(prueba);

    var x = -1,
        min = 0,
        max = 15;
    console.log(min <= x && x <= max);
}

function sentenciasControl() {
    var edad = prompt("Dime tu edad");

    if (edad >= 18) {
        console.log("Pasa");
    } else {
        console.log("Prohibido");
    }

    //if(edad>=18); Sentencia vacia. Si edad >= 18 no hagas nada

    do {
        edad = promt("Dime tu edad");
    }
    while (edad >= 18)
    /*
    function prueba() {
        document.getElementById("antes").style.color = "#CCCCCC";
        document.getElementsByClassName("despues")[0].style.backgroundColor = "#EE0000";
    }*/
}
