package subastas;

public class Usuario {
	public String nombre;
	public double credito;
	private double pujaTotal = 0.0;
	

	public Usuario(String nombre, double credito) {
		this.nombre = nombre;
		this.credito = credito;
	}
	public Usuario(String nombre) {
		this.nombre=nombre;
	}
	
	public double getPujaTotal() {
		return pujaTotal;
	}
	public void setPujaTotal(double pujaTotal) {
		this.pujaTotal = pujaTotal;
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

	public double incrementarCredito(double credito) {
		this.credito += credito;
		return credito;
	}

	public double decrementarCredito(double credito) {
		this.credito -= credito;
		return credito;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", credito=" + credito + ", pujaTotal=" + pujaTotal + "]";
	}
	
}
