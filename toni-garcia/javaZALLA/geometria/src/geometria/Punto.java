package geometria;

public class Punto {
	private int coordenadaX;
	private int coordenadaY;
	
	public Punto(int coordenadaX , int coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}
	
		
	public Punto(){
			this.coordenadaX = 0;
			this.coordenadaY = 0;
		}
	
	public Punto(Punto Punto){
		this.coordenadaX = Punto.coordenadaX;
	    this.coordenadaY = Punto.coordenadaY;
	}
	
	public void Desplazar(Punto Punto,int coordenadaX , int coordenadaY)
	{
		Punto.coordenadaX = Punto.coordenadaX + coordenadaX;
		Punto.coordenadaY = Punto.coordenadaY + coordenadaY;
		
	}
	 public void obtenerInfo()
	    {
	    	System.out.println("CoordenadaX: " + coordenadaX);
	        System.out.println("CoordenadaY: " + coordenadaY);
	    }    
	 public void setPunto(int coordenadaX , int coordenadaY)
	    {
		 this.coordenadaX = coordenadaX;
		 this.coordenadaY = coordenadaY;
		}


}
