package ejercicio2;

public class Programa {

	public static void main(String[] args) {
		
		// Declara la variable local punto1 y asigna un objeto Punto en (2, 3).
		Punto punto1 = new Punto(2, 3);
		Punto origen = new Punto();
		// Desplaza punto1 en la direcci�n hacia arriba.
		punto1.desplazar(Direccion.arriba);
		punto1.desplazar(Direccion.arriba);
		// Muestra las propiedades de punto1 por la consola.
		mostrarInfo("punto1", punto1);

		// Declara la variable local punto2 y asigna un objeto Punto en (4, 2).
		Punto punto2 = new Punto(4, 2);

		// Calcula la distancia entre punto1 y punto2. Muestra el resultado en
		// la consola.

		System.out.println("Distancia entre punto1 y punto2: " + punto1.distancia(punto2)+ "\n");

		// Utiliza el m�todo mayorDistancia para comprobar cu�l de los dos
		// puntos (punto1,punto2) est� m�s alejado del eje de coordenadas. 
		// Muestra el resultado en la consola.
		mostrarInfo("punto1", punto1);
		
		System.out.println("Distancia al origen punto1: " + origen.distancia(punto1) + "\n");
		Punto.distancia(origen, punto1);
		mostrarInfo("punto2", punto2);
		
		System.out.println("Distancia al origen punto2: " + origen.distancia(punto2) + "\n");
		
		
		System.out.println("El punto m�s alejado del origen de coordenadas es: ");
		mostrarInfo("punto", Punto.mayorDistancia(punto1, punto2));

		// Declara la variable circulo1 que sea asignada por un c�rculo que
		// tenga como centro
		// punto1 y radio 3.
		Circulo circulo1 = new Circulo();
		

		// Declara la variable circulo2 que sea asignada por un c�rculo que
		// tenga de nuevo como
		// centro punto1 y radio 5.

		// Desplaza circulo1 3 unidades en el eje X y 2 unidades en Y.

		// Muestra por la consola las coordenadas del centro de circulo1 y
		// circulo2. Las
		// coordenadas deben ser distintas puesto que el desplazamiento del
		// circulo1 no debe
		// influir en el circulo2.

		// Declara la variable centro y asignale el resultado de la consulta del
		// centro del circulo2.
		// Desplaza el centro hacia abajo.

		// Muestra por la consola las coordenadas del centro y del centro del
		// circulo2. Las
		// coordenadas deben ser distintas puesto que el desplazamiento del
		// centro no debe
		// influir en el circulo2.

		// Escala circulo2 al 150% y muestra sus propiedades por la consola.

	}

	public static void mostrarInfo(String nombrePunto, Punto punto) {
		System.out.println(nombrePunto + ": " + punto + "\n");
	}
	
}