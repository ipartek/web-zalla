package Tragaperras;

import java.util.Random;

public class Funciones {

	double valorIntroducido;
	static String[] frutasArray = new String[Maquina.casillas];
	static double premio = 0.0;
	

	public static double introducirSaldo(double valorIntroducido) {

		System.out.println("La cantidad introducida es: " + valorIntroducido);

		return valorIntroducido;
	}

	public static String[] jugar() {

		Random generador = new Random();
		int index = generador.nextInt(5);
		

		Premio.Fruta[] frutaObtenido = Premio.Fruta.values();
		
		for (int i = 0; i < Maquina.casillas; i++) {

			frutasArray[i] = frutaObtenido[index].toString();
			index = generador.nextInt(5);

		}
		
		System.out.println("Las frutas obtenidas son: " + frutasArray[0]);
		System.out.println("Las frutas obtenidas son: " + frutasArray[1]);
		System.out.println("Las frutas obtenidas son: " + frutasArray[2]);
		return frutasArray;
	}

	public static double premio(String[] frutasArray) {
		
		
		
		if(frutasArray[0]==frutasArray[1] && frutasArray[0]==frutasArray[2]){
			System.out.println("Premio!!");
			premio+=100;
		}else{
			System.out.println("No ha habido suerte.INTENTALO DE NUEVO!!");
			premio-=Maquina.precioPartida;
		}
		
		return premio;
	}
}
