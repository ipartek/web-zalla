package subastas;
import java.util.LinkedList;
public class Usuario {
	private String nombre;
	private double credito;
	private LinkedList<Subasta> subastasRegistradas;
	
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Usuario(String nombre, double credito) {
		super();
		this.nombre = nombre;
		this.credito = credito;
		this.subastasRegistradas = new LinkedList<Subasta>();


	}
	
	
	
	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}



	public String getNombre() {
		return nombre;
	}



	public void IncrementarCredito(double cantidad){
		this.credito += cantidad;
	}
	
	public void DecrementarCredito(double cantidad){
		this.credito -= cantidad;
	}
	public void SubastasRegistradas(Subasta subasta){
		this.subastasRegistradas.addLast(subasta);
	}
	
}
