package puntos;

public class Programa {
	
	public static void main(String[] args) {
		Direccion dir = Direccion.ARRIBA;
		
		Punto punto1= new Punto(2,3);
		punto1.MuevePunto(dir);
		punto1.MuestraPunto();
		Punto punto2 = new Punto(4,2);
		double distancia = punto2.distancia(punto1);
		System.out.println(distancia);
		Punto punto0 = new Punto();
		Punto compruebaDistancia[] = {punto1,punto2};
		Punto puntoLejano = new Punto(punto0.MayorDistancia(compruebaDistancia));
		puntoLejano.MuestraPunto();
		Circulo circulo1 = new Circulo(punto1,3);
		Circulo circulo2 = new Circulo(punto1,5);
		circulo2.desplazar(3, 2);
		circulo1.MuestraCirculo("circulo 1");
		circulo2.MuestraCirculo("circulo2");
		Punto centro = circulo2.getCentro();
		centro.MuevePunto(Direccion.ABAJO);
		centro.MuestraPunto();
		circulo2.MuestraCirculo("circulo2");
		circulo2.escalar(150);
		circulo2.MuestraCirculo("circulo2");
		Rectangulo rectangulo1 = new Rectangulo(5, 3, punto2);
		rectangulo1.muestraRectangulo("rectangulo1");
		rectangulo1.desplazar(5, 6);
		rectangulo1.muestraRectangulo("rectangulo1");
	}

}
