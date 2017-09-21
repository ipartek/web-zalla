package principal;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.PrintWriter;

import beans.Persona;
import beans.Dni;
import config.Configuracion;
import entradasalida.AlmacenamientoFicheros;

public class EjecutarGuardarDatos {

	public static void main(String[] args) {
		List<Persona> listaPersonas = crearListaPersonas();
		AlmacenamientoFicheros.guardarPersonas(Configuracion.NOMBRE_FICHERO,
				listaPersonas);

		

	}

	public static List<Persona> crearListaPersonas() {
		List<Persona> listaPersonas = new ArrayList<Persona>();

		Persona persona1 = new Persona("Juan", "Lopez", new Dni("2233445566",
				'A'));
		listaPersonas.add(persona1);
		Persona persona2 = new Persona("Marta", "Bilbao", new Dni("2233445577",
				'B'));
		listaPersonas.add(persona2);
		Persona persona3 = new Persona("Juan", "Lopez", new Dni("2233445588",
				'C'));
		listaPersonas.add(persona3);
		Persona persona4 = new Persona("Juan", "Lopez", new Dni("2233445599",
				'D'));
		listaPersonas.add(persona4);
		Persona persona5 = new Persona("Juan", "Lopez", new Dni("2233445566",
				'A'));
		listaPersonas.add(persona5);
		Persona persona6 = new Persona("Marta", "Bilbao", new Dni("2233445577",
				'B'));
		listaPersonas.add(persona6);
		Persona persona7 = new Persona("Juan", "Lopez", new Dni("2233445588",
				'C'));
		listaPersonas.add(persona7);
		Persona persona8 = new Persona("Juan", "Lopez", new Dni("2233445599",
				'D'));
		listaPersonas.add(persona8);
		Persona persona9 = new Persona("Juan", "Lopez", new Dni("2233445566",
				'A'));
		listaPersonas.add(persona9);
		Persona persona10 = new Persona("Marta", "Bilbao", new Dni(
				"2233445577", 'B'));
		listaPersonas.add(persona10);

		return listaPersonas;

	}
}
