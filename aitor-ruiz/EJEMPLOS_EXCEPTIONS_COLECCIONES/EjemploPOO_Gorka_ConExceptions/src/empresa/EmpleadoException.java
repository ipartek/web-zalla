package empresa;

public class EmpleadoException extends Exception {
	private int codigoError;
	private Empleado empleado;

	public EmpleadoException(String mensajeExcepcion, int codigoRetorno, Empleado empleado) {
		super(mensajeExcepcion);
		this.codigoError = codigoRetorno;
	}

	public int getCodigoError() {
		return codigoError;
	}

	public Empleado getEmpleado() {
		return empleado;
	}
	
	

}
