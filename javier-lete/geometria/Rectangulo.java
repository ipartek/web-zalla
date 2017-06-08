package geometria;



public class Rectangulo {
	/*
	 * vértice inferior izquierda (abreviado como verticeII) que representa el
	 * punto que corresponde con la esquina inferior izquierda, vértice superior
	 * izquierda (verticeSI), vértice superior derecha (verticeSD) y vértice
	 * inferior derecha (verticeID). Estas propiedades se pueden apreciar en la
	 * siguiente figura:
	 */

	private int ladoX;
	private int ladoY;
	private Punto verticeII;
	private Punto verticeSI;
	private Punto verticeSD;
	private Punto verticeID;

	public Rectangulo(int ladoX, int ladoY, Punto verticeII) {
		this.ladoX = ladoX;
		this.ladoY = ladoY;
		this.verticeII = verticeII;
		
		

	}
	
	public Rectangulo(Punto verticeII, Punto verticeSD){
		this.verticeII = verticeII;
		this.verticeSD = verticeSD;
		
		
		
	}
	
	public void desplazar(int mueveX, int mueveY){
		
		this.verticeII.setX(this.verticeII.getX()+mueveX);
		this.verticeII.setY(this.verticeII.getY()+mueveY);
		
		
		
	}
	
	public void muestraRectangulo(String nombre){
		System.out.println("Soy " + nombre + ", empiezo en " + this.verticeII.getX() + ", " + this.verticeII.getY() + " y mis lados miden " + this.ladoX + " y " + this.ladoY);
	}

	public int getLadoX() {
		return ladoX;
	}

	public void setLadoX(int ladoX) {
		this.ladoX = ladoX;
	}

	public int getLadoY() {
		return ladoY;
	}

	public void setLadoY(int ladoY) {
		this.ladoY = ladoY;
	}

	public Punto getVerticeII() {
		return verticeII;
	}

	public void setVerticeII(Punto verticeII) {
		this.verticeII = verticeII;
	}

	public Punto getVerticeSI() {
		return verticeSI;
	}

	public void setVerticeSI(Punto verticeSI) {
		this.verticeSI = verticeSI;
	}

	public Punto getVerticeSD() {
		return verticeSD;
	}

	public void setVerticeSD(Punto verticeSD) {
		this.verticeSD = verticeSD;
	}

	public Punto getVerticeID() {
		return verticeID;
	}

	public void setVerticeID(Punto verticeID) {
		this.verticeID = verticeID;
	}

}
