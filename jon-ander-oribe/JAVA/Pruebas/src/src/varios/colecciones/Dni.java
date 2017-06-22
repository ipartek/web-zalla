package varios.colecciones;


public class Dni implements Comparable<Dni>{

	private String dni;
	private char letra;

	
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

	

	public Dni(String dni, char letra) {
		this.dni = dni;
		this.letra = letra;

	}
	
	/*public int compareTo(Dni otroDni) {
		int diferencia = Integer.parseInt(this.dni) - Integer.parseInt(otroDni.dni);
		if (diferencia == 0) {
			diferencia = this.letra - otroDni.letra;
		}
		return diferencia;
	}*/
	/*
	public int compareToConIf(Dni otroDni) {
		return (this.dni.compareTo(otroDni.dni) == 0 ? this.letra - otroDni.letra
				: this.dni.compareTo(otroDni.dni));
	}
*/
	public void obtenerInfo() {
		System.out.println("DNI número: " + dni + "-" + letra);

	}
	
	

	public int funcionIfSimplificado() {
		if (dni == null) {
			return 0;
		} else {
			return dni.hashCode();
		}
	}

	@Override
	public int compareTo(Dni o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
