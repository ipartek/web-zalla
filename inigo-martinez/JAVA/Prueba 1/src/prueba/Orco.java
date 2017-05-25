package prueba;

// La armadura no funciona correctamente. Deberia de reducir el da�o, no sumarse directamente.

public class Orco {

	int PV, danio, armadura;
	String raza;

	public Orco() {
		raza = "Orco";
		this.PV = (int) (Math.random() * 4) + 4;
		this.danio = (int) (Math.random() * 5) + 4;
		this.armadura = (int) (Math.random() * 2) + 4;
	}

	public int atacar() {

		int danioRealizado = (int) (Math.random() * (this.danio));
		return danioRealizado;

	}

	public int getPV() {
		return PV;
	}

	public void setPV(int pV) {
		PV = pV;
	}

	public int getDanio() {
		return danio;
	}

	public void setDanio(int danio) {
		this.danio = danio;
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Orco"+this.PV;
	}

}