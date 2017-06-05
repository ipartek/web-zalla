package geometria;

public class Circulo {

		private Punto centro;
		private double radio;

		private static Punto centroCoord = new Punto();
		private static double radioDefecto = 5;
		
		//círculo por defecto, valores por defecto
		public Circulo() {
			this.centro = new Punto(centroCoord);
			this.radio = radioDefecto;
		}
		//Círculo a partir de un punto y un radio
		public Circulo(Punto centro, double radio) {
			this.centro = new Punto(centro);
			this.radio = radio;
		}
		//Círculo a partir de otro
		public Circulo(Circulo circulo) {
			this.centro = circulo.centro;
			this.radio = circulo.radio;
		}
		
		public void desplazar (double x, double y){
			this.centro.desplazar(x, y);
		}
		
		public void desplazar (Punto centro){
			this.centro = centro;
		}
		
		public void escalar(double escala){
			this.radio = this.radio*escala / 100;
		}
		
		public Punto getCentro() {
			return centro;
		}

		public double getRadio() {
			return radio;
		}
		
		public double getPerimetro() {
			return 2 * radio * Math.PI;
		}
}
