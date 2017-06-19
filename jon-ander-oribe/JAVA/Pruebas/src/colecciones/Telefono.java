package colecciones;

public class Telefono {
	
	private int numero=0;

	public Telefono(int numero) {
		// TODO Auto-generated constructor stub
		this.numero=numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
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
		Telefono other = (Telefono) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Telefono [numero=" + numero + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
