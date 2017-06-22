package colecciones;

import java.util.Comparator;

public class ComparadorPersonasPorDni implements Comparator<Persona> {
	@Override
	public int compare(Persona persona1, Persona persona2) {
		int diferencia = persona1.getDni().compareTo(persona2.getDni());
		if (diferencia == 0) {
			diferencia = persona1.getApellido().compareTo(persona2.getApellido());
			if (diferencia == 0) {
				diferencia = persona1.getNombre().compareTo(persona2.getNombre());
			}
		}
		return diferencia;
	}
}
