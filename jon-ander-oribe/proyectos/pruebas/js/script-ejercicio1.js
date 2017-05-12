   var btnSubmit = document.getElementById("enviar_datos");

   function mostrarDatos() {


       var nombreYApellidos = "NOMBRE: " + document.getElementById("nombre").value + "\n";
       nombreYApellidos += "APELLIDOS: " + datosPersonales.apellidos.value;
       var sexo = "SEXO: " + datosPersonales.sexo.options[datosPersonales.sexo.selectedIndex].text;
       var estadoCivil = "ESTADO CIVIL: " + datosPersonales.estadoCivil.options[datosPersonales.estadoCivil.selectedIndex].text;
       var dni = "DNI: " + document.getElementById("dni").value;
       var idioma = "IDIOMAS: ";
       var edad = "EDAD: " + document.getElementById("edad").value;


       if (idioma1.checked) {
           idioma += document.getElementById("idioma1").value;
       }
       if (idioma2.checked) {
           idioma += "," + document.getElementById("idioma2").value;
       }
       if (idioma3.checked) {
           idioma += "," + document.getElementById("idioma3").value;
       }

       var profesion = "PROFESION: ";
       var salida = false;
       var tasas = "TASAS: ";

       for (i = 0; i < datosPersonales.profesion.length && salida != true; i++) {
           if (datosPersonales.profesion[i].checked) {

               profesion += datosPersonales.profesion[i].value;
               var recorrido = i;



               switch (recorrido) {
                   case 0:
                       document.forms[0].tasas.value = "Autonomo: 15 euros";
                       tasas = "TASAS: 15 euros";
                       break;
                   case 1:
                       document.forms[0].tasas.value = "Cuenta ajena: 20 euros";
                       tasas = "TASAS: 20 euros";
                       break;
                   case 2:
                       document.forms[0].tasas.value = "Desempleado: 2 euros";
                       tasas = "TASAS: 2 euros"
                       break;
                   case 3:
                       document.forms[0].tasas.value = "Jubilado: 5 euros";
                       tasas = "TASAS: 5 euros";
                       break;
               }
               salida = true;
           }
       }




       var texto = "TEXTO: " + document.getElementById("comentarios").value;


       var msgFinal = nombreYApellidos + "\n" + edad + "\n" + sexo + "\n" + estadoCivil + "\n" + dni + "\n" + idioma + "\n" + profesion + "\n" + tasas + "\n" + texto;
       alert(msgFinal);

   }


   window.onload = function() {
       document.forms[0].nombre.focus();
   }

   function esFemenino() {
       if (document.forms[0].sexo.options.selectedIndex == 2) {
           document.getElementById("EstadoCivil").disabled = false;
       } else {
           document.getElementById("EstadoCivil").disabled = true;
           document.getElementById("EstadoCivil").value = 0;
       }
   }

   function validarEdad() {
       if (document.getElementById("edad").value < 1 || (isNaN(document.getElementById("edad").value))) {
           document.getElementById("edad").value = "Intentelo de nuevo";
           alert("Error");
           document.getElementById("edad").focus();

       }
   }

   function validarIdiomas() {
       if (document.forms[0].idioma1.checked == false && document.forms[0].idioma2.checked == false && document.forms[0].idioma3.checked == false) {
           alert("Rellena idiomas");
       }
   }

   function validarFecha() {
       if (document.getElementById("dia").value == "..." || document.getElementById("mes").value == "..." || document.getElementById("ano").value == "...") {
           alert("Falta una fecha valida");
       }
   }

   function autoRellenar() {

       document.getElementById("nombre").value = "Tipo";
       document.getElementById("apellidos").value = "De Incognito";
       datosPersonales.sexo.selectedIndex = 1;
       document.getElementById("edad").value = 23;
       document.getElementById("dni").value = "73654748D";
       document.getElementById("comentarios").value = "Texto de relleno";
       document.getElementById("idioma2").checked = true;
       document.getElementById("idioma3").checked = true;
       document.getElementById("profesion2").checked = true;
       document.getElementById("dia").selectedIndex = 2;
       document.getElementById("mes").selectedIndex = 2;
       document.getElementById("ano").selectedIndex = 1;




   }

   /**********FUNCIONA DE AQUI PARA ARRIBA********/


   function popUp() {
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
       divMensaje.id = "popUpMensaje";

       divMensaje.style.backgroundColor = "white";
       divMensaje.style.position = "fixed";
       divMensaje.style.top = y + "px";
       divMensaje.style.left = x + "px";
       divMensaje.style.height = alto + "px";
       divMensaje.style.width = ancho + "px";
       divMensaje.style.textAlign = "center";
       divMensaje.style.fontSize = "2em";
       divMensaje.style.padding = "10px";

       divMensaje.style.zIndex = 10001;

       divFondo.appendChild(divMensaje);

       divMensaje.innerHTML = "<h1>Alerta!!</h1>" + "\nTu DNI es: " + document.getElementById("dni").value + "<br>";
       var boton = document.createElement("button");
       divMensaje.appendChild(boton);
       boton.innerHTML = "Salir!";
       boton.onclick = function() {
           divFondo.parentNode.removeChild(divFondo);
           document.forms[0].submit();
           return false;
       }


   }
