package bdLibreria.beans;

public class Libro {
	
  private String isbn="";
  private String titulo="";
  private int stock=0;
  private String editorial="";
  private double precio=0.0;
  private String cod_categoria="";
  private String cod_Autor="";
  


public Libro(String idLibro,String titulo,int cantidad,String edicion,double precio,String idGenero,String idAutor) {
	this.isbn=idLibro;
	this.titulo=titulo;
	this.stock=cantidad;
	this.editorial=edicion;
	this.precio=precio;
	this.cod_categoria=idGenero;
	this.cod_Autor=idAutor;
}


public Libro() {
	// TODO Auto-generated constructor stub
}

public String getIdLibro() {
	return isbn;
}



public void setIdLibro(String idLibro) {
	this.isbn = idLibro;
}



public String getTitulo() {
	return titulo;
}



public void setTitulo(String titulo) {
	this.titulo = titulo;
}



public int getCantidad() {
	return stock;
}



public void setCantidad(int cantidad) {
	this.stock = cantidad;
}



public String getEditorial() {
	return editorial;
}



public void setEditorial(String editorial) {
	this.editorial = editorial;
}



public double getPrecio() {
	return precio;
}



public void setPrecio(double precio) {
	this.precio = precio;
}



public String getIdGenero() {
	return cod_categoria;
}



public void setIdGenero(String idGenero) {
	this.cod_categoria = idGenero;
}



public String getIdAutor() {
	return cod_Autor;
}



public void setIdAutor(String idAutor) {
	this.cod_Autor = idAutor;
}
 
}