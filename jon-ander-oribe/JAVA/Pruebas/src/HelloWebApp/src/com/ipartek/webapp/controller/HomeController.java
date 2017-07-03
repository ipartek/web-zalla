package com.ipartek.webapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class HomeController
 */
@WebServlet("/")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final int EDAD_JUBILACION = 68;

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
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// Recibir parametros por get si este se envia

		// http://127.0.0.1:8080/NombreAppWeb/URL_del_Servlet?parametro1=valor1&parametro2=valor2&parametroN=valorN

		PrintWriter out = response.getWriter();

		String nombre = request.getParameter("nombre");
		String edad = request.getParameter("edad");


		if (nombre == null) {
			out.append("<h1>Pagina de bienvenida</h1>");
		} else {
			out.append("<p>Bienvenido: </p>" + nombre);
		}

		if (edad != null){
			try{
			int resto = EDAD_JUBILACION - Integer.parseInt(edad);
			out.append("<p>" + "Tu edad es: " + edad + "</p>");
			if (resto > 0) {
				out.append("<p>" + "Para jubilarte te falta " + resto
						+ " años</p>");
			} else {
				out.append("<p>Jubilate ya gañan!!Te has pasado por "
						+ Math.abs(resto) + " años</p>");
			}}catch(Exception e){
				out.append("<p style='color:red'>Solo se aceptan valores numericos</p>");
			}
		}else {{
			out.append("<p>Eres inmortal!</p>");
		} }

		out.append("<p>Server: </p>").append(request.getContextPath());
		// Hora del sistema
		long ts = System.currentTimeMillis();
		Date hora = new Date(ts);
		System.out.println(hora.toString());
		out.append("<p>" + " La Fecha es " + hora.toString() + "</p>");
		// Version del navegador
		String userAgent = request.getHeader("User-Agent");
		out.append("<p>Navegador: </p>" + userAgent);
		out.append("<p>Mismo ejercicio pero por POST</p>");
		out.append("<a href='Formulario.jsp'>Aqui</a>");
		out.append("<a href='Calculadora.jsp'>Calculadora</a>");

		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		//Empezamos a liarla de aqui para abajo
		
		PrintWriter out= response.getWriter();
		String edad= request.getParameter("edad");
		out.append("<p>Parametro edad= "+edad+"</p>");
		
		
		//Recoger parametros del formulario
		//String edad= request.getParameter("edad");
		request.setAttribute("resultado",String.valueOf(EDAD_JUBILACION-Integer.parseInt(edad)));
		
		//Ir a la JSP
		request.getRequestDispatcher("Formulario.jsp").forward(request,response);
		
		
	}

}
