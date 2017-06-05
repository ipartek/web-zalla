package geometria;

public class PruebaPunto {

	public static void main(String[] args) {
		//1 parte
		Punto punto1 = new Punto(1, 3);
		mostrarInfo("punto1", punto1);
		//parte 2
		Punto punto2 = new Punto();
		mostrarInfo("punto2", punto2);
		//parte 3
		Punto punto3 = new Punto(punto1);
		mostrarInfo("punto3", punto3);
		//x=9 en punto 1
		punto1.setX(9);
		mostrarInfo("punto3", punto3);
		// a punto4 asigno pto2
		Punto punto4 = punto2;
		mostrarInfo("punto4", punto4);
		//
		punto2.setX(5);
		punto2.setY(17);
		mostrarInfo("punto2", punto2);
		mostrarInfo("punto4", punto4);
		//
		punto4.setX(3);
		punto4.setY(5);
		mostrarInfo("punto2", punto2);
		mostrarInfo("punto4", punto4);
		//
		//puedo poner Punto.desplazar(punto1,3,4);
		//sale 12,7 pq x es 9 en punto1 e y es 3 en punto1
		punto1.desplazar(3, 4);
		mostrarInfo("punto1", punto1);

	}

	public static void mostrarInfo(String nombrePunto, Punto punto) {
		System.out.println("Datos " + nombrePunto + ": " + punto);

	}

}
