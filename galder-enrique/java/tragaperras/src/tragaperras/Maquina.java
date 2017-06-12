package tragaperras;

public class Maquina {
	
	double saldo = 0.0;
	static int casillas = 3;
	public final static double precioPartida = 0.50;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldoSuma(double saldo) {
		this.saldo += saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void borrarSaldo(){
		this.saldo = 0.0;
	}
	
}
