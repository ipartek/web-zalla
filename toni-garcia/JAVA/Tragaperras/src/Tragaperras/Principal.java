package Tragaperras;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sc1;
		double cantidades = 0.0;

		Maquina tragaperras = new Maquina();

		do {
			System.out.println("");
			System.out.println("Bienvenido a la maquina tragaperras.Elige una opcion:");
			System.out.println("");

			System.out.println("1-Introducir saldo");
			System.out.println("2-Consultar saldo");
			System.out.println("3-Jugar");
			System.out.println("4-Recoger saldo");
			System.out.println("5-Salir");

			sc1 = sc.nextInt();

			switch (sc1) {
			case 1:
				System.out.println("Que cantidad quieres introducir?");
				cantidades = sc.nextDouble();
				tragaperras.setSaldo(Funciones.introducirSaldo(cantidades));
				System.out.println("Tu saldo actual es de: " + tragaperras.getSaldo());

				break;
			case 2:
				System.out.println("Su saldo es: " + tragaperras.getSaldo());
				break;
			case 3:

				tragaperras.setSaldo(Funciones.premio(Funciones.jugar()));
				System.out.println("Tu saldo actual es de: " + tragaperras.getSaldo());
				break;
			case 4:
				System.out.println("Retirando saldo de: " + tragaperras.getSaldo());
				tragaperras.borrarSaldo();
				System.out.print("El valor de su cuenta es ahora : " + tragaperras.getSaldo());
				break;
			case 5:
				break;
			}
		} while (sc1 != 5);
		sc.close();
	}
}