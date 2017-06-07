package subastas;

public class Puja extends Usuario {

	private double cantidadPujada = 0.0;

	public Puja(String nombre, double cantidadPujada) {
		super(nombre);
		this.cantidadPujada = cantidadPujada;

	}

	public double getCantidadPujada() {
		return cantidadPujada;
	}

}
