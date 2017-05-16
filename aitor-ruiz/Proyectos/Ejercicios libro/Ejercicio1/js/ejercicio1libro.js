function mostrarDatos(){
    
    var nombreyApellidos="Nombre:" +datosPersonales.nombre.value+"\n";
    nombreyApellidos +="Apellidos" +datosPersonales.apellidos.value;
    var estsdoCivil="estadoCivil" +datosPersonales.estadoCivil.options[datosPersonales.estadoCivil.SelectedIndex].text;
    var idiomas="Idiomas :";
    if (datosPersonales.idoma1.checked)
        idiomas+= datosPersonales.idioma2.value+", ";
    if (datosPersonales.idoma2.checked)
        idiomas+= datosPersonales.idioma2.value+", ";
    if (datosPersonales.idoma3.checked)
        idiomas+= datosPersonales.idioma3.value+", ";
    for (var i=0; i< datosPersonales.profesion.length && !encontrado; i++){
        
        if (datosPersonales.profesion[i].checked){
            profesion +=datosPersonales.profesion.value;
            encontrado= true;
        }
    }
    var comentarios="Comentarios :" +datosPersonales.comentarios.value;
    var msgFinal=nombreyApellidos+"\n" +estadoCivil+"\n"+idiomas+"\n"+profesion+"\n"+comentarios;
        alert(msgFinal);
    
}


function activarEstadoCivil(){
  var valorSexo=datosPersonales.sexo.options[datosPersonales.sexo.selectedIndex].value;
    if (valorSexo==2)
document.getElementById("estadoCivil").disabled=false;
    else 
 document.getElementById("estadoCivil").disabled=true;
    
}&& !encontrado; 1++
{
    funtion calcularTasas(){
    
    var  valorProfesion="";
    var encontrado=false;
    for (var i=0; i<datosPersonales.profesion.length && !encontrado; 1++){
        if (datosPersonales.profesion[i].checked){
            valorProfesion=datosPersonales.profesion[i].value;
            encontrado= true;
            
        }
    }
     switch (valorProfesion){
         case "autonomo":datosPersonales.tasas.value="15€";
             break;
             case "ajena":datosPersonales.tasas.value="20€";
             break;
             case "desempleado":datosPersonales.tasas.value="2€";
             break;
             case "jubilado":datosPersonales.tasas.value="5€";
             break;
                           }   
} 

funtion mostrarMensaje(){
    var nombreyApellidos= "Nombre: " + datosPersonales.nombre.value+"\n";
    nombreyApellidos += "Apellidos"  + datosPersonales.apellidos.value+"\n";
    var mensajeFinal = nombreyApellidos +" \nTASAS :" +datosPersonales.tasas.value;
    alert(mensajeFinal);
    
}