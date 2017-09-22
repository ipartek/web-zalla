$(function(){
	$('#boton').click(function(){
		$.get('servicio?nombre=' + $('#nombre').val(), function(respuesta){
			$('#mensaje').html(respuesta);
		});
	});
	
	
	$('#usuarioid').change(function(){
		$.getJSON('api/usuarios/' + $('#usuarioid').val(), function(usuario){
			$('#usuarionombre').val(usuario.nombre);
			$('#usuarioapellido').val(usuario.apellido);
		});
	});
});