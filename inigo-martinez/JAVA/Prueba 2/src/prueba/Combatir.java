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

	public void run() {

		do {

			try {
				sleep(100);
				int pos = 0;

				for (Unidad unidadAtac : ejercAliado) {

					if (pos >= ejercEnemigo.size())
						pos = 0;

					Unidad enemigo = (Unidad) ejercEnemigo.get(pos);

					if (unidadAtac.isVivo()) {

						int vida = (unidadAtac.atacar() - enemigo.getArmadura());

						enemigo.herir(vida);
						if (!enemigo.isVivo()) {

							
							Borrar(enemigo);
							if (ejercEnemigo.indexOf(enemigo) == ejercEnemigo.size()) {
								pos=0;
								
							}
							
						}
					}
					pos++;
					if (ejercEnemigo.size() - 1==0) {

						interrupt();

					}
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} while (!ejercEnemigo.isEmpty() && !ejercAliado.isEmpty());

	}
	
	synchronized void Borrar(Unidad enemigo){
		
		bajas++;
		System.out.println(enemigo.getRaza() + " MUERE. BAJAS TOTALES: " + bajas);
		ejercEnemigo.remove(ejercEnemigo.indexOf(enemigo));	
		
	}
}
