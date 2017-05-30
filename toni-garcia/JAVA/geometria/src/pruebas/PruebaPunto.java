package pruebas;

import geometria.Punto;

public class PruebaPunto {

	public static void main(String[] args) {
		//Declara la variable local punto1 y asigna un objeto Punto en las coordenadas
		//(1, 3). Muestra el valor de las propiedades x e y por la consola.
	
		Punto punto1 = new Punto(1,3);
		System.out.println("punto1: ");
		punto1.obtenerInfo();
		
		//Declara la variable punto2 y asigna un objeto Punto construido a partir del
		//constructor sin parámetros. Muestra por la consola el valor de sus propiedades.
		Punto punto2 = new Punto();
		System.out.println("punto2: ");
		punto2.obtenerInfo();
		
		
		// Declara la variable punto3 y asigna un objeto Punto construido a partir del punto1
		//(constructor de copia). Muestra sus propiedades por la consola.
		Punto punto3 = new Punto(punto1);
		System.out.println("punto3: ");
		punto3.obtenerInfo();
		
		
		// Declara la variable punto4 y asígnale la variable punto2.
		
		Punto punto4 = punto2;
		System.out.println("punto4: ");
		punto4.obtenerInfo();
		
		// Modifica las coordenadas de punto2 y muestra el valor de las propiedades por la
		//consola. Muestra también el valor de las propiedades del punto4. Observa que tienen
		//los mismos valores porque son referencias al mismo objeto. 
		punto2.Desplazar(100, 200);
		System.out.println("punto2 movido: ");
		punto2.obtenerInfo();
		punto4.obtenerInfo();
		
	}
	
}
