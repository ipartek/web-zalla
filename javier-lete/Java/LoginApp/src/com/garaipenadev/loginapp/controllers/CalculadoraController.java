package com.garaipenadev.loginapp.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculadoraController
 */
@WebServlet("/calcular")
public class CalculadoraController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String resultado = "";

		// Si ambos parámetros son números los sumo y genero la cadena a mostrar
		String param1 = request.getParameter("param1");
		String param2 = request.getParameter("param2");
		if (isNumber(param1) && isNumber(param2)) {
			int suma = Integer.parseInt(param1)	+ Integer.parseInt(param2);
			resultado = "<br>La suma de " + param1 + " y " + param2 + " es: " + suma;
		} else {
			resultado = " <br> Introduzca números válidos";
		}

		// Genero un atributo de nombre resultado y valor la cadena generada en resultados.

		request.setAttribute("resultado", resultado);

		// volvemos al JSP
		request.getRequestDispatcher("Calculadora.jsp").forward(request, response);

	}

	public Boolean isNumber(String compruebame) {
		// Intenta convertir la cadena a número, si no puede, devuelve false.
		try {
			int number = Integer.parseInt(compruebame);
		} catch (Exception e) {
			return false;
		}

		return true;
	}

}
