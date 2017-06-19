package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class BusquedaPorDNI {

	public static void main(String[] args) {
		

		
		Map<Dni, Persona> mapaPersonas=new HashMap<Dni,Persona>();
		Persona persona1= new Persona(1,"Jose","Martinez", new Dni("2233445566",'A'));
		mapaPersonas.put(persona1.getDni(), persona1);
		Persona persona2 = new Persona(2, "Marta", "Bilbao", new Dni("2233445577",'B'));
		mapaPersonas.put(persona2.getDni(), persona2);
		Persona persona3 = new Persona(3, "Oscar", "Igartua", new Dni("2233445588", 'C'));
		mapaPersonas.put(persona3.getDni(), persona3);
		Persona persona4 = new Persona(3, "Oscar", "Igartua", new Dni("2233445588", 'C'));
		mapaPersonas.put(persona4.getDni(), persona3);
		
		Dni clave=null;
		Iterator<Dni> elementos=mapaPersonas.keySet().iterator();
		System.out.println("Existen los siguientes elementos: ");
		while(elementos.hasNext()){
			clave= elementos.next();
			System.out.println(clave+"-"+mapaPersonas.get(clave));
			
		}
		
		//TEST
		
		Telefono telefono1= new Telefono(656778943);
		
		Map<Telefono, Persona> mapaTelefonos=new HashMap<Telefono,Persona>();
		mapaTelefonos.put(telefono1, persona1);
		
		System.out.println(mapaTelefonos);
		
		
		//FIN TEST
		
		int codigo=telefono1.getNumero();
		System.out.println(codigo);
		System.out.println(mapaTelefonos.keySet());
		System.out.println(mapaTelefonos.containsKey(codigo));
		
		if(mapaTelefonos.containsKey(codigo)){
			System.out.println(codigo);
		}else{
			System.out.println("El DNI no existe");
		}
		

	}

	private static Dni dni(String numero, char letra) {
		// TODO Auto-generated method stub
		numero=numero;
		letra=letra;
		return null;
	}
	




}
