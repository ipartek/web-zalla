package empresa;

public class GestionTrabajo {
	public final static int COD_RETORNO_CORRECTO = 0;
	public final static int COD_RETORNO_CODIGO_EMPLEADO_INCORRECTO = 1;
	public final static int COD_RETORNO_NOMBRE_EMPLEADO_INCORRECTO = 2;
	public final static int COD_RETORNO_TIPO_EMPLEADO_INCORRECTO = 3;

	public static void tratarEmpleado(Empleado empleado) throws EmpleadoException {
		//
		// Los Tecnicos tienen que tener c�digo entre 1 y 70
		// Los Ingenieros tienen que tener c�digo entre 71 y 140;
		// Los Administrativos tienen que tener c�digo entre 141 y 210;
		//
		// Los Tecnicos tienen que tener nombre "Olatz"
		// Los Ingenieros tienen que tener nombre "Marta"
		// Los Administrativos tienen que tener nombre "Juan"
		int codEmpleado = empleado.getCodEmpleado();
		if (empleado instanceof Tecnico) {
			System.out.println("T�cnico");
			if (codEmpleado < 1 || codEmpleado > 70) {
				throw new EmpleadoException("ERROR EmpleadoException", COD_RETORNO_CODIGO_EMPLEADO_INCORRECTO,
						empleado);
			} else if (empleado.getNombre().equals("Olatz")) {
				throw new EmpleadoException("ERROR EmpleadoException", COD_RETORNO_NOMBRE_EMPLEADO_INCORRECTO,
						empleado);
			}
			empleado.trabajar();
		} else if (empleado instanceof Ingeniero) {
			System.out.println("Ingeniero");
			if (codEmpleado < 71 || codEmpleado > 140) {
				throw new EmpleadoException("ERROR EmpleadoException", COD_RETORNO_CODIGO_EMPLEADO_INCORRECTO,
						empleado);
			} else if (empleado.getNombre().equals("Marta")) {
				throw new EmpleadoException("ERROR EmpleadoException", COD_RETORNO_NOMBRE_EMPLEADO_INCORRECTO,
						empleado);
			}
			empleado.trabajar();
			((Ingeniero) empleado).disenyar();
		} else if (empleado instanceof Administrativo) {
			System.out.println("Administrativo");
			if (codEmpleado < 141 || codEmpleado > 210) {
				throw new EmpleadoException("ERROR EmpleadoException", COD_RETORNO_CODIGO_EMPLEADO_INCORRECTO,
						empleado);
			} else if (empleado.getNombre().equals("Juan")) {
				throw new EmpleadoException("ERROR EmpleadoException", COD_RETORNO_NOMBRE_EMPLEADO_INCORRECTO,
						empleado);
			}
			empleado.trabajar();
			((Ingeniero) empleado).disenyar();
		} else {
			throw new EmpleadoException("ERROR EmpleadoException", COD_RETORNO_TIPO_EMPLEADO_INCORRECTO, null);
		}
	}

}
