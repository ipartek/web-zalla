package Ejecutar;

import geom2d.Circulo;
import geom2d.Cuadrado;
import geom2d.Figura2D;
import geom3d.Cilindro;
import geom3d.Prisma;
import geom3d.Figura3D;

public class Ejecutar {

	public static void main(String[] args) {
		//CIRCULO Y CILINDRO
		double ALTURA_CILINDRO = 8;
		double RADIO_CILINDRO = 5;
		Circulo circulo = new Circulo(RADIO_CILINDRO);
		Cilindro cilindro = new Cilindro(circulo, ALTURA_CILINDRO);
		System.out.println("Volumen cilindro con radio " + RADIO_CILINDRO + " y altura " + ALTURA_CILINDRO + ": "
				+ cilindro.volumen());

		//CUADRADO Y PRISMA
		double ALTURA_PRISMA = 12;
		double LADO_PRISMA = 12;
		Cuadrado cuadrado = new Cuadrado();
		cuadrado.setLado(LADO_PRISMA);
		Prisma prisma = new Prisma(cuadrado, ALTURA_PRISMA);
		System.out.println("Volumen prisma con lado " + LADO_PRISMA + " y altura " + ALTURA_PRISMA + ": "
				+ prisma.volumen());

	}

}
