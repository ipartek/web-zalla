package subastas;

import java.util.LinkedList;

public class Usuario {
	private String nombre;
	private double credito;
	private LinkedList<Subasta> subastas;
	/**
	 * @param nombre
	 * @param credito
	 */
	public Usuario(String nombre, double credito) {
		super();
		this.nombre = nombre;
		this.credito = credito;
		this.subastas = new LinkedList<Subasta>();
	}
	public void añadirSubasta(Subasta subasta){
		subastas.add(subasta);
	}
	public void incrementarCredito(double cantidad){
		this.credito = this.credito + cantidad;
	}

	public void decrementarCredito(double cantidad){
		this.credito = this.credito - cantidad;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the credito
	 */
	public double getCredito() {
		return credito;
	}
	/**
	 * @param credito the credito to set
	 */
	public void setCredito(double credito) {
		this.credito = credito;
	}
}
