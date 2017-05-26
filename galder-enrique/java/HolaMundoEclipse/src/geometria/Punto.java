package geometria;

public class Punto {

	private int coordX;
	private int coordY;

	public Punto(int coordX, int coordY) {
		this.coordX = coordX;
		this.coordY = coordY;

	}
	public Punto(){
		this.coordX = 0;
		this.coordY = 0;
	}
	public Punto(Punto punt1){
		this.coordX = punt1.coordX;
		this.coordY = punt1.coordY;
		
	}
	public static void sumatorio(Punto a){
		a.coordX++;
		a.coordY++;
	}
	public int getcoordX()
    {
    	return coordX;
    }
	public void setcoordX(int coordX)
    {
    	this.coordX = coordX;
    }
	
	public int getcoordY()
    {
    	return coordY;
    }
	
	public void setcoordY(int coordY)
    {
    	this.coordY = coordY;
    }
	public void distancia()
	public static void main (String[] args){
		
		Punto punto1 = new Punto(1, 3);
		Punto punto2 = new Punto ();
		Punto punto3 = new Punto(punto1);
		Punto punto4 = new Punto(punto2);
		
		
		
		//System.out.println(copia.getcoordX() + " , " + copia.getcoordY());
		System.out.println("Datos con coordenadas : " + punto1.getcoordX() + " , " + punto1.getcoordY());
		System.out.println("Datos sin coordenadas : " + punto2.getcoordX() + " , " + punto2.getcoordY());
		System.out.println("Datos copiados de punto1 : " + punto3.getcoordX() + " , " + punto3.getcoordY());
		punto2.setcoordX(5);
		punto2.setcoordY(17);
		punto4.setcoordX(punto2.getcoordX());
		punto4.setcoordY(punto2.getcoordY());

		System.out.println("Datos punto2 modificados (5,17) : " + punto2.getcoordX() + " , " + punto2.getcoordY());
		System.out.println("Datos punto4 : " + punto4.getcoordX() + " , " + punto4.getcoordY());

		sumatorio(punto1);
		System.out.println(punto1.getcoordX() + " , " + punto1.getcoordY());

	}
	
	
}

