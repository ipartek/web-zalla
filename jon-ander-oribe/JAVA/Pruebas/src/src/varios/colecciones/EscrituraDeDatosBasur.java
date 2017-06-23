package varios.colecciones;

import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class EscrituraDeDatosBasur {

	public static final String SEPARADOR_CONSTANTE = " , ";

	public static void main(String[] args) {

		// String nombreFichero =
		// "D:/Desarrollo/web-zalla/jon-ander-oribe/JAVA/Pruebas/PruebaEscritura.txt";
		// BASUR
		String nombreFichero = "C:/desarrollo/web/web-zalla/jon-ander-oribe/JAVA/Pruebas/PruebaEscritura.txt";
		File fichero = new File(nombreFichero);
		BufferedReader lector = null;
		FileReader lectorArchivo = null;
		BufferedReader lector1 = null;
		FileReader lectorArchivo1 = null;

		Persona persona1 = new Persona("1", "Jose", "Martinez", new Dni("2233445566", 'A'));

		Persona persona2 = new Persona("2", "Marta", "Bilbao", new Dni("2233445577", 'B'));

		Persona persona3 = new Persona("3", "Oscar", "Igartua", new Dni("2233445588", 'C'));

		Persona persona4 = new Persona("3", "Oscar", "Igartua", new Dni("2233445588", 'C'));

		Persona personaTest=null;

		try {
			if (fichero.exists()) {
				System.out.println("El archivo ya existe");
			} else {
				FileWriter fw = new FileWriter(fichero);
				fw.write(persona1.toStringClasificacion() + SEPARADOR_CONSTANTE + persona2.toStringClasificacion()
						+ SEPARADOR_CONSTANTE + persona3.toStringClasificacion());
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
			lectorArchivo.close();
			lector.close();
		} catch (Exception e) {
			System.out.println("Error en el lector");
		}

		// Introducir dentro de un OBJETO usando un split() [Consultar API]

		try {

			lectorArchivo1 = new FileReader(nombreFichero);
			lector1 = new BufferedReader(lectorArchivo1);
			System.out.println("Iniciando SEPARADOR");
			String[] subLectura;

			String lectura1;
			String[] subFilas;
			while ((lectura1 = lector1.readLine()) != null) {
				
				subFilas=lectura1.split(".");
				subLectura = lectura1.split(",");
				System.out.println("FUNCIONO");
				
				personaTest = new Persona(subLectura[0], subLectura[1], subLectura[2]);
				
				System.out.println(personaTest.toStringClasificacion());
				

			}

		} catch (Exception e) {
			System.out.println("Error convertidor a objetos");
			System.out.println(personaTest);
		}
	}

}