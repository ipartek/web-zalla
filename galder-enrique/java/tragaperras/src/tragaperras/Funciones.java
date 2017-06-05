package tragaperras;

import java.util.Random;

public class Funciones {
	
	double valorIntroducido;
	
	public static double introducirSaldo(double valorIntroducido) {

		System.out.println("La cantidad introducida es: " + valorIntroducido);

		return valorIntroducido;
	}
	
	public static String[] jugar(){
		Random generador = new Random();
		int index = generador.nextInt(5);
				
		String[] frutasArray = new String[Maquina.casillas];
		Premio.Fruta[] frutaObtenido = Premio.Fruta.values();
		
		for(int i=0;i<Maquina.casillas;i++){
			frutasArray[i] = frutaObtenido[index].toString();
			index = generador.nextInt(5);
		}
		System.out.println("La fruta de la primera casilla es: " + frutasArray[0]);
		System.out.println("La fruta de la segunda casilla es: " + frutasArray[1]);
		System.out.println("La fruta de la tercera casilla es: " + frutasArray[2]);
		return frutasArray;
	}
	
	public static double premio(String[] frutasArray){
		double premio = 0.0;
		double saldoTotal = 0.0;
		int intentos = 0;
		
		if(frutasArray[0]==frutasArray[1] && frutasArray[0]== frutasArray[2]){
			premio = premio + 20;
			saldoTotal= premio + Principal.tragaperras.getSaldo();
			Principal.tragaperras.setSaldo(saldoTotal);
			System.out.println("PREMIO!!11UNOUNO tu saldo es: " + saldoTotal + " con " + intentos + " intentos");
		}else {
			System.out.println("No hay premio: Better luck next time!");
			intentos++;
		}
		return saldoTotal;
	}

}
