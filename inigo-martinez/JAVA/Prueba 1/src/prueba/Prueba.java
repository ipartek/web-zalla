package prueba;

import java.util.Scanner;

// Falta arreglar el tema del combate.

public class Prueba {

	static Humanos Humanos;
	static Orcos Orcos;
	static Goblins Goblins;

	public static void main(String args[]) {

		int eleccion, tamanio;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Elige uno de los bandos:");
		System.out.println("1.- Humanos");
		System.out.println("2.- Orcos");
		System.out.println("3.- Los poderosos Goblins[Aun en fase Alpha]");
		System.out.println("Recuerdo que las aldeas se defienden con un minimo:");
		System.out.println("Humanos ---> 20 soldados");
		System.out.println("Orcos ---> 50 soldados");
		System.out.println("Goblins ---> 80 soldados");

		eleccion = teclado.nextInt();

		switch (eleccion) {

		case 1:
			// Humanos

			System.out.print("Introduce la cantidad de soldados de tu ejercito: ");
			tamanio = teclado.nextInt();
			Humanos = new Humanos(tamanio);
			// ORCOS
			Orcos = new Orcos(tamanio /** + 50 **/
			);

			break;

		case 2:
			System.out.print("Introduce la cantidad de soldados de tu ejercito: ");
			tamanio = teclado.nextInt();
			// ORCOS
			Orcos = new Orcos(tamanio);
			// HUMANOS
			if (tamanio > 120) {
				Humanos = new Humanos(tamanio /** - 100 **/
				);
			} else {
				Humanos = new Humanos(20);
			}
			break;

		case 3:
			System.out.println("Introduce la cantidad de soldados de tu ejercito: ");
			tamanio = teclado.nextInt();
			// GOBLINS
			Goblins = new Goblins(tamanio);
			// HUMANOS
			if (tamanio > 120) {
				Humanos = new Humanos(tamanio /** - 100 **/
				);
			} else {
				Humanos = new Humanos(20);
			}

		default:
			System.out.println("Opci�n no valida");
			

		}

		int bajasH, bajasO;

		do {

			bajasO = Humanos.combate();
			bajasH = Orcos.combate();

		} while (Humanos.Humanos.size() > 0 && Orcos.Orcos.size() > 0);

		teclado.close();
	}

}