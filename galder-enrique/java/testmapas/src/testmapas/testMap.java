package testmapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class testMap {

	public static void main(String[] args) {

		HashMap<Dni, Persona> testMapas = new HashMap<Dni, Persona>();

		Persona persona1 = new Persona("Francis", "Belasques", new Dni("27383444", 'R'));
		//
		Persona persona2 = new Persona("Alberto", "Martines", new Dni("27383444", 'Q'));
		//
		Persona persona3 = new Persona("Eneko", "Gimenes", new Dni("27383444", 'T'));

		testMapas.put(persona1.getDni(), persona1);
		testMapas.put(persona2.getDni(), persona2);
		testMapas.put(persona3.getDni(), persona3);

		Persona persona4 = new Persona("Galder", "Martin", new Dni("27383444", 'Q'));

		Persona testPersonaQuitada = testMapas.put(persona4.getDni(), persona4);
		System.out.println(testMapas.toString());
		System.out.println("----------------------------------");
		System.out.println("El registro quitado es : " +testPersonaQuitada);
		System.out.println("----------------------------------");

		recorrer(testMapas);


	}

	public static void recorrer(HashMap<Dni, Persona> testMapas) {
		//
		Set<Dni> setClaves = testMapas.keySet();
		Iterator<Dni> iteradorClaves = setClaves.iterator();
		
		Dni clave = null;
		Persona persona= null;
		while (iteradorClaves.hasNext()) {
			clave = iteradorClaves.next();
			persona= testMapas.get(clave);
			System.out.println(persona);

		}
		
		
	}

}
