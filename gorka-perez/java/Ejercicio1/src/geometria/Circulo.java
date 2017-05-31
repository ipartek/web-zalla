package geometria;

public class Circulo {

		private Punto centro;
		private double radio;
		private double perimetro = 2 * radio * Math.PI;
		private static Punto centroCoord = new Punto(0,0);
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
		
		public Punto getCentro() {
			return centro;
		}

		public double getRadio() {
			return radio;
		}
		
		public double getPerimetro() {
			return perimetro;
		}

	


}
