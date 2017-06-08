package geometria;

public class Punto {
	private double x;
	private double y;

	public Punto(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public Punto()
	{
		this.x = 0;
		this.y = 0;
	}
	public Punto(Punto Punto)
	{
		this.x = Punto.x;
		this.y = Punto.y;
	}
	public void Desplazar(double x, double y)
    {
        this.x = this.x + x;
        this.y = this.y + y;
    }
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	
	public void setPunto(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
}
