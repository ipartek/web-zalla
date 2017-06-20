package colecciones;

public class Dni implements Comparable<Dni>{
	private String numero;
	private char letra;

	public Dni(String numero, char letra) {
		this.numero = numero;
		this.letra = letra;
	}

	public void obtenerInfo() {
		System.out.println("DNI número: " + numero + "-" + letra);

	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	@Override
	public int compareTo(Dni otroDni) {
		int diferenciaDni = this.numero.compareTo(otroDni.numero);
		if (diferenciaDni == 0) {
			return 0;
		} else {
			return diferenciaDni;
		}
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + letra;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
		if (letra != other.letra)
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}
	
	
	
}