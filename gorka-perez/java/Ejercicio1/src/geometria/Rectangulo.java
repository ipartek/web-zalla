package geometria;

public class Rectangulo {
	
	private double ladoX;
	private double ladoY;
	
	private Punto verticeII;
	private Punto verticeID;
	private Punto verticeSI;
	private Punto verticeSD;
	
	public Rectangulo(Punto verticeII, double ladoX, double ladoY){
		this.ladoX = ladoX;
		this.ladoY = ladoY;
		this.verticeII = new Punto(verticeII);
	}
	public Rectangulo(Punto verticeII, Punto verticeSD){
		
		this.verticeSD = new Punto(verticeSD);
		this.verticeII = new Punto(verticeII);
	}
	public void desplazar (double x, double y){
		this.verticeII.desplazar(x, y);
		this.verticeID.desplazar(x, y);
		this.verticeSI.desplazar(x, y);
		this.verticeSD.desplazar(x, y);
	}
	/**
	 * @return the ladoX
	 */
	public double getLadoX() {
		return ladoX;
	}
	/**
	 * @param ladoX the ladoX to set
	 */
	public void setLadoX(double ladoX) {
		this.ladoX = ladoX;
	}
	/**
	 * @return the ladoY
	 */
	public double getLadoY() {
		return ladoY;
	}
	/**
	 * @param ladoY the ladoY to set
	 */
	public void setLadoY(double ladoY) {
		this.ladoY = ladoY;
	}
	/**
	 * @return the verticeII
	 */
	public Punto getVerticeII() {
		return verticeII;
	}
	/**
	 * @param verticeII the verticeII to set
	 */
	public void setVerticeII(Punto verticeII) {
		this.verticeII = verticeII;
	}
	/**
	 * @return the verticeID
	 */
	public Punto getVerticeID() {
		return verticeID;
	}
	/**
	 * @param verticeID the verticeID to set
	 */
	public void setVerticeID(Punto verticeID) {
		this.verticeID = verticeID;
	}
	/**
	 * @return the verticeSI
	 */
	public Punto getVerticeSI() {
		return verticeSI;
	}
	/**
	 * @param verticeSI the verticeSI to set
	 */
	public void setVerticeSI(Punto verticeSI) {
		this.verticeSI = verticeSI;
	}
	/**
	 * @return the verticeSD
	 */
	public Punto getVerticeSD() {
		return verticeSD;
	}
	/**
	 * @param verticeSD the verticeSD to set
	 */
	public void setVerticeSD(Punto verticeSD) {
		this.verticeSD = verticeSD;
	}
	
}
