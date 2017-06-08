package paquete_empresa;

public class Tecnico extends Empleado implements Arreglador {

	public Tecnico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tecnico(String nombre, String apellido, int edad, Dni dni, double sueldo) {
		super(nombre, apellido, edad, dni, sueldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arreglar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trabajar() {
		arreglar();
		// TODO Auto-generated method stub
		
	}

}
