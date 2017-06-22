package empresa;

public abstract class Empleado extends Persona {
	private int codEmpleado;
	private static int numEmpleados = 0;
	private double sueldo;

	/**
	 * 
	 */
	public Empleado() {
		super();
		numEmpleados++;
		this.codEmpleado = numEmpleados;
	}

	public Empleado(String nombre, String apellido, int edad, Dni dni, double sueldo) {
		super(nombre, apellido, edad, dni);
		this.sueldo = sueldo;
		numEmpleados++;
		this.codEmpleado = numEmpleados;
	}

	@Override
	public String toString() {
		return "Empleado [codEmpleado=" + codEmpleado + ", sueldo=" + sueldo + "]";
	}

	public abstract void trabajar();

	public double obtenerSueldo() {
		return this.sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getCodEmpleado() {
		return codEmpleado;
	}
}
