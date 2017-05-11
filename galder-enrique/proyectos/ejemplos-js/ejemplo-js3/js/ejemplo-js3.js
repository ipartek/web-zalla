 window.onload = alCargar;

 function alCargar() {
     var total;
     var x, y;

     x = pedirEnteroRepetir("Define la X");
     y = pedirEnteroRepetir("Define la Y");

     total = sumar(x, y);
     if (total != null) {
         escribir("La suma de " + x + " y " + y + " es " + total);
     } else {
         escribir("Ha habido un error");
     }

 }
 
 function pedirEnteroRepetir(textoMensaje) {
     var dato, entero;
     var noEsEntero;
     do {
         dato = prompt("Este cuadro sólo acepta números enteros\n" + textoMensaje);
         if (dato == null) {
             return null;
         }
         entero = parseInt(dato);
         noEsEntero = isNaN(entero);
         if (noEsEntero) {
             escribir("El dato introducido es inválido");
         }
     } while (noEsEntero);
     return entero;
 }

 // function pedirEntero(textoMensaje) {
 //     var dato = prompt(textoMensaje);
 //     var entero = parseInt(dato);

 //     if (isNaN(entero)) {
 //         return null;
 //     }
 //     return entero;
 // }

 

 function sumar(a, b) {
     if (isNaN(parseInt(a)) || isNaN(parseInt(b)))
         return null;
     return a + b;

 }
function escribir(textoMensaje) {
     console.log(textoMensaje);
 }