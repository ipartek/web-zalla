package objetos;

/*Raza creada para ver como lo habias ido haciendo,NO ES FUNCIONAL,aun*/

public class Goblin extends Unidad {

	public static int m(int p) {
		return (int) Math.floor(Math.random() * (p) + 1);
	}

	public Goblin() {
		super("Goblin", m(20), m(10), m(1));
	}

	public void resucitar() {

		int pV = (int) Math.floor(Math.random() * (10) + 2);
		int danio = (int) Math.floor(Math.random() * (20) + 2);
		
		this.setPV(pV); 
		this.setDanio(danio); 
		this.setArmadura(0);
		this.setVivo(true);

	}

}