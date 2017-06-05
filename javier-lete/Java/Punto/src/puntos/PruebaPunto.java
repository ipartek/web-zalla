package puntos;

public class PruebaPunto {

	public static void main(String[] args) {
		// Generamos punto con coordenadas
		Punto punto1 = new Punto(1, 3);
		punto1.MuestraPunto();
		
		// Generamos punto en 0,0
		Punto punto2 = new Punto();
		punto2.MuestraPunto();
		
		// Generamos punto en las coordenadas actuales de punto1
		Punto punto3 = new Punto(punto1);
		punto3.MuestraPunto();
		
		// Generamos punto, que es una referencia a punto2
		Punto punto4 = punto2;
		punto4.MuestraPunto();
		
		//Movemos punto2 y mostramos coordenadas; las coordenadas de punto4 son las mismas.
		punto2.MuevePunto(3, 7);
		punto4.MuestraPunto();
	}


}
