package tragaperras;

import java.util.Arrays;

public class Premio {

	private Fruta[] combinacion;
	private int premio;
	
	public Premio(Fruta[] combinacion, int premio) {
		super();
		this.combinacion = Arrays.copyOf(combinacion, combinacion.length);
		this.premio = premio;
	}
	
	public Fruta[] getCombinacion() {
		return combinacion;
	}
	
	public int getPremio() {
		return premio;
	}
	
}
