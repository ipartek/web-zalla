package ejercicio;

import java.text.DecimalFormat;

import geom2d.Circulo;
import geom2d.Cuadrado;
import geom3d.Cilindro;
import geom3d.Prisma;

public class Figuras3DTest {

	public static void main(String[] args) {
		
		double RADIO = 6;
		double ALTURA_CILINDRO = 10;
		double LADO = 4;
		double ALTURA_PRISMA = 10;
		
		//Crea círculo
		Circulo circulo1 = new Circulo(RADIO);
		
		//Crea cilindro
		Cilindro cilindro1 = new Cilindro(circulo1, ALTURA_CILINDRO);
		
		DecimalFormat mascara = new DecimalFormat("###.##");
		System.out.println("El Volumen del cilindro de radio: " + circulo1.getRadio() + " Y altura: " + cilindro1.getAltura() + " es: " + mascara.format(cilindro1.volumen()) );
		
		//Cuadrado
		Cuadrado cuadrado1 = new Cuadrado(LADO);
		
		//Prisma
		Prisma prisma1 = new Prisma(cuadrado1, ALTURA_PRISMA);		
		System.out.println("El Volumen del PRISMA DE LADO: " + cuadrado1.getLado() + " Y altura: " + prisma1.getAltura() + " es: " + mascara.format(prisma1.volumen()) );
	}

}
