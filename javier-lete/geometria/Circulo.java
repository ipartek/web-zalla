package geometria;

public class Circulo {
	private Punto centro;
	private int radio;
	private float perimetro = (float) (2 * Math.PI * radio);

	public Circulo(Punto centro, int radio) {
		this.centro = centro;
		this.radio = radio;
	}

	public Circulo() {
		final Punto c = new Punto();
		final int r = 5;
		this.centro = c;
		this.radio = r;
	}

	public Circulo(Circulo circulo) {
		this.radio = circulo.radio;
		this.centro = circulo.centro;
	}

	public void desplazarCirculo(int mueveX, int mueveY){
		Punto nuevoCentro =new Punto(this.centro.getX()+mueveX, this.centro.getY()+mueveY);
		this.setCentro(nuevoCentro);
	}
	
	public void escalar(int porcentaje){
		this.setRadio(this.getRadio()*porcentaje/100);
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}
	public void MuestraCirculo(String nombre){
		System.out.println("Soy " + nombre + ", empiezo en " + this.centro.getX() + ", " + this.centro.getY() + " y mi radio es de " + radio);
	}

}
