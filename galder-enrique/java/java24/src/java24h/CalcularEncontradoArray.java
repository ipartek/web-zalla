package paquete1;

import java.util.Random;

public class CalcularMaximoArray {
	public static void main(String[] args) {
		//
		int NUM_ELEMENTOS = 100;
		int MAXIMO_VALOR_ARRAY = 1000;
		//
		int[] arrayEnteros = crearArray(NUM_ELEMENTOS, MAXIMO_VALOR_ARRAY);
		System.out.println("DESORDENADO");
		System.out.println("-------------------------------------------------------------------------");
		recorrerArray(arrayEnteros);
		//
		int maximo = obtenerMaximoArray(arrayEnteros);
		int suma = sumar(arrayEnteros);
		// int resultadoMultiplicar = multiplicar(arrayEnteros);
		ordenarArray(arrayEnteros);
		System.out.println("ORDENADO");
		System.out.println("-------------------------------------------------------------------------");
		recorrerArray(arrayEnteros);
		int elementoBuscar = 19;
		int posicionElementoBuscar = busquedaNormal(arrayEnteros, elementoBuscar);
		int posicionElementoBuscarOrdenado = busquedaNormalArrayOrdenado(arrayEnteros, elementoBuscar);
		int posicionFinal = busquedaBinaria(arrayEnteros, elementoBuscar);

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
		for (int i = 0; i < arrayEnteros.length; i++) {
			System.out.println("Elemento del array con posicion " + i + ": " + arrayEnteros[i]);
		}
	}

	public static int obtenerMaximoArray(int[] arrayEnteros) {
		int maximo = arrayEnteros[0];
		for (int i = 0; i < arrayEnteros.length; i++) {
			if (arrayEnteros[i] > maximo) {
				maximo = arrayEnteros[i];
			}
		}
		System.out.println("El número maximo  es " + maximo);
		return maximo;
	}

	public static int sumar(int[] arrayEnteros) {
		int suma = 0;
		for (int i = 0; i < arrayEnteros.length; i++) {
			suma = suma + arrayEnteros[i];
		}

		System.out.println("la suma del array es  " + suma);
		return suma;

	}

	public static int multiplicar(int[] arrayEnteros) {
		int multiplicacion = 1;
		for (int i = 1; i < arrayEnteros.length; i++) {
			multiplicacion = multiplicacion * arrayEnteros[i];

		}
		System.out.println("la multiplicación del array es " + multiplicacion);
		return multiplicacion;
	}

	public static void ordenarArray(int[] arrayEnteros) {

		for (int i = 0; i < (arrayEnteros.length - 1); i++) {
			for (int j = i + 1; j < arrayEnteros.length; j++) {
				if (arrayEnteros[i] > arrayEnteros[j]) {
					int varauxiliar = arrayEnteros[i];
					arrayEnteros[i] = arrayEnteros[j];
					arrayEnteros[j] = varauxiliar;
				}
			}
		}

	}

	public static int busquedaNormal(int[] arrayEnteros, int elementoBuscar) {
		int posicion = -1;
		boolean encontrado = false;
		for (int i = 0; (i < arrayEnteros.length) && (encontrado == false); i++) {
			if (arrayEnteros[i] == elementoBuscar) {
				posicion = i;
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("Se ha encontrado el elemento en la posición " + posicion);
		} else {
			System.out.println("No se ha encontrado el elemento");
		}
		return posicion;
	}

	public static int busquedaNormalArrayOrdenado(int[] arrayEnteros, int elementoBuscar) {
		int posicion = -1;
		boolean encontrado = false;
		boolean pasado = false;
		for (int i = 0; (i < arrayEnteros.length) && (encontrado == false) && (pasado == false); i++) {
			if (arrayEnteros[i] == elementoBuscar) {
				posicion = i;
				encontrado = true;
			}
			if (arrayEnteros[i] > elementoBuscar) {
				pasado = true;
			}
		}
		if (encontrado) {
			System.out.println("Se ha encontrado el elemento en la posición " + posicion);
		} else if (pasado) {
			System.out.println("Se ha pasado");
		} else {
			System.out.println("No se ha encontrado el elemento");
		}
		return posicion;
	}

	public static int busquedaBinaria(int[] arrayEnteros, int elementoBuscar) {
		int posicion = -1;
		int posicionInicial = 0;
		int posicionFinal = arrayEnteros.length - 1;
		int posicionMedio = 0;
		boolean encontrado =false;
		while (()&&(encontrado==true)) {
			posicionMedio = (posicionInicial + posicionFinal) / 2;
			if (elementoBuscar == arrayEnteros[posicionMedio]) {
				encontrado=true;
				posicion=posicionMedio;
			} else if (elementoBuscar < arrayEnteros[posicionMedio]) {
				posicionFinal = posicionMedio - 1;
			} else {
				posicionInicial = posicionMedio + 1;
			}
		}
		if (encontrado) {
			System.out.println("Se ha encontrado el elemento en la posición " + posicion);
		} else {
			System.out.println("No se ha encontrado el elemento");
		}
		return posicion;
	}
}