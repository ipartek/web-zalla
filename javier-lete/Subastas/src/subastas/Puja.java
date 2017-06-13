package subastas;

public class Puja {
	private Usuario usuario;
	private double cantidad;
	public Puja(Usuario usuario, double cantidad) {
		super();
		this.usuario = usuario;
		this.cantidad = cantidad;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public double getCantidad() {
		return cantidad;
	}
	
	
}
