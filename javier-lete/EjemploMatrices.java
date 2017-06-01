
public class EjemploMatrices {

	public static void main(String[] args) {
		//
		int NUM_FILAS = 4;
		int NUM_COLUMNAS = 4;

		int NUM_FILAS3 = 2;
		int NUM_COLUMNAS3 = 3;

		int NUM_FILAS4 = 3;
		int NUM_COLUMNAS4 = 2;
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
		int[][] matrizEnteros3 = new int[NUM_FILAS3][NUM_COLUMNAS3];
		matrizEnteros3[0] = new int[] { 1, 4, 2 };
		matrizEnteros3[1] = new int[] { 11, -4, 12 };

		//
		int[][] matrizEnteros4 = new int[NUM_FILAS4][NUM_COLUMNAS4];
		matrizEnteros4[0] = new int[] { 1, 4 };
		matrizEnteros4[1] = new int[] { 11, -57 };
		matrizEnteros4[2] = new int[] { 133, 41 };
		//
		int[][] matrizSuma = new int[NUM_FILAS][NUM_COLUMNAS];

		//
		// int filasTemporal = NUM_FILAS3 * NUM_FILAS4;
		//int[][] matrizMultiplicar = new int[NUM_FILAS][NUM_COLUMNAS];
		int[] matrizTemporal = new int[60];
		matrizTemporal = new int[] { };

		recorrer(matrizEnteros);
		calcularMaximo(matrizEnteros);
		matrizSimetrica(matrizEnteros);
		sumaDiagonal(matrizEnteros);
		sumarMatrices(matrizEnteros, matrizEnteros2, matrizSuma);
		multiplicarMatrices(matrizEnteros3, matrizEnteros4, matrizTemporal);
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

	public static void recorrer3(int[][] matrizEnteros3) {
		String cadenaMatriz = "";
		String cadenaFila = "";
		for (int i = 0; i < matrizEnteros3.length; i++) {
			cadenaFila = "";
			for (int j = 0; j < matrizEnteros3[0].length; j++) {
				cadenaFila = cadenaFila + matrizEnteros3[i][j];
				if (j != matrizEnteros3[0].length - 1) {
					cadenaFila = cadenaFila + " , ";
				}
			}
			if (i != matrizEnteros3.length - 1) {
				cadenaFila = cadenaFila + "\n";
			}
			cadenaMatriz = cadenaMatriz + cadenaFila;
		}
		System.out.println("  ");
		System.out.println("        Matriz 3 ");
		System.out.println("----------------------");

		System.out.println(cadenaMatriz);
	}

	public static void recorrer4(int[][] matrizEnteros4) {
		String cadenaMatriz = "";
		String cadenaFila = "";
		for (int i = 0; i < matrizEnteros4.length; i++) {
			cadenaFila = "";
			for (int j = 0; j < matrizEnteros4[0].length; j++) {
				cadenaFila = cadenaFila + matrizEnteros4[i][j];
				if (j != matrizEnteros4[0].length - 1) {
					cadenaFila = cadenaFila + " , ";
				}
			}
			if (i != matrizEnteros4.length - 1) {
				cadenaFila = cadenaFila + "\n";
			}
			cadenaMatriz = cadenaMatriz + cadenaFila;
		}
		System.out.println(" ");
		System.out.println("        Matriz 4 ");
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

	public static void multiplicarMatrices(int[][] matrizEnteros3, int[][] matrizEnteros4,int[] matrizTemporal) {
		
		int matriz3Columna = matrizEnteros3[0].length;
		int matriz4Fila = matrizEnteros4.length;
		int matriz4Columna = matrizEnteros4[0].length;
		int tempSuma = 0;
		int tempMultiplicacion=matrizEnteros3[0][0] ;
		int tempMultiplicacion2=matrizEnteros4[0][0] ;
		int tempMultiplicacion3 ;
		recorrer3(matrizEnteros3);
		recorrer4(matrizEnteros4);
		if (matriz3Columna == matriz4Fila) {

			for (int i = 0; i < matrizEnteros3.length; i++) {
				System.out.println("");
				tempMultiplicacion3=0;
				tempMultiplicacion = matrizEnteros3[i][0];
				
				//for (int j = 0; j < matrizEnteros3[0].length; j++) {			
					for (int k = 0; k < matrizEnteros4.length; k++) {
						tempMultiplicacion3=0;
						tempMultiplicacion2=matrizEnteros4[k][0];
						tempMultiplicacion3 =tempMultiplicacion* tempMultiplicacion2;
						//tempSuma=tempSuma+tempMultiplicacion;
						//matrizTemporal[i] = tempSuma;
						System.out.println("");
						System.out.print("");
						System.out.print(tempMultiplicacion3 + ",");
						//for (int q = 0; q < matrizEnteros4[0].length; q++) {	
							
						//}
						
					//}
				}
				//recorrerMultiplicar(matrizTemporal);
			}
		} else {
			System.out.println("la matriz no se puede multiplicar");
		}
	}

	public static void recorrerMultiplicar(int[] matrizTemporal) {
		for (int i = 0; i < matrizTemporal.length; i++) {
			System.out.println("");
			System.out.print(matrizTemporal + ",");
		}

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
		System.out.println("");
		System.out.println("        Matriz Suma");
		System.out.println("----------------------");

		System.out.println(cadenaMatriz);
	}

}
