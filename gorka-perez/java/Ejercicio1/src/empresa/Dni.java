package empresa;

public class Dni {
	private int numero;
	private char letra;
	
	/**
	 * @param numero
	 * @param letra
	 */
	public Dni(int numero, char letra) {
		super();
		this.numero = numero;
		this.letra = letra;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dni [numero=" + numero + ", letra=" + letra + "]";
	}
}
