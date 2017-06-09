package varios;

public class PracticaHilos {

	public static void main(String[] args) throws InterruptedException {

		Hilo miHilo = new Hilo();
		miHilo.start();
		for (int i = 0; i < 10; i++) {
			miHilo.sleep(1);
			System.out.println("Hola!");

		}

	}

}
