"use strict";

window.onload = alCargar;

function alCargar(){
    var total, x, y;
    
    x = pedirEnteroRepetir("Introduce x");
    y = pedirEnteroRepetir("Introduce y");
    
    total = sumar(x,y);
    
    if (total != null){
        escribir("la suma entre "+x+ " y "+y+" es:"+total);
    }else{
        return pedirEnteroRepetir;
    }
}
function sumar(a, b){
    //Return devuelve el valor a suma de arriba
    return a + b;        
}

function pedirEntero(textoMensaje){
    var dato = prompt(textoMensaje);
    var entero = parseInt(dato);
    
    if(isNaN(entero))
        return null;
    return entero;
}

function pedirEnteroRepetir(textoMensaje){
    var dato;
    var entero, noEsEntero;
    
    do{
        dato = prompt("Solo se aceptan numero ENTEROS\n" + textoMensaje);
        
        if(dato == null)
            return null;
        
        entero = parseInt(dato);
        
        noEsEntero =isNaN(entero);
        
        if(noEsEntero)
            escribir("El dato que has escrito no era entero");
        
    }while (isNaN(entero));
    return entero;
}
function escribir(textoMensaje){
    console.log(textoMensaje);
}