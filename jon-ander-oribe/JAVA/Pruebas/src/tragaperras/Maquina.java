package tragaperras;

import java.util.Scanner;

public class Maquina {
	
	private double saldo=0.0;
	private int numeroPremios=0;
	final static int casillas=3;
	private final double precioPartida=0.25;
	
	String[] Premio= new String[3];
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setSaldo(double saldo){
		this.saldo+=saldo;
	}
	
	public double getNumeroPremios(){
		return numeroPremios;
	}
	
	

}
