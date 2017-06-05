package varios;
import java.util.Arrays;
import java.util.Scanner;

public class MultiplicacionMatrices {
	
	static int [][] respuesta= new int[][]{{1,2,3},{3,4,5}};
	
	public static String MultiplicaMatrices(int[][] array1,int[][] array2){
		
		int[][] arrayFinal=new int[3][3];
		String respuesta="";
		
		for(int i=0;i<array1.length;i++){
			int valor1=array1[0][i];
			int valor2=array2[0][i];
			arrayFinal[i][i]=valor1+valor2;
		}
		
		respuesta=Arrays.deepToString(arrayFinal);
		
		 return respuesta;
	}
	
	

}
