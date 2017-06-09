package varios;

public class Hilo extends Thread {
	
	public void run(){
		
		for (int i=0;i<10;i++){
		System.out.println("Funciono!!");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
