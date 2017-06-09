package empresa;

public abstract class Empleado extends Persona {

	private double sueldo = 0.0;

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + "]";
	}

	public Empleado(int numero, char letra, String nombre, String apellido, int edad) {
		super(numero, letra, nombre, apellido, edad);

	}

	public abstract void trabajar();

	public double obtenerSueldo() {
		return sueldo;
	}

}
