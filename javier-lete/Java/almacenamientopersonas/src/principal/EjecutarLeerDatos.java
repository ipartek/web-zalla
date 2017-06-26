package principal;

import java.util.List;

import beans.Persona;
import config.Configuracion;
import entradasalida.AlmacenamientoFicheros;

public class EjecutarLeerDatos {

	public static void main(String[] args) {
		
		List<Persona> listaPersonas = AlmacenamientoFicheros.obtenerPersonas(Configuracion.NOMBRE_FICHERO);
		mostrarPersonas(listaPersonas);
	}

	public static void mostrarPersonas(List<Persona> listaPersonas) {
		
		for(int i = 0; i<listaPersonas.size(); i++){
			//System.out.println(listaPersonas.get(i).getNombre());

			if (listaPersonas.get(i).getNombre().equals("Eneko")){
				System.out.println(listaPersonas.get(i));
			}
		}
		}
		//System.out.println(listaPersonas);
		//System.out.println(listaPersonas.get(1).getNombre());

	}


