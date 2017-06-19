package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import conduccion.Dni;
import conduccion.Persona;

public class EjecutarListaPersonas {

	public static void main(String[] args) {

		List<Persona> listaPersonas = cargarListaPersonas();
		recorrerListaPersonas(listaPersonas);
	}

	// cargar arraylist con 4 personas y lo devuelve
	public static List<Persona> cargarListaPersonas() {

		Dni dni1 = new Dni("12345678", 'H');
		Persona persona1 = new Persona("Juan", "Gomez", dni1);

		Dni dni2 = new Dni("12345679", 'A');
		Persona persona2 = new Persona("Pepe", "Reset", dni2);

		Dni dni3 = new Dni("12345677", 'H');
		Persona persona3 = new Persona("Luis", "Landa", dni3);

		Dni dni4 = new Dni("12345676", 'H');
		Persona persona4 = new Persona("Pedro", "Karl", dni4);

		Dni dni5 = new Dni("12345689", 'H');
		Persona persona5 = new Persona("Ander", "Carl", dni5);

		Dni dni6 = new Dni("12345689", 'H');
		Persona persona6 = new Persona("Ander", "Carl", dni6);

		List<Persona> arrayList = new ArrayList<Persona>();

		arrayList.add(persona1);
		arrayList.add(persona2);
		arrayList.add(persona3);
		arrayList.add(persona4);
		arrayList.add(persona5);
		addUnique(arrayList, persona1);
		addUnique(arrayList, persona6);

		return arrayList;

	}

	public static void addUnique(List<Persona> arrayList, Persona elemento) {

		if (!arrayList.contains(elemento))
			arrayList.add(elemento);
	}

	// recorre un list con personas
	public static void recorrerListaPersonas(List<Persona> listaPersonas) {

		for (int i = 0; i < listaPersonas.size(); i++) {
			System.out.println("->persona" + i + ": " + listaPersonas.get(i));
		}
		// habiamos hecho con Iterator,pero es mejor un for,el iterator es para
		// conjuntos sin orden.....

		// Iterator<Persona> ListaPersonasIterator = listaPersonas.iterator();

		// while(ListaPersonasIterator.hasNext()){
		// System.out.println(ListaPersonasIterator.next());

	}
}
