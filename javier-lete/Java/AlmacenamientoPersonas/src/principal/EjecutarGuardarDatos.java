package principal;

import java.util.ArrayList;
import java.util.List;

import beans.Persona;
import config.Configuracion;
import entradasalida.AlmacenamientoFicheros;

public class EjecutarGuardarDatos {

	public static void main(String[] args) {
		List<Persona> listaPersonas = crearListaPersonas();
		AlmacenamientoFicheros.guardarPersonas(Configuracion.NOMBRE_FICHERO, listaPersonas);

	}

	public static List<Persona> crearListaPersonas() {
		List<Persona> listaPersonas = new ArrayList<Persona>();
		// Cargar 10 personas
		return listaPersonas;

	}

}
