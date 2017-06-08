package prueba;

// La armadura no funciona correctamente. Deberia de reducir el daño, no sumarse directamente.

public class Orco {

	private int PV, danio, armadura;
	private String raza;
	private boolean vivo;

	public Orco() {
		vivo = true;
		raza = "Orco";
		this.PV = 4;
		this.danio = 9;
		this.armadura = 4;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public int atacar() {

		int danioRealizado = (int) (Math.random() * (this.danio));
		return danioRealizado;

	}

	public int getPV() {
		return PV;
	}

	public void setPV(int pV) {
		PV += pV;
		if(this.PV<0){
			this.PV=0;
		}
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
		
		return "Orco " + this.PV + " armadura " + this.armadura + "daño " + this.danio;
		
	}

}
