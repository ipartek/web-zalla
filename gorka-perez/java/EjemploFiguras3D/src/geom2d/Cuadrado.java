package geom2d;

public class Cuadrado extends Figura2D {
	private double lado;

	/**
	 * @param lado
	 */
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}
	
	/**
	 * @return the lado
	 */
	public double getLado() {
		return lado;
	}


	/**
	 * @param lado the lado to set
	 */
	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public double area() {
		return lado * lado;
	}
}
