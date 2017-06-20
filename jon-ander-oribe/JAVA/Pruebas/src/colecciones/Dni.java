package colecciones;

public class Dni {
	
	private String dni="";
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + letra;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dni other = (Dni) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (letra != other.letra)
			return false;
		return true;
	}

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
