package subastas;




public class Usuario {
	

	

	@Override
	public String toString() {
		return ID+","+nombre+","+" credito=" + credito + "";
	}
	protected int ID=0;
	protected String nombre="";
	protected static double credito=0.0;
	public enum Usuarios{Mariano,Cristina,Pedro,Ghao_Pin,Magnate_del_petroleo,Artista_anonimo};
	
	static Usuarios[] ids=Usuarios.values();
	
	public Usuario(int id,String nombre,double credito){
		
		this.ID=id;
		this.nombre=nombre;
		this.credito=credito;
		
	}
	
	public Usuario(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre(){return nombre;}
	public static double getCredito(){return credito;}
	
	public static double incrementarCredito(double credito){
		credito+=credito;
		return credito;
	}
	public static double decrementarCredito(double credito){
		credito-=credito;
		return credito;
	}
}
