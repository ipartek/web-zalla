/*
 * Created on 25-abr-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package libreriavirtual.beans;


public class Libro {
	private String isbn;
	private String titulo;
	private String cod_autor;
	private String cod_categoria;
	private String cod_editorial;
	private double precio;
	private int stock;
	public Libro(String isbn, String titulo, String cod_autor, String cod_categoria, String cod_editorial,
			double precio, int stock) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.cod_autor = cod_autor;
		this.cod_categoria = cod_categoria;
		this.cod_editorial = cod_editorial;
		this.precio = precio;
		this.stock = stock;
	}
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCod_autor() {
		return cod_autor;
	}
	public void setCod_autor(String cod_autor) {
		this.cod_autor = cod_autor;
	}
	public String getCod_categoria() {
		return cod_categoria;
	}
	public void setCod_categoria(String cod_categoria) {
		this.cod_categoria = cod_categoria;
	}
	public String getCod_editorial() {
		return cod_editorial;
	}
	public void setCod_editorial(String cod_editorial) {
		this.cod_editorial = cod_editorial;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
