package tragaperras;

public class Maquina {
	
	double saldo = 0.0;
	static int casillas = 3;
	double precioTirada = 1.0;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void borrarSaldo(){
		this.saldo = 0.0;
	}
	

}
