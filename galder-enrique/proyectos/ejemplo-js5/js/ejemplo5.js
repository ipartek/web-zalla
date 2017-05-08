'use strict';

window.onload = function(){
	 var usuario = document.getElementById("usuario");
	 console.log(usuario);

	var btnPruebas = document.getElementById("btnPruebas");
	btnPruebas.onclick = function(){
		var txtMensajes = document.getElementById("txtMensajes");

		var txtUsuario = document.getElementById("txtUsuario").value;
		//var usuario = txtUsuario.value;
		txtMensajes.value = "Hola " + txtUsuario;

		txtMensajes.placeholder = "MODIFICADO AL MENOS UNA VEZ";
	};
};