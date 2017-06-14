package subastas;

public class Programa {

	public static void main(String[] args) {
		
		Usuario juan = new Usuario("Juan", 100);
		Usuario pedro = new Usuario("Pedro", 150);
		Usuario enrique = new Usuario("Enrique", 300);
		
		Subasta subastaTlf = new Subasta("Teléfono Móvil", pedro);

		
		
		boolean resPuja = subastaTlf.pujar(juan,100);
		System.out.println(resPuja);
		System.out.println("Juan:");
		System.out.println("puja mayor:" + subastaTlf.getPujaMayor().getCantidadPuja() + "\n");
		
		System.out.println("Enrique:");
		subastaTlf.pujar(enrique,50);
		System.out.println("puja mayor:" + subastaTlf.getPujaMayor().getCantidadPuja() + "\n");
		
		
		System.out.println("puja enrique 200" + subastaTlf.pujar(enrique,200)+ "\n"); 
		
		System.out.println("ejecutar" + subastaTlf.ejecutar()+ "\n");
		
		
	}

}
