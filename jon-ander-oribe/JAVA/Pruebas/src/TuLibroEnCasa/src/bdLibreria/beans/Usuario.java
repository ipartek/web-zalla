package bdLibreria.beans;

import java.io.Serializable;

public class Usuario implements Serializable{

	private static final long serialVersioUID =1L;
	
	private String nombre="";
	private String password="";
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Usuario(String nombre,String password) {
		super();
		this.nombre=nombre;
		this.password=password;
	}
	
	
}
