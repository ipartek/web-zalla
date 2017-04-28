function saludo() {
    alert('Hola desde JS');
    alert('Hola pepe');

}
window.onload = alCargar;

function alCargar() {
    //saludo();
    var boton = document.getElementById('btnSaludar');
    boton.onclick = saludo;
}


/*function mensajePepito() {
    alert(boton2.innerHTML);
    alert('PRUEBA');
    var boton2 = document.getElementById('pepito');
    boton2.onclick = mensajePepito;

}*/
a.onclick = fechaYHora;

function fechaYHora() {
    var boton = document.getElementById('fechayhora').innerHTML = Date();


}
}
