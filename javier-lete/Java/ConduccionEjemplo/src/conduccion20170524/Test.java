package conduccion20170524;

public class Test {
	public static void main(String[] args) {
		Dni dni = new Dni("27383444", 'R');
		Persona persona = new Persona("Roberto", "Martin", dni);
		persona.obtenerInfo();

		Dni dni2 = new Dni("83224112", 'A');
		Estudiante estudiante = new Estudiante("Maria", "Perez", dni2);
		estudiante.obtenerInfo();

		Dni dni3 = new Dni("12345678", 'X');
		Conductor personaConductora = new PersonaConductora("Jose", "Salgado", dni3);
		personaConductora.conducir();

		Dni dni4 = new Dni("87654321", 'Y');
		Persona e = new Estudiante("Javi", "Lopez", dni4);
		e.obtenerInfo();
		// Instancia u objeto
		estudiante.codEstudiante = 7;
		estudiante.obtenerInfo();
		// Estática o de clase
		Estudiante.numEstudiantes = 8;
		Estudiante.obtenerInfo(estudiante);
		//
		int a = 3;
		int b = 5;
		int c = suma(a, b);
		System.out.println("a es " + a);
		System.out.println("b es " + b);
		System.out.println("c es " + c);
		//
		Dni dniNuevo = new Dni("27383444", 'R');
		tratarDni(dniNuevo);
		System.out.println("numero: " + dniNuevo.getNumero());
		System.out.println("letra: " + dniNuevo.getLetra());
		tratarDni2(dniNuevo);
		System.out.println("numero: " + dniNuevo.getNumero());
		System.out.println("letra: " + dniNuevo.getLetra());
	}	

	public static void tratarDni2(Dni dni) {
		dni.setNumero("111111111");
		dni.setLetra('W');
	}

	public static void tratarDni(Dni dni) {
		dni = new Dni("111111111", 'W');
	}

	public static int suma(int a, int b) {
		int c = a + b;
		a = 5;
		return c;
	}
	
	
	
	
	
	
	
	

}