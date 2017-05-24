package prueba;

import java.util.ArrayList;

public class Humanos implements Razas {

	ArrayList<Orco> ejercitoOrco = Prueba.Orcos.Orcos;
	ArrayList<Humano> Humanos = new ArrayList<Humano>();

	public Humanos(int tamanio) {
		Creacion(tamanio);
	}

	@Override
	public ArrayList<Humano> Creacion(int tamanio) {

		for (int i = 0; i < tamanio; i++) {

			Humano soldado = new Humano();

			Humanos.add(soldado);
		}

		return Humanos;

	}

	@Override
	public int combate() {

		int bajas = 0, pos = 0;

		for (Humano soldadoSelecc : Humanos) {

			Object enemigo = ejercitoOrco.get(pos);

			Orco orco = (Orco) enemigo;

			switch (orco.raza) {

			case "Orco":

				Orco enemigoOrco = (Orco) enemigo;

				int saludTotal = enemigoOrco.armadura + enemigoOrco.PV;

				if (soldadoSelecc.atacar() - orco.armadura >= orco.PV) {

					enemigoOrco.setPV(0);;
					bajas++;
					System.out.println("LLEGO4" + bajas);

				} else {

					orco.setPV((soldadoSelecc.atacar() - orco.armadura) - orco.PV);
					;

				}
				if (ejercitoOrco.indexOf(enemigo) == ejercitoOrco.size()) {
					pos = 0;

				}
				if (bajas != 0) {

					Ordenar();

				}
				pos++;

			}

		}

		return bajas;

	}

	public void Ordenar() {

		int i;
		Humano aux;
		for (i = 0; i < Humanos.size() - 1; i++) {
			if (Humanos.get(i + 1).PV < Humanos.get(i).PV) {
				aux = Humanos.get(i + 1);
				Humanos.set(i + 1, Humanos.get(i));
				Humanos.set(i, aux);
			}
		}
		for (i = 0; i < Humanos.size() - 1; i++) {

			System.out.println(Humanos.get(i));
			if(Humanos.get(i).getPV()==0){
				
				Humanos.remove(i);
			}

		}
	}
	
}
