package empresa;

public abstract class Empleado extends Persona {
	private int codEmpleado;
	private static int numEmpleado = 0;
	private double sueldo;

	/**
	 * 
	 */
	public Empleado() {
		super();
		numEmpleado++;
	}

	public Empleado(String nombre, String apellido, int edad, Dni dni, double sueldo) {
		super(nombre, apellido, edad, dni);
		this.sueldo = sueldo;
		numEmpleado++;
	}

	@Override
	public String toString() {
		return "Empleado [codEmpleado=" + codEmpleado + ", sueldo=" + sueldo + "]";
	}
	public abstract void trabajar();
	
	public double obtenerSueldo(){
		return this.sueldo;
	}
	public int getCodEmpleado() {
		return codEmpleado;
	}

	public static int getNumEmpleado() {
		return numEmpleado;
	}
}
