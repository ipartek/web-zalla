'use strickt';
window.onload = function () {
    //var resultado= eval(prompt("Dime que quieres que te ejecute : "))
    //console.log(resultado);
    //console.log(escape("Raul Alvarez Escalona"));
    //console.log(unescape("Raul%20Alvarez%20Escalona"));
    console.log(encodeURI("Raul Alvarez Escalona = "));
    console.log(decodeURI("Raul%20Alvarez%20Escalona = "));
    console.log("Formula = " + encodeURIComponent("h=a*a+b*b"));
    console.log("Formula = " + decodeURIComponent("h%3Da*a%2Bb*b"));

    //console.log(encodeURIComponent("Raul Alvarez Escalona="));
    //console.log(decodeURIComponent("Raul%20Alvarez%20Escalona%3D"));


    console.log(parseInt("5", 10));

    console.log(parseInt("7.3", 10));


    console.log(parseInt("AFH", 10));

    var a = prompt("A"); //5
    console.log("valor de  a " + a);
    console.log(a);
    var b = prompt("B"); //6
    console.log("valor de  b " + b);
    console.log(b);
    var suma = a + b; //56
    console.log("valor de a+b " + suma);
    console.log(suma);

    var x = parseInt(prompt("x"), 10);
    console.log("valor de  x " + x);
    console.log(x);
    var y = parseInt(prompt("y"), 10);
    console.log("valor de  y " + y);
    console.log(y);
    var suma2 = x + y;
    console.log("valor de x+y " + suma2);
    console.log(suma2);





};
