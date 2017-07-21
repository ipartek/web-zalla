package bdLibreria.beans;

public class Libro {
	
  private int idLibro=0;
  private String titulo="";
  private int cantidad=0;
  private String edicion="";
  private String lanzamiento="";
  private double precio=0.0;
  private String idGenero="";
  private String idAutor="";
  


public Libro(int idLibro,String titulo,int cantidad,String edicion,String lanzamiento,double precio,String idGenero,String idAutor) {
	this.idLibro=idLibro;
	this.titulo=titulo;
	this.cantidad=cantidad;
	this.edicion=edicion;
	this.lanzamiento=lanzamiento;
	this.precio=precio;
	this.idGenero=idGenero;
	this.idAutor=idAutor;
}


public Libro() {
	// TODO Auto-generated constructor stub
}

public int getIdLibro() {
	return idLibro;
}



public void setIdLibro(int idLibro) {
	this.idLibro = idLibro;
}



public String getTitulo() {
	return titulo;
}



public void setTitulo(String titulo) {
	this.titulo = titulo;
}



public int getCantidad() {
	return cantidad;
}



public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}



public String getEdicion() {
	return edicion;
}



public void setEdicion(String edicion) {
	this.edicion = edicion;
}



public String getLanzamiento() {
	return lanzamiento;
}



public void setLanzamiento(String lanzamiento) {
	this.lanzamiento = lanzamiento;
}



public double getPrecio() {
	return precio;
}



public void setPrecio(double precio) {
	this.precio = precio;
}



public String getIdGenero() {
	return idGenero;
}



public void setIdGenero(String idGenero) {
	this.idGenero = idGenero;
}



public String getIdAutor() {
	return idAutor;
}



public void setIdAutor(String idAutor) {
	this.idAutor = idAutor;
}
 
}