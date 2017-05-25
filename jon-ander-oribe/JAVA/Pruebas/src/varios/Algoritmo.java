package varios;

public class Algoritmo {
	
	public static int[] arrayOrdenado(int a,int b,int c){
		int[] listaFinal= new int[3];
		listaFinal[0]=a;
		listaFinal[1]=b;
		listaFinal[2]=c;
		
		return listaFinal;
		
	}

	public static void main(String[] args) {
		int a=3;
		int b=12;
		int c=8;
		
		System.out.println(arrayOrdenado(4,8,9).toString());


	}

}
