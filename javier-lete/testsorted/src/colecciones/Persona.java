package colecciones;

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
	public int compareTo(Persona otraPersona) {
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
		//return this.apellido.compareTo(otraPersona.apellido);
	}
	
		

		
	

	
}