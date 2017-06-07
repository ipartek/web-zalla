package subastas;
import java.util.Scanner;

public class Puja extends Usuario {

	private double cantidadPujada = 0.0;

	public Puja(String nombre, double cantidadPujada) {
		super(nombre);
		this.cantidadPujada = cantidadPujada;

	}

	public double getCantidadPujada() {
		return cantidadPujada;
	}

	public static void Comprar() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("¿Que quieres comprar?");
		System.out.println("Opcion 0: "+Principal.arraySubasta[0].toString());
		System.out.println("Opcion 1: "+Principal.arraySubasta[1].toString());
		System.out.println("Opcion 2: "+Principal.arraySubasta[2].toString());
		System.out.println("Opcion 3: "+Principal.arraySubasta[3].toString());
		int eleccion=sc.nextInt();
		System.out.println("El precio actual de "+Principal.arraySubasta[eleccion].getNombreObjeto()+ " es de "+Principal.arraySubasta[eleccion].getPujaMayor());
		System.out.println("¿Cuanto quieres pagar por "+Principal.arraySubasta[eleccion].getNombreObjeto()+" ?");
		double puja=sc.nextDouble();
		
		if (puja < Principal.arrayUsuario[Principal.idUsuario].getCredito() && puja> Principal.arraySubasta[eleccion].getPujaMayor()) {
			System.out.println("Objeto adquirido!!");
			Principal.arrayUsuario[Principal.idUsuario].decrementarCredito(puja);
			//REVISAR EL INCREMENTO;HACE COSAS MUY RARAS
			System.out.println(Principal.arraySubasta[Principal.idUsuario].getNombrePropietario()+" acaba de ganar "+((double)(Principal.arraySubasta[eleccion].getNombrePropietario().credito)+puja)+" euros!!");
			
			for(Usuario usuarioVende: Principal.arrayUsuario){
				
				if(usuarioVende.getNombre().equals(Principal.arraySubasta[eleccion].getNombrePropietario())){
					System.out.println(usuarioVende.incrementarCredito(puja));
				}
				
			}
			//Principal.arrayUsuario[Principal.arraySubasta[eleccion].].incrementarCredito(puja);
			
			Principal.arraySubasta[eleccion].setNombrePropietario(Principal.arrayUsuario[Principal.idUsuario]);
			Principal.arraySubasta[eleccion].setPujaMayor(puja);
			//Principal.arraySubasta[Principal.idUsuario].incrementarCredito(puja);
			//Principal.arrayUsuario[Principal.idUsuario].incrementarCredito(Principal.arraySubasta[eleccion].getPujaMayor());//ESTA MAL;PERO A POSTA
			
		} else {
			System.out.println("Falta credito");

		}

	}
	
	public void imprimirFactura(){}
}
