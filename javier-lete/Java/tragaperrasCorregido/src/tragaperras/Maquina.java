package tragaperras;

import java.util.Random;
import java.util.Arrays;

public class Maquina {
	// definimos las variables
	private int casillas;
	private double precioJugada;
	private double creditoDisponible;
	private Premio[] premios;

	// definimos maquina
	public Maquina(int casillas, double precios, Premio... premios) {
		this.precioJugada = precios;
		this.casillas = casillas;
		this.premios = premios;
	}

	// leemos precio jugada
	public double getPrecioJugada() {
		return precioJugada;
	}

	// asignamos precio jugada a precio
	public void setPrecioJugada(double precioJugada) {
		this.precioJugada = precioJugada;
	}

	// leemos el credito disponible
	public double getCreditoDisponible() {
		return creditoDisponible;
	}

	// asignamos el credito disponible a credito
	public void setCreditoDisponible(double creditoDisponible) {
		this.creditoDisponible = creditoDisponible;
	}

	// numero casillas del array a jugar
	public int getCasillas() {
		return casillas;
	}

	// leemos la coleccion de premios
	public Premio[] getPremios() {
		return premios;
	}

	// asignamos los creditos del inicio
	public void incrementarCredito(double incremento) {
		this.creditoDisponible = this.creditoDisponible + incremento;
	}

	// cobramos y dejamos el credito a 0
	public void cobrar() {
		System.out.println("");
		System.out.println("Retirando " + creditoDisponible + " euros de la maquina");
		this.creditoDisponible = 0;
	}

	// jugamos una partida
	public Fruta[] jugar() {
		// mientras el credito sea mayor al precio de jugada
		if (creditoDisponible >= precioJugada) {
			// descontamos a credito el precio de la jugada
			creditoDisponible = creditoDisponible - precioJugada;
			// generamos la jugada aleatoria
			Fruta[] frutasJugadaAleatoria = new Fruta[casillas];
			Random generador = new Random();
			Fruta[] arrayFrutasEnumeracion = Fruta.values();
			for (int i = 0; i < casillas; i++) {
				int index = generador.nextInt(arrayFrutasEnumeracion.length);
				frutasJugadaAleatoria[i] = arrayFrutasEnumeracion[index];
			}
			boolean premiado = false;
			for (int i = 0; i < premios.length && (!premiado); i++) {
				// comprueba si combinación esta en premios registrados
				if (Arrays.equals(frutasJugadaAleatoria, premios[i].getCombinacionGanadora())) {
					// incrementamos el credito con el premio
					creditoDisponible = creditoDisponible + premios[i].getCantidad();
					System.out.println("----------------PREMIO DE " + premios[i].getCantidad() + " ---------------");
					premiado = true;
				}
			}
			return frutasJugadaAleatoria;
		}
		return null;
	}
}
