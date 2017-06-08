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
		punto1.desplazarPunto(3, 4);
		mostrarInfo("punto1", punto1);

		// -----------------ejemplo 2----------------------------------------------------

		System.out.println("----------------------");
		System.out.println("");

		Punto punto5 = new Punto(5, 5);
		mostrarInfo("punto5", punto5);

		Punto punto6 = new Punto(8, 8);
		mostrarInfo("punto6", punto6);

		double distancia = punto5.distancia(punto6);
		System.out.println("");
		System.out.println("la distancia entre estos puntos es : " + distancia);
		
		Direccion dir = Direccion.ARRIBA;
		punto5.MuevePunto(dir);
		System.out.println("");
		System.out.println("Movemos por parametro una posicion (arriba) punto5 "+ punto5);
		
		Punto punto0 = new Punto();
		
		Punto compruebaDistancia[] = { punto5, punto6 };
		Punto puntoLejano = new Punto(punto0.MayorDistancia(compruebaDistancia));
		System.out.println("");
		System.out.println("El punto mas lejano entere "+ punto5+" , "+punto6+" es "+puntoLejano);
		
		Circulo circulo1 = new Circulo(punto5, 3);
		Circulo circulo2 = new Circulo(punto5, 5);
		circulo2.desplazarCirculo(3, 2);
		
		
		circulo1.MuestraCirculo("circulo 1");
		
		circulo2.MuestraCirculo("circulo2");
		
		Punto centro = circulo2.getCentro();
		//System.out.println("");
		centro.MuevePunto(Direccion.ABAJO);
		mostrarInfo("Centro del circulo", centro);
	
		circulo2.MuestraCirculo("circulo2");
		//System.out.println("");
		circulo2.escalar(150);
		
		circulo2.MuestraCirculo("circulo2");
		
		Rectangulo rectangulo1 = new Rectangulo(5, 3, punto5);
		System.out.println("");
		rectangulo1.muestraRectangulo("rectangulo1");
		rectangulo1.desplazar(5, 6);
		rectangulo1.muestraRectangulo("rectangulo1");
		
		

	}

	public static void mostrarInfo(String nombrePunto, Punto punto) {
		System.out.println("Datos " + nombrePunto + ": " + punto);

	}

}
