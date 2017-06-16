package SAX;

import java.io.FileInputStream;
import java.io.IOException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

// Clase que procesa un XML de ejemplo mediante el handler SAX ManejadorEjemplo 

public class HandlerSaxMain {

	public static void main(String[] args) {

		try {
			// Creamos la factoria de parseadores por defecto
			XMLReader reader = XMLReaderFactory.createXMLReader();

			// Añadimos nuestro manejador al reader
			reader.setContentHandler(new HandlerSax());

			// Procesamos el xml de ejemplo
			reader.parse(new InputSource(new FileInputStream("C:\\Users\\ZALLA\\Desktop\\Lista Personas.xml")));

		} catch (SAXException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
