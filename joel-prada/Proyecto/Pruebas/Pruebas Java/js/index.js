
window.onload = alCargar;

function alCargar(){
    escribir("<pre>");
    escribir("Bienvenidos al juego adivina el numero");
    
    var numeroOculto = parseInt(Math.random()*100+1);
    
    escribir ("Acabo de pensar un numero")
    
    var numero = prompt("Introduce un numero para jugar")
    
    
    
    escribir("</pre>");
    
}

function escribir(texto){
   document.write(texto + "<br />");
}




