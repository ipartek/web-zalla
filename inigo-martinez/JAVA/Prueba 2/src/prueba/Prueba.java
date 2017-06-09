package prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * El programa funciona correctamente
 * 
 * Falta integrar hilos y hacer funcional goblins. Esta �ltima parte te la dejo
 * a ti Jon Ander.
 **/

public class Prueba {

	static Thread ejercitoMaq;
	static Thread ejercitoHum;
	static int bajasJug, bajasMaq;

	public static void main(String args[]) {

		List<Unidad> ejercMaqu = new ArrayList<Unidad>();
		List<Unidad> ejercJugador = new ArrayList<Unidad>();

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

		System.out.println("Elige la raza ENEMIGA");
		System.out.println("1.- Humanos");
		System.out.println("2.- Orcos");

		int eleccEnemiga = teclado.nextInt();

		System.out.print("Introduce la cantidad de soldados de tu ejercito: ");
		tamanio = teclado.nextInt();
		try {

			switch (eleccion) {

			case 1:
				// Humanos
				crearEjercito("Humano", tamanio, ejercJugador);
				break;

			case 2:

				crearEjercito("Orco", tamanio, ejercJugador);
				break;

			case 3:
				// GOBLINS
				crearEjercito("Goblin", tamanio, ejercJugador);

				break;

			default:
				System.out.println("Opci�n no valida");

			}
			switch (eleccEnemiga) {
			case 1:
				// Humanos
				crearEjercito("Humano", tamanio, ejercMaqu);
				break;

			case 2:

				crearEjercito("Orco", tamanio, ejercMaqu);
				break;

			case 3:
				// GOBLINS
				crearEjercito("Goblin", tamanio, ejercMaqu);

				break;

			default:
				System.out.println("Opci�n no valida");

			}

			ejercitoMaq = new Thread(new Combatir(ejercMaqu, ejercJugador));
			ejercitoHum = new Thread(new Combatir(ejercMaqu, ejercJugador));

			// bajasMaq = combate(ejercJugador, ejercMaqu, bajasMaq);
			// bajasJug = combate(ejercMaqu, ejercJugador, bajasJug);
			ejercitoMaq.start();
			ejercitoHum.start();

			System.out.println(bajasJug);
			System.out.println(bajasMaq);
			System.out.println("TOTAL " + bajasMaq + bajasJug);
			if (!ejercitoMaq.isAlive() && !ejercitoHum.isAlive()) {
				for (int i = 0; ejercJugador.size() - 1 >= i; i++) {

					System.out.println(ejercJugador.get(i));

				}
				for (int i = 0; ejercMaqu.size() - 1 >= i; i++) {

					System.out.println(ejercMaqu.get(i));

				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		teclado.close();
	}

	public static void crearEjercito(String raza, int tamanio, List<Unidad> ejercito) {
		Unidad soldado;

		for (int i = 0; i < tamanio; i++) {

			switch (raza) {
			case "Humano":
				soldado = new Humano();
				ejercito.add(soldado);
				break;
			case "Orco":
				soldado = new Orco();
				ejercito.add(soldado);
				break;
			case "Goblin":
				soldado = new Goblin();
				ejercito.add(soldado);
				break;
			}

		}

	}

	/**
	 * public static int combate(List<Unidad> ejercAtac, List<Unidad>
	 * ejercDefen, int bajas) {
	 * 
	 * int pos = 0;
	 * 
	 * for (Unidad unidadAtac : ejercAtac) {
	 * 
	 * if (ejercDefen.isEmpty()) {
	 * 
	 * return bajas;
	 * 
	 * } if (pos >= ejercDefen.size()) pos = 0;
	 * 
	 * Unidad enemigo = (Unidad) ejercDefen.get(pos);
	 * 
	 * if (unidadAtac.isVivo()) {
	 * 
	 * int vida = (unidadAtac.atacar() - enemigo.getArmadura());
	 * 
	 * enemigo.herir(vida);
	 * 
	 * if (!enemigo.isVivo()) {
	 * 
	 * bajas++; System.out.println("LLEGO " + unidadAtac.getRaza() + " " +
	 * bajas);
	 * 
	 * ejercDefen.remove(ejercDefen.indexOf(enemigo));
	 * 
	 * if (ejercDefen.indexOf(enemigo) == ejercDefen.size()) { pos = 0;
	 * 
	 * } pos++; } } } return bajas; }
	 **/
}
