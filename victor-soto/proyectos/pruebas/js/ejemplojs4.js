'use strict'

//Esto es una función anónima. En js se utilizan estas funciones
window.onload = function() {
    alert("Hola");
    //Cuidado al llamar a un eval en js. Ejecuta cualquier secuencia de js dentro del eval
    eval(prompt("Dime que quieres que ejecute"));
    //Transforma previamente el texto para que se pueda colocar en una URL
    console.log(escape("Javier Lete García"));
    //Transforma el texto url en texto normal
    console.log(unescape("Javier%20Lete%20Garc%EDa"));
    //Codifica en URI (No codifica los iguales)
    console.log(encodeURI("Javier Lete García="));
    console.log(decodeURI("Javier%20Lete%20Garc%C3%ADa="));
    //Trasforma los iguales que se introduzcas en un igual
    console.log(encodeURIComponent("Javier Lete García="));
    console.log(decodeURIComponent("Javier%20Lete%20Garc%C3%ADa="));
    //Transforma los elementos
    console.log("formula=" + encodeURIComponent("h*h=a*a+b*b"));
    console.log("formula=" + encodeURIComponent("h*h%3Da*a%2Bb*b"));

    console.log(parseInt("5", 10));
    console.log(parseFloat("7.3", 10));
    console.log(isNaN(parseInt("asdfasdf", 10)));

    //toFixed(2) //Texto para sacar con un redondeo correspondiente
    //Permite redondear bien un numero con el tercer decimal 5, al segundo decimal a 1 (2.005)
    Math.round(valor * 100) / 100


    var valor = 2.005;
    console.log(redondear(valor));
}

//Función que redonde bien un número con el tercer decimal 5, al segundo decimal a 1

function redondear() {
    return (Math.round(valor.*100) / 100).toFixed(2);
}

//Se pueden crear funciones de la siguiente manera
//Defino una función anonima. No solo la defino sino la ejecuto ahora mismo
/*
 (function(){
 	var x = 5;
	alert(x);
 })();
*/
//Sería igua que alert(x) solo.
//Se realiza para hacer una zona de aislamiento de variables. Fuera de esa zona
//la variable no se ejecuta. Desaparecerá
//Se puede enviar un atributo dentro de la propia llamada para utilizar dentor de la función
/*
 (function(ATRIBUTO){
 	var x = 5;
	alert(x);
 })(ATRIBUTO);
*/
