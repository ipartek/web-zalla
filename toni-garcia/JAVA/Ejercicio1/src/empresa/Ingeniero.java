package empresa;

import java.util.Random;

public class Ingeniero extends Empleado implements ManejadorOrdenador, Arreglador {

	public Ingeniero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ingeniero(String nombre, String apellido, int edad, Dni dni, double sueldo) {
		super(nombre, apellido, edad, dni, sueldo);
		// TODO Auto-generated constructor stub
	}

	public double obtenerSueldo() {

		double sueldoBase = super.obtenerSueldo();
		double sueldoIngeniero;

		Random numRandom = new Random();
		double porcentaje = numRandom.nextInt(20);
		
		sueldoIngeniero = sueldoBase + sueldoBase * porcentaje / 100;

		return sueldoIngeniero;
	}

	@Override
	public void trabajar() {
	}

	@Override
	public void arreglar() {
	}

	@Override
	public void teclear() {
	}

	public void disenyar() {
	}
}
