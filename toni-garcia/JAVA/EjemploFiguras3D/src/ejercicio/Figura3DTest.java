package ejercicio;

import java.text.DecimalFormat;

import geom2d.Circulo;
import geom2d.Cuadrado;
import geom3d.Cilindro;

import geom3d.Prisma;

public class Figura3DTest {

	public static void main(String[] args) {
		
		
		double RADIO = 6;
		double ALTURA_CILINDRO = 10;
		double LADO = 4;
		double ALTURA_PRISMA = 10;
		
		//esto es un circulo
		Circulo circulo1 = new Circulo(RADIO);
		
		//esto es un cilindro
		Cilindro cilindro1 = new Cilindro(circulo1, ALTURA_CILINDRO);
		DecimalFormat mascara = new DecimalFormat("###,##");
		System.out.println(" el volumen del cilindro de radio: " + circulo1.getRadio() + " y altura: " + cilindro1.getAltura() + " es: " + mascara.format(cilindro1.volumen()) );
		
		
		
		
		//esto es un cuadrado
		Cuadrado cuadrado1 = new Cuadrado(LADO);
		
		//esto es un prisma
		Prisma prisma1 = new Prisma(cuadrado1 , ALTURA_PRISMA);
		
		
		
		
		
		System.out.println(" el volumen del prisma de lado: " + cuadrado1.getLado() + " y altura: " + prisma1.getaltura() + " es: " + mascara.format(prisma1.volumen()) );
		
		

	}

}
