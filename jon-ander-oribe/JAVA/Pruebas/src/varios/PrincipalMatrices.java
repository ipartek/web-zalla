package varios;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class PrincipalMatrices {

	static int i = 0;
	static int j = 0;
	static int x = 0;
	static int z = 0;

	public static void main(String[] args) {

		System.out.println("Introduce el tamaño de la matriz con la que quieres trabajar: [Formato i,j]");

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el tamaño de la i");
		i = sc.nextInt();
		System.out.println("Introduce el tamaño de la j");
		j = sc.nextInt();
		
		  System.out.println("Introduce el tamaño de la x"); x=sc.nextInt();
		  System.out.println("Introduce el tamaño de la z"); z=sc.nextInt();
		 

		int[][] array1 = new int[i][j];
		int[][] array2 = new int[x][z];

		System.out.println("Vamos a rellenar la matriz \"i j\"");

		for (int k = 0; k < i; k++) {
			array1[k][k] = 1;
			for(int kj=0;kj<j;kj++){
				array1[k][kj]=2;
			}

		}
		
		System.out.println("Vamos a rellenar la matriz \"x z\"");

		for (int k = 0; k < x; k++) {
			array2[k][k] = 3;
			for(int kj=0;kj<z;kj++){
				array2[k][kj]=4;
			}

		}
		
		
		System.out.println("Array 1: ");
		System.out.println("\t"+Arrays.deepToString(array1).replace("], ", "]\n\t"));
		System.out.println("Array 2: ");
		System.out.print("\t"+Arrays.deepToString(array2).replace("], ", "]\n\t"));
		System.out.println("");
		MultiplicacionMatrices.MultiplicaMatrices(array1,array2);
		System.out.println(MultiplicacionMatrices.respuesta);

	}

}
