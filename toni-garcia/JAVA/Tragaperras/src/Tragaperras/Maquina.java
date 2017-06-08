package Tragaperras;


public class Maquina {
	
	private double saldo=0.00;
	private int numeroPremios=0;
	final static int casillas=3;
	public final static double precioPartida=0.25;
	
	String[] Premio= new String[3];
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setSaldo(double saldo){
		this.saldo+=saldo;
	}
	
	public void borrarSaldo(){
		this.saldo=0.0;
	}
	
	public double getNumeroPremios(){
		return numeroPremios;
	}


	
	

}
