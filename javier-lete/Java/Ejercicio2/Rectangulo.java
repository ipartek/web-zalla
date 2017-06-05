package geometria;

public class Rectangulo {
	/*
	 * vértice inferior izquierda (abreviado como verticeII) que representa el
	 * punto que corresponde con la esquina inferior izquierda, vértice superior
	 * izquierda (verticeSI), vértice superior derecha (verticeSD) y vértice
	 * inferior derecha (verticeID). Estas propiedades se pueden apreciar en la
	 * siguiente figura:
	 */
	// Propiedades que caracterizan al rectángulo
	private double ladoX;
	private double ladoY;
	private Punto verticeII;
	// Propiedades calculadas
	private Punto verticeSI;
	private Punto verticeSD;
	private Punto verticeID;

	public Rectangulo(double ladoX, double ladoY, Punto verticeII) {
		establecer(ladoX, ladoY, verticeII);
	}

	public Rectangulo(Punto verticeII, Punto verticeSD) {
		establecer(verticeII, verticeSD);
	}

	public void establecer(double ladoX, double ladoY, Punto verticeII) {
		//
		this.ladoX = ladoX;
		this.ladoY = ladoY;
		this.verticeII = verticeII;
		//
		double xII = verticeII.getX();
		double yII = verticeII.getY();
		//
		double xSI = xII;
		double ySI = yII + ladoY;
		this.verticeSI = new Punto(xSI, ySI);
		//
		double xSD = xII + ladoX;
		double ySD = yII + ladoY;
		this.verticeSD = new Punto(xSD, ySD);
		//
		double xID = xII + ladoX;
		double yID = yII;
		this.verticeID = new Punto(xID, yID);
	}

	public void establecer(Punto verticeII, Punto verticeSD) {
		//
		this.verticeII = verticeII;
		this.verticeSD = verticeSD;
		//
		double xII = verticeII.getX();
		double yII = verticeII.getY();
		//
		double xSD = verticeSD.getX();
		double ySD = verticeSD.getY();
		//
		this.ladoX = xSD - xII;
		this.ladoY = ySD - yII;
		//
		double xSI = xII;
		double ySI = yII + this.ladoY;
		this.verticeSI = new Punto(xSI, ySI);
		//
		double xID = xII + this.ladoX;
		double yID = yII;
		this.verticeID = new Punto(xID, yID);
	}

	public void desplazar(double desplazamientoX, double desplazamientoY) {
		//
		verticeII.desplazar(desplazamientoX, desplazamientoY);
		establecer(this.ladoX, this.ladoY, verticeII);
	}

	public String toString() {
		return "[" + verticeII + "," + verticeSI + "," + verticeSD + "," + verticeID + "," + ladoX + "," + ladoY + "]";
	}

}
