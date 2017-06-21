package empresa;

public class Dni {
	
	private int numero;
	private char letra;
	
	public Dni(int numero, char letra){
		this.numero = numero;
		this.letra = letra;
	}

	
	public String getDni(){
		String cadena = Integer.toString(this.numero) + this.letra;
		return cadena;
	}
}
