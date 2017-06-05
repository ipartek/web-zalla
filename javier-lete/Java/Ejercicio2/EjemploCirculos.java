package geometria;

public class EjemploCirculos {

	public static void main(String[] args) {
		Punto centro = new Punto(3, 4);
		Circulo circulo1 = new Circulo(centro, 5);
		Circulo circulo2 = new Circulo(circulo1);
		System.out.println(circulo1);
		System.out.println(circulo2);
		circulo1.desplazar(2, 2);
		System.out.println(circulo1);
		System.out.println(circulo2);
		double perimetro = circulo1.calcularPerimetro();
		System.out.println(circulo1);
		System.out.println("perimetro: " + perimetro);
		circulo1.escalar(200);
		perimetro = circulo1.calcularPerimetro();
		System.out.println(circulo1);
		System.out.println("perimetro: " + perimetro);
	}

}
