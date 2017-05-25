package geometria;

import java.lang.Math.*;
import java.util.Scanner;

public class Punto { // Constructor vacio

	private double x = 0.0;
	private double y = 0.0;
	Scanner sc = new Scanner(System.in);

	public Punto(double x, double y) { // Constructor X e Y

		this.x = x;
		this.y = y;
	}

	public Punto(Punto punto) {
		this.x = punto.x;
		this.y = punto.y;
	}

	public void desplazar(Direccion direccionSeleccionada) {
		System.out.println("Elige la dirección del desplazamiento");
		String sc1 = sc.next();

		switch (sc1) {

		case "arriba":
			Direccion.arriba += 1;
			break;
		case "abajo":
			Direccion.abajo += 1;
			break;
		case "izquierda":
			Direccion.izquierda += 1;
			break;
		case "derecha":
			Direccion.derecha += 1;
			break;

		}

	}

	public void desplazar(double x, double y) {
		this.x += x;
		this.y += y;
	}

	public static void desplazarObjeto(Punto punto, double x, double y) {
		punto.desplazar(x, y);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;

	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static double calcularDistancia(double x1, double x2, double y1, double y2) {
		double valorFinal = 0.0;
		valorFinal = Math.sqrt(Math.pow(x1, 2) - Math.pow(x2, 2) + Math.pow(y1, 2) - Math.pow(y2, 2));
		return valorFinal;
	}

	public static void main(String[] args) {

		Punto punto1 = new Punto(2, 3);
		Punto punto2 = new Punto(7, 7);
		System.out.println(punto1.getX());
		System.out.println(punto1.getY());
		punto1.setX(12);
		punto1.setY(9);
		System.out.println(punto1.getX());
		System.out.println(punto1.getY());
		System.out.println("***************************");
		Punto puntoClon = new Punto(punto2);
		System.out.println(puntoClon.getX());
		System.out.println(puntoClon.getY());
		desplazarObjeto(punto2, 3, 4);
		System.out.println(punto2.getX());
		System.out.println(punto2.getY());
		desplazarObjeto(punto2, 8, 6);
		System.out.println(punto2.getX());
		System.out.println(punto2.getY());
		System.out.println("***************************");
		double distancia = calcularDistancia(3, 2, 3, 2);
		System.out.println("La distancia es " + distancia);
		System.out.println("***************************");
		System.out.println("");//Evaluación metodo desplazar() sobrecargado
		

	}

}
