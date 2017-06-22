package empresa;


public class Ingeniero extends Empleado implements Arreglador, ManejadorOrdenador {
	
	public Ingeniero(){
		super();
	}
	
	public Ingeniero(String nombre, String apellidos, int edad, Dni dni, double sueldo){
		super(nombre, apellidos, edad, dni, sueldo);
	}

	@Override
	public void teclear() {
		System.out.println("Terminando el solitario del administrativo mientras esta fumando....");

	}

	@Override
	public void arreglar() {
		System.out.println("Pues tampoco veo nada malo.....");

	}

	@Override
	public void trabajar() {
		System.out.println("Temgo que empezar a fumar tambien.....");

	}
	
	public void disenyar(){
		System.out.println("Algo habra que hacer para justificar el sueldo, que no somos politicos....");
		
	}
	
	public double getSueldo(){
		double sueldo = super.getSueldo();
		double aleatorio = Math.random()*21;
		double tantoPorCiento = (sueldo * aleatorio)/100;
		sueldo = sueldo + tantoPorCiento;		
		return sueldo;
	}

}
