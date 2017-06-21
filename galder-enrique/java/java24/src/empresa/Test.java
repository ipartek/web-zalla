package empresa;

public class Test {

	public static void main(String[] args) {
		
		Dni dnijosetxu = new Dni(234235236, 'a');
		Administrativo josetxu = new Administrativo("Josetxu","Leton",56, dnijosetxu, 1200);
		//
		Dni dniPepe = new Dni(123456789, 'b');
		Tecnico pepe = new Tecnico("Pepe", "Gotera", 45, dniPepe, 1300);
		//
		Dni dniOtilio = new Dni(987654321, 'c');
		Ingeniero otilio = new Ingeniero("Otilio", "Gotera", 36, dniOtilio, 1400);
		
		System.out.println(josetxu.toString(josetxu.getSueldo()));
		System.out.println(pepe.toString(pepe.getSueldo()));
		System.out.println(otilio.toString(((Ingeniero)otilio).getSueldo()));
		
		GestionTrabajo gestor = new GestionTrabajo();
		gestor.tratarEmpleado(josetxu);
		gestor.tratarEmpleado(pepe);
		gestor.tratarEmpleado(otilio);

	}

}
