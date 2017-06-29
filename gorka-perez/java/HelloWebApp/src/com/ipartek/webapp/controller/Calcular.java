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
		
		//recojer parámetros del formulario enviados por request
		String Operador1 = request.getParameter("Operador1"); 
		String Operador2 = request.getParameter("Operador2");
		
		//enviar valor 
		request.setAttribute("resultado", String.valueOf(Integer.parseInt(Operador1) + Integer.parseInt(Operador2)));

		//Ir a JSP
		request.getRequestDispatcher("calculadora.jsp").forward(request, response);
	}

}
