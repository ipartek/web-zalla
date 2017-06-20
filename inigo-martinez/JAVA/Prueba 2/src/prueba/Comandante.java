package prueba;

public class Comandante { // ¿Lo extendemos desde Unidad?

	private String raza;
	private boolean vivo;
	private int pV;
	private int danio;
	private int armadura;

	public Comandante() {

		pV = (int) Math.floor(Math.random() * (10) + 7);
		danio = (int) Math.floor(Math.random() * (12) + 7);
		armadura = (int) Math.floor(Math.random() * (2) + 5);
		vivo = true;

	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public int getpV() {
		return pV;
	}

	public void setpV(int pV) {
		this.pV = pV;
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

}
