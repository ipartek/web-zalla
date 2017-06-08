package subastas;

import java.util.*;

public class Principal {

	static Usuario[] arrayUsuario = new Usuario[6];
	static Subasta[] arraySubasta = new Subasta[4];
	static int idUsuario = 0;

	public static Usuario[] inicializarUsuario() {

		// CLIENTES

		arrayUsuario[0] = new Usuario(0, "Mariano", 3400);
		arrayUsuario[1] = new Usuario(1, "Cristina", 7405);
		arrayUsuario[2] = new Usuario(2, "Pedro", 2840);
		arrayUsuario[3] = new Usuario(3, "Ghao-Pin", 12000);
		arrayUsuario[4] = new Usuario(4, "Magnate del petroleo", 300);
		arrayUsuario[5] = new Usuario(5, "Artista anonimo", 210);

		return arrayUsuario;
	}

	public static Subasta[] inicializarSubasta() {

		// SUBASTAS

		arraySubasta[0] = new Subasta("Jarron Minh", arrayUsuario[3], true);

		arraySubasta[1] = new Subasta("Brujula Mágica", arrayUsuario[3], true, 350);

		arraySubasta[2] = new Subasta("Joya ridiculamente brillante", arrayUsuario[4], true, 280);

		arraySubasta[3] = new Subasta("Monton de estiercol", arrayUsuario[5], false, 12);

		return arraySubasta;
	}

	public static void main(String[] args) {

		int sc1 = 0;

		Usuario[] arrayUsuario = inicializarUsuario();
		Subasta[] arraySubasta = inicializarSubasta();
		System.out.println("Objetos en venta");
		// Subasta.consultarCatalogo();
		do {
			System.out.println("***********************************************");
			System.out.println("Elija una opción");

			System.out.println("0-Login");
			System.out.println("1-Consultar catálogo");
			System.out.println("2-Comprar");
			System.out.println("3-Ingresar saldo");
			System.out.println("4-Decrementar saldo");
			System.out.println("5-Imprimir factura");
			System.out.println("6-Cerrar sesión");

			Scanner sc = new Scanner(System.in);
			System.out.println("***********************************************");
			System.out.println("Introduzca su opción");
			sc1 = sc.nextInt();

			switch (sc1) {
			case 0:
				System.out.println("¿Quien eres?");
				idUsuario = sc.nextInt();
				System.out.println("Eres: " + Usuario.ids[idUsuario].toString());

				break;
			case 1:
				// Subasta.consultarCatalogo();

				System.out.println(arraySubasta[0].toString());
				System.out.println(arraySubasta[1].toString());
				System.out.println(arraySubasta[2].toString());
				System.out.println(arraySubasta[3].toString());

				break;
			case 2:

				Puja.Comprar();

				break;
			case 3:
				System.out.println(
						"Dime " + Usuario.ids[idUsuario].toString() + ",¿En cantidad quieres aumentar tu saldo?");
				sc1 = sc.nextInt();
				arrayUsuario[idUsuario].incrementarCredito(sc1);
				System.out.println("Tu saldo actual es " + arrayUsuario[idUsuario].getCredito());
				break;
			case 4:
				System.out.println(
						"Dime " + Usuario.ids[idUsuario].toString() + ",¿En cantidad quieres reducir tu saldo?");
				sc1 = sc.nextInt();
				arrayUsuario[idUsuario].decrementarCredito(sc1);
				System.out.println("Tu saldo actual es " + arrayUsuario[idUsuario].getCredito());
				break;
			case 5:
				System.out.println("Creando carpeta...");
				Puja.imprimirFactura();
				break;
			case 6:
				System.exit(0);
				break;

			}
		} while (sc1 != 6);
	}
}
