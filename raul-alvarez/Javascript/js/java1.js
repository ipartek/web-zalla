 'use scipt';

 var boton;

 window.onload = alCargar;

 function saludo() {

     /*Ejemplo de programacion basica
     vamos a ver variables y sentencas de 
     control*/

     var n;
     n = 2;

     //Declaracion de variable de texto
     //otra linea

     var nombre = 'javier';


     alert('hola desde javacript');
     alert(boton.innerHTML);
 }

 function alCargar() {
     //saludo();
     boton = document.getElementById('btnSaludar');
     boton.onclick = saludo;
 }
