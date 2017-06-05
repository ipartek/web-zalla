package geometria;

public enum Direccion_DefAmpliada {
	ARRIBA(1, "Arriba"), ABAJO(2, "Abajo"), DERECHA(3, "Derecha"), IZQUIERDA(4, "Izquierda");

	private Object codigo;
	private String descripcion;

	private Direccion_DefAmpliada(Object codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public Object getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
