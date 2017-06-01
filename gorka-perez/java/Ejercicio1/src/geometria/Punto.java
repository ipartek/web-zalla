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

	public void desplazar(Direccion direccion) {
		switch (direccion) {
		case arriba:
			this.desplazar(0, 1);
			break;
		case abajo:
			this.desplazar(0, -1);
			break;
		case izquierda:
			this.desplazar(-1, 0);
			break;
		case derecha:
			this.desplazar(1, 0);
			break;
		default:
			break;
		}
	}

	public void desplazar(double desplazamientoX, double desplazamientoY) {
		this.x = this.x + desplazamientoX;
		this.y = this.y + desplazamientoY;
	}

	public void desplazar(Punto punto, double desplazamientoX, double desplazamientoY) {
		punto.desplazar(desplazamientoX, desplazamientoY);
	}

	public static double distancia(Punto punto1, Punto punto2) {
		return punto1.distancia(punto2);
	}

	public double distancia(Punto punto) {
		return Math.sqrt(Math.pow((this.x - punto.x), 2) + Math.pow((this.y - punto.y), 2));
	}
	
	public static Punto mayorDistancia(Punto... puntos){
		Punto puntoMayor = new Punto();
		Punto origen = new Punto();
		for(int i=0; i < puntos.length; i++){
			if (origen.distancia(puntos[i]) > origen.distancia(puntoMayor)){
				puntoMayor = puntos[i];
			}
		}
		return puntoMayor;
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
