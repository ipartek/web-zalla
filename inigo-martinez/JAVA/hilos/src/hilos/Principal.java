package hilos;

public class Principal {
	
	static Thread concursante1 = new Thread(new hilo("JOSE"));
	static Thread concursante2 = new Thread(new hilo("PEPE"));
	
	public static void main(String[]args){
		
		System.out.println("EMPECEMOS");
	
		try {
			
			concursante1.start();
			concursante2.start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
