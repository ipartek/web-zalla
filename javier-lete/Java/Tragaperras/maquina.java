package Tragaperras;

import java.util.Random;
import java.util.Arrays;

public class maquina {
	// definimos las variables
	private int casillas;
	private double precJug;
	private double credDisp;
	private Premio[] coleccion;

	// definimos maquina
	public maquina(int nCasillas, double precio, Premio... premio) {
		precJug = precio;
		casillas = nCasillas;
		coleccion = premio;
	}

	// leemos precio juagada
	public double getPrecJug() {
		return precJug;
	}

	// asignamos precio jugada a precio
	public void setPrecJug(double precio) {
		precJug = precio;
	}

	// leemos el credito disponible
	public double getCredito() {
		return credDisp;
	}

	// asignamos el credito disponible a credito
	public void setCredDisp(double credito) {
		credDisp = credito;
	}

	// numero casillas del array a jugar
	public int getnCasillas() {
		return casillas;
	}

	// leemos la coleccion de premios
	public Premio[] getColeccion() {
		return coleccion;
	}

	// asignamos los creditos del inicio
	public double incrementarCredito(double incremento) {
		return credDisp + incremento;
	}

	// cobramos y dejamos el credito a 0
	public double cobrar() {
		System.out.println("");
		System.out.println("Retirando " + credDisp + " euros de la maquina");
		credDisp = 0;
		return credDisp;
	}

	// jugamos una partida
	public Fruta[] jugar() {

		setPrecJug(precJug);
		// mientras el credito sea mayor al precio de jugada
		if (getCredito() >= precJug) {

			// descontamos a credito el precio de la jugada
			credDisp = credDisp - precJug;

			// generamos la jugada aleatoria
			Random generador = new Random();
			Fruta[] frutas;
			frutas = new Fruta[casillas];
			Fruta[] frutas_aleatorias = Fruta.values();

			for (int i = 0; i < casillas; i++) {
				int index = generador.nextInt(5);
				frutas[i] = frutas_aleatorias[index];
			}

			int n = 1; // n = numero de premios
			for (int i = 0; i <= n; i++) {

				// comprueba si combinación esta en premios registrados

				if (Arrays.equals(frutas, coleccion[i].getCombGanad()) == true) {
					// incrementamos el credito con el premio
					credDisp = credDisp + coleccion[i].getPremio();
					System.out.println("----------------PREMIO DE "+coleccion[i].getPremio()+ " ---------------");
				}
			}
			return frutas;
		}
		return null;
	}
}
