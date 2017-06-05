package subastas;

public class Puja {
	private Usuario usuario;
	private double cantidadPuja;
	/**
	 * @param usuario
	 * @param cantidadPuja
	 */
	public Puja(Usuario usuario, double cantidadPuja) {
		super();
		this.usuario = usuario;
		this.cantidadPuja = cantidadPuja;
	}
	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	/**
	 * @return the cantidadPuja
	 */
	public double getCantidadPuja() {
		return cantidadPuja;
	}
}

