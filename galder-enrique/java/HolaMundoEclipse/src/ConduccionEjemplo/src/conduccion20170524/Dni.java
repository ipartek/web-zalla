package conduccion20170524;

public class Dni
{
    private String numero;
    private char letra;

    public Dni(String numero, char letra)
    {
        this.numero = numero;
        this.letra  = letra;
    }

    public void obtenerInfo()
    {
    	System.out.println("numero: " + numero);
        System.out.println("letra: " + letra);
    }    
    
    public String getNumero()
    {
    	return numero;
    }
    
    public void setNumero(String numero)
    {
    	this.numero = numero;
    }
    
    public char getLetra()
    {
    	return letra;
    }
    
    public void setLetra(char letra)
    {
    	this.letra = letra;
    }
}