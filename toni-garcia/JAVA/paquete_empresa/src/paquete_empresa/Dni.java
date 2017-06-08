package paquete_empresa;

public class Dni {
	
	private int numero;
	private char letra;
	
	public Dni(int numero, char letra) {
		super();
		this.numero = numero;
		this.letra = letra;
	}

	@Override
	public String toString() {
		return "Dni [numero=" + numero + ", letra=" + letra + "]";
	}
	
	
	
	

}
