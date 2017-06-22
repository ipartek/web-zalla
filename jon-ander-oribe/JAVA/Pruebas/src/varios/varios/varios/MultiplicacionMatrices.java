package varios;
import java.util.Arrays;
import java.util.Scanner;

public class MultiplicacionMatrices {
	
	//static int [][] respuesta= new int[][]{{1,2,3},{3,4,5}};
	static String respuesta="";
	
	public static String MultiplicaMatrices(int[][] array1,int[][] array2){
		
		/*int[][] arrayFinal=new int[3][3];
		String respuesta="";
		
		for(int i=0;i<array1.length;i++){
			int valor1=array1[0][i];
			int valor2=array2[0][i];
			arrayFinal[i][i]=valor1+valor2;
		}
		
		respuesta=Arrays.deepToString(arrayFinal);
		
		 return respuesta;*/
		
		int[][] m1 = {{1,0,2},{-1,3,1}};
		int[][] m2 = {{3,1},{2,1},{1,0}};
		
		int fil_m1 = m1.length;
		int col_m1 = m1[0].length;
		 
		int fil_m2 = m2.length;
		int col_m2 = m2[0].length;
		
		int[][] multiplicacion = new int[fil_m1][col_m2];
		
		for (int x=0; x < multiplicacion.length; x++) {
			  for (int y=0; y < multiplicacion[x].length; y++) {
			    for (int z=0; z<col_m1; z++) {
			      multiplicacion [x][y] += m1[x][z]*m2[z][y]; 
			    }
			  }
			}

		respuesta=Arrays.deepToString(multiplicacion);
		
		 return respuesta;
	}
	
	

}
