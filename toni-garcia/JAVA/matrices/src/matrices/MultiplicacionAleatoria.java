package matrices;

import java.util.Random;
import java.util.Scanner;
 
public class MultiplicacionAleatoria {
 
	public static void main (String args[]){
 
		  Random r=new Random();
	      Scanner in=new Scanner(System.in);
 
	        System.out.println("ingrese numero de filas de la primera matriz");
	       int x1=in.nextInt();
	        System.out.println("ingrese numero de columnas de la primera matriz");
	       int z1=in.nextInt();
	        System.out.println("ingrese numero de filas de la segunda matriz");
	       int x2=in.nextInt();
	        System.out.println("ingrese numero de columnas de la segunda matriz");
	       int z2=in.nextInt();
 
	       int[][] m1=new int[x1][z1];
	       int[][] m2=new int[x2][z2];
	       int[][] mR=new int[x1][z2];
	        System.out.println("La matriz 1");
 
 
	        for(int i=0;i<x1;i++){
	            System.out.print("[ ");
	            for(int j=0;j<z1;j++){
	                m1[i][j]=r.nextInt(9);
	                System.out.print(m1[i][j]+" ");
	            }
	            System.out.print("]");
	            System.out.println("");
	        }
	        System.out.println("La matriz 2");
	        for(int i=0;i<x2;i++){
	            System.out.print("[ ");
	            for(int j=0;j<z2;j++){
	                m2[i][j]=r.nextInt(9);
	                System.out.print(m2[i][j]+" ");
	            }
	            System.out.print("]");
	            System.out.println("");
	        }
 
	        if(z1==x2){
	            System.out.println("La matriz resultante es: ");
 
	            for(int i=0;i<x1;i++){
 
	            	System.out.print("[ ");
 
	            for(int j=0;j<z2;j++){
 
 
	            for(int h=0;h<z1;h++){
 
	            	 mR[i][j]+=m1[i][h]*m2[h][j];
                }
                System.out.print(mR[i][j]+" ");
            }
            System.out.print("]");
            System.out.println("");
        }
    }
    else{
        System.out.println("Los rangos de las matrices son incorrectos");
    }
}
 
	}