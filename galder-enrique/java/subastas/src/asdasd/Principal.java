package subastas;

import java.util.*;

public class Principal {

	static Usuario arrayUsuario[]=new Usuario[6];

	// CLIENTES

	arrayUsuario[0]=new Usuario(1,"Mariano",3400);
	arrayUsuario[1]=new Usuario(2,"Cristina",7405);
	arrayUsuario[2]=new Usuario(3,"Pedro",2840);
	arrayUsuario[3]=new Usuario(4,"Ghao-Pin",12000);
	arrayUsuario[4]=new Usuario(5,"Magnate del petroleo",300);
	arrayUsuario[5]=new Usuario(6,"Artista anonimo",210);

	// SUBASTAS

	static Subasta subasta1 = new Subasta("Jarron Minh", new Usuario(4, "Ghao-Pin", 12000), true);

	static Subasta subasta2 = new Subasta("Brujula Mágica", new Usuario(4, "Ghao-Pin", 12000), true, 350);

	static Subasta subasta3 = new Subasta("Joya ridiculamente brillante", new Usuario(5, "Magnate del petroleo", 300),
			true, 280);

	static Subasta subasta4 = new Subasta("Monton de estiercol", new Usuario(6, "Artista anonimo", 210), false, 12);

	public static void main(String[] args) {

		int sc1 = 0;
		int idUsuario = 0;
		System.out.println("Objetos en venta");
		Subasta.consultarCatalogo();
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
				System.out.println("Eres: "+Usuario.ids[idUsuario].toString());

				break;
			case 1:
				Subasta.consultarCatalogo();
				break;
			case 2:

				break;
			case 3:
				System.out.println("Dime "+Usuario.ids[idUsuario].toString()+",¿En cantidad quieres aumentar tu saldo?");
				sc1 = sc.nextInt();
				arrayUsuario[0].incrementarCredito(sc1);
				System.out.println("Tu saldo actual es " + arrayUsuario[0].getCredito());
				break;
			case 4:
				System.out.println("Dime "+Usuario.ids[idUsuario].toString()+",¿En cantidad quieres reducir tu saldo?");
				sc1 = sc.nextInt();
				arrayUsuario[0].decrementarCredito(sc1);
				System.out.println("Tu saldo actual es " + arrayUsuario[0].getCredito());
				break;
			case 5:
				break;
			case 6:
				break;

			}
		} while (sc1 != 6);

	}
}}
