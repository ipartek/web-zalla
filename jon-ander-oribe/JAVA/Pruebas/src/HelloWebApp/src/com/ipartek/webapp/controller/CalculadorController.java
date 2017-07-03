package com.ipartek.webapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CalculadorController
 */
@WebServlet("/CalculadorController")
public class CalculadorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out= response.getWriter();
		String valor1= request.getParameter("valor1");
		String valor2= request.getParameter("valor2");
		String resultado2=Integer.toString(Integer.parseInt(valor1)+Integer.parseInt(valor2));
		out.append("<p>El resultado es "+resultado2+"</p>");
		request.setAttribute("resultado2",String.valueOf(Integer.parseInt(valor1)+Integer.parseInt(valor2)));
		
		//Ir a la JSP
		request.getRequestDispatcher("Calculadora.jsp").forward(request,response);
	}

}
