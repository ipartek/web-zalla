package varios;

import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class EscrituraDeDatos {

	public static void main(String[] args) {

		String nombreFichero = "C:/desarrollo/web/web-zalla/jon-ander-oribe/JAVA/Pruebas/PruebaEscritura.txt";
		File fichero = new File(nombreFichero);
		BufferedReader lector = null;
		FileReader lectorArchivo = null;

		try {
			if (fichero.exists()) {
				System.out.println("El archivo ya existe");
			} else {
				FileWriter fw = new FileWriter(fichero);
				fw.write("Texto de Prueba");
				fw.write(" 1234567 ");
				fw.close();
			}
		} catch (Exception e) {
			System.out.println("Error en la escritura");
		}

		try {

			lectorArchivo = new FileReader(nombreFichero);
			lector = new BufferedReader(lectorArchivo);
			String lectura;
			while ((lectura = lector.readLine()) != null) {
				System.out.println(lectura);
			}

		} catch (Exception e) {
			System.out.println("Error en el lector");
		}
	}

}
