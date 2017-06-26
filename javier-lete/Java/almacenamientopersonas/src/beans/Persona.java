package beans;

public class Persona implements Comparable<Persona> {
	private String nombre;
	private String apellido;
	private Dni dni;

	public Persona(String nombre, String apellido, Dni dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public void obtenerInfo() {

		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("--------------------------");
		dni.obtenerInfo();
		System.out.println("--------------------------");

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Dni getDni() {
		return dni;
	}

	public void setDni(Dni dni) {
		this.dni = dni;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Persona other = (Persona) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public int compareTo(Persona otraPersona) {
		int diferencia = this.apellido.compareTo(otraPersona.apellido);
		if (diferencia == 0) {
			diferencia = this.nombre.compareTo(otraPersona.nombre);
			if (diferencia == 0) {
				diferencia = this.dni.compareTo(otraPersona.dni);
			}
		}
		return diferencia;
	}

	public int compareToOther(Persona otraPersona) {
		int diferenciaApellido = this.apellido.compareTo(otraPersona.apellido);
		if (diferenciaApellido == 0) {
			int diferenciaNombre = this.nombre.compareTo(otraPersona.nombre);
			if (diferenciaNombre == 0) {
				int diferenciaDni = this.dni.compareTo(otraPersona.dni);
				if (diferenciaDni == 0) {
					return 0;
				} else {
					return diferenciaDni;
				}
			} else {
				return diferenciaNombre;
			}
		} else {
			return diferenciaApellido;
		}
		// return this.apellido.compareTo(otraPersona.apellido);
	}

}