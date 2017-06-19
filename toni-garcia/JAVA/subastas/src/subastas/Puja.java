package subastas;



public class Puja extends Usuario
{
	private double pujaJugada = 0.0;
	
	public Puja(String nombre, double pujaJugada){
		super(nombre);
		this.pujaJugada = pujaJugada;
	}

	public double getPujaJugada() {
		return pujaJugada;
	}

}
