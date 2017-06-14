package empresa;

public class Test {

	public static void main(String[] args) {
		try {

			// 2
			Dni dniTec = new Dni(1111111, 'H');
			Tecnico tecnico = new Tecnico("Pedobeard", "rape", 80, dniTec, 30000);
			GestionTrabajo.tratarEmpleado(tecnico);
			
			// 1
			Dni dniAdmin = new Dni(34343434, 'H');
			Administrativo administrativo = new Administrativo("Palomo", "Cojo", 25, dniAdmin, 100000);
			GestionTrabajo.tratarEmpleado(administrativo);

			// 3
			Dni dniIng = new Dni(4444444, 'H');
			Ingeniero ingeniero = new Ingeniero("Cris", "Baleia", 35, dniIng, 200000);
			GestionTrabajo.tratarEmpleado(ingeniero);
		} catch (EmpleadoException e) {
			tratarError(e);
		}

	}

	public static void tratarError(EmpleadoException e) {

		int codigoError = e.getCodigoError();
		Empleado empleado = e.getEmpleado();
		String tipoEmpleado = null;

		System.out.println("empleado: " + empleado.getNombre());

		if (empleado instanceof Administrativo) {
			tipoEmpleado = "administrativo";
		} else if (empleado instanceof Tecnico) {
			tipoEmpleado = "tecnico";
		} else if (empleado instanceof Ingeniero) {
			tipoEmpleado = "ingeniero";
		} else {
			tipoEmpleado = "error";
		}
		if (codigoError == GestionTrabajo.COD_RETORNO_CODIGO_EMPLEADO_INCORRECTO) {
			System.out.println("Error código " + tipoEmpleado);
		} else if (codigoError == GestionTrabajo.COD_RETORNO_CODIGO_EMPLEADO_INCORRECTO) {
			System.out.println("Error nombre " + tipoEmpleado);
		} else {
			System.out.println("Error tipo empleado" + tipoEmpleado);
		}
	}

}
