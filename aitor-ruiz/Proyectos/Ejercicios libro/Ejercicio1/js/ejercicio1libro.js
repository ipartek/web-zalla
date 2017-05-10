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