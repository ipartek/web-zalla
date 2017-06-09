package empresa;

public class DNI {
	
	private char letra;
	private int numero;
	
	public DNI (int num, char letra){
		
		this.letra=letra;
		this.numero=num;		
		
	}
	
	public String toString(){
		
		return "EL DNI ES: "+numero+""+letra;
		
	}

}
