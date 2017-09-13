package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the libro database table.
 * 
 */
@Entity
@NamedQuery(name="Libro.findAll", query="SELECT l FROM Libro l")
public class Libro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String isbn;

	private double precio;

	private int stock;

	private String titulo;

	//bi-directional many-to-one association to DetallesCompra
	@OneToMany(mappedBy="libro")
	private List<DetallesCompra> detallesCompras;

	//bi-directional many-to-one association to Autor
	@ManyToOne
	@JoinColumn(name="cod_autor")
	private Autor autor;

	//bi-directional many-to-one association to Categoria
	@ManyToOne
	@JoinColumn(name="cod_categoria")
	private Categoria categoria;

	//bi-directional many-to-one association to Editorial
	@ManyToOne
	@JoinColumn(name="cod_editorial")
	private Editorial editorial;

	public Libro() {
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<DetallesCompra> getDetallesCompras() {
		return this.detallesCompras;
	}

	public void setDetallesCompras(List<DetallesCompra> detallesCompras) {
		this.detallesCompras = detallesCompras;
	}

	public DetallesCompra addDetallesCompra(DetallesCompra detallesCompra) {
		getDetallesCompras().add(detallesCompra);
		detallesCompra.setLibro(this);

		return detallesCompra;
	}

	public DetallesCompra removeDetallesCompra(DetallesCompra detallesCompra) {
		getDetallesCompras().remove(detallesCompra);
		detallesCompra.setLibro(null);

		return detallesCompra;
	}

	public Autor getAutor() {
		return this.autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Editorial getEditorial() {
		return this.editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

}