package paquete1;

import java.util.Random;

public class CalcularMaximoArray {
	public static void main(String[] args) {
		//
		int NUM_ELEMENTOS = 100;
		int MAXIMO_VALOR_ARRAY = 1000;
		//
		int[] arrayEnteros = crearArray(NUM_ELEMENTOS, MAXIMO_VALOR_ARRAY);
		recorrerArray(arrayEnteros);
		//
		int maximo = obtenerMaximoArray(arrayEnteros);

	}

	public static int[] crearArray(int numElementos, int maximoValorArray) {
		int[] arrayEnteros = new int[numElementos];
		Random random = new Random();
		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = random.nextInt(maximoValorArray);
		}
		return arrayEnteros;
	}

	public static void recorrerArray(int[] arrayEnteros) {
		Random random = new Random();
		for (int i = 0; i < arrayEnteros.length; i++) {
			System.out.println("Elemento del array con posicion " + i + ": " + arrayEnteros[i]);
		}
	}

	public static int obtenerMaximoArray(int[] arrayEnteros) {
		return arrayEnteros[0];
	}

}
