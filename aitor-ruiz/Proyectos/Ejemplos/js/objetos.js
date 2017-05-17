var o = new Object();

o.id = 5;
o.nombre = "Pepe";
o.mostrarId = function() {
    alert(this.id);
};

alert(o.nombre);
o.mostrarId();

var Aplicacion = new Object();
 
Aplicacion.Modulos = new Array();
Aplicacion.Modulos[0] = new Object();
Aplicacion.Modulos[0].titulo = "Lector RSS";
 
var inicial = new Object();
inicial.estado = 1;
inicial.publico = 0;
inicial.nombre = "Modulo_RSS";
inicial.datos = new Object();
 
Aplicacion.Modulos[0].objetoInicial = inicial;

var modulo = {
  titulo : "Lector RSS",
  objetoInicial : { estado : 1, publico : 0, nombre : "Modulo RSS", datos : {} },
  mostrarNombre : function() { alert (this.objetoInicial.nombre);}
};

function Factura(idFactura, idCliente) {
  this.idFactura = idFactura;
  this.idCliente = idCliente;
}
 
Factura.prototype.muestraCliente = function() {
  alert(this.idCliente);
}
 
Factura.prototype.muestraId = function() {
  alert(this.idFactura);
}

var f1 = new Factura(5, "Cliente FACTURA 5");
var f2 = new Factura(6, "Cliente FACTURA 6");

f1.muestraCliente();
f2.muestraId();

String.prototype.mid = function(inicio, longitud) {
    return this.substring(inicio, inicio + longitud);
};