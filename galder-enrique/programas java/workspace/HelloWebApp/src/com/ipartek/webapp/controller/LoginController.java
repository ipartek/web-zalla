package com.ipartek.webapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean correcto = false;

		/*String usuarioValido = request.getParameter("usuarioRegistro");
		String contraseñaValida = request.getParameter("passwordRegistro");
		String usuarioYaRegistrado= "Galder";
		
		if(usuarioValido.equals(usuarioYaRegistrado)){
			request.setAttribute("correcto", String.valueOf(correcto));
			request.getRequestDispatcher("registro.jsp").forward(request, response);
		}*/
		
		
		
		String usuario= request.getParameter("usuario");
		String contraseña= request.getParameter("password");
		correcto = true;
		
		HttpSession sesion= request.getSession(true);
		sesion.setAttribute("user",usuario);
		
		
		request.setAttribute("correcto", String.valueOf(correcto));
		request.getRequestDispatcher("login.jsp").forward(request, response);


	}

}
