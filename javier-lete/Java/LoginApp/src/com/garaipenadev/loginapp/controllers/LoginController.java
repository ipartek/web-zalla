package com.garaipenadev.loginapp.controllers;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;

import com.garaipenadev.loginapp.vo.User;

@WebServlet(description = "Servlet de inicio", urlPatterns = { "/login" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Boolean validar(String nombre, String pass) {
		List<User> usuarios = new LinkedList<User>();
		usuarios.add(new User("Jonacedo", "12345"));
		usuarios.add(new User("Gorka", "12345"));
		usuarios.add(new User("Pepe", "12345"));
		User attemptingdUser = new User(nombre, pass);
		for (User u : usuarios) {
			if (attemptingdUser.equals(u)) {
				
				return true;
			}
		}
		return false;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// Recojo parámetros
		String nombre = request.getParameter("nombre");
		String pass = request.getParameter("pass");
		String recordar = request.getParameter("recordar");
		
		// Valido, si el usuario existe genero sesión y cookie
		if (validar(nombre, pass)) {

			// Creo usuario
			User user = new User(nombre, pass);
			// Creo sesión con el usuario
			request.getSession().setAttribute("user", user);

			// Genero una cookie
			if (recordar != null) {
				String   encodedName = DatatypeConverter.printBase64Binary(nombre.getBytes());
				String   encodedPass = DatatypeConverter.printBase64Binary(pass.getBytes());
				Cookie cookie = new Cookie("usuario", encodedName + "|" + encodedPass);
				cookie.setMaxAge(10000);
				response.addCookie(cookie);
				
			}
		}
		response.sendRedirect("private/index.jsp");
	}

}