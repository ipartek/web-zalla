package principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import beans.Dni;
import beans.Persona;
import config.Configuracion;
import entradasalida.AlmacenamientoFicheros;

public class EjecutarLeerDatos {

	public static void main(String[] args) {
		List<Persona> listaPersonas = AlmacenamientoFicheros
				.obtenerPersonas(Configuracion.NOMBRE_FICHERO);
		mostrarPersonas(listaPersonas);

	}

	public static void mostrarPersonas(List<Persona> listaPersonas) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File(
					"C:/Eclipse_JavaSE/Nueva carpeta/MIS_FICHEROS/personas.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
