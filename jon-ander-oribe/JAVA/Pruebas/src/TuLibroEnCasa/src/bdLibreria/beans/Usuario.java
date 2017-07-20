package bdLibreria.beans;

import java.io.Serializable;

public class Usuario implements Serializable{

	private static final long serialVersioUID =1L;
	
	private String nombre="";
	private String primerApellido="";
	private String segundoApellido="";
	private String dni="";
	private String direccion="";
	private String fechaDeNacimiento="";
	private String mail="";
	private String nombreUsuario="";
	private String password="";
	private String confirmPassword="";
	
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
	
	public Usuario(String nombre,String primerApellido,String segundoApellido,String dni,String direccion,String fechaDeNacimiento,String mail,String nombreUsuario,String password,String confirmPassword) {
		
		this.nombre=nombre;
		this.primerApellido=primerApellido;
		this.segundoApellido=segundoApellido;
		this.dni=dni;
		this.direccion=direccion;
		this.fechaDeNacimiento=fechaDeNacimiento;
		this.mail=mail;
		this.nombreUsuario=nombreUsuario;
		this.password=password;
		this.confirmPassword=confirmPassword;
		
		this.password=password;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
}
