package empresa;

public class GestionTrabajo {
	public static void tratarEmpleado(Empleado empleado) {
		if (empleado instanceof Tecnico) {
			System.out.println("Técnico");
			empleado.trabajar();
		} else if (empleado instanceof Ingeniero) {
			System.out.println("Ingeniero");
			empleado.trabajar();
			((Ingeniero) empleado).disenyar();
		} else if (empleado instanceof Administrativo) {
			System.out.println("Administrativo");
			empleado.trabajar();
		} 
	}

}
