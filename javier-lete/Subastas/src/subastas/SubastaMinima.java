package subastas;

public class SubastaMinima extends Subasta {
	private double cantidadMinima;

	public SubastaMinima(String nombreProductoSubastado, Usuario usuario, double cantidadMinima) {
		super(nombreProductoSubastado, usuario);
		this.cantidadMinima = cantidadMinima;
	}

	public double getCantidadMinima() {
		return cantidadMinima;
	}

	public void setCantidadMinima(double cantidadMinima) {
		this.cantidadMinima = cantidadMinima;
	}

	public boolean ejecutar() {
		Puja pujaMayor = super.getPujaMayor();
		if ((pujaMayor != null) && (pujaMayor.getCantidad() >= this.cantidadMinima)) {
			return super.ejecutar();
		} else {
			return false;
		}
	}

}
