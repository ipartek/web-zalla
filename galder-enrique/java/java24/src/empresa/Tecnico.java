package empresa;

public class Tecnico extends Empleado implements Arreglador {
	
	public Tecnico(){
		super();
	}
	
	public Tecnico(String nombre, String apellidos, int edad, Dni dni, double sueldo){
		super(nombre, apellidos, edad, dni, sueldo);
	}
	
	@Override
	public void arreglar() {
		System.out.println("Pues yo no veo nada malo....");

	}

	@Override
	public void trabajar() {
		System.out.println("Estoy fumando con el administrativo.....");

	}

}
