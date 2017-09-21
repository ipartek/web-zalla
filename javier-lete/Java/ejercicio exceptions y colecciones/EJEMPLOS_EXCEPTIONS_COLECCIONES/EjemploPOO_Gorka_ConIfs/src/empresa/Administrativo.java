package empresa;

public class Administrativo extends Empleado implements ManejadorOrdenador {

	/**
	 * 
	 */
	public Administrativo() {
		super();
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
	}

	@Override
	public void trabajar() {
		teclear();
	}

	@Override
	public void teclear() {
		System.out.println("teclear");
	}
}
