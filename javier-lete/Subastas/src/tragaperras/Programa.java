package tragaperras;

import java.util.Scanner;
import java.util.Arrays;

public class Programa {

	public static void main(String[] args) {
		Fruta[] combinacion1 = { Fruta.FRESA, Fruta.FRESA, Fruta.FRESA };
		Premio premio1 = new Premio(combinacion1, 20);
		Fruta[] combinacion2 = { Fruta.SANDIA, Fruta.FRESA, Fruta.SANDIA };
		Premio premio2 = new Premio(combinacion2, 10);
		Maquina maquina = new Maquina(3, 0.5, premio1, premio2);

		System.out.println("Introduzca el crédito: ");
		Scanner teclado = new Scanner(System.in);
		double credito = teclado.nextDouble();
		teclado.nextLine();
		maquina.IncrementarCredito(credito);
		while (maquina.getCredito() > 0) {
			// 4.1 Realiza la jugada
			Fruta[] combinacion = maquina.Jugar();

			// 4.2 Muestra la combinación obtenida y el crédito
			System.out.println(Arrays.toString(combinacion) + " --- " + maquina.getCredito());
			// 4.3 Pide al usuario que pulse intro para continuar
			System.out.println("Pulse Intro para volver a jugar");
			teclado.nextLine();
		}
		teclado.close();

	}

}
