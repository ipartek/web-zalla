package empresa;

import java.util.Random;

public class Ingeniero extends Empleado implements ManejadorOrdenador, Arreglador {

	public Ingeniero() {
		super();
	}

	public Ingeniero(String nombre, String apellido, int edad, Dni dni, double sueldo) {
		super(nombre, apellido, edad, dni, sueldo);
	}

	@Override
	public double obtenerSueldo() {
		double sueldoBase = super.obtenerSueldo();
		Random random = new Random();
		double porcentaje = random.nextInt(21);
		double sueldoFinal = sueldoBase + sueldoBase * porcentaje / 100;
		return sueldoFinal;
	}

	@Override
	public void trabajar() {
		arreglar();
		teclear();
	}

	@Override
	public void arreglar() {
		System.out.println("arreglar");
	}

	@Override
	public void teclear() {
		System.out.println("teclear");
	}

	public void disenyar() {
		System.out.println("disenyar");
	}
}
