/*
 * Created on 24-may-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package bdLibreria.servlets;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import bdLibreria.bd.BdOperaciones;
import bdLibreria.beans.Usuario;


public class SrvProcesarUsuario extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service (HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException
	{				
		HttpSession sesion = request.getSession(false);	
		if (sesion!=null)
		{			
			System.out.println("TRACEANDO UNO!!");
			String modo_entrada = request.getParameter("modo_entrada");
			if (modo_entrada.equals("modo_modificacion"))
			{
				
				String dni = request.getParameter("dni");
				BdOperaciones bdOperaciones = new BdOperaciones();
				bdOperaciones.abrirConexion();
				Usuario usuario = bdOperaciones.getUsuario(dni);
				bdOperaciones.cerrarConexion();
				request.setAttribute("usuario",usuario);
				System.out.println("TRACEANDO!!");
			}
			
			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/usuarios.jsp");
			rd.forward(request,response);
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	}

}
