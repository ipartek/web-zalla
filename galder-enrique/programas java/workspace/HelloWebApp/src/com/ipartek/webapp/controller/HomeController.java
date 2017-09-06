package com.ipartek.webapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final int JUBILACION = 68;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		// recibir parametros por GET si es que se envia
		// http://127.0.0.1:8080/NombreAppWeb/URL_del_Servlet?parametro1=valor1&parametro2=valor2&parametroN=valorN
		// parametros: edad y nombre
		String nombre = request.getParameter("nombre");

		if (nombre == null) {
			out.append("<h1>ONGI ETORRI : </h1> ");

		} else {

			out.append("<h1>ONGI ETORRI  " + nombre + "</h1>");

		}

		String edad = request.getParameter("edad");
		int resultado = 0;
		if (edad != null) {
			try {
				int edadInt = Integer.parseInt(edad);
				resultado = JUBILACION - edadInt;
				out.append(" tienes " + edad + " a�os y te faltan " + resultado + " de a�os para la jubilaci�n");

				if (resultado < 0) {
					resultado = 0;
				}
			} catch (Exception e) {
				out.append("<p> La edad enviada no es correcta. Escribe una edad correcta</p>");
			}
		} else {
			out.append("<p>Eres inmortal, s�lo puedes quedar T�</p>");

		}

		out.append(request.getContextPath());

		// fecha y hora
		Date fecha = new Date();
		out.append("<p>Fecha <b>" + fecha + "</b></p>");
		// Version del navegador y cliente
		String userAgent = request.getHeader("User-Agent");
		out.append("<p>Navegador <b>" + userAgent + "</b></p>");

		out.append("<h2>Mismo ejercicio pero por POST</h2>");
		out.append("<a href='formulario.jsp'>Ir a formulario</a>");

		out.append("<h2>Ejercicio con CALCULADORA por POST</h2>");
		out.append("<a href='calculadora.jsp'>Ir a la calculadora</a>");

		out.append("<h2>REGISTRO</h2>");
		out.append("<a href='registro.jsp'>Ir al REGISTRO DE USUARIOS</a>");
		
		

		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * PrintWriter out = response.getWriter(); String edad =
		 * request.getParameter("edad"); out.append("<p>parametro edad = <b>"+
		 * edad + "</b></p>");
		 */

		String edad = request.getParameter("edad");

		// Calcular edad jubilacion
		int edadJubilacion = 0;
		/*
		 * int edadInt = Integer.parseInt(edad); edadJubilacion =
		 * JUBILACION-edadInt; request.setAttribute("resultado",
		 * String.valueOf(edadJubilacion));
		 */

		// ir a la jsp
		request.getRequestDispatcher("formulario.jsp").forward(request, response);

	}

}