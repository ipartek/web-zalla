package empresa;

public class Administrativo extends Empleado implements ManejadorOrdenador {

	/**
	 * 
	 */
	public Administrativo() {
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
	public Administrativo(String nombre, String apellido, int edad, Dni dni, double sueldo) {
		super(nombre, apellido, edad, dni, sueldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
	}
	public void teclear() {
		// TODO Auto-generated method stub
	}
}
