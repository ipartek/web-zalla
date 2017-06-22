package empresa;


public class Administrativo extends Empleado implements ManejadorOrdenador {
	
	public Administrativo(){
		super();
	}
	
	public Administrativo(String nombre, String apellidos, int edad, Dni dni, double sueldo){
		super(nombre, apellidos, edad, dni, sueldo);
	}

	@Override
	public void teclear() {
		
		System.out.println("Jugando al solitario......");
	}

	@Override
	public void trabajar() {
		
		System.out.println("Salgo a fumar..... Por favor espere.....");
		
	}

}
