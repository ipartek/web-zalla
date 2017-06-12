package tragaperras;

import java.util.Scanner;

public class Principal {

	static Maquina tragaperras = new Maquina();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sc1;
		double cantidades = 0.0;
		

		do {
			System.out.println("1-Recargar saldo");
			System.out.println("2-Consultar saldo");
			System.out.println("3-Jugar");
			System.out.println("4-Obtener premios");
			System.out.println("5-Salir");

			sc1 = sc.nextInt();

			switch (sc1) {
			case 1:
				System.out.println("Introduce la cantidad que desees introducir: ");
				cantidades = sc.nextDouble();
				tragaperras.setSaldoSuma(Funciones.introducirSaldo(cantidades));
				System.out.println("Saldo : " + tragaperras.getSaldo());
				break;
			case 2:
				System.out.println("Tu Saldo es : " + tragaperras.getSaldo());
				break;
			case 3:
				if (tragaperras.getSaldo() == 0) {
					System.out.println("Lo siento! Introduce saldo para poder jugar");
					cantidades = sc.nextDouble();
					tragaperras.setSaldoSuma(Funciones.introducirSaldo(cantidades));
				}
				
				tragaperras.setSaldo(Funciones.premio(Funciones.jugar()));
				System.out.println("Tu saldo actual es de: " + tragaperras.getSaldo());
				break;
			case 4:
				System.out.println("Tus premios son : " + tragaperras.getSaldo());
				tragaperras.borrarSaldo();
				break;
			case 5:
				break;

			}
		} while (sc1 != 5);
		sc.close();

	}

}
