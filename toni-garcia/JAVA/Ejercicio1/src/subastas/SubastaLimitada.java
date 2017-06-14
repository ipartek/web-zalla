package subastas;

public class SubastaLimitada extends Subasta {

	private double numeroMaximoPujas;

	public SubastaLimitada(String producto, Usuario propietario, double numeroMaximoPujas) {
		super(producto, propietario);
		this.numeroMaximoPujas = numeroMaximoPujas;
	}

	public boolean pujar(Usuario pujador, double cantidadPuja) {

		boolean resultadoPuja;
		resultadoPuja = super.pujar(pujador, cantidadPuja);

		this.numeroMaximoPujas--;

		if (this.numeroMaximoPujas == 0) {
			this.ejecutar();
		}
		return resultadoPuja;
	}

	public boolean pujar(Usuario pujador) {

		boolean resultadoPuja;
		resultadoPuja = super.pujar(pujador);

		this.numeroMaximoPujas--;

		if (this.numeroMaximoPujas == 0) {
			this.ejecutar();
		}
		return resultadoPuja;
	}

	public double consultarPujas() {

		return this.numeroMaximoPujas;
	}
}
