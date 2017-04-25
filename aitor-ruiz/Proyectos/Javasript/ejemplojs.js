 'use strict';
var boton;

window.onload=alCargar;
function saludo()

         {
             var n;
             n=2;
            
             alert("Hola Pepe");
              alert(boton.innerHTML);
         }
         
function alCargar(){
    
saludo();
var boton= document.getElementById("btnSaludar");
    boton.onclick=saludo;
}

