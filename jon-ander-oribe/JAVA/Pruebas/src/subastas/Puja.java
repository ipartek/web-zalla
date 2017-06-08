package subastas;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Puja extends Usuario {

	private double cantidadPujada = 0.0;
	static String registro="";

	public Puja(String nombre, double cantidadPujada) {
		super(nombre);
		this.cantidadPujada = cantidadPujada;

	}

	public double getCantidadPujada() {
		return cantidadPujada;
	}

	public static void Comprar() {
		
		//Usuario nombrePropietario=Principal.arraySubasta[Principal.idUsuario].getNombrePropietario();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("¿Que quieres comprar?");
		System.out.println("Opcion 0: "+Principal.arraySubasta[0].toString());
		System.out.println("Opcion 1: "+Principal.arraySubasta[1].toString());
		System.out.println("Opcion 2: "+Principal.arraySubasta[2].toString());
		System.out.println("Opcion 3: "+Principal.arraySubasta[3].toString());
		int eleccion=sc.nextInt();
		System.out.println("El precio actual de "+Principal.arraySubasta[eleccion].getNombreObjeto()+ " es de "+Principal.arraySubasta[eleccion].getPujaMayor());
		System.out.println("¿Cuanto quieres pagar por "+Principal.arraySubasta[eleccion].getNombreObjeto()+" ?");
		double puja=sc.nextDouble();
		
		if (puja < Principal.arrayUsuario[Principal.idUsuario].getCredito() && puja> Principal.arraySubasta[eleccion].getPujaMayor()) {
			System.out.println("Objeto adquirido!!");
			registro="-->"+Principal.arrayUsuario[Principal.idUsuario].getNombre()+" ha comprado "+ Principal.arraySubasta[eleccion].getNombreObjeto()+" a "+Principal.arraySubasta[eleccion].getNombrePropietario()+" por "+puja+".\n";
			Principal.arrayUsuario[Principal.idUsuario].decrementarCredito(puja);
			//REVISAR EL INCREMENTO;HACE COSAS MUY RARAS
			System.out.println(Principal.arraySubasta[eleccion].getNombrePropietario()+" ahora tiene "+((double)(Principal.arraySubasta[eleccion].getNombrePropietario().credito)+puja)+" euros!!");
			double aumentoCredito=(double)(Principal.arraySubasta[eleccion].getNombrePropietario().credito)+puja;
			Principal.arrayUsuario[0].incrementarCredito(aumentoCredito);
			
			/*for(Usuario usuarioVende: Principal.arrayUsuario){
				
				if(usuarioVende.getNombre().equals(nombrePropietario)){
					System.out.println(usuarioVende.incrementarCredito(puja));
				}
				
			}*/
			//Principal.arrayUsuario[Principal.arraySubasta[eleccion].].incrementarCredito(puja);
			
			Principal.arraySubasta[eleccion].setNombrePropietario(Principal.arrayUsuario[Principal.idUsuario]);
			Principal.arraySubasta[eleccion].setPujaMayor(puja);
			System.out.println(registro);
			imprimirFactura();
			
			
		} else {
			System.out.println("Falta credito");

		}

	}
	
	public static void imprimirFactura(){
		
		try {
			File directorio = new File("Facturas");
			directorio.mkdir();
			System.out.println("La carpeta "+directorio.getName() +" se ha creado en "+System.getProperty("user.dir"));
			String ruta=System.getProperty("Facturas.dir");
			File archivo = new File("C:/desarrollo/web/web-zalla/jon-ander-oribe/JAVA/Pruebas/Facturas"+File.separator+"Registro.txt");
			archivo.getParentFile().mkdirs();
			archivo.createNewFile();
			FileWriter textoSalida=new FileWriter(archivo,true);
			textoSalida.write(registro);
			textoSalida.close();
			} catch(Exception e) {
				System.out.println("Fallo durante la generación del documento");
			}
		
	}
}
