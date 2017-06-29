package com.ipartek.webapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class HomeController
 */

public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		//Recibir parámetros en caso de enviarse.
		//http://127.0.0.1:8080/NombreAppWeb/URL_del_Servlet?parametro1=valor1&parametro2=valor2&parametroN=valorN
		
		//parámetros a recibir "nombre" y "edad"
		
		String nombre = request.getParameter("nombre");
		String edad = request.getParameter("edad");
		final int edadJuvilacion = 68;
		
		if (nombre == null){
			out.append("<h1>Página de Bienvenida</h1>");
		}else{
			out.append("<h1>Página de Bienvenida "+nombre+"</h1>");
		}
		
		if (edad == null){
			out.append("<p><h2> Eres Connor Mclaud, del clan Mclaud</h2></p>");
		}
		else{
			try {
			out.append("<p>edad: "+edad+"</p>");
			int anhosHastaJubilacion = edadJuvilacion - Integer.parseInt(edad);
			if (anhosHastaJubilacion < 0) {
				anhosHastaJubilacion = 0;
			}
			out.append("<p>Te quedan "+ anhosHastaJubilacion +" para la jubilación</p>");
			}
			catch(Exception e){
				out.append("<p style='color:red;'>Edad incorrecta. Escribe una edad de 0 a 99</p>");
			}
		}
			
			
		out.append("Served at: ");
		out.append(request.getContextPath());
		
		//Fecha y hora
		
		Date fecha = new Date(); 
		out.append("<p>Fecha<b>"+fecha+"</b></p>");
		
		//Versión del cliente
		String userAgent = request.getHeader("User-Agent");
		out.append("<p>Navegador <b>"+userAgent+"</b></p>");
		
		out.append("<h2>Mismo ejercicio por post</h2>");
		out.append("<p><a href='formulario.jsp'>Ir a formulario</a></p>");
		out.append("<p><a href='calculadora.jsp'>Ir a Calculadora</a></p>");
		
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*PrintWriter out = response.getWriter();
		String edad = request.getParameter("edad"); 
		out.append("<p>parametro edad= <b>"+edad+"</b></p>");
		*/
		
		//recojer parámetros del formulario enviados por request
		String edad = request.getParameter("edad"); 
		
		//Calcular edad jubilación
		final int edadJuvilacion = 68;	
		int anhosHastaJubilacion = edadJuvilacion - Integer.parseInt(edad);
		
		
		//enviar valor edad al JSP  para que lo pinte
		request.setAttribute("resultado", String.valueOf(anhosHastaJubilacion));

		//Ir a JSP
		request.getRequestDispatcher("formulario.jsp").forward(request, response);
	}

}
