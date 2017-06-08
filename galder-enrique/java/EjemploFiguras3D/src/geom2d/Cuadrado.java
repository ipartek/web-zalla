package geom2d;

public class Cuadrado extends Figura2D {
	private double lado;

	

	public void setLado(double lado) {
		this.lado = lado;
	}



	@Override
	public double area() {
		return lado * lado;
	}
}
