/*
 * Created on 25-abr-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package libreriavirtual.beans;

import java.io.Serializable;



public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String dni;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String direccion;
	private String fechaNacimiento;
	private String email;
	private String clave;
	private String usuario;
	private String confClave;
	
	public Usuario()
	{
		super();
		
	}
	
	public Usuario(String nombre,String primerApellido,String segundoApellido, String dni, String direccion, String fechaNacimiento, 
			String email, String usuario, String clave, String confClave)
	{
		super();
		this.dni=dni;
		this.nombre=nombre;
		this.primerApellido=primerApellido;
		this.segundoApellido=segundoApellido;
		this.direccion=direccion;
		this.fechaNacimiento=fechaNacimiento;
		this.email=email;
		this.usuario=usuario;
		this.clave=clave;
		this.confClave=confClave;

		
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Primer Apellido
	public String getPrimerApellido() {
		return primerApellido;
	}
	
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	//
	
	//Segundo Apellido	
	public String getSegundoApellido() {
		return segundoApellido;
	}
	
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	//
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
		
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getConfClave() {
		return confClave;
	}

	public void setConfClave(String confClave) {
		this.confClave = confClave;
	}
	

	
	
	
	
	
}
