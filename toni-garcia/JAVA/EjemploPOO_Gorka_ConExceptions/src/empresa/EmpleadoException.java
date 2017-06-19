package empresa;

public class EmpleadoException extends Exception {
	private static final long serialVersionUID = 1L;
	private int codigoError;
	private Empleado empleado;

	public EmpleadoException(String mensajeExcepcion, int codigoRetorno, Empleado empleado) {
		super(mensajeExcepcion);
		this.codigoError = codigoRetorno;
		this.empleado = empleado;
	}

	public int getCodigoError() {
		return codigoError;
	}

	public Empleado getEmpleado() {
		return empleado;
	}
	
	

}
