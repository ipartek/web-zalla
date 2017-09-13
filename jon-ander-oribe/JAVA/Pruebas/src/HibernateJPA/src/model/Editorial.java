package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the editorial database table.
 * 
 */
@Entity
@NamedQuery(name="Editorial.findAll", query="SELECT e FROM Editorial e")
public class Editorial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cod_editorial")
	private int codEditorial;

	@Column(name="nom_editorial")
	private String nomEditorial;

	//bi-directional many-to-one association to Libro
	@OneToMany(mappedBy="editorial")
	private List<Libro> libros;

	public Editorial() {
	}

	public int getCodEditorial() {
		return this.codEditorial;
	}

	public void setCodEditorial(int codEditorial) {
		this.codEditorial = codEditorial;
	}

	public String getNomEditorial() {
		return this.nomEditorial;
	}

	public void setNomEditorial(String nomEditorial) {
		this.nomEditorial = nomEditorial;
	}

	public List<Libro> getLibros() {
		return this.libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public Libro addLibro(Libro libro) {
		getLibros().add(libro);
		libro.setEditorial(this);

		return libro;
	}

	public Libro removeLibro(Libro libro) {
		getLibros().remove(libro);
		libro.setEditorial(null);

		return libro;
	}

}