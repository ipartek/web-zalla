package empresa;

public abstract class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private Dni dni;
	
	public Persona(){
		this.nombre="";
		this.apellido="";
		this.edad=1;
		this.dni = null;
	}
	
	public Persona(String nombre, String apellido, int edad, Dni dni){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Dni getDni() {
		return dni;
	}

	public void setDni(Dni dni) {
		this.dni = dni;
	}
	
	public String toString(){
		return("Nombre : " + this.nombre +
				"\nApellido :" + this.apellido +
				"\nEdad : " + this.edad +
				"\nDni : " + this.dni.getDni());
	}
	
	

}
