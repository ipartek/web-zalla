package geometria;

public class Circulo {
	private static final double RADIO_DEFECTO = 5;
	private static final double COORDENADA_X_DEFECTO = 0;
	private static final double COORDENADA_Y_DEFECTO = 0;
	private Punto centro;
	private double radio;

	public Circulo(Punto centro, double radio) {
		this.centro = centro;
		this.radio = radio;
	}

	public Circulo() {
		Punto puntoDefecto = new Punto(COORDENADA_X_DEFECTO, COORDENADA_Y_DEFECTO);
		double radioDefecto = RADIO_DEFECTO;
		this.centro = puntoDefecto;
		this.radio = radioDefecto;
	}

	public Circulo(Circulo circulo) {
		this.radio = circulo.radio;
		this.centro = new Punto(circulo.centro);
	}

	public void desplazar(double desplazamientoX, double desplazamientoY) {
		centro.desplazar(desplazamientoX, desplazamientoY);
	}

	public void desplazar(Direccion direccion) {
		centro.desplazar(direccion);
	}

	public void escalar(double porcentaje) {
		this.radio = this.radio * (porcentaje / 100);
	}

	public Punto getCentro() {
		return centro;
	}

	public double getRadio() {
		return radio;
	}

	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}

	public String toString() {
		return "[" + centro + "," + radio + "]";
	}

}
