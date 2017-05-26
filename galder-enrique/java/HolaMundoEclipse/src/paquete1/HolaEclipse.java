package paquete1;

public class HolaEclipse {

	public static void main(String[] args) {
		System.out.println("HOLA MUNDO");
		int a = 3;
		int b = 7;
		int c = suma(a,b);
		System.out.println("suma: " + c);

	}
	public static int suma(int a, int b) {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		int c = a + b;
		return c;
	}
	

}


