package prueba;

/*Raza creada para ver como lo habias ido haciendo,NO ES FUNCIONAL,aun*/

public class Goblin {
	
	int PV, danio, armadura;
	String raza;
	
	public Goblin(){
		raza="Goblin";
		this.PV=(int)(Math.random()*2)+2;
		this.danio=(int)(Math.random()*3+2);
		this.armadura=(int) (Math.random()*3+3);
	}
	
	public int atacar(){
		int danioRealizado=(int)(Math.random()*(this.danio)); 
		/* Multiplicar 2 veces por random().Una aqui y otra en el constructor,¿
		 * no destroza los valores iniciales de ataque?Ejemplo:(0,40*3)+2=3,2.Hasta aqui todo bien,
		 * pero al volver a multiplicar por random(),por ejemplo,"0,3" el daño total se queda mas en manos
		 * del azar que de la formula.Un Orco podría facilmente terminar con un ataque de 1 y un humano
		 * con 4 */
		return danioRealizado;
	}
	
	public int getPV(){
		return PV;
	}
	
	public void setPV(int pV){
		PV=pV;
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
		return "Goblin"+this.PV;
	}

}
