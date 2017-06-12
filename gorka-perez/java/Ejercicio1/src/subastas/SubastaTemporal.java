package subastas;

public class SubastaTemporal extends Subasta {

	private double HorasMaxima;
	private long creationTime;

	public SubastaTemporal(String producto, Usuario propietario, double subastaHoras) {
		super(producto, propietario);
		// TODO Auto-generated constructor stub

		this.HorasMaxima = subastaHoras;
		this.creationTime = System.currentTimeMillis();
	}

	public boolean pujar(Usuario pujador, double cantidadPuja) {

		if (horaLimiteSobrepasada()) {
			this.ejecutar();
			return false;
		} else {
			return super.pujar(pujador, cantidadPuja);
		}
	}

	public boolean pujar(Usuario pujador) {

		if (horaLimiteSobrepasada()) {
			this.ejecutar();
			return false;
		} else {
			return super.pujar(pujador);
		}
	}
	
	private boolean horaLimiteSobrepasada(){
		
		long tiempoTranscurrido = System.currentTimeMillis() - this.creationTime;
		
		if ((int) ((tiempoTranscurrido / (1000 * 60 * 60)) % 24) > this.HorasMaxima){
			return true;
		}else{
			return false;
		}
	}
}
