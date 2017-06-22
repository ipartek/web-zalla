package colecciones;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSetPersonasUsandoComparator {

	public static void main(String[] args) {
		//
		Persona persona1 = new Persona("Alvaro", "Zororigoiti", new Dni("12345678", 'R'));
		//
		Persona persona2 = new Persona("Elvaro", "Zororigoiti", new Dni("12345678", 'R'));
		//
		Persona persona3 = new Persona("Robertito", "Alvarez", new Dni("27383444", 'T'));
		//
		Persona persona4 = new Persona("Robertito", "Alvarez", new Dni("23834", 'T'));
		//
		Persona persona5 = new Persona("Juanito", "Martin", new Dni("383444", 'T'));
		//
		Persona persona6 = new Persona("Amaia", "Bilbao", new Dni("983444", 'T'));
		//
		Persona persona7 = new Persona("Javier", "Sanchez", new Dni("17383444", 'T'));
		//
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("COMPARACION POR DNIS");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		ComparadorPersonasPorDni comparadorPersonasPorDni = new ComparadorPersonasPorDni();
		//Llamada al compare de ComparadorPersonasPorDni
		SortedSet<Persona> sortedSetPersonasComparadasPorOrdenAlfabetico = new TreeSet<Persona>(
				comparadorPersonasPorDni);
		sortedSetPersonasComparadasPorOrdenAlfabetico.add(persona1);
		sortedSetPersonasComparadasPorOrdenAlfabetico.add(persona2);
		sortedSetPersonasComparadasPorOrdenAlfabetico.add(persona3);
		sortedSetPersonasComparadasPorOrdenAlfabetico.add(persona4);
		sortedSetPersonasComparadasPorOrdenAlfabetico.add(persona5);
		sortedSetPersonasComparadasPorOrdenAlfabetico.add(persona6);
		sortedSetPersonasComparadasPorOrdenAlfabetico.add(persona7);
		recorrer(sortedSetPersonasComparadasPorOrdenAlfabetico);
		//
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("COMPARACION POR ORDEN ALFABETICO");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		//Llamada al compareTo e Equals de Persona

		SortedSet<Persona> setPersonas = new TreeSet<Persona>();
		setPersonas.add(persona1);
		setPersonas.add(persona2);
		setPersonas.add(persona3);
		setPersonas.add(persona4);
		setPersonas.add(persona5);
		setPersonas.add(persona6);
		setPersonas.add(persona7);
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
