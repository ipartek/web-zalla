 function saludo() { alert("Hola mundo!"); }

 function alCargar() {
     saludo();

     var boton = document.getElementById("btnSaludar");
     boton.onclick = saludo;
 }

 window.onload = alCargar;
