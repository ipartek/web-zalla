package colecciones;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSetPersonas {

	public static void main(String[] args) {
		SortedSet<Persona> setPersonas = new TreeSet<Persona>();
		//
		Persona persona1 = new Persona("Alvaro", "Zororigoiti", new Dni("12345678", 'R'));
		//
		Persona persona2 = new Persona("Elvaro", "Zororigoiti", new Dni("12345678", 'R'));
		//
		Persona persona3 = new Persona("Robertito", "Alvarez", new Dni("27383444", 'T'));
		//
		Persona persona4 = new Persona("Robertito", "Alvarez", new Dni("27383444", 'T'));
		//
		setPersonas.add(persona1);
		setPersonas.add(persona2);
		setPersonas.add(persona3);
		setPersonas.add(persona4);
		recorrer(setPersonas);
	}

	public static void recorrer(Set<Persona> setPersona) {
		//
		Iterator<Persona> iterator = setPersona.iterator();
		Persona persona = null;
		while (iterator.hasNext()) {
			persona = iterator.next();
			persona.obtenerInfo();
		}
	}
}
