package varios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio01 {
	
	static List listado= new ArrayList();

	public static void main(String[] args) {

		List<String> listaPersonas = cargarListaPersonas();
		recorrerListaPersonas(listaPersonas);

	}

	public static List<String> cargarListaPersonas() {
		
		
		listado.add("Paco");
		listado.add("Manolo");
		listado.add("Susana");
		listado.add("Carmen");
		
		return listado;
		
		
		
	}

	public static void recorrerListaPersonas(List listaPersonas) {
		for(Object persona : listado){
			System.out.println(persona);
		}
	}

}
