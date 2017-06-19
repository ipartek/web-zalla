package subasta2ejercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sc1;
int variableAux =0;
double pujaMaxima=0.0;
		double cantidadPuja = 0.0;
		String duenoSubasta;

		Usuario usuarioJuan = new Usuario("Juan", 100);
		Usuario usuarioPedro = new Usuario("Pedro", 150);
		Usuario usuarioEnrique = new Usuario("Enrique", 300);
		ArrayList<Usuario> listaPujas = new ArrayList<Usuario>();
		listaPujas.add(usuarioJuan);
		listaPujas.add(usuarioPedro);
		listaPujas.add(usuarioEnrique);
		// CREAR UN OBJETO CON CONSTRUCTOR POR DEFECTO
		// QUE TIENE QUE SER DEFINIDO EN LA CLASE
		// Subasta subastaTlf = new Subasta();

		do {
			System.out.println("1-Crea una subasta");
			System.out.println("2-Pujar");
			System.out.println("3-Retirar saldo");
			System.out.println("4-Pujar");
			System.out.println("5-Salir");

			sc1 = sc.nextInt();

			switch (sc1) {
			case 1:
				System.out.println("******************************");
				Subasta subastaTlf = new Subasta("TelefonoMovil", usuarioJuan.nombre, true, 0.0);
				System.out.println(subastaTlf.toString());
				//
				// PUJA DE PEDRO DE 100, SOLO SE ACEPTA SI ES LA MAYOR PUJA
				do {
					System.out.println("Introduce la puja de Pedro: ");
					cantidadPuja = sc.nextDouble();// 100
					usuarioPedro.setPujaTotal(cantidadPuja);

					if (subastaTlf.getMayorPuja() < cantidadPuja) {
						subastaTlf.setMayorPuja(cantidadPuja);
						// usuarioPedro.decrementarCredito(cantidadPuja);
					}
					System.out.println("El usuario " + usuarioPedro.nombre + " ha pujado " + cantidadPuja);
				} while (subastaTlf.getMayorPuja() > cantidadPuja && subastaTlf.isActivo() == true);
				//
				// PUJA DE ENRIQUE DE 50, NO SE ACEPTA PORQUE NO ES LA MAYOR
				// PUJA

				// do {
				System.out.println("Introduce la puja de Enrique: ");
				cantidadPuja = sc.nextDouble();// 50
				usuarioEnrique.setPujaTotal(cantidadPuja);

				if (subastaTlf.getMayorPuja() < cantidadPuja) {
					subastaTlf.setMayorPuja(cantidadPuja);
					// usuarioEnrique.decrementarCredito(cantidadPuja);
				}
				System.out.println("El usuario " + usuarioEnrique.nombre + " ha pujado " + cantidadPuja);

				System.out.println("Hasta ahora la mayor puja es : (" + subastaTlf.getMayorPuja() + ")");
				// } while (subastaTlf.getMayorPuja() > cantidadPuja &&
				// subastaTlf.isActivo()==true);

				// EJECUCION DE LA SUBASTA, BOOLEAN ACTIVO == FALSE
				for (Usuario pujaMaximaTotal : listaPujas) {
					double filtroPujas = listaPujas.get(variableAux).getPujaTotal();
					System.out.println("La puja total es: " + pujaMaximaTotal.toString());
					System.out.println(filtroPujas);
					if(filtroPujas > pujaMaxima){
						pujaMaxima = filtroPujas;
					}
					System.out.println("La mayor es : " + pujaMaxima);
					variableAux++;

				}
				//QUITAR DINERO DEL USUARIO GANADOR
				usuarioPedro.decrementarCredito(pujaMaxima);
				
				//DAR DINERO AL DUEÑO DE LA SUBASTA
				duenoSubasta = subastaTlf.getUsuarioSubasta();
				//System.out.println(duenoSubasta + " es el propietario de la subasta");
				if(duenoSubasta == Usuario.getNombre()){
					
				}
				
				subastaTlf.setActivo(false);

				// ENRIQUE REPUJA 200, PERO NO SE LE ACEPTA AL NO ESTAR ACTIVA
				// LA SUBASTA
				do {
					System.out.println("Introduce la puja de Enrique2: ");
					cantidadPuja = sc.nextDouble();// 200
					usuarioEnrique.setPujaTotal(cantidadPuja);

					if (subastaTlf.getMayorPuja() < cantidadPuja && subastaTlf.isActivo() == true) {
						subastaTlf.setMayorPuja(cantidadPuja);
						// usuarioEnrique.decrementarCredito(cantidadPuja);
						System.out.println("El usuario " + usuarioEnrique.nombre + " ha pujado " + cantidadPuja);
					}
					System.out.println("Hasta ahora la mayor puja es : (" + subastaTlf.getMayorPuja() + ")");
				} while (subastaTlf.getMayorPuja() > cantidadPuja && subastaTlf.isActivo() == true);
				// MOSTRAR CREDITOS FINALES
				System.out.println("Juan :" + usuarioJuan.getCredito() + " Pedro : " + usuarioPedro.getCredito()
						+ " Enrique : " + usuarioEnrique.getCredito());
				break;
			case 2:

				// System.out.println("Tu Saldo es : " +
				// tragaperras.getSaldo());
				break;
			case 3:
				// if (tragaperras.getSaldo() == 0) {
				// System.out.println("Lo siento! Introduce saldo para poder
				// jugar");
				// cantidades = sc.nextDouble();
				// tragaperras.setSaldoSuma(Funciones.introducirSaldo(cantidades));
				// }
				//
				// tragaperras.setSaldo(Funciones.premio(Funciones.jugar()));
				// System.out.println("Tu saldo actual es de: " +
				// tragaperras.getSaldo());
				break;
			case 4:
				// System.out.println("Tus premios son : " +
				// tragaperras.getSaldo());
				// tragaperras.borrarSaldo();
				break;
			case 5:
				break;

			}
		} while (sc1 != 5);
		sc.close();

	}

}
