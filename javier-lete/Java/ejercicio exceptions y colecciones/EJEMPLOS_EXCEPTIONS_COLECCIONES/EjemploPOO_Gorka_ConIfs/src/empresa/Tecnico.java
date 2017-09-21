package empresa;

public class Tecnico extends Empleado implements Arreglador {

	/**
	 * 
	 */
	public Tecnico() {
		super();
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
	}

	@Override
	public void trabajar() {
		arreglar();
	}

	@Override
	public void arreglar() {
		System.out.println("arreglar");
	}

}
