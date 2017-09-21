package empresa;

public class Test {

	public static void main(String[] args) {

		Dni dniAdmin = new Dni(34343434, 'H');
		Administrativo administrativo = new Administrativo("Palomo", "Cojo", 22, dniAdmin, 100000);
		administrativo.trabajar();
		System.out.println(administrativo.obtenerSueldo());
		GestionTrabajo.tratarEmpleado(administrativo);

		Dni dniTec = new Dni(1111111, 'H');
		Tecnico tecnico = new Tecnico("Pedobeard", "rape", 80, dniTec, 30000);
		tecnico.trabajar();
		System.out.println(tecnico.obtenerSueldo());
		GestionTrabajo.tratarEmpleado(tecnico);

		Dni dniIng = new Dni(4444444, 'H');
		Ingeniero ingeniero = new Ingeniero("Cris", "Baleia", 35, dniIng, 200000);
		ingeniero.trabajar();
		System.out.println(ingeniero.obtenerSueldo());
		GestionTrabajo.tratarEmpleado(ingeniero);

	}

}
