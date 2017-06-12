package tragaperras;

import java.util.Random;

public class Maquina {
	private int casillas;
	private double precioJugada;
	private double credito;
	private Premio[] premios;

	public Maquina(int casillas, double precioJugada, Premio... premios) {

		this.casillas = casillas;
		this.precioJugada = precioJugada;
		this.premios = premios;
	}

	public void incrementarCredito(double credito) {
		this.credito = this.credito + credito;
	}

	public double cobrar(double credito) {
		double creditoFinal = this.credito;
		this.credito = 0;
		return creditoFinal;
	}

	public Fruta[] jugar() {
		double creditoJugada = this.credito - this.precioJugada;
		if (creditoJugada >= 0) {
			
			boolean premiado = false;
			this.credito = creditoJugada;

			Random random = new Random();
			Fruta[] combinacionFrutas = new Fruta[this.casillas];

			for (int i = 0; i < this.casillas; i++) {
				combinacionFrutas[i] = Fruta.values()[random.nextInt(Fruta.values().length)];
			}			
			for (int i = 0; i < premios.length && (!premiado); i++) {
				if (combinacionFrutas.equals(premios[i].getCombinacion())){
					premiado = true;
					credito = credito + premios[i].getPremio();
				}
			}			
			return combinacionFrutas;
		} else {
			return null;
		}
	}

	/**
	 * @return the casillas
	 */
	public double getCasillas() {
		return casillas;
	}

	/**
	 * @return the precioJugada
	 */
	public double getPrecioJugada() {
		return precioJugada;
	}

	/**
	 * @return the credito
	 */
	public double getCredito() {
		return credito;
	}

	/**
	 * @param credito
	 *            the credito to set
	 */
	public void setCredito(double credito) {
		this.credito = credito;
	}

	/**
	 * @return the premios
	 */
	public Premio[] getPremios() {
		return premios;
	}

}
