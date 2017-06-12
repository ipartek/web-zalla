package Tragaperras;

import java.util.Scanner;
import java.util.Arrays;

public class Programa {
	public static void main(String[] args) {

		// 1. Declara dos variables locales de tipo Premio
		Fruta[] combinacion1 = { Fruta.FRESA, Fruta.FRESA, Fruta.FRESA };
		Premio premio1 = new Premio(combinacion1, 20);
		Fruta[] combinacion2 = { Fruta.SANDIA, Fruta.FRESA, Fruta.SANDIA };
		Premio premio2 = new Premio(combinacion2, 10);

		/*
		 * 2. Crea una máquina con un tamaño de combinación de 3 frutas, un
		 * precio por partida de 0,5 euros y los dos premios declarados
		 * previamente
		 */
		maquina maquina = new maquina(3, 0.5, premio1, premio2);

		/*
		 * 3. Solicita al usuario que introduzca por teclado la cantidad de
		 * crédito para jugar.
		 */
		System.out.print("Introduzca el crédito para jugar : ");
		Scanner teclado = new Scanner(System.in);
		double credito = teclado.nextDouble();
		teclado.nextLine();
		maquina.incrementarCredito(credito);

		System.out.println("");
		System.out.println("Credito inicial :" + credito);
		

		// 4. Jugamos mientras haya crédito disponible
		Fruta[] combinacion;
		maquina.setCredDisp(credito);
		while (maquina.getCredito() > 0) {

			// 4.1 Realiza la jugada
			combinacion = maquina.jugar();

			// 4.2 Muestra la combinación obtenida y el crédito
			System.out.println("");
			System.out.println(Arrays.toString(combinacion) + " --- " + maquina.getCredito());

			// 4.3 Pide al usuario que pulse intro para continuar
			
			System.out.print("Pulse intro para volver a jugar y C para cobrar  ");
			System.out.print("");
			// comprobamos si metemos por teclado una c para cobrar y acabar el juego
			String s;
			s = teclado.nextLine();
			if (s.equals("c")||s.equals("C")) {
				maquina.cobrar();

			}
		}
		// cuando no hay credito suficiente
		System.out.println("");
		System.out.println("        --------------------");
		System.out.println("");
		System.out.println("Fin del juego: no dispone de credito ");
		System.out.println("");
		System.out.println("        --------------------");
	}
}
