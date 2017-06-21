package principal;

import java.util.List;
import config.Configuracion;
import entradasalida.AlmacenamientoFicheros;

public class EjecutarLeerDatos {

	public static void main(String[] args) {
		
		List<String> listaPersonas = AlmacenamientoFicheros.obtenerPersonas(Configuracion.NOMBRE_FICHERO);
		mostrarPersonas(listaPersonas);
	}

	public static void mostrarPersonas(List<String> listaPersonas) {
		System.out.println(listaPersonas);

	}

}
