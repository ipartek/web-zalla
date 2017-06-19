package prueba;

import java.util.List;

public class Combate extends Thread {

	private List<Unidad> ejercAliado;
	private List<Unidad> ejercEnemigo;
	private List<Unidad> bajasGenerales;
	private int bajas;

	public Combate(List<Unidad> ejercAliado, List<Unidad> ejercEnemigo, List<Unidad> bajasGenerales, int bajas) {
		super();
		this.ejercAliado = ejercAliado;
		this.ejercEnemigo = ejercEnemigo;
		this.bajasGenerales = bajasGenerales;
		this.bajas = bajas;
	}

	public void run() {

		int pos = 0;
		try {
			for (Unidad unidadAtac : ejercAliado) {

				if (ejercEnemigo.isEmpty()) {

					interrupted();

				}
				if (pos >= ejercEnemigo.size())
					pos = 0;

				Unidad enemigo = (Unidad) ejercEnemigo.get(pos);

				if (unidadAtac.isVivo()) {

					int danioRealizado = (unidadAtac.atacar() - enemigo.getArmadura());

					enemigo.herir(danioRealizado);

					if (!enemigo.isVivo()) {

						bajas++;
						System.out.println("LLEGO " + unidadAtac.getRaza() + " " + bajas);
						bajasGenerales.add(enemigo);
						ejercEnemigo.remove(ejercEnemigo.indexOf(enemigo));

						if (ejercEnemigo.indexOf(enemigo) == ejercEnemigo.size()) {
							pos = 0;

						}
						pos++;
					}
				}
			}
			sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

		}
	}

}
