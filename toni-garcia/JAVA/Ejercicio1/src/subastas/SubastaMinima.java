package subastas;

public class SubastaMinima extends Subasta {

	
	private double pujaMinima;

	public SubastaMinima(String producto, Usuario propietario, double pujaMinima) {
		super(producto, propietario);
		// TODO Auto-generated constructor stubç

		this.pujaMinima = pujaMinima;
	}

	public double getPujaMinima() {
		return pujaMinima;
	}

	public void setPujaMinima(double pujaMinima) {
		this.pujaMinima = pujaMinima;
	}

	public boolean ejecutar() {
		if (this.abierto && this.getPujaMayor() != null) {
			this.getPujaMayor().getUsuario().decrementarCredito(this.getPujaMayor().getCantidadPuja());
			this.getPropietario().incrementarCredito(this.getPujaMayor().getCantidadPuja());
			this.abierto = false;
			return true;
		} else {
			return false;
		}

	}

	public void cerrarSubasta() {

		this.abierto = false;
	}

}