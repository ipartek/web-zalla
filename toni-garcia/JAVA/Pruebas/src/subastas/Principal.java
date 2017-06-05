package subastas;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Subasta subasta1=new Subasta("Jarron Minh",new Usuario("Ghao-Pin",12000),true);
		System.out.println(subasta1.toString());
	}

}
