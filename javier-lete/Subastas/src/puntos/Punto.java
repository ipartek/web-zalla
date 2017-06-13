package puntos;

import java.util.Arrays;

public class Punto {
	private int x;
	private int y;

	// Constructor con 2 coordenadas (enteros) como parametros
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Constructor sin parámetros, genera un punto en las coordenadas 0,0
	public Punto() {
		this.x = 0;
		this.y = 0;
	}

	// Constructor con otro punto como parámetro
	public Punto(Punto punto) {
		this.x = punto.getX();
		this.y = punto.getY();
	}

	// Getters y setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// Muestra por consola las coordenadas del punto
	public void MuestraPunto() {
		System.out.println("Ahora estoy en  " + this.x + ", " + this.y);
	}

	// Mueve el punto la distancia dada por los parámetros y después muestra las
	// coordenadas.
	public void MuevePunto(int mueveX, int mueveY) {

		this.x += mueveX;
		this.y += mueveY;
		MuestraPunto();

	}

	public double distancia(Punto p) {
		/**
		distancia = raíz cuadrada((x1-x2 al cuadrado) + (y1-y2 al cuadrado))
		**/
		int x1 = this.x;
		int y1 = this.y;
		int x2 = p.getX();
		int y2 = p.getY();
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
