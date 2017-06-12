package geometria;

public class PruebaPunto {

	public static void main(String[] args) {
		Punto punto1 = new Punto(1, 3);
		mostrarInfo("punto1", punto1);
		Punto punto2 = new Punto();
		mostrarInfo("punto2", punto2);
		Punto punto3 = new Punto(punto1);
		mostrarInfo("punto3", punto3);
		punto1.setX(9);
		mostrarInfo("punto3", punto3);
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
		punto1.desplazar(3, 4);
		mostrarInfo("punto1", punto1);

	}

	public static void mostrarInfo(String nombrePunto, Punto punto) {
		System.out.println("Datos " + nombrePunto + ": " + punto);

	}

}
