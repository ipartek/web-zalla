package java24h;

import java.util.Random;

public class CalcularMaximoArray {
	public static void main(String[] args) {
		//
		int NUM_ELEMENTOS = Integer.parseInt(args[0]);
		int MAXIMO_VALOR_ARRAY = Integer.parseInt(args[1]);
		//
		int[] arrayEnteros = crearArray(NUM_ELEMENTOS, MAXIMO_VALOR_ARRAY);
		recorrerArray(arrayEnteros);
		//
		int maximo = obtenerMaximoArray(arrayEnteros);
		System.out.println("El número máximo es : " + maximo);
		
		int minimo = obtenerMinimoArray(arrayEnteros);
		System.out.println("El número mínimo es : " + minimo);


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
		//Random random = new Random();
		for (int i = 0; i < arrayEnteros.length; i++) {
			System.out.println("Elemento del array con posicion " + i + ": " + arrayEnteros[i]);
		}
	}

	public static int obtenerMaximoArray(int[] arrayEnteros) {
		int maximo = arrayEnteros[0];
		for(int i=0;i<arrayEnteros.length;i++){
			if(maximo<arrayEnteros[i]){
				maximo = arrayEnteros[i];
			}
		}
		return maximo;
	}
	public static int obtenerMinimoArray(int[] arrayEnteros) {
		int minimo = arrayEnteros[0];
		for(int i=0;i<arrayEnteros.length;i++){
			if(minimo>arrayEnteros[i]){
				minimo = arrayEnteros[i];
			}
		}
		return minimo;
	}
	}
