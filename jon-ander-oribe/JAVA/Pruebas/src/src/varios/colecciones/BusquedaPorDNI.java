package varios.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BusquedaPorDNI {

	public static void main(String[] args) {

		Map<Dni, Persona> mapaPersonas = new HashMap<Dni, Persona>();
		Persona persona1 = new Persona(1, "Jose", "Martinez", new Dni("2233445566", 'A'));
		mapaPersonas.put(persona1.getDni(), persona1);
		Persona persona2 = new Persona(2, "Marta", "Bilbao", new Dni("2233445577", 'B'));
		mapaPersonas.put(persona2.getDni(), persona2);
		Persona persona3 = new Persona(3, "Oscar", "Igartua", new Dni("2233445588", 'C'));
		mapaPersonas.put(persona3.getDni(), persona3);
		Persona persona4 = new Persona(3, "Oscar", "Igartua", new Dni("2233445588", 'C'));
		mapaPersonas.put(persona4.getDni(), persona4);

		Dni dniPrueba = new Dni("2233445577", 'B');

		Dni clave = null;
		Iterator<Dni> elementos = mapaPersonas.keySet().iterator();
		System.out.println("Existen los siguientes elementos: ");
		while (elementos.hasNext()) {
			clave = elementos.next();
			System.out.println(clave + "-" + mapaPersonas.get(clave));

		}

		// TEST

		Telefono telefono1 = new Telefono(656778943);

		Map<Telefono, Persona> mapaTelefonos = new HashMap<Telefono, Persona>();
		mapaTelefonos.put(telefono1, persona1);

		System.out.println("Mapa TELEFONOS: " + mapaTelefonos);

		// FIN TEST

		Dni codigo = dniPrueba;
		System.out.println("****************************************");
		System.out.println(codigo);
		System.out.println(mapaPersonas.keySet());
		System.out.println(mapaPersonas.containsKey(codigo));

		if (mapaPersonas.containsKey(codigo)) {
			System.out.println("El CODIGO " + codigo + "EXISTE");
		} else {
			System.out.println("El DNI no existe");
		}

	}

}
