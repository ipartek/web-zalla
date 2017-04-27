 'use strict';
var boton;

window.onload=alCargar;
function saludo()

         {
             var n , N;
             n=2;
             var nombre='Aitor';
             nombre= prompt('Dime tu nombre');
            
             alert("Hola" + nombre);
             alert(n+5);
              alert(boton.innerHTML);
         }
         
function alCargar(){
    
saludo();
var boton= document.getElementById("btnSaludar");
    boton.onclick= saludo;
}
 