package tragaperras;

import java.util.Arrays;

public class Premio {
	private Fruta[] combinacionGanadora;
	private int cantidad;

	public Fruta[] getCombinacionGanadora() {
		return combinacionGanadora;
	}

	public int getCantidad() {
		return cantidad;
	}

	// CONSTRUCTORES
	public Premio(Fruta[] combinacionGanadora, int cantidad) {
		this.combinacionGanadora = Arrays.copyOf(combinacionGanadora, combinacionGanadora.length);
		// this.combinacionGanadora = new Fruta[combinacionGanadora.length];
		// for (int i = 0; i < combinacionGanadora.length; i++) {
		// this.combinacionGanadora[i] = combinacionGanadora[i];
		// }
		this.cantidad = cantidad;
	}
}
