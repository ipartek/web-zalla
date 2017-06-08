package paquete_empresa;

public class Test {

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		//creo administrativo
		Administrativo administrativo = new Administrativo();
//llamo a trabajar
		administrativo.trabajar();
		administrativo.obtenerSueldo();
		System.out.println(administrativo.obtenerSueldo());
		GestionTrabajo.tratarEmpleado(administrativo);
		
		Tecnico tecnico = new Tecnico();
		tecnico.trabajar();
		tecnico.obtenerSueldo();
		System.out.println(tecnico.obtenerSueldo());
		GestionTrabajo.tratarEmpleado(tecnico);
		
		Ingeniero ingeniero = new Ingeniero();
		ingeniero.trabajar();
		ingeniero.obtenerSueldo();
		System.out.println(ingeniero.obtenerSueldo());
		GestionTrabajo.tratarEmpleado(ingeniero);
		

}}
