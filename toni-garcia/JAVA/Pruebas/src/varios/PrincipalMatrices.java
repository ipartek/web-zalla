package varios;

import java.util.Arrays;
import java.util.Scanner;

public class PrincipalMatrices {

	static int i1 = 0;
	static int j1 = 0;
	static int x1 = 0;
	static int z1 = 0;

	public static void main(String[] args) {

		System.out.println("Introduce los valores de la matriz con la que quieres trabajar: [Formato i,j]");

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el valor de 0|0");
		i1 = sc.nextInt();
		System.out.println("Introduce el valor de 0|1");
		j1 = sc.nextInt();

		System.out.println("Introduce el valor de 1|0");
		x1 = sc.nextInt();
		System.out.println("Introduce el valor de 1|1");
		z1 = sc.nextInt();

		System.out.println("Sobre que posición quieres hacer el cambio?");

		System.out.println("Posición X");
		int coordX = sc.nextInt();
		System.out.println("Posición Y");
		int coordY = sc.nextInt();

		System.out.println("Cual es el nuevo valor?");
		int valor = sc.nextInt();

		// ZONA DE PRUEBAS

		int[][] arrayTest1 = new int[][] { { i1, j1 }, { x1, z1 } };
		int[][] arrayTest2 = new int[][] { { i1, j1 }, { x1, z1 } };
		arrayTest1[coordX][coordY] = valor;
		arrayTest2[coordX][coordY] = valor;
		int[][] arrayTest3 = new int[2][2];
		int[] arrayAux1 = new int[2];
		int[] arrayAux2 = new int[2];
		int[][] arrayFinal= new int[2][2];

		// MULTIPLICACION

		/*
		 * arrayTest3[0][0] = (arrayTest1[0][0] * arrayTest2[0][0]) +
		 * (arrayTest1[0][1] * arrayTest2[1][0]); arrayTest3[0][1] =
		 * (arrayTest1[0][0] * arrayTest2[0][1]) + (arrayTest1[0][1] *
		 * arrayTest2[1][1]); arrayTest3[1][0] = (arrayTest1[1][0] *
		 * arrayTest2[0][0]) + (arrayTest1[1][1] * arrayTest2[1][0]);
		 * arrayTest3[1][1] = (arrayTest1[1][0] * arrayTest2[0][1]) +
		 * (arrayTest1[1][1] * arrayTest2[1][1]);
		 */

		// FOR

		/*
		 * for(int iX=0;iX<arrayTest1.length;iX++){ for(int
		 * jX=0;jX<arrayTest2.length;jX++){ arrayTest3[iX][jX] =
		 * (arrayTest1[iX][jX] * arrayTest2[iX][jX]) + (arrayTest1[iX][1] *
		 * arrayTest2[1][jX]); } }
		 */

		// FOR APROXIMACION

		for (int i = 0; i < arrayTest1.length; i++) {
			for (int j = 0; j < arrayTest2.length; j++) {
				for(int z=0;z< arrayFinal.length;z++){
				arrayAux1[z]=arrayTest1[i][j];
				arrayAux2[z]=arrayTest2[j][i];
				//arrayFinal[i][j]=arrayAux1[i]+arrayAux2[j];
				}
			}
		}

		System.out.println("Array 1: ");
		System.out.println("\t" + Arrays.deepToString(arrayTest1).replace("], ", "]\n\t"));
		System.out.println("Array 2: ");
		System.out.print("\t" + Arrays.deepToString(arrayTest2).replace("], ", "]\n\t"));
		System.out.println("");
		System.out.println("Array TEST: ");
		System.out.println("\t" + Arrays.toString(arrayAux1).replace("], ", "]\n\t"));
		System.out.println("\t" + Arrays.toString(arrayAux2).replace("], ", "]\n\t"));

	}

}
