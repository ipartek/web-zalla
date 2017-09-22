package com.ipartek.ejemplo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.ipartek.ejemplo.modelo.Usuario;

@WebServlet("/api/usuarios/*")
public class ServicioRest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long id = Long.parseLong(request.getPathInfo().substring(1));
		
		Usuario usuario = new Usuario(id, "Nombre" + id, "Apellidos" + id);
		
		response.setContentType("application/json");
		response.getWriter().println(new Gson().toJson(usuario));
	}

}
