package java24h;

public class Circulo {
	private static final double RADIO_DEFECTO = 5;
	private static final double COORDENADA_X_DEFECTO = 0;
	private static final double COORDENADA_Y_DEFECTO = 0;
	private Punto centro;
	private double radio;
	private double perimetro;

	public Circulo(Punto centro, double radio) {
		this.centro = centro;
		this.radio = radio;
		perimetro=2 * Math.PI * radio;
	}

	public Circulo() {
		Punto puntoDefecto = new Punto(COORDENADA_X_DEFECTO, COORDENADA_Y_DEFECTO);
		double radioDefecto = RADIO_DEFECTO;
		this.centro = puntoDefecto;
		this.radio = radioDefecto;
	}

	public Circulo(Circulo circulo) {
		this.radio = circulo.radio;
		this.centro = circulo.centro;
	}

	public void desplazar(double desplazamientoX, double desplazamientoY){
		centro.desplazar(desplazamientoX, desplazamientoY);
	}
	
	public void escalar(double porcentaje){
		this.radio=this.radio * (porcentaje/100);
	}

	public Punto getCentro() {
		return centro;
	}

	public double getRadio() {
		return radio;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void muestraCirculo(String nombre){
		System.out.println("Soy " + nombre + ", empiezo en " + this.centro.getX() + ", " + this.centro.getY() + " y mi radio es de " + radio);
	}

}
