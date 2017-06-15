package arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import conduccion.Dni;
import conduccion.Persona;


public class EjecutarListaPersonas {
	
	public static void main(String[] args){
		
		List<Persona> listaPersonas = cargarListaPersonas();
		recorrerListaPersonas(listaPersonas);
	}
	//cargar arraylist con 4 personas y lo devuelve
public static List<Persona> cargarListaPersonas(){
	
	Dni dni1 = new Dni("12345678",'H');
	Persona persona1 = new Persona( "juan", "gomez", dni1);
	
	Dni dni2 = new Dni("12345679",'A');
	Persona persona2 = new Persona("juana", "gomeza", dni2);
	
	Dni dni3 = new Dni("12345677",'H');
	Persona persona3 = new Persona("juane", "gomeze", dni3);
	
	Dni dni4 = new Dni("12345676",'H');
	Persona persona4 = new Persona("juani", "gomezi", dni4);
	
	List<Persona> arrayList = new ArrayList<Persona>();
	
	arrayList.add(persona1);
	arrayList.add(persona2);
	arrayList.add(persona3);
	arrayList.add(persona4);
	
	return arrayList;
	
		
}
private static List<EjecutarListaPersonas> persona1(EjecutarListaPersonas persona2, EjecutarListaPersonas persona3,
			EjecutarListaPersonas persona4) {
		// TODO Auto-generated method stub
		return null;
	}
//recorre un list con personas
public static void recorrerListaPersonas(List<Persona> listaPersonas){
	
	for(int i=0; i<listaPersonas.size();i++){
		System.out.println(listaPersonas.get(i));
	}
	
	//Iterator<Persona> ListaPersonasIterator = listaPersonas.iterator();
	
	//while(ListaPersonasIterator.hasNext()){
		//System.out.println(ListaPersonasIterator.next());
	
	}
}

