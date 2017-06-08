package empresa;

public abstract class Persona extends Dni {

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	private String nombre;
	private String apellido;
	private int edad;

	
	
	public Persona(int numero, char letra) {
		super(numero, letra);
	}

	public Persona(int numero, char letra, String nombre,String apellido,int edad) {
		super(numero, letra);
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
	}

	

}
