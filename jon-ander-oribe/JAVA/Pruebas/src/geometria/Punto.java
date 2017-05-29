package geometria;

import java.lang.Math.*;
import java.util.Scanner;

public class Punto { // Constructor vacio

	private double x = 0.0;
	private double y = 0.0;
	private String nombre = "";
	Scanner sc = new Scanner(System.in);

	public Punto(double x, double y) { // Constructor X e Y

		this.x = x;
		this.y = y;
	}

	public Punto(Punto punto) {
		this.x = punto.x;
		this.y = punto.y;
	}

	public void desplazar(double... x) {
		System.out.println("Elige la dirección del desplazamiento");
		String sc1 = sc.next();
		System.out.println("Elige un objeto sobre el que trabajar");
		String sc2 = sc.next();
		switch (sc2) {
		case "cuadrado":
			Punto sc3 = Principal.cuadrado;
		}//FALTA RELLENAR ESTE SWITCH
		double sc4 = 0.0;//NECESITAS OTRO PARA EL OTRO EJE

		switch (sc1) {

		case "arriba":
			sc4 = sc3.getY();
			sc4 += Direccion.arriba;
			break;
		case "abajo":
			sc4 = sc3.getY();
			sc4 -= Direccion.abajo;
			break;
		case "izquierda":
			sc4 = sc3.getX();
			sc4 += Direccion.izquierda;
			break;
		case "derecha":
			sc4 = sc3.getX();
			sc4 -= Direccion.derecha;
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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public static double calcularDistancia(double x1, double x2, double y1, double y2) {
		double valorFinal = 0.0;
		valorFinal = Math.sqrt(Math.pow(x1, 2) - Math.pow(x2, 2) + Math.pow(y1, 2) - Math.pow(y2, 2));
		return valorFinal;
	}

}
