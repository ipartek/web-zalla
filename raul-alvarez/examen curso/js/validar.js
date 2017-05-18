var counter = 0;

function validar() {
    var txtErrorN = document.getElementById("nombre");
    var txtErrorD = document.getElementById("descripcion");
    var txtErrorP = document.getElementById("precio");
    var txtErrorS = document.getElementById("stock");
    var txtErrorF = document.getElementById("fecha");
    var muestraStock=1;
    var muestraPrecio=1;
    var toRemove;

    //-------------------------NOMBRE



    if (formulario.nombre.value.length == 0 && !txtErrorN.error) {
        //console.log('error');
        toRemove = document.getElementById('#errorNombre');
        if (toRemove) {
            toRemove.remove();
        }
        txtErrorN = document.getElementById("nombre");
        txtErrorN.error = span = document.createElement("span");
        span.setAttribute("id", "errorNombre");
        span.className = "error";
        span.innerHTML = " Dato erroneo";
        txtErrorN.parentNode.insertBefore(span, txtErrorN.nextSibling);
        counter++
        return false;
    } else if (formulario.nombre.value.length != 0 && txtErrorN.error) {
        //txtError = document.getElementById("nombre");
        ////txtError.error.parentNode.removeChild(txtError.error);
        toRemove = $('#errorNombre');

        toRemove.remove();
        counter--;
        //delete txtError.error;

    }
    //-------------------------DESCRIPCION
    if (formulario.descripcion.value.length == 0 && !txtErrorD.error) {
        //console.log('error');
        toRemove = document.getElementById('errorDescripcion');
        if (toRemove) {
            toRemove.remove();
        }
        txtErrorD = document.getElementById("descripcion");
        txtErrorD.error = span = document.createElement("span");
        span.setAttribute("id", "errorDescripcion");
        span.className = "error";
        span.innerHTML = " Dato erroneo";
        txtErrorD.parentNode.insertBefore(span, txtErrorD.nextSibling);
        counter++
        return false;
    } else if (formulario.descripcion.value.length != 0 && txtErrorD.error) {
        //txtError = document.getElementById("nombre");
        ////txtError.error.parentNode.removeChild(txtError.error);
        toRemove = $('#errorDescripcion');

        toRemove.remove();
        counter--;
        //delete txtError.error;

    }
    //--------------------------STOCK

    
    if ((parseInt(formulario.stock.value, 10) < 1) || (isNaN(formulario.stock.value))) {
        toRemove = document.getElementById('errorStock');
        if (toRemove) {
            toRemove.remove();
        }
        txtErrorS = document.getElementById("stock");
        txtErrorS.error = span = document.createElement("span");
        span.className = "error";
        span.setAttribute("id", "errorStock");
        span.innerHTML = " Dato erroneo";
        txtErrorS.parentNode.insertBefore(span, txtErrorS.nextSibling);
      
        muestraStock = 1;
        
        return false;

    } else if (parseInt(formulario.stock.value) > 1 && muestraStock == 1) {
        
        //txtError = document.getElementById("stock");
        toRemove = document.getElementById('errorStock');
        if(toRemove){
        toRemove.remove();
        }
        muestraStock = 0;
       
        
        //txtError.error.parentNode.removeChild(txtError.error);
        //delete txtError.error;
    }

     //--------------------------precio

    
    if ((parseFloat(formulario.precio.value, 10) < 1) || (isNaN(formulario.stock.value))) {
        toRemove = document.getElementById('errorPrecio');
        if (toRemove) {
            toRemove.remove();
        }
        txtErrorP = document.getElementById("precio");
        txtErrorP.error = span = document.createElement("precio");
        span.className = "error";
        span.setAttribute("id", "errorPrecio");
        span.innerHTML = " Dato erroneo";
        txtErrorS.parentNode.insertBefore(span, txtErrorS.nextSibling);
      
        muestraPrecio = 1;
        
        return false;

    } else if (parseInt(formulario.precio.value) > 1 && muestraPrecio == 1) {
        
        //txtError = document.getElementById("stock");
        toRemove = document.getElementById('errorPrecio');
        if(toRemove){
        toRemove.remove();
        }
        muestraPrecio = 0;
       
        
        //txtError.error.parentNode.removeChild(txtError.error);
        //delete txtError.error;
    }
    
    //-------------------------fecha
    

    if ((formulario.fecha.value == '')) {
        toRemove = document.getElementById('errorFecha');
        if (toRemove) {
    
            toRemove.remove();
        }
        txtErrorF = document.getElementById("fecha");
        txtErrorF.error = span = document.createElement("span");
        span.setAttribute("id", "errorFecha");
        span.className = "error";
        span.innerHTML = " Dato erroneo";
        txtErrorF.parentNode.insertBefore(span, txtErrorF.nextSibling);
        counter++;
        return false;
    } else if (formulario.fecha.value.length != 0 && txtErrorF.error) {
        //txtError = document.getElementById("fecha");
        //txtError.error.parentNode.removeChild(txtError.error);
        toRemove = document.getElementById('errorFecha');
        toRemove.remove();
        counter--;
        //delete txtError.error;
    }




    salir();

}




function salir() {


        alert("Formulario correcto !!");
        //location.reload();

        if (confirm("Seguro Que Quieres añadirlo?")) {

            alert("Registro añadido.");
            $("#cajaFormulario").css("display", "none");
            $(".btnOcultar").css("display", "none");



        } else {
            $("#cajaFormulario").css("display", "none");
            $(".btnOcultar").css("display", "none");

        }


}
