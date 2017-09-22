$(function(){
	$('#boton').click(function(){
		$.get('servicio', function(respuesta){
			$('#mensaje').html(respuesta);
		});
	});
});