package varios.colecciones;


public class Persona implements Comparable<Persona> {
	
	
	public String id="";

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	private int String=0;
	private String nombre="";
	private String apellido="";
	private Dni dni=null;
	
	public Persona(String id, String nombre, String apellido, Dni dni) {
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
	}
	
	public Persona(String id,String nombre,String apellido){
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
	
	public String toStringClasificacion(){
		return this.getId()+EscrituraDeDatosBasur.SEPARADOR_CONSTANTE+this.getNombre()+EscrituraDeDatosBasur.SEPARADOR_CONSTANTE+this.getApellido()+".";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Dni getDni() {
		return dni;
	}

	public void setDni(Dni dni) {
		this.dni = dni;
	}
	

	@Override
	public int compareTo(Persona persona) {
		
		int diferencia = this.apellido.compareTo(persona.apellido);
		if(diferencia==0){
			diferencia=this.nombre.compareTo(persona.nombre);
			if(diferencia==0){
				diferencia=this.dni.compareTo(persona.dni);
			}
		}
		
		return 0;
	}
	
	public void obtenerInfo() {

		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("--------------------------");
		dni.obtenerInfo();
		System.out.println("--------------------------");

	}
	

}
