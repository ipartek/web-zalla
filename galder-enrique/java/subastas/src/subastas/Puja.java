package subastas;

import java.util.Scanner;

public class Puja extends Usuario {
	private double pujaJugada = 0.0;
	private int limiteSubasta;

	public Puja(String nombre, double pujaJugada) {
		super(nombre);
		this.pujaJugada = pujaJugada;
	}

	public double getPujaJugada() {
		return pujaJugada;
	}

	public static void comprar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***********************************");
		System.out.println("¿Qué desea adquirir?");
		System.out.println("Opción 0 : " + Inicio.arraySubasta[0].toString());
		System.out.println("Opción 1 : " + Inicio.arraySubasta[1].toString());
		System.out.println("Opción 2 : " + Inicio.arraySubasta[2].toString());
		System.out.println("Opción 3 : " + Inicio.arraySubasta[3].toString());
		int eleccion = sc.nextInt();
		
		int limiteSubasta = Inicio.arraySubasta[eleccion].getLimiteSubasta();
		if(limiteSubasta == (Inicio.arraySubasta[eleccion].getLimiteMaximoSubasta()-1)){
			System.out.println("OJIMETRO!!!! ÉSTA SUBASTA ES LA ÚLTIMA ACEPTADA!!!!");
		}

		System.out.println("La puja máxima actual de " + Inicio.arraySubasta[eleccion].getNombreObjeto() + " es : "
				+ Inicio.arraySubasta[eleccion].getMayorPuja());
		System.out.println("¿Cuanto quieres pagar por " + Inicio.arraySubasta[eleccion].getNombreObjeto() + " ?");
		double pujaFinal = sc.nextDouble();
		Inicio.arraySubasta[eleccion].setLimiteSubasta();
		System.out.println("limite subasta número " + Inicio.arraySubasta[eleccion].getLimiteSubasta());
		Inicio.arraySubasta[eleccion].setMayorPuja(pujaFinal);
		limiteSubasta = Inicio.arraySubasta[eleccion].getLimiteSubasta();

		
		
		
//		if(limiteSubasta >Inicio.arraySubasta[eleccion].getLimiteMaximoSubasta()){
//			Inicio.arraySubasta[eleccion].setActivo(false);
//			
//			System.out.println("Lo siento, la subasta deseada ha superado el número máximo de pujas y está cerrada");
//		}

		
		if (pujaFinal < Inicio.arrayUsuario[Inicio.idUsuario].getCredito() && Inicio.arraySubasta[eleccion].isActivo() == true 
				&& limiteSubasta == Inicio.arraySubasta[eleccion].getLimiteMaximoSubasta()) {
			System.out.println("Enhorabuena! El " + Inicio.arraySubasta[eleccion].getNombreObjeto() + " es suyo!");
			Inicio.arrayUsuario[Inicio.idUsuario].decrementarCredito(pujaFinal);
			for (int i = 0; i < Inicio.arrayUsuario.length; i++) {
				if (Inicio.arraySubasta[eleccion].getUsuarioSubasta().equals(Inicio.arrayUsuario[i])) {
					Inicio.arrayUsuario[i].incrementarCredito(pujaFinal);
					System.out.println(Inicio.arrayUsuario[i] + " vendedor");
				}
			}
			System.out.println(Inicio.arrayUsuario[Inicio.idUsuario].toString() + " comprador");
			Inicio.arraySubasta[eleccion].setActivo(false);
		}

	}

}
