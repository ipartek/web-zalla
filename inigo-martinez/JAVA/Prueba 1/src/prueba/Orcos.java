package prueba;

import java.util.ArrayList;

public class Orcos implements Razas {

	ArrayList<Orco> Orcos = new ArrayList<Orco>();

	public Orcos(int tamanio) {
		Creacion(tamanio);
	}

	public ArrayList<Orco> Creacion(int tamanio) {

		for (int i = 0; i < tamanio; i++) {

			Orco soldado = new Orco();

			Orcos.add(soldado);
		}

		return Orcos;

	}

	@Override
	public int combate(ArrayList<?> Enemigos) {

		int bajas = 0, pos = 0;

		for (Orco soldadoSelecc : Orcos) {

			Object enemigo = Enemigos.get(pos);

			switch (enemigo.toString()) {

			case "Humano":

				Humano enemigoOrco = (Humano) enemigo;

				int saludTotal = enemigoOrco.armadura + enemigoOrco.PV;

				if (soldadoSelecc.atacar() >= saludTotal) {

					Enemigos.remove(enemigo);
					bajas++;

				}
				if (Enemigos.indexOf(enemigo) == Enemigos.size()) {
					pos = 0;

				}

			}

		}

		return bajas;

	}

}
