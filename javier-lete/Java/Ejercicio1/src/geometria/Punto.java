package geometria;

public class Punto {

	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punto() {
		this(0, 0);
	}

	public Punto(Punto punto) {
		this(punto.x, punto.y);

	}

	public void desplazar(double desplazamientoX, double desplazamientoY) {
		this.x = this.x + desplazamientoX;
		this.y = this.y + desplazamientoY;
	}

	public static void desplazar(Punto punto, double desplazamientoX, double desplazamientoY) {
		punto.desplazar(desplazamientoX, desplazamientoY);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

}
