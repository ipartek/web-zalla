package objetos;


public class Humano extends Unidad {

	public static int m(int p) {
		return (int) Math.floor(Math.random() * (p) + 1);
	}

	public Humano() {
		super("Humano", m(35), m(12), m(8));
	}

	public void resucitar() {

		int pV = (int) Math.floor(Math.random() * (10) + 1);
		int danio = (int) Math.floor(Math.random() * (12) + 1);
		int armadura = (int) Math.floor(Math.random() * (2) + 1);

		this.setPV(pV);
		this.setDanio(danio);
		this.setArmadura(armadura);
		this.setVivo(true);
	}

}
