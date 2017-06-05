package prueba;

import java.util.ArrayList;
import java.util.List;

public class Combatir extends Thread {

	List<Unidad> ejercEnemigo = new ArrayList<Unidad>();
	List<Unidad> ejercAliado = new ArrayList<Unidad>();
	static int bajas = 0;

	public Combatir(List<Unidad> ejercEnemigo, List<Unidad> ejercAliado) {
		
		super();
		this.ejercEnemigo = ejercEnemigo;
		this.ejercAliado = ejercAliado;
	
	}

	public synchronized void run() {

		do {

			int pos = 0;

			for (Unidad unidadAtac : ejercAliado) {

				if (ejercEnemigo.isEmpty()) {

					System.out.println(bajas);

				}
				if (pos >= ejercEnemigo.size())
					pos = 0;

				Unidad enemigo = (Unidad) ejercEnemigo.get(pos);

				if (unidadAtac.isVivo()) {

					int vida = (unidadAtac.atacar() - enemigo.getArmadura());

					enemigo.herir(vida);

					if (!enemigo.isVivo()) {

						bajas++;
						System.out.println("LLEGO " + unidadAtac.getRaza() + " " + bajas);

						ejercEnemigo.remove(ejercEnemigo.indexOf(enemigo));

						if (ejercEnemigo.indexOf(enemigo) == ejercEnemigo.size()) {
							pos = 0;

						}
						pos++;
					}
				}
			}
		} while (!ejercEnemigo.isEmpty() && !ejercAliado.isEmpty());
	}
}
