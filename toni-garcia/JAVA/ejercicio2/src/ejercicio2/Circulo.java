package ejercicio2;

public class Circulo {
	private Punto centro;
	private double radio;
	private double perimetro = 2 * radio * Math.PI;
	private static Punto centroCoord = new Punto(0, 0);
	// private static Punto centroCoord = new Punto();
	private static double radioDefecto = 5;

	// c�rculo por defecto, valores por defecto
	public Circulo(Punto centro, double radio) {
		Punto centro1 =new Punto(0.0,0.0);
		radio = 5;
	}

	public void desplazar(Punto centro) {
		this.centro = centro;
	}

	public Punto getCentro() {
		return centro;
	}

	public Circulo() {
	}

	public double getPerimetro() {
		return perimetro;
	}
}