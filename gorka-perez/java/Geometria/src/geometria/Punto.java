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
		//el this hace referencia al objeto con el que se llama ejemplo:
		//punto1.desplazar, el objeto que hace referencia this es punto1.
		this.x = this.x + desplazamientoX;
		this.y = this.y + desplazamientoY;
	}
	
	//Desplazar 1 unidad en una dirección
	
	public void desplazar(Direccion direccion){
		switch (direccion) {
        case arriba:
        	this.y = this.y + 1;
        	break;
        case abajo:
        	this.y = this.y - 1;
        	break;
        case derecha:
        	this.x = this.x + 1;
        	break;
        case izquierda:
        	this.x = this.x - 1;
        	break;
        default:
        	break;
		}	
	}
	
	public Punto mayorDistancia(Punto[] arrayPuntos){
		
		Punto puntoCero = new Punto(0,0);
		Punto puntoMayor = new Punto(0,0);
		
		for (int i = 0; i < arrayPuntos.length; i++){
			if (distancia(arrayPuntos[i], puntoCero) > distancia(puntoMayor, puntoCero)){
				puntoMayor = arrayPuntos[i];
			}
		}
		return puntoMayor;
	}
	
	public void desplazar(Punto punto, double desplazamientoX, double desplazamientoY) {
		punto.desplazar(desplazamientoX, desplazamientoY);
	}
	
	public double distancia(Punto punto1, Punto punto2){
		return Math.sqrt(Math.pow((punto1.x - punto2.x), 2) + Math.pow((punto1.y - punto2.y), 2));
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
