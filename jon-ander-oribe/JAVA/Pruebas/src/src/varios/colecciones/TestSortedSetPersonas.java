package varios.colecciones;


import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSetPersonas {

	public static void main(String[] args) {

		SortedSet<Persona> listaPersonas = new TreeSet<Persona>(); //Con SET y HASHSET si funciona

		Persona persona1 = new Persona(1, "Jose", "Martinez", new Dni("2233445566", 'A'));

		Persona persona2 = new Persona(2, "Marta", "Bilbao", new Dni("2233445577", 'B'));

		Persona persona3 = new Persona(3, "Oscar", "Igartua", new Dni("2233445588", 'C'));

		// Solo añade el primer ADD
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		
		System.out.println("PRUEBA");
		System.out.println(listaPersonas.toString());
		recorrer(listaPersonas);

		// REVISAR

		/*
		 * for(Persona elemento: listaPersonas){ System.out.println(elemento); }
		 */
	}

	/*
	 * System.out.println(" Lista con " + listaPersonas.size() + " elementos");
	 * for( Iterator it = listaPersonas.iterator(); it.hasNext();) { Persona
	 * elemento = (Persona)it.next(); System.out.println(elemento);
	 * 
	 * /*Persona clave=null; Iterator<Persona>
	 * elementos=listaPersonas.iterator();
	 * System.out.println("Existen los siguientes elementos: ");
	 * while(elementos.hasNext()){ clave= elementos.next();
	 * System.out.println(clave+"-->"+listaPersonas);
	 * 
	 * }
	 * 
	 * }
	 */

	/*public static void recorrer(Set<Persona> listaPersonas) {
		System.out.println("ITERADOR:");
		Iterator<Persona> iterator = listaPersonas.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

	}*/
	
	public static void recorrer(Set<Persona> listaPersonas) {
		//
		Iterator<Persona> iterator = listaPersonas.iterator();
		Persona persona = null;
		while (iterator.hasNext()) {
			persona = iterator.next();
			persona.obtenerInfo();
		}
	}
	
	
}
