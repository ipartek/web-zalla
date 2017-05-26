package varios;

public class TestSimple {

	public static void main(String[] args) {

		ClaseUno prueba = new ClaseUno(1,2,3);
		ClaseDos prueba2 = new ClaseDos(3,4,5);
		ClaseTres prueba3 = new ClaseTres(6,7,8);
		ClaseUno pruebaParametros=new ClaseUno(7,8,9);
		System.out.println(prueba.getM1());
		System.out.println(prueba2.getM2());
		System.out.println(prueba3.getM3());
		System.out.println(pruebaParametros.getM2());
	}

}
