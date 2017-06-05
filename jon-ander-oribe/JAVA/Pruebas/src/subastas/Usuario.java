package subastas;

public class Usuario {

	@Override
	public String toString() {
		return nombre+","+" credito=" + credito + "";
	}
	protected String nombre="";
	protected double credito=0.0;
	
	public Usuario(String nombre,double credito){
		
		this.nombre=nombre;
		this.credito=credito;
		
	}
	
	public Usuario(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre(){return nombre;}
	public double getCredito(){return credito;}
	
	public double incrementarCredito(double credito){
		this.credito+=credito;
		return credito;
	}
	public double decrementarCredito(double credito){
		this.credito-=credito;
		return credito;
	}
}
