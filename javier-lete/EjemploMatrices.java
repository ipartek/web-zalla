package paquete1;

public class EjemploMatrices {

	public static void main(String[] args) {
		//
		int NUM_FILAS = 4;
		int NUM_COLUMNAS = 4;
		int[][] matrizEnteros = new int[NUM_FILAS][NUM_COLUMNAS];
		matrizEnteros[0] = new int[] { 1, 4, 2, 6 };
		matrizEnteros[1] = new int[] { 11, -4, 12, 2 };
		matrizEnteros[2] = new int[] { 133, 41, -2, -16 };
		matrizEnteros[3] = new int[] { 10, 44, -52, 4 };
		//
		recorrer(matrizEnteros);
	}

	public static void recorrer(int[][] matrizEnteros) {
		String cadenaMatriz = "";
		String cadenaFila = "";
		for (int i = 0; i < matrizEnteros.length; i++) {
			cadenaFila = "";
			for (int j = 0; j < matrizEnteros[0].length; j++) {
				cadenaFila = cadenaFila + matrizEnteros[i][j];
				if (j != matrizEnteros[0].length - 1) {
					cadenaFila = cadenaFila + " , ";
				}
			}
			if (i != matrizEnteros.length - 1) {
				cadenaFila = cadenaFila + "\n";
			}
			cadenaMatriz = cadenaMatriz + cadenaFila;
		}
		System.out.println(cadenaMatriz);
	}

}
