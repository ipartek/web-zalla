var boton;

window.onload = alCargar;


function saludo(){
    
    var n;
    n=2;
    
    var nombre;
    nombre="joel";
    
    alert(n +" "+nombre);    
    alert(boton.innerHTML);
 }


function alCargar(){
    //saludo();
    
    boton = document.getElementById("btnSaludar");
    
    boton.onclick =saludo;
    
}




