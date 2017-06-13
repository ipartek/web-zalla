package subastas;

import java.util.LinkedList;

public class Programa2 {

	public static void main(String[] args) {
		
		LinkedList<Subasta> listaSubastas = new LinkedList<Subasta>();
		
		Usuario juan = new Usuario("Juan", 100);
		Usuario enrique = new Usuario("Enrique", 500);
		
		SubastaLimitada subasta1 = new SubastaLimitada("Disco duro multimedia", juan, 1);
		SubastaMinima subasta2 = new SubastaMinima("Impresora Láser", juan, 100);
		SubastaTemporal temporal = new SubastaTemporal("Teclado", juan, 3);

		listaSubastas.add(subasta1);
		listaSubastas.add(subasta2);
		listaSubastas.add(temporal);
		
		for(int i = 0; i < listaSubastas.size(); i++){
			listaSubastas.get(i).pujar(enrique, 10);
		}
		
		
	}

}
