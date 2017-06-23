package principal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import beans.Persona;
import beans.Dni;
import config.Configuracion;
import entradasalida.AlmacenamientoFicheros;

public class EjecutarGuardarDatos {

	public static void main(String[] args) throws IOException {
		String ruta = Configuracion.NOMBRE_FICHERO;

		File archivo = new File(ruta);
		if (archivo.exists()) {
			System.out.println("El archivo ya está creado");
			
		} else {
			archivo.createNewFile();
			System.out.println("El fichero se ha creado correctamente");
		}

		/*
		 * try{
		 * 
		 * if(archivo.createNewFile()){
		 * System.out.println("Se ha creado el archivo"); } } catch(IOException
		 * e){ System.out.println("No se ha podido crear el archivo"); }
		 */
		List<Persona> listaPersonas = crearListaPersonas();
		AlmacenamientoFicheros.guardarPersonas(Configuracion.NOMBRE_FICHERO, listaPersonas);

	}

	public static List<Persona> crearListaPersonas() {
		List<Persona> listaPersonas = new ArrayList<Persona>();
		// Cargar 10 personas
		Persona persona1 = new Persona("Francisco", "Belasques", new Dni("11111111", 'R'));
		Persona persona2 = new Persona("Alberto", "Martines", new Dni("22222222", 'Q'));
		Persona persona3 = new Persona("Eneko", "Gimenes", new Dni("33333333", 'T'));
		Persona persona4 = new Persona("Iñigo", "Alberez", new Dni("44444444", 'R'));
		Persona persona5 = new Persona("Eneko", "Sanchez", new Dni("55555555", 'Q'));
		Persona persona6 = new Persona("Jose Antonio", "Oria", new Dni("66666666", 'T'));
		Persona persona7 = new Persona("Asier", "Gallo", new Dni("77777777", 'R'));
		Persona persona8 = new Persona("Irantzu", "Martines", new Dni("88888888", 'Q'));
		Persona persona9 = new Persona("Estibaliz", "Abadia", new Dni("99999999", 'T'));
		Persona persona10 = new Persona("Jennifer", "Lopez", new Dni("12345678", 'T'));

		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		listaPersonas.add(persona4);
		listaPersonas.add(persona5);
		listaPersonas.add(persona6);
		listaPersonas.add(persona7);
		listaPersonas.add(persona8);
		listaPersonas.add(persona9);
		listaPersonas.add(persona10);
		
		System.out.println(listaPersonas);

		return listaPersonas;

	}

}
