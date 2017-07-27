package com.ipartek.webapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CalculadoraController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraController() {
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
		String numero1= request.getParameter("numero1");
		String numero2= request.getParameter("numero2");
		int resultadoSuma=0;
		double resultadoDivision=0;
		
		if(numero1!=null||numero2!=null){
			resultadoSuma= Integer.parseInt(numero1) +Integer.parseInt(numero2);
			resultadoDivision = Integer.parseInt(numero1) / Integer.parseInt(numero2);
		}
		
		
		request.setAttribute("resultadoSuma", String.valueOf(resultadoSuma));
		request.setAttribute("resultadoDivision", String.valueOf(resultadoDivision));

		request.getRequestDispatcher("calculadora.jsp").forward(request, response);


	}

}
