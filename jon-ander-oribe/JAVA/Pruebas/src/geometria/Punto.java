package geometria;

public class Punto {

	private double x = 0.0;
	private double y = 0.0;

	public Punto(double x, double y) {

		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;

	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static void main(String[] args) {

		Punto punto1 = new Punto(2, 3);
		System.out.println(punto1.getX());
		System.out.println(punto1.getY());
		punto1.setX(12);
		punto1.setY(9);
		System.out.println(punto1.getX());
		System.out.println(punto1.getY());
		

	}

}
