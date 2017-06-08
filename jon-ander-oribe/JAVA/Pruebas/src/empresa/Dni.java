package empresa;

public class Dni {
	
	public static int numero=78554678;
	public static char letra='A';
	
	@Override
	public String toString() {
		return ""+numero+letra;
	}

	public Dni(int numero,char letra){
		this.numero=numero;
		this.letra=letra;
	}
	
	public static String devolverDni(){
		String dni=String.valueOf(numero)+letra;
		return dni;
	}

}
