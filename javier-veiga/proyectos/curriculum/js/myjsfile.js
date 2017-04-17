$(document).ready(function() {
	console.log("el documento esta preparado.");
	
	//--declaracion de objetos-------------------------
	
	
	function Alumno(codigo, nombre, notaHtml, notaJs, notaAcc){
		this.codigo = codigo;
		this.nombre = nombre;
		this.notaHtml = parseFloat(notaHtml);
		this.notaJs = parseFloat(notaJs);
		this.notaAcc = parseFloat(notaA);
		this.notamedia = 0;
	}
	
	Alumno.prototype = {
		
		calcularMedia : function(){
			return(((this.notaHtml + this.notaJs + this.notaAcc)/3).toIndex(2);
		}
	}
	//-------eventos de botonera-----------------------
	
	$("#botones button:eq(0)").click(function(e){
		$("#modalform").modal();
	});
});
