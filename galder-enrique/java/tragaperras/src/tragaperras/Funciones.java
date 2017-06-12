package tragaperras;

import java.util.Random;

public class Funciones {

	double valorIntroducido;
	static double resta = -Maquina.precioPartida;
	static int intentos = 0;

	public static double introducirSaldo(double valorIntroducido) {

		System.out.println("La cantidad introducida es: " + valorIntroducido);

		return valorIntroducido;
	}

	public static String[] jugar() {
		Random generador = new Random();
		int index = generador.nextInt(5);

		String[] frutasArray = new String[Maquina.casillas];
		Premio.Fruta[] frutaObtenido = Premio.Fruta.values();

		Principal.tragaperras.setSaldoSuma(resta);

		for (int i = 0; i < Maquina.casillas; i++) {
			frutasArray[i] = frutaObtenido[index].toString();
			index = generador.nextInt(5);
		}
		System.out.println("La fruta de la primera casilla es: " + frutasArray[0]);
		System.out.println("La fruta de la segunda casilla es: " + frutasArray[1]);
		System.out.println("La fruta de la tercera casilla es: " + frutasArray[2]);
		return frutasArray;
	}

	public static double premio(String[] frutasArray) {
		double premio = 0.0;
		double saldoTotal = 0.0;

		if (frutasArray[0] == frutasArray[1] && frutasArray[0] == frutasArray[2]) {
			premio = premio + 20;
			// Melocoton = premio 30
			if (frutasArray[0] == "Melocoton") {
				premio = premio + 10;
				System.out.println("El premio del Melocotón es : " + premio);
			}
			//Fresa = premio 40
			if (frutasArray[0] == "Fresa") {
				premio = premio + 20;
				System.out.println("El premio de la fresa es : " + premio);
			}
			//Plátano = premio 120
			if (frutasArray[0] == "Platano") {
				premio = premio + 100;
				System.out.println("El premio del plátano es : " + premio);
			}
			saldoTotal = premio + Principal.tragaperras.getSaldo();
			Principal.tragaperras.setSaldo(saldoTotal);
			intentos++;
			System.out.println("PREMIO!!11UNOUNO tu saldo es: " + saldoTotal + " con " + intentos + " intentos");
		} else {
			System.out.println("No hay premio: Better luck next time!");
			saldoTotal = Principal.tragaperras.getSaldo();
			intentos++;
		}

		return saldoTotal;
	}

}
