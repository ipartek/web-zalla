package beans;

public class Dni implements Comparable<Dni> {
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
		int diferencia = Integer.parseInt(this.numero) - Integer.parseInt(otroDni.numero);
		if (diferencia == 0) {
			diferencia = this.letra - otroDni.letra;
		}
		return diferencia;
	}
	
	public int compareToGorka(Dni otroDni) {
		int diferencia = this.numero.compareTo(otroDni.numero);
		if (diferencia == 0) {
			diferencia = this.letra - otroDni.letra;
		}
		return diferencia;
	}

	public int compareToConIf(Dni otroDni) {
		return (this.numero.compareTo(otroDni.numero) == 0 ? this.letra - otroDni.letra
				: this.numero.compareTo(otroDni.numero));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + letra;
		// result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + funcionIfSimplificado();
		return result;
	}

	public int funcionIfSimplificado() {
		if (numero == null) {
			return 0;
		} else {
			return numero.hashCode();
		}
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