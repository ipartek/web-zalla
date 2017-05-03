window.onload = alCargar;

 function alCargar(){
     var total, x, y;
     
     x = pedirEntero("Dime la X :");
     y = pedirEntero("Dime la Y :");

    total= sumar(x,y);
     if total != null¨{
     alert("La suma de "+ x +"y" + y+ "es" +total+);}
           else{
           escribir("Ha habido un error");
           }
 }



function sumar(a,b){
   if (isNaN(parseInt(a))|| isNaN(parseInt(b)))
       return null;
         
 return a+ b;   
}
     
function pedirEnteroRepetir(textoMensaje){
    var data, entero;
    var noEsEntero;
    do{
        dato= promp("Este cuadro solo acepta enteros\n" + textoMensaje);
        if (dato== null)
            return null;
        entero= parseInt(dato);
        noEsEntero= isNaN(entero);
        if(noEsEntero)
            escribir("El dato qie has escrito no es entero";)
    }
    whil(noEsEntero);
    return entero;
    }