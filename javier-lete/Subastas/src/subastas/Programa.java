package subastas;

import java.util.LinkedList;

public class Programa {

	public static void main(String[] args) {
		Usuario juan = new Usuario("Juan", 100);
		Usuario pedro = new Usuario("Pedro", 150);
		Usuario enrique = new Usuario("Enrique", 300);
		
		Subasta subasta = new Subasta("Teléfono móvil", juan);
		
		subasta.pujar(pedro, 100);
		System.out.println(subasta.getPujaMayor().getCantidad());
		
		subasta.pujar(enrique, 50);
		System.out.println(subasta.getPujaMayor().getCantidad());
		
		if(subasta.ejecutar()){
			System.out.println("Subasta ejecutada");
		}else{
			System.out.println("La subasta no ha sido ejecutada");
		}
		
		System.out.println("Credito de " + juan.getNombre() + " :" + juan.getCredito());
		System.out.println("Credito de " + pedro.getNombre() + " :" + pedro.getCredito());
		System.out.println("Credito de " + enrique.getNombre() + " :" + enrique.getCredito());
		
		
		LinkedList<Subasta> listaDeSubastas = new LinkedList<Subasta>();
		
		Usuario paco = new Usuario("Paco", 100);
		Usuario manolo = new Usuario("Manolo", 500);
		
		Subasta subasta1 = new SubastaLimitada("Disco duro multimedia", paco, 1);
		Subasta subasta2 = new SubastaMinima("Impresora laser", manolo, 100);
		
		listaDeSubastas.add(subasta1);
		listaDeSubastas.addLast(subasta2);
		
		SubastaTemporal temporal1 = new SubastaTemporal("Teclado", paco, 15, 3);
		listaDeSubastas.addLast(temporal1);
		
		for(int i = 0; i<listaDeSubastas.size(); i++){
			listaDeSubastas.get(i).pujar(manolo, 10);
		}
		
		for(int i = 0; i<listaDeSubastas.size(); i++){
			if(listaDeSubastas.get(i) instanceof SubastaLimitada){
				LinkedList<Puja> listado = listaDeSubastas.get(i).getListaDePujas();
				for (int p = 0; p<listado.size(); p++){
					System.out.println("Usuario: " + listado.get(p).getUsuario().getNombre());
					System.out.println("cantidad: " + listado.get(p).getCantidad());
				}
				listaDeSubastas.get(i).pujar(manolo, 20);
			}
		}
		
		for(int i = 0; i<listaDeSubastas.size(); i++){
			if(listaDeSubastas.get(i) instanceof SubastaTemporal){
				listaDeSubastas.get(i).pujar(paco);
			}
			
		}
		
		for(int i = 0; i<listaDeSubastas.size(); i++){
			listaDeSubastas.get(i).ejecutar();
		}
		
		System.out.println(paco.getCredito());
		System.out.println(manolo.getCredito());

	}

}
