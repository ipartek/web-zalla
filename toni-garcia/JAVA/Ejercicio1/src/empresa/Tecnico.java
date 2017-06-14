package empresa;

public class Tecnico extends Empleado implements Arreglador {

	/**
	 * 
	 */
	public Tecnico() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param dni
	 * @param sueldo
	 */
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
		// TODO Auto-generated method stub
	}

}
