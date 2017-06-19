package empresa;

public class GestionTrabajo {
	public final static int COD_RETORNO_CORRECTO = 0;
	public final static int COD_RETORNO_CODIGO_EMPLEADO_INCORRECTO = 1;
	public final static int COD_RETORNO_NOMBRE_EMPLEADO_INCORRECTO = 2;
	public final static int COD_RETORNO_TIPO_EMPLEADO_INCORRECTO = 3;

	public static int tratarEmpleado(Empleado empleado) {
		//
		// Los Tecnicos tienen que tener código entre 1 y 70
		// Los Ingenieros tienen que tener código entre 71 y 140;
		// Los Administrativos tienen que tener código entre 141 y 210;
		//
		// Los Tecnicos tienen que tener nombre "Olatz"
		// Los Ingenieros tienen que tener nombre "Marta"
		// Los Administrativos tienen que tener nombre "Juan"
		int codEmpleado = empleado.getCodEmpleado();
		if (empleado instanceof Tecnico) {
			System.out.println("Técnico");
			if (codEmpleado < 1 || codEmpleado > 70) {
				return COD_RETORNO_CODIGO_EMPLEADO_INCORRECTO;
			} else if (empleado.getNombre().equals("Olatz")) {
				return COD_RETORNO_NOMBRE_EMPLEADO_INCORRECTO;
			} else {
				empleado.trabajar();
				return COD_RETORNO_CORRECTO;
			}
		} else if (empleado instanceof Ingeniero) {
			System.out.println("Ingeniero");
			if (codEmpleado < 71 || codEmpleado > 140) {
				return COD_RETORNO_CODIGO_EMPLEADO_INCORRECTO;
			} else if (empleado.getNombre().equals("Marta")) {
				return COD_RETORNO_NOMBRE_EMPLEADO_INCORRECTO;
			} else {
				empleado.trabajar();
				((Ingeniero) empleado).disenyar();
				return COD_RETORNO_CORRECTO;
			}
		} else if (empleado instanceof Administrativo) {
			System.out.println("Administrativo");
			if (codEmpleado < 141 || codEmpleado > 210) {
				return COD_RETORNO_CODIGO_EMPLEADO_INCORRECTO;
			} else if (empleado.getNombre().equals("Juan")) {
				return COD_RETORNO_NOMBRE_EMPLEADO_INCORRECTO;
			} else {
				empleado.trabajar();
				((Ingeniero) empleado).disenyar();
				return COD_RETORNO_CORRECTO;
			}
		} else {
			return COD_RETORNO_TIPO_EMPLEADO_INCORRECTO;
		}
	}

}
