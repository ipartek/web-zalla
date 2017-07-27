package libreriavirtual.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import libreriavirtual.bd.BdOperaciones;
import libreriavirtual.beans.Usuario;




/**
 * Servlet implementation class SrvRegistro
 */
public class SrvRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession(false);	
		if (sesion!=null)
		{			
			
			String dni = request.getParameter("dni");
			BdOperaciones bdOperaciones = new BdOperaciones();
			bdOperaciones.abrirConexion();
			Usuario usuario = bdOperaciones.getUsuario(dni);
			bdOperaciones.cerrarConexion();
			request.setAttribute("cliente",usuario);
			
			
			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/cliente.jsp");
			rd.forward(request,response);
		}
		else
		{
			response.sendRedirect("login.html");
		}
	}

}
