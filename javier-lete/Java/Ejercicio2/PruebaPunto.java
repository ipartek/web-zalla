package geometria;

public class PruebaPunto {

	public static void main(String[] args) {
		Punto punto1 = new Punto(1, 3);
		mostrarInfo("punto1", punto1);
		Punto punto2 = new Punto();
		mostrarInfo("punto2", punto2);
		Punto punto3 = new Punto(punto1);
		mostrarInfo("punto3", punto3);
		punto1.setX(9);
		mostrarInfo("punto3", punto3);
		Punto punto4 = punto2;
		mostrarInfo("punto4", punto4);
		//
		punto2.setX(5);
		punto2.setY(17);
		mostrarInfo("punto2", punto2);
		mostrarInfo("punto4", punto4);
		//
		punto4.setX(3);
		punto4.setY(5);
		mostrarInfo("punto2", punto2);
		mostrarInfo("punto4", punto4);
		//
		punto1.desplazar(3, 4);
		mostrarInfo("punto1", punto1);

		// -----------------ejemplo
		// 2----------------------------------------------------

		System.out.println("----------------------");
		System.out.println("SEGUNDO EJEMPLO");

		Punto punto5 = new Punto(5, 5);
		mostrarInfo("punto5", punto5);

		Punto punto6 = new Punto(8, 8);
		mostrarInfo("punto6", punto6);

		double distancia = punto5.distancia(punto6);
		System.out.println("");
		System.out.println("la distancia entre estos puntos es : " + distancia);

		Direccion direccion = Direccion.ARRIBA;
		punto5.desplazar(direccion);
		System.out.println("");
		System.out.println("Movemos por parametro una posicion (arriba) punto5 " + punto5);

		Punto puntoMasLejano = Punto.mayorDistancia(punto5, punto6);
		System.out.println("");
		System.out.println("El punto mas lejano entere " + punto5 + " , " + punto6 + " es " + puntoMasLejano);

		Circulo circulo1 = new Circulo(punto5, 3);
		Circulo circulo2 = new Circulo(punto5, 5);
		circulo2.desplazar(3, 2);
		PruebaPunto.mostrarInfo("circulo1", circulo1);
		PruebaPunto.mostrarInfo("circulo2", circulo2);
		Punto centro = circulo2.getCentro();
		// System.out.println("");
		centro.desplazar(Direccion.ABAJO);
		mostrarInfo("Centro del circulo", centro);

		PruebaPunto.mostrarInfo("circulo2", circulo2);
		// System.out.println("");
		circulo2.escalar(150);

		PruebaPunto.mostrarInfo("circulo2", circulo2);
		Circulo circulo3 = new Circulo(circulo2);

		System.out.println("----------------------");
		System.out.println("TERCER EJEMPLO");

		Rectangulo rectangulo1 = new Rectangulo(5, 3, punto5);
		System.out.println("");
		PruebaPunto.mostrarInfo("rectangulo1", rectangulo1);
		rectangulo1.desplazar(5, 6);
		PruebaPunto.mostrarInfo("rectangulo1", rectangulo1);

	}

	public static void mostrarInfo(String nombrePunto, Punto punto) {
		System.out.println("Datos " + nombrePunto + ": " + punto);

	}

	public static void mostrarInfo(String nombre, Circulo circulo) {
		System.out.println("Soy " + nombre + ", y mi valor es: " + circulo.toString());
	}

	public static void mostrarInfo(String nombre, Rectangulo rectangulo) {
		System.out.println("Soy " + nombre + ", y mi valor es: " + rectangulo.toString());
	}

}
