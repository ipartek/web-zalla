package bdLibreria.beans;

import java.io.Serializable;

public class Usuario implements Serializable{

	private static final long serialVersioUID =1L;
	
	private String nombre="";
	private String apellido1="";
	private String apellido2="";
	private String dni="";
	private String direccion="";
	private String fecha_nacimiento="";
	private String email="";
	private String usuario="";
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
		this.apellido1=primerApellido;
		this.apellido2=segundoApellido;
		this.dni=dni;
		this.direccion=direccion;
		this.fecha_nacimiento=fechaDeNacimiento;
		this.email=mail;
		this.usuario=nombreUsuario;
		this.password=password;
		this.confirmPassword=confirmPassword;
		
	}
	public Usuario() {
		super();
	}
	public String getPrimerApellido() {
		return apellido1;
	}
	public void setPrimerApellido(String primerApellido) {
		this.apellido1 = primerApellido;
	}
	public String getSegundoApellido() {
		return apellido2;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.apellido2 = segundoApellido;
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
		return fecha_nacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fecha_nacimiento = fechaDeNacimiento;
	}
	public String getMail() {
		return email;
	}
	public void setMail(String mail) {
		this.email = mail;
	}
	public String getNombreUsuario() {
		return usuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.usuario = nombreUsuario;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
}
