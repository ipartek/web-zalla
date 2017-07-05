package com.ipartek.hola.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class SrvCicloVida
 */
public class SrvCicloVida extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SrvCicloVida() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		if (request.getMethod().equals("GET")) {
			doGet(request, response);
		} else if (request.getMethod().equals("POST")) {
			doPost(request, response);
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(request, response);
		
		HttpSession sesion=request.getSession(true);

		PrintWriter out = response.getWriter();
		String usuario = request.getParameter("usuario");
		String contrasenia = request.getParameter("contrasenia");
		
		//Introducimos los valores en la sesion
		
		sesion.setAttribute("nombre", usuario);
		sesion.setAttribute("password",contrasenia);
		Boolean validacion = false;
		Boolean validacionCorrecta=true;
		
		String usuarioCorrecto = "Paco";
		String contraseniaCorrecta = "1234";

		if (usuario.equals(usuarioCorrecto)
				&& contrasenia.equals(contraseniaCorrecta)) {

			validacion = true;
			request.setAttribute("resultadoNombre", usuario);
			request.setAttribute("resultadoContrasenia", contrasenia);
			

			String resultado="";
			String we="";
			if (validacion==true) {
				resultado="Al menu";
				request.setAttribute("alMenu",resultado);
			}
			
			if (validacion==true) { //Este IF es unicamente para pruebas.Eliminar al terminar
				we="WEEEEEEE";
				request.setAttribute("wee",we);
			}
			
			request.getRequestDispatcher("login.jsp")
					.forward(request, response);
			
			

		} else { //Entramos aqui cuando el USER o el PASS son incorrectos
			usuario = "Zoquete";
			contrasenia = "0000";
			validacion = false;

			request.setAttribute("resultadoNombre", usuario);
			request.setAttribute("resultadoContrasenia", contrasenia);
			request.setAttribute("validacion", validacion);
			request.getRequestDispatcher("login.jsp")
					.forward(request, response);
		}

	}

}
