"use strict";

window.onload = function(){
    console.clear();
    //sirve para que el navegador te pregunte que linea de script
    //quieres ejecutar
    //var resultado = eval(prompt("Dime que quieres que ejecute"));
    
    
    console.log(parseInt("5", 10));
    console.log(parseFloat("5,5", 10));
    console.log(isNaN(parseInt("asfagagas", 10)));
    
    
    //CONCATENA LO QUE INTRODUZCAS
    var a = prompt("introduce a");
    console.log(a); //en negro indica que es texto en la consola
    var b = prompt("introduce b");
    console.log(b); //en negro indica que es texto en la consola
    
    var suma = (a+b);
    
    console.log(suma);
    
    //SUMA LO QUE INTRODUZCAS
    var x = parseInt(prompt("introduce x"));
    console.log(x); //en azul indica que es numero en la consola
    var y = parseInt(prompt("introduce y"));
    console.log(y); //en azul indica que es numero en la consola
    
    var suma2 = (x+y);
    
    console.log(suma2);
    
    
};
    //FUNCION ANONIMA


(function(){
    var x = 5;
    alert(x);
})();

