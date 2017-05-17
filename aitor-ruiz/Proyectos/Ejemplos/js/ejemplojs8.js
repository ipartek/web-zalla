var txtDni;

window.onload = function () {
    txtDni = document.getElementById("txtDni");

    document.forms[0].onsubmit = function() {
        if(validarFormDni()){
            var altoDisplay = window.innerHeight;
            var anchoDisplay = window.innerWidth;
            
            var divFondo = document.createElement("div");
            
            divFondo.id = "popupfondo";
            
            divFondo.style.backgroundColor = "rgba(50, 50, 50, 0.8)";
            divFondo.style.position = "fixed";
            divFondo.style.top = 0;
            divFondo.style.left = 0;
            divFondo.style.height = altoDisplay + "px";
            divFondo.style.width = anchoDisplay + "px";
            divFondo.style.zIndex = 10000;
            
            document.body.appendChild(divFondo);
            
            var x, y, alto, ancho;
            
            alto = altoDisplay / 2;
            ancho = anchoDisplay / 2;
            
            x = ancho / 2;
            y = alto / 2;
            
            var divMensaje = document.createElement("div");
            
            divMensaje.id = "popcuadromensaje";
            
            divMensaje.style.backgroundColor = "white";
            divMensaje.style.position = "fixed";
            divMensaje.style.top = y + "px";
            divMensaje.style.left = x + "px";
            divMensaje.style.height = alto + "px";
            divMensaje.style.width = ancho + "px";
            divMensaje.style.zIndex = 10001;
            divMensaje.style.textAlign = "center";
            divMensaje.style.fontSize = "2em";
            
            divFondo.appendChild(divMensaje);
            
            divMensaje.innerHTML = "<h1>ADVERTENCIA</h1><p>Toda información enviada a través de esta página.........</p>";
            
            var boton = document.createElement("button");
            
            boton.innerHTML = "ACEPTAR";
            boton.onclick = function () {
                divFondo.parentNode.removeChild(divFondo);
                document.forms[0].submit();
            };
            
            divMensaje.appendChild(boton);
        } 
        
        return false;
    };
    
    txtDni.onblur = validarFormDni;
};

function validarFormDni() {
    var ejecutarAction = false,
        dniCorrecto;
    dniCorrecto = ejecutarAction = validarDni(txtDni.value);

    if (!dniCorrecto && !txtDni.error) {
        txtDni.error = span = document.createElement("span");
        span.className = "error";
        span.innerHTML = "El DNI no es correcto";
        
        txtDni.parentNode.appendChild(span);
        //txtDni.parentNode.insertBefore(span, txtDni.nextSibling); // como un insertAfter
        
    } else if(dniCorrecto && txtDni.error) {
        txtDni.error.parentNode.removeChild(txtDni.error);
        delete txtDni.error; //txtDni.error = undefined; //txtDni.removeAttribute("error");
    }

    return ejecutarAction;
}
