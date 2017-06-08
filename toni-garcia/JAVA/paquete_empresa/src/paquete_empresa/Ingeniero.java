package paquete_empresa;

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

	@Override
	public void arreglar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teclear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void trabajar() {
		arreglar();
		teclear();
		// TODO Auto-generated method stub

	}
	@Override
	public double obtenerSueldo() {
		double sueldoBase = super.obtenerSueldo();
		double sueldoIngeniero;
		
		Random numRandom = new Random();
		int porcentaje = numRandom.nextInt(21);
		
		 sueldoIngeniero = sueldoBase + (sueldoBase * (double)porcentaje) /(double) 100;
		return sueldoIngeniero;

	}
	
	public void disenyar() {
		// TODO Auto-generated method stub

	}

}
