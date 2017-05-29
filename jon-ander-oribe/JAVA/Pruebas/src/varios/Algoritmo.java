package varios;

import java.util.Arrays;

public class Algoritmo {

	public static int[] mostrarMaximo(int a, int b, int c, int d, int e, int f) {
		int[] resultado = new int[6];
		resultado[0] = a;
		resultado[1] = b;
		resultado[2] = c;
		resultado[3] = d;
		resultado[4] = e;
		resultado[5] = f;
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
	
	public static int[] ordenarArray(int a, int b, int c, int d, int e, int f){
		
		int [] arrayOrdenado= new int[6];
		arrayOrdenado[0] = a;
		arrayOrdenado[1] = b;
		arrayOrdenado[2] = c;
		arrayOrdenado[3] = d;
		arrayOrdenado[4] = e;
		arrayOrdenado[5] = f;
		int aux=0;
		
		for(int i=0;i<(arrayOrdenado.length-1);i++){// ESTO NO FUNCIONA
			for(int j=1;j<(arrayOrdenado.length-1);j++){
			if(arrayOrdenado[i]>arrayOrdenado[j]){
				aux=arrayOrdenado[i];
				arrayOrdenado[i]=arrayOrdenado[j];
				arrayOrdenado[j]=aux;
			}
			}
			
		}
		
		return arrayOrdenado;
		
	}

	public static void main(String[] args) {

		String[] array = new String[] { "2", "3", "4" };

		System.out.println(Arrays.toString(array));

		int[] num=mostrarMaximo(3, 26, 4, 12, 1, 88);
		
		int[] numOr=ordenarArray(3, 26, 4, 12, 1, 88);
		
		System.out.println(Arrays.toString(num));
		System.out.println("***********************************************");
		System.out.println(Arrays.toString(numOr));

	}

}
