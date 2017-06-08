package paquete_empresa;

public abstract class Empleado extends Persona {

	private int CodEmpleado;
	private static int numEmpleado = 0;
	private double sueldo;

	public Empleado() {
		super();
		numEmpleado++;
	}

	public Empleado(String nombre, String apellido, int edad, Dni dni, double sueldo) {
		super(nombre, apellido, edad, dni);
		this.sueldo = sueldo;
		numEmpleado++;
	}

	public int getCodEmpleado() {
		return CodEmpleado;
	}
	public static int getNumEmpleado() {
		return numEmpleado;
	}
	

	@Override
	public String toString() {
		return "Empleado [CodEmpleado=" + CodEmpleado + ", sueldo=" + sueldo + "]";
	}

	public abstract void trabajar();
	
	public double obtenerSueldo(){
		return this.sueldo;
	}
	

}
