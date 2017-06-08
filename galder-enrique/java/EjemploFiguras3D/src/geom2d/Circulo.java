package geom2d;

public class Circulo extends Figura2D {
	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	

	public double getRadio() {
		return radio;
	}


	@Override
	public double area() {
		return Math.PI * radio * radio;
	}
}
