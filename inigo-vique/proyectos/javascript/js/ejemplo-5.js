'use strict'; // ECMASCRIPT 5

// Las constantes pueden ser globales o locales.
// no va a cambiar de valor en la ejecución del programa.
const IVA_STANDARD = 0.21;

// LAS VARIABLES NO EMPIEZAN POR NUMERO
// existen palabras reservadas :S.

function inicial() {
    let n;
    n = 2;

    let texto = 'Javier'; // || "Javier"

    // Limpiamos la consola.
    console.clear();

    // es el elemento para mostrar la consola.
    //alert("texto\nmás \'texto\' \\\' &lt;")
}

function btn2func()
{
    //let a = prompt("a");
    //let b = prompt("b");

    let x = 0;

    console.log("x: " + x);

    console.log("x++: " + x++);

    console.log("x: " + x);

    console.log("++x: " + ++x);

    console.log("x: " + x);
}

function btn3func(){

    let arreglado = true;

    let texto = arreglado ? "Arreglado" : "Estropeado";
    //          EXPRESION ? RESULTADO_TRUE : RESULTADO_FALSE;
    //  Operador ternario.

    console.log(texto);

}

function doOnLoad() {
    let myBtn = document.getElementById('btn-main');
    let btn2 = document.getElementById('btn-2');
    console.log(myBtn);
    myBtn.onclick = inicial;
    btn2.onclick = btn2func;
    document.getElementById('btn-3').onclick = btn3func;
}

/* Secuencias de escape
 *
 * \n   Enter
 * \t   Tabulador   
 * \"   Comillas dobles
 * \'   Comillas simples
 * 
 * Para que las \ no se escapen, simplemente tenemos que duplicarlas
 * \\
 * 
 * Los escapes de HTML no funcionan :)
 * 
 */

/*
 *  + - * /
 *  % : el resto de una división. Sirve para saber si son múltiplos
 *  // a^b XOR // a&b AND // a|b OR // ~a INVERSO ( OPERADORES A NIVEL DE BITS )
 * 
 */


/*
 * parseInt().  Sirve para parsear un string en un número.
 * 
 * Los números precedidos por 0, es un número octal.
 * 010 será 8
 * Si supera los números de octal (0-7) el número saldrá normal.
 * 
 * parseInt( numero : string, base : int).
 * 
 * https://developer.mozilla.org/es/docs/Web/JavaScript/Referencia/Objetos_globales/parseInt
 * 
 * SIEMPRE PONER LA BASE
 * 
 */

/*
 * x++ y ++x son cosas diferentes.
 * 
 * x++ primero devuelve el valor y luego lo incrementa POSTINCREMENTO
 * ++x primero incrementa el valor y después lo devuelve PREINCREMENTO
 * 
 * En líneas sueltas da bastante igual, en sentencias es donde el orden importa
 */ 

/*
 * Operadores de comparación
 * 
 *  a == b IGUALES
 *  a === b ESTRICTAMENTE IGUAL. Tienen que tener el mismo tipo.
 *  a != b DISTINTO
 *  a !== b ESTRICTAMENTE DISTINTO
 *  a > b // a < b // a >= b // a <= b
 * 
 *  true es igual a 1 ; false es igual a 0;
 *  Cualquier numero distinto de 0 es true.
 * 
 * Operadores lógicos
 *  a && b y
 *  a || b o
 *  !a no a
 * 
 *  TRUCO CONVERTIR COSAS A BOOLEANO !!1. Es IGUAL A TRUE :).
 * 
 */ 

window.onload = doOnLoad;