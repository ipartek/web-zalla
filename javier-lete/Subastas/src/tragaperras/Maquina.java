package tragaperras;

public class Maquina {
	private int numCasillas;
	private double precioJugada;
	private double credito;
	private Premio[] premiosConcedidos;

	public Maquina(int numCasillas, double precioJugada, Premio... premiosConcedidos) {
		super();
		this.numCasillas = numCasillas;
		this.precioJugada = precioJugada;
		this.premiosConcedidos = premiosConcedidos;
	}

	public int getNumCasillas() {
		return numCasillas;
	}

	public double getPrecioJugada() {
		return precioJugada;
	}

	public void setPrecioJugada(double precioJugada) {
		this.precioJugada = precioJugada;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public Premio[] getPremiosConcedidos() {
		return premiosConcedidos;
	}

	public void IncrementarCredito(double cantidadAIncrementar) {
		this.credito += this.credito + cantidadAIncrementar;
	}

	public double Cobrar() {
		double cantidadAcobrar = this.credito;
		this.credito = 0;
		return cantidadAcobrar;
	}

	public Fruta[] Jugar() {
		Fruta[] combi = new Fruta[this.numCasillas];
		int randomNum;
		if (this.credito >= this.precioJugada) {
			this.credito -= this.precioJugada;
			for (int i = 0; i < combi.length; i++) {
				randomNum = (int) (Math.random() * Fruta.values().length);
				combi[i] = Fruta.values().clone()[randomNum];
			}
			for (int p = 0; p < premiosConcedidos.length; p++) {
				//Fruta[] premio = premiosConcedidos[p].getCombinacion();

				if (sonIguales(combi, this.premiosConcedidos[p].getCombinacion())) {
					this.credito += this.premiosConcedidos[p].getPremio();
				}
			}
		}
		return combi;
	}

	public boolean sonIguales(Fruta[] combi1, Fruta[] combi2) {
		boolean iguales = true;
		if (combi1.length != combi2.length) {
			iguales = false;
		}
		for (int i = 0; i < combi1.length && iguales; i++) {
			if (combi1[i] != combi2[i]) {
				iguales = false;
			}
		}
		return iguales;
	}

}
