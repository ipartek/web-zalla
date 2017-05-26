package geom2d;

public class Cuadrado extends Figura2D {
	private double lado;

	@Override
	public double area() {
		return lado * lado;
	}
}
