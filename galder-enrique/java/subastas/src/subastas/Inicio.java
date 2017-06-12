package subastas;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
	static Usuario[] arrayUsuario = new Usuario[6];
	static Subasta[] arraySubasta = new Subasta[4];
	static int idUsuario = 0;
	static int opcion;

	public static Usuario[] inicializarUsuario() {

		arrayUsuario[0] = new Usuario(0, "Mariano", 97000);
		arrayUsuario[1] = new Usuario(1, "Alberto", 14000);
		arrayUsuario[2] = new Usuario(2, "Ainara", 5000);
		arrayUsuario[3] = new Usuario(3, "Adalberto", 3000);
		arrayUsuario[4] = new Usuario(4, "Frunciano", 10000);
		arrayUsuario[5] = new Usuario(5, "Burgundofora", 10);
		return arrayUsuario;
	}

	public static Subasta[] inicializarSubasta() {
		arraySubasta[0] = new Subasta("Portatil HP", arrayUsuario[5], true, 500.0, 0);
		arraySubasta[1] = new Subasta("Teléfono Móvil", arrayUsuario[1], true, 800.0, 3);
		arraySubasta[2] = new Subasta("Libro Java 8", arrayUsuario[2], false, 20.0, 4);
		arraySubasta[3] = new Subasta("Botella de agua Lanjarón", arrayUsuario[3], true, 10000.0, 3);
		return arraySubasta;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Usuario[] arrayUsuario = inicializarUsuario();
		Subasta[] arraySubasta = inicializarSubasta();

		int sc1;

		// int variableAux =0;
		double pujaMaxima = 0.0;
		double cantidadPuja = 0.0;

		String duenoSubasta;

		/*
		 * Usuario usuarioJuan = new Usuario("Juan", 100); Usuario usuarioPedro
		 * = new Usuario("Pedro", 150); Usuario usuarioEnrique = new
		 * Usuario("Enrique", 300); ArrayList<Usuario> listaPujas = new
		 * ArrayList<Usuario>(); listaPujas.add(usuarioJuan);
		 * listaPujas.add(usuarioPedro); listaPujas.add(usuarioEnrique);
		 */
		// CREAR UN OBJETO CON CONSTRUCTOR POR DEFECTO
		// QUE TIENE QUE SER DEFINIDO EN LA CLASE
		// Subasta subastaTlf = new Subasta();

		do {
			System.out.println("1-Login");
			System.out.println("2-Consultar Pujas Disponibles Actualmente");
			System.out.println("3-Comprar Puja");
			System.out.println("4-Pujar");
			System.out.println("5-Salir");
			System.out.println("***********************************");

			sc1 = sc.nextInt();

			switch (sc1) {
			case 1:
				System.out.println("***********************************");
				System.out.println("Introduce tu ID de Usuario : ");
				idUsuario = sc.nextInt();
				System.out.println("Bienvenido " + arrayUsuario[idUsuario].getNombre() + "!!");
				System.out.println("***********************************");

				break;
			case 2:
				System.out.println("***********************************");
				System.out.println("Esta es la primera subasta : " + arraySubasta[0].toString());
				System.out.println("Esta es la segunda subasta : " + arraySubasta[1].toString());
				System.out.println("Esta es la tercera subasta : " + arraySubasta[2].toString());
				System.out.println("Esta es la cuarta subasta : " + arraySubasta[3].toString());
				System.out.println("***********************************");
				break;
			case 3:
				Puja.comprar();
				
				break;
			case 4:

				break;
			case 5:
				break;

			}
		} while (sc1 != 5);
		sc.close();

	}

}
/*
 * System.out.println("******************************"); Subasta subastaTlf =
 * new Subasta("TelefonoMovil", usuarioJuan.nombre, true, 0.0);
 * System.out.println(subastaTlf.toString()); // // PUJA DE PEDRO DE 100, SOLO
 * SE ACEPTA SI ES LA MAYOR PUJA do {
 * System.out.println("Introduce la puja de Pedro: "); cantidadPuja =
 * sc.nextDouble();// 100 usuarioPedro.setPujaTotal(cantidadPuja);
 * 
 * if (subastaTlf.getMayorPuja() < cantidadPuja) {
 * subastaTlf.setMayorPuja(cantidadPuja); //
 * usuarioPedro.decrementarCredito(cantidadPuja); }
 * System.out.println("El usuario " + usuarioPedro.nombre + " ha pujado " +
 * cantidadPuja); } while (subastaTlf.getMayorPuja() > cantidadPuja &&
 * subastaTlf.isActivo() == true); // // PUJA DE ENRIQUE DE 50, NO SE ACEPTA
 * PORQUE NO ES LA MAYOR // PUJA
 * 
 * // do { System.out.println("Introduce la puja de Enrique: "); cantidadPuja =
 * sc.nextDouble();// 50 usuarioEnrique.setPujaTotal(cantidadPuja);
 * 
 * if (subastaTlf.getMayorPuja() < cantidadPuja) {
 * subastaTlf.setMayorPuja(cantidadPuja); //
 * usuarioEnrique.decrementarCredito(cantidadPuja); }
 * System.out.println("El usuario " + usuarioEnrique.nombre + " ha pujado " +
 * cantidadPuja);
 * 
 * System.out.println("Hasta ahora la mayor puja es : (" +
 * subastaTlf.getMayorPuja() + ")"); // } while (subastaTlf.getMayorPuja() >
 * cantidadPuja && // subastaTlf.isActivo()==true);
 * 
 * // EJECUCION DE LA SUBASTA, BOOLEAN ACTIVO == FALSE for (Usuario
 * pujaMaximaTotal : listaPujas) { double filtroPujas =
 * listaPujas.get(variableAux).getPujaTotal();
 * System.out.println("La puja total es: " + pujaMaximaTotal.toString());
 * System.out.println(filtroPujas); if(filtroPujas > pujaMaxima){ pujaMaxima =
 * filtroPujas; duenoSubasta = listaPujas.get(variableAux).getNombre();
 * if(duenoSubasta == subastaTlf.getUsuarioSubasta()){
 * incrementarCredito(pujaMaxima);
 * 
 * } } System.out.println("La mayor es : " + pujaMaxima); variableAux++;
 * 
 * } //QUITAR DINERO DEL USUARIO GANADOR
 * usuarioPedro.decrementarCredito(pujaMaxima);
 * 
 * //DAR DINERO AL DUEÑO DE LA SUBASTA //System.out.println(duenoSubasta +
 * " es el propietario de la subasta");
 * 
 * 
 * subastaTlf.setActivo(false);
 * 
 * // ENRIQUE REPUJA 200, PERO NO SE LE ACEPTA AL NO ESTAR ACTIVA // LA SUBASTA
 * do { System.out.println("Introduce la puja de Enrique2: "); cantidadPuja =
 * sc.nextDouble();// 200 usuarioEnrique.setPujaTotal(cantidadPuja);
 * 
 * if (subastaTlf.getMayorPuja() < cantidadPuja && subastaTlf.isActivo() ==
 * true) { subastaTlf.setMayorPuja(cantidadPuja); //
 * usuarioEnrique.decrementarCredito(cantidadPuja);
 * System.out.println("El usuario " + usuarioEnrique.nombre + " ha pujado " +
 * cantidadPuja); } System.out.println("Hasta ahora la mayor puja es : (" +
 * subastaTlf.getMayorPuja() + ")"); } while (subastaTlf.getMayorPuja() >
 * cantidadPuja && subastaTlf.isActivo() == true); // MOSTRAR CREDITOS FINALES
 * System.out.println("Juan :" + usuarioJuan.getCredito() + " Pedro : " +
 * usuarioPedro.getCredito() + " Enrique : " + usuarioEnrique.getCredito());
 */