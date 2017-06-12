package tragaperras;

public class Premio {
	
	private Fruta[] combinacion;
	private double premio;	
	
	public Premio(Fruta[] frutas, double premio){
		this.combinacion = java.util.Arrays.copyOf(frutas, frutas.length);
		this.premio = premio;
	}

	/**
	 * @return the combinacion
	 */
	public Fruta[] getCombinacion() {
		return combinacion;
	}

	/**
	 * @return the premio
	 */
	public double getPremio() {
		return premio;
	}
}

