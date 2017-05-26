package geom2d;

public class Circulo extends Figura2D {
	private double radio;

	@Override
	public double area() {
		return Math.PI * radio * radio;
	}
}
