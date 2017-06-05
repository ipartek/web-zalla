package geometria;

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

	public void desplazar(double desplazamientoX, double desplazamientoY) {
		this.x = this.x + desplazamientoX;
		this.y = this.y + desplazamientoY;
	}

	public static void desplazar(Punto punto, double desplazamientoX, double desplazamientoY) {
		punto.desplazar(desplazamientoX, desplazamientoY);
	}

	public void desplazar(Direccion direccion) {
		switch (direccion) {
		case ARRIBA:
			desplazar(0, 1);
			break;
		case ABAJO:
			desplazar(0, -1);
			break;
		case IZQUIERDA:
			desplazar(-1, 0);
			break;
		case DERECHA:
			desplazar(1, 0);
			break;
		}
	}

	public static Punto mayorDistancia(Punto... puntos) {
		Punto puntoOrigenCoordenadas = new Punto(0, 0);
		Punto punto = null;
		double distancia = 0;
		double distanciaMaxima = 0;
		int indiceDistanciaMaxima = 0;
		for (int i = 0; i < puntos.length; i++) {
			punto = puntos[i];
			distancia = puntoOrigenCoordenadas.distancia(punto);
			if (distancia > distanciaMaxima) {
				indiceDistanciaMaxima = i;
				distanciaMaxima = distancia;
			}
		}
		Punto puntoDistanciaMaxima = puntos[indiceDistanciaMaxima];
		return puntoDistanciaMaxima;
	}

}
