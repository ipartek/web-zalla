package prueba;

import java.util.ArrayList;

public class Orcos implements Razas {

	//CLASES
	
	ArrayList<Humano> ejercitoHumanos = Prueba.Humanos.Humanos;
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
	public int combate() {

		int bajas = 0, pos = 0;

		for (Orco soldadoSelecc : Orcos) {

			Object enemigo = ejercitoHumanos.get(pos);

			Humano humano = (Humano) enemigo;

			switch (humano.raza) {

			case "Humano":

				Humano enemigoHumano = (Humano) enemigo;

				if (soldadoSelecc.atacar() - humano.armadura >= humano.PV) {

					enemigoHumano.setPV(0);
					bajas++;
					System.out.println("LLEGO3" + bajas);

				} else {

					humano.setPV((soldadoSelecc.atacar() - humano.armadura) - humano.PV);

				}
				if (ejercitoHumanos.indexOf(enemigo) == ejercitoHumanos.size()) {
					pos = 0;

				}
				if (bajas != 0) {

					 

				}
				pos++;
			}

		}

		return bajas;

	}

	public void Ordenar() {

		int i;
		Orco aux;
		for (i = 0; i < Orcos.size() - 1; i++) {
			if (Orcos.get(i + 1).PV < Orcos.get(i).PV) {
				aux = Orcos.get(i + 1);
				Orcos.set(i + 1, Orcos.get(i));
				Orcos.set(i, aux);
			}
		}
		for (i = 0; i < Orcos.size() - 1; i++) {

			System.out.println(Orcos.get(i));

		}
	}

}
