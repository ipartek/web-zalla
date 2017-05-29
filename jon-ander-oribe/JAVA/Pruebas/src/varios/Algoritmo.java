package varios;

import java.util.Arrays;
import java.util.Scanner;

public class Algoritmo {

	public static int[] mostrarMaximo(int a, int b, int c, int d, int e, int f, int g, int h, int ix) {
		int[] resultado = new int[9];
		resultado[0] = a;
		resultado[1] = b;
		resultado[2] = c;
		resultado[3] = d;
		resultado[4] = e;
		resultado[5] = f;
		resultado[6] = g;
		resultado[7] = h;
		resultado[8] = ix;
		int mayor = 0;
		int aux = 0;

		for (int num : resultado) {
			System.out.println("Elemento: " + num);
		}

		for (int i = 0; i < resultado.length; i++) {
			if (resultado[i] > aux) {
				aux = resultado[i];

			}
		}

		System.out.println("Mayor: " + aux);

		return resultado;
	}

	// ALGORITMO DE ORDENACION

	public static int[] ordenarArray(int a, int b, int c, int d, int e, int f, int g, int h, int ix) {

		int[] arrayOrdenado = new int[9];
		arrayOrdenado[0] = a;
		arrayOrdenado[1] = b;
		arrayOrdenado[2] = c;
		arrayOrdenado[3] = d;
		arrayOrdenado[4] = e;
		arrayOrdenado[5] = f;
		arrayOrdenado[6] = g;
		arrayOrdenado[7] = h;
		arrayOrdenado[8] = ix;
		int aux = 0;

		for (int i = 0; i < (arrayOrdenado.length - 1); i++) {
			for (int j = 0; j < (arrayOrdenado.length - 1); j++) {
				if (arrayOrdenado[j + 1] < arrayOrdenado[j]) {
					aux = arrayOrdenado[j + 1];
					arrayOrdenado[j + 1] = arrayOrdenado[j];
					arrayOrdenado[j] = aux;
				}
			}

		}

		return arrayOrdenado;

	}

	// ALGORITMO BINARIO

	public static String busquedaBinaria(int sc1) {

		int[] arrayOrdenado = new int[5];
		arrayOrdenado[0] = 1;
		arrayOrdenado[1] = 3;
		arrayOrdenado[2] = 5;
		arrayOrdenado[3] = 7;
		arrayOrdenado[4] = 9;

		int aux = 0, posActu = (arrayOrdenado.length / 2);
		int posInicial = arrayOrdenado[posActu];
		int posFinal = sc1;
		try {
			while (posInicial != posFinal && aux <= arrayOrdenado.length) {
				System.out.println("Buscando...");

				if (posInicial < posFinal) {

					System.out.println("Buscando HACIA ARRIBA");
					posActu *= 2;
					if (posActu > arrayOrdenado.length) {

						posActu = arrayOrdenado.length;

					}
					posInicial = arrayOrdenado[posActu];
					aux++;

				} else if (posInicial > posFinal) {

					System.out.println("Buscando HACIA ABAJO");
					posActu /= 2;
					posInicial = arrayOrdenado[posActu];
					aux++;

				}
			}
		} catch (Exception e) {
			return "NO EXISTE";
		}

		
		if (posInicial == posFinal)
			return "Posicion de " + posFinal + " en la posicion [" + (posActu) + "]";
		else
			return "NO EXISTE";

	}

	public static void main(String[] args) {

		String[] array = new String[] { "2", "3", "4" };

		System.out.println(Arrays.toString(array));

		int[] num = mostrarMaximo(3, 26, 4, 12, 1, 88, 32, 11, 7);

		int[] numOr = ordenarArray(3, 26, 4, 12, 1, 88, 32, 11, 7);

		System.out.println(Arrays.toString(num));
		System.out.println("***********************************************");
		System.out.println(Arrays.toString(numOr));
		System.out.println("***********************************************");
		System.out.println("Que numero quieres buscar?");
		Scanner sc = new Scanner(System.in);
		int sc1 = sc.nextInt();
		System.out.println(busquedaBinaria(sc1));

	}

}
