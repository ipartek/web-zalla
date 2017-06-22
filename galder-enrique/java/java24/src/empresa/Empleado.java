package empresa;

public abstract class Empleado extends Persona {
	
	private int codEmpleado;
	private static int numEmpleados = 0;
	private double sueldo;
	
	public Empleado(){
		super();
		numEmpleados++;
		this.codEmpleado = numEmpleados;
		this.sueldo = 0;
		
	}
	
	public Empleado(String nombre, String apellidos, int edad, Dni dni, double sueldo){
		super(nombre, apellidos, edad, dni);
		numEmpleados++;
		this.codEmpleado = numEmpleados;
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}
		
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public abstract void trabajar();
	
	public String toString(double sueldo){
		return(super.toString() + 
				"\n Codigo Empleado : " + this.codEmpleado +
				"\n Sueldo : "+ sueldo);
	}
	
	

}
