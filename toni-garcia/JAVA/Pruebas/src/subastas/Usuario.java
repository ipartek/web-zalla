package subastas;

public class Usuario {


	@Override
	public String toString() {
		return ID+","+nombre+","+" credito=" + credito + "";
	}
	protected int ID=0;
	protected String nombre="";
	protected double credito=0.0;
	public enum Usuarios{Mariano,Cristina,Pedro,Ghao_Pin,Magnate_del_petroleo,Artista_anonimo};
	
	static Usuarios[] ids=Usuarios.values();
	
	public Usuario(int id,String nombre,double credito){
		
		this.ID=id;
		this.nombre=nombre;
		this.credito=credito;
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	public boolean compararNombres(String nombre){
		
		if(this.nombre.equals(nombre))return true;
		
		return false;
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Usuario(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre(){return nombre;}
	public static Usuarios[] getIds() {
		return ids;
	}

	public static void setIds(Usuarios[] ids) {
		Usuario.ids = ids;
	}

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
