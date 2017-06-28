package com.ipartek.webapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calcular
 */
@WebServlet("/Calcular")
public class Calcular extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
		request.getRequestDispatcher("calculadora.jsp").forward(request, response);
	}

}
