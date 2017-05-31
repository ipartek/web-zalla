
public class EjemploMatrices {

	public static void main(String[] args) {
		//
		int NUM_FILAS = 4;
		int NUM_COLUMNAS = 4;
		int[][] matrizEnteros = new int[NUM_FILAS][NUM_COLUMNAS];
		matrizEnteros[0] = new int[] { 1, 4, 2, 6 };
		matrizEnteros[1] = new int[] { 11, -4, 12, 2 };
		matrizEnteros[2] = new int[] { 133, 41, -2, -16 };
		matrizEnteros[3] = new int[] { 10, 44, 36, 4 };
		//
		int[][] matrizEnteros2 = new int[NUM_FILAS][NUM_COLUMNAS];
		matrizEnteros2[0] = new int[] { 1, 4, 2, 6 };
		matrizEnteros2[1] = new int[] { 11, -57, 12, 2 };
		matrizEnteros2[2] = new int[] { 133, 41, 3, -16 };
		matrizEnteros2[3] = new int[] { 10, 44, -16, 4 };
		//
		int[][] matrizSuma = new int[NUM_FILAS][NUM_COLUMNAS];

		recorrer(matrizEnteros);
		calcularMaximo(matrizEnteros);
		matrizSimetrica(matrizEnteros);
		sumaDiagonal(matrizEnteros);
		sumarMatrices(matrizEnteros, matrizEnteros2, matrizSuma);
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
		System.out.println("        Matriz ");
		System.out.println("----------------------");

		System.out.println(cadenaMatriz);
	}

	public static void recorrer2(int[][] matrizEnteros2) {
		String cadenaMatriz = "";
		String cadenaFila = "";
		for (int i = 0; i < matrizEnteros2.length; i++) {
			cadenaFila = "";
			for (int j = 0; j < matrizEnteros2[0].length; j++) {
				cadenaFila = cadenaFila + matrizEnteros2[i][j];
				if (j != matrizEnteros2[0].length - 1) {
					cadenaFila = cadenaFila + " , ";
				}
			}
			if (i != matrizEnteros2.length - 1) {
				cadenaFila = cadenaFila + "\n";
			}
			cadenaMatriz = cadenaMatriz + cadenaFila;
		}
		System.out.println("        Matriz 2");
		System.out.println("----------------------");

		System.out.println(cadenaMatriz);
	}

	public static void calcularMaximo(int[][] matrizEnteros) {
		int numeroMaximo = matrizEnteros[0][0];
		int numero;
		for (int i = 0; i < matrizEnteros.length; i++) {
			for (int j = 0; j < matrizEnteros[0].length; j++) {
				numero = matrizEnteros[i][j];
				if (numero > numeroMaximo) {
					numeroMaximo = numero;
				}
			}
		}

		System.out.println("----------------------");
		System.out.println("");
		System.out.println("El numero maximo de la matriz es : " + numeroMaximo);
		System.out.println("");

	}

	public static void matrizSimetrica(int[][] matrizEnteros) {
		boolean simetrica = true;
		int numeroComparar1 = matrizEnteros[0][0];
		int numeroComparar2 = matrizEnteros[0][0];
		for (int i = 0; i < matrizEnteros.length; i++) {
			for (int j = 0; j < matrizEnteros[0].length; j++) {
				if (i != j) {
					numeroComparar1 = matrizEnteros[i][j];
					numeroComparar2 = matrizEnteros[j][i];
					if (numeroComparar1 != numeroComparar2) {
						simetrica = false;
					}
				}
			}
		}
		if (simetrica) {
			System.out.println("----------------------");
			System.out.println("");
			System.out.println("La matriz es simetrica");
			System.out.println("");
		} else {
			System.out.println("----------------------");
			System.out.println("");
			System.out.println("La matriz  no es simetrica");
			System.out.println("");
		}
		System.out.println("----------------------");
		System.out.println("");
	}

	public static void sumaDiagonal(int[][] matrizEnteros) {
		int sumaDiagonal = 0;
		int valorDiagonal = matrizEnteros[0][0];

		for (int i = 0; i < matrizEnteros.length; i++) {
			valorDiagonal = matrizEnteros[i][i];
			sumaDiagonal = sumaDiagonal + valorDiagonal;
		}

		System.out.println("La suma de la diagonal es : " + sumaDiagonal);
		System.out.println("");

	}

	public static void sumarMatrices(int[][] matrizEnteros, int[][] matrizEnteros2, int[][] matrizSuma) {
		int numeroMatriz1 = matrizEnteros[0][0];
		int numeroMatriz2 = matrizEnteros[0][0];
		int sumaMatriz = matrizEnteros[0][0];
		recorrer(matrizEnteros);
		recorrer2(matrizEnteros2);
		for (int i = 0; i < matrizEnteros.length; i++) {
			for (int j = 0; j < matrizEnteros[0].length; j++) {
				numeroMatriz1 = matrizEnteros[i][j];
				numeroMatriz2 = matrizEnteros[i][j];
				sumaMatriz = numeroMatriz1 + numeroMatriz2;
				matrizSuma[i][j] = sumaMatriz;
			}
		}
		recorrerSuma(matrizSuma);
	}
	
	public static void recorrerSuma(int[][] matrizSuma) {
		String cadenaMatriz = "";
		String cadenaFila = "";
		for (int i = 0; i < matrizSuma.length; i++) {
			cadenaFila = "";
			for (int j = 0; j < matrizSuma[0].length; j++) {
				cadenaFila = cadenaFila + matrizSuma[i][j];
				if (j != matrizSuma[0].length - 1) {
					cadenaFila = cadenaFila + " , ";
				}
			}
			if (i != matrizSuma.length - 1) {
				cadenaFila = cadenaFila + "\n";
			}
			cadenaMatriz = cadenaMatriz + cadenaFila;
		}
		System.out.println("        Matriz Suma");
		System.out.println("----------------------");

		System.out.println(cadenaMatriz);
	}

}
