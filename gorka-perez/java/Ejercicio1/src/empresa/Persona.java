package empresa;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private Dni dni;
	
	/**
	 * 
	 */
	public Persona() {
		super();
	}
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param dni
	 */
	public Persona(String nombre, String apellido, int edad, Dni dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + "]";
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * @return the dni
	 */
	public Dni getDni() {
		return dni;
	}
	
	/**
	 * @param dni the dni to set
	 */
	public void setDni(Dni dni) {
		this.dni = dni;
	}	
}
