package entradasalida;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import beans.Persona;
import config.Configuracion;

public class AlmacenamientoFicheros {

	public static void guardarPersonas(String nombreFichero, List<Persona> listaPersonas) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("C:\\Users\\PORT-Z6\\Desktop\\Proyectos-web\\archivoPersonas.txt");
			pw = new PrintWriter(fichero);

			System.out.println("Escribiendo en el archivo.txt");
			for (int i = 0; i < listaPersonas.size(); i++) {
				pw.println(listaPersonas.get(i).toString());
				pw.println("--------------------------------------------------------------------------");
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

	public static List<String> obtenerPersonas(String nombreFichero) {
		String ruta = Configuracion.NOMBRE_FICHERO;
		List<String> listaPersonasString = new ArrayList<String>();

		try {
			FileReader fr = new FileReader(ruta);
			BufferedReader br = new BufferedReader(fr);

			System.out.println("Leyendo en el archivo.txt");
			
			String linea;
			
			while ((linea = br.readLine()) != null) {
				listaPersonasString.add(linea + System.lineSeparator());
					
			}
			

		} catch (Exception e) {
			System.out.println("ERROR!!!!!111UNOUNO");

		}

		return listaPersonasString;
	}

}
