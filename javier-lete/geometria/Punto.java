package geometria;

import java.util.Arrays;



//import java.util.Arrays;

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

	public void desplazarPunto(double desplazamientoX, double desplazamientoY) {
		this.x = this.x + desplazamientoX;
		this.y = this.y + desplazamientoY;
	}

	public static void desplazarPunto(Punto punto, double desplazamientoX, double desplazamientoY) {
		punto.desplazarPunto(desplazamientoX, desplazamientoY);
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

	public double distancia(Punto punto) {
		/**
		 * distancia = raíz cuadrada((x1-x2 al cuadrado) + (y1-y2 al cuadrado))
		 **/
		double x1 = this.x;
		double y1 = this.y;
		double x2 = punto.getX();
		double y2 = punto.getY();
		double operador1 = Math.pow(x1 - x2, 2);
		double operador2 = Math.pow(y1 - y2, 2);
		double suma = operador1 + operador2;
		double distancia = Math.sqrt(suma);
		return distancia;
	}

	public void MuevePunto(Direccion dir) {

		switch (dir) {
		case ARRIBA:
			this.y++;
			break;

		case ABAJO:
			this.y--;
			break;

		case IZQUIERDA:
			this.x--;
			break;

		default:
			this.x++;

		}
	}
	public Punto MayorDistancia(Punto... puntos) {
		Punto punto = new Punto();
		double distancias[] = new double[puntos.length];
		double referencia[] = new double[puntos.length];

		for (int i = 0; i < puntos.length; i++) {
			punto = puntos[i];
			distancias[i] = distancia(punto);
			referencia[i] = distancias[i];
		}

		Arrays.sort(distancias);

		for (int i = 0; i < distancias.length; i++) {
			if (distancias[distancias.length - 1] == referencia[i]) {
				punto = puntos[i];
			}
		}

		return punto;
	}
	

}
