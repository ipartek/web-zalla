package conduccion20170524;

public class Persona
{
    private String nombre;
    private String apellido;
    private Dni dni;

    public Persona(String nombre, String apellido, Dni dni)
    {
        this.nombre   = nombre;
        this.apellido = apellido;
        this.dni      = dni;
    }
    
    public void obtenerInfo()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        dni.obtenerInfo();
    }
    
    public String getNombre()
    {
    	return nombre;
    }
    
    public void setNombre(String nombre)
    {
    	this.nombre = nombre;
    }
    
    public String getApellido()
    {
    	return apellido;
    }
    
    public void setApellido(String apellido)
    {
    	this.apellido = apellido;
    }
    
    public Dni getDni()
    {
    	return dni;
    }
    
    public void setDni(Dni dni)
    {
    	this.dni = dni;
    }
}