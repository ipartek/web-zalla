package colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSetPersonas {

	public static void main(String[] args) {

		SortedSet<Persona> setPersona = new TreeSet<Persona>();

        Persona persona1 = new Persona("Alvaro", "Zororigoiti", new Dni("12345678", 'R'));
        //
        
        Persona persona2 = new Persona("Elvaro", "Zororigoiti", new Dni("12345678", 'R'));
        //
       
        Persona persona3 = new Persona("Robertito", "Alvarez", new Dni("27383444", 'T'));
        //
		setPersona.add(persona1);
		setPersona.add(persona2);
		setPersona.add(persona3);
		recorrer(setPersona);
		System.out.println(setPersona);
		

	}

	public static void recorrer(Set<Persona> setPersona) {
		//
		Iterator<Persona> iterator = setPersona.iterator();
		while (iterator.hasNext()) {
			Persona persona=iterator.next();
			persona.obtenerInfo();

		}
//		for (Persona persona : setPersona) {
//			persona.obtenerInfo();
//			
//		}
	}

}
