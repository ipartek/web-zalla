package tragaperras;

import java.util.Random;

public class Funciones {

	double valorIntroducido;

	public static double introducirSaldo(double valorIntroducido) {

		System.out.println("La cantidad introducida es: " + valorIntroducido);

		return valorIntroducido;
	}

	public static double jugar() {

		double premio = 0.0;
		Random generador = new Random();
		int index = generador.nextInt(5);
		String[] frutasArray = new String[Maquina.casillas];

		Premio.Fruta[] frutaObtenido = Premio.Fruta.values();
		String frutasObtenidas = "";
		for (int i = 0; i < Maquina.casillas; i++) {

			frutasArray[i] = frutaObtenido[index].toString();
			index = generador.nextInt(5);

		}
		frutasObtenidas = frutaObtenido.toString();
		System.out.println("Las frutas obtenidas son: " + frutasArray[0]);
		System.out.println("Las frutas obtenidas son: " + frutasArray[1]);
		System.out.println("Las frutas obtenidas son: " + frutasArray[2]);
		return premio;
	}

	public static double premio(String x,String y, String z) {
		
		double premio = 0.0;
		
		if(x==y && x==z){
			System.out.println("Premio!!");
			premio+=100;
		}
		
		return premio;
	}
}
