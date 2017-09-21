package entradasalida;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import beans.Persona;

public class AlmacenamientoFicheros {

	public static void guardarPersonas(String nombreFichero, List<Persona> listaPersonas) {
		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			fichero = new FileWriter(
					"C:/Eclipse_JavaSE/Nueva carpeta/MIS_FICHEROS/personas.txt");
			pw = new PrintWriter(fichero);

			Persona prueba;

			for (int i = 0; i < listaPersonas.size(); i++) {
				prueba = listaPersonas.get(i);
				pw.println(prueba.toString());
				System.out.println(prueba.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static List<Persona> obtenerPersonas(String nombreFichero) {
		return null;
	}

}
