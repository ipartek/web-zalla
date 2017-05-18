if(Modernizr.flash) {
    alert("Tenemos Flash");
    
    if(Modernizr.flash.blocked)
        alert("Flash está bloqueado");
    else
        alert("Flash está disponible");
} else {
    alert("No tenemos Flash");
}