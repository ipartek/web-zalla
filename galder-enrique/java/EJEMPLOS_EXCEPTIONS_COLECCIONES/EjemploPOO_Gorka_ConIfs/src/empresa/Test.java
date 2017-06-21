package empresa;

public class Test {

	public static void main(String[] args) {
		int codigoRetorno = GestionTrabajo.COD_RETORNO_CORRECTO;
		// 1
		Dni dniAdmin = new Dni(34343434, 'H');
		Administrativo administrativo = new Administrativo("Palomo", "Cojo", 22, dniAdmin, 100000);
		codigoRetorno = GestionTrabajo.tratarEmpleado(administrativo);
		if (codigoRetorno == GestionTrabajo.COD_RETORNO_CORRECTO) {
			// 2
			Dni dniTec = new Dni(1111111, 'H');
			Tecnico tecnico = new Tecnico("Pedobeard", "rape", 80, dniTec, 30000);
			codigoRetorno = GestionTrabajo.tratarEmpleado(tecnico);
			if (codigoRetorno == GestionTrabajo.COD_RETORNO_CORRECTO) {
				// 3
				Dni dniIng = new Dni(4444444, 'H');
				Ingeniero ingeniero = new Ingeniero("Cris", "Baleia", 35, dniIng, 200000);
				codigoRetorno = GestionTrabajo.tratarEmpleado(ingeniero);
				if (codigoRetorno == GestionTrabajo.COD_RETORNO_CORRECTO) {
					System.out.println("PROGRAMA TERMINADO CORRECTAMENTE");
				} else {
					tratarError(codigoRetorno, "ingeniero");
				}
			} else {
				tratarError(codigoRetorno, "tecnico");
			}
		} else {
			tratarError(codigoRetorno, "administrativo");
		}

	}

	public static void tratarError(int codigoRetorno, String tipoEmpleado) {
		if (codigoRetorno == GestionTrabajo.COD_RETORNO_CODIGO_EMPLEADO_INCORRECTO) {
			System.out.println("Error código " + tipoEmpleado);
		} else if (codigoRetorno == GestionTrabajo.COD_RETORNO_CODIGO_EMPLEADO_INCORRECTO) {
			System.out.println("Error nombre " + tipoEmpleado);
		} else {
			System.out.println("Error tipo empleado incorrecto");
		}
	}

}
