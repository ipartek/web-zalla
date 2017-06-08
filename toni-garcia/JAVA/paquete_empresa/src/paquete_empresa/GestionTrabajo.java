package paquete_empresa;

public class GestionTrabajo {

	public static void tratarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		if (empleado instanceof Administrativo) {
			System.out.println("soy un administrativo");
			empleado.trabajar();
		} else if (empleado instanceof Tecnico) {
			System.out.println("soy un tecnico");
			empleado.trabajar();

		} else if (empleado instanceof Ingeniero) {
			System.out.println("soy un ingeniero loco");
			empleado.trabajar();
			((Ingeniero) empleado).disenyar();

		}

	}

}
