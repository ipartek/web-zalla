package subastas;

import java.time.*;
import java.time.temporal.*;
import java.io.*;
import java.util.Scanner;

public class Puja extends Usuario {
	private static LocalDateTime ahora = LocalDateTime.now();
	private double cantidadPujada = 0.0;
	private static double pujaMinima=0.0;
	private static int contadorPujas=0;
	static String registro = "";

	public Puja(String nombre, double cantidadPujada) {
		super(nombre);
		this.cantidadPujada = cantidadPujada;

	}

	public double getCantidadPujada() {
		return cantidadPujada;
	}

	public static void Comprar() {

		// Usuario
		// nombrePropietario=Principal.arraySubasta[Principal.idUsuario].getNombrePropietario();

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Que quieres comprar?");
		System.out.println("Opcion 0: " + Principal.arraySubasta[0].toString());
		System.out.println("Opcion 1: " + Principal.arraySubasta[1].toString());
		System.out.println("Opcion 2: " + Principal.arraySubasta[2].toString());
		System.out.println("Opcion 3: " + Principal.arraySubasta[3].toString());
		int eleccion = sc.nextInt();
		pujaMinima=Principal.arraySubasta[eleccion].getPujaMayor()+(Principal.arraySubasta[eleccion].getPujaMayor()/10);
		System.out.println("El precio actual de " + Principal.arraySubasta[eleccion].getNombreObjeto() + " es de "
				+ Principal.arraySubasta[eleccion].getPujaMayor()+" y la puja MINIMA es de "+ pujaMinima);
		System.out.println("¿Cuanto quieres pagar por " + Principal.arraySubasta[eleccion].getNombreObjeto() + " ?");
		double puja = sc.nextDouble();
		
		if(contadorPujas>=8){
			
			System.out.println("Numero de pujas por sesion superado.Vuelva otro dia");
		}

		else if (puja < Principal.arrayUsuario[Principal.idUsuario].getCredito()
				&& puja > Principal.arraySubasta[eleccion].getPujaMayor()) {
			System.out.println("Objeto adquirido!!");
			registro = "-->" + Principal.arrayUsuario[Principal.idUsuario].getNombre() + " ha comprado "
					+ Principal.arraySubasta[eleccion].getNombreObjeto() + " a "
					+ Principal.arraySubasta[eleccion].getNombrePropietario() + " por " + puja + ".\n";
			Principal.arrayUsuario[Principal.idUsuario].decrementarCredito(puja);

			System.out.println(Principal.arraySubasta[eleccion].getNombrePropietario() + " ahora tiene "
					+ ((double) (Principal.arraySubasta[eleccion].getNombrePropietario().credito) + puja) + " euros!!");
			
			int verificacion=Principal.arraySubasta[eleccion].getNombrePropietario().getID();
			Principal.arrayUsuario[verificacion].incrementarCredito(puja);

			Principal.arraySubasta[eleccion].setNombrePropietario(Principal.arrayUsuario[Principal.idUsuario]);
			Principal.arraySubasta[eleccion].setPujaMayor(puja);
			System.out.println(registro);
			imprimirFactura();
			ahora=LocalDateTime.now();
			System.out.println("La compra se realizo: "+ahora);
			contadorPujas++;

		} else {
			System.out.println("Falta credito");

		}

	}

	public static void imprimirFactura() {

		try {
			File directorio = new File("Facturas");
			directorio.mkdir();
			System.out.println(
					"La carpeta " + directorio.getName() + " se ha creado en " + System.getProperty("user.dir"));
			String ruta = System.getProperty("Facturas.dir");
			File archivo = new File("C:/desarrollo/web/web-zalla/jon-ander-oribe/JAVA/Pruebas/Facturas" + File.separator
					+ "Registro.txt");
			archivo.getParentFile().mkdirs();
			archivo.createNewFile();
			BufferedWriter textoSalida = new BufferedWriter(new FileWriter(new File("C:/desarrollo/web/web-zalla/jon-ander-oribe/JAVA/Pruebas/Facturas" + File.separator
					+ "Registro.txt"), true));
			textoSalida.write(ahora+" "+registro);
			textoSalida.newLine();
			textoSalida.close();
		} catch (Exception e) {
			System.out.println("Fallo durante la generación del documento");
		}

	} 
}
