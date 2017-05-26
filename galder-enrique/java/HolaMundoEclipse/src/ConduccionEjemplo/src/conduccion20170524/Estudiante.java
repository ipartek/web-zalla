package conduccion20170524;

public class Estudiante extends Persona {
	public static int numEstudiantes = 0;
	public int codEstudiante;

	private Estudiante(String nombre, String apellido, Dni dni, int codEstudiante) {
		super(nombre, apellido, dni);
		this.codEstudiante = codEstudiante;
	}

	public Estudiante(String nombre, String apellido, Dni dni) {
		super(nombre, apellido, dni);
		numEstudiantes++;
		this.codEstudiante = numEstudiantes;
	}

	public void obtenerInfo() {
		super.obtenerInfo();
		System.out.println("Cod. Estudiante: " + codEstudiante);
	}

	public static void obtenerInfo(Estudiante estudiante) {
		estudiante.obtenerInfo();
	}

	

}