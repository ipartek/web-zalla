package colecciones;

public class Dni {
	
	private String dni="";
	@Override
	public String toString() {
		return "Dni [dni=" + dni + ", letra=" + letra + "]";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	private char letra=' ';
	
	public Dni(String dni,char letra){
		this.dni=dni;
		this.letra=letra;
		
	}

}
