package prueba;
import java.util.Scanner;

public class Hechizos {
	
	private int danio=0;
	private int curacion=0;
	
	public int bolaDeFuego(){
		danio=6*(int)(Math.random()*9);
		return danio;
	}
	
	public int curar(){
		curacion=4*(int)(Math.random()*7);
		return curacion;
	}
	
	public void lanzarHechizo(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Que hechizo quieres utilizar?[1-Bola de Fuego,2-Curar]");
		int opcion=sc.nextInt();
		switch(opcion){
		case 1:
			System.out.println("Lanzando una peligrosamente imprecisa bola de fuego");
			bolaDeFuego();
			break;
			
		case 2:
			System.out.println("Tengo el día simpatico asi que os lanzo curación");
			curar();
			break;
		}
	}

}
