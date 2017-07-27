/*
 * Created on 23-may-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package libreriavirtual.servlets;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

import libreriavirtual.bd.BdBase;
import libreriavirtual.bd.BdOperaciones;
import libreriavirtual.configuracion.Configuracion;
import libreriavirtual.configuracion.GestorConfiguracion;



;

/**
 * @author Administrador
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class SrvValidarEntrada extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		BdOperaciones bdOperaciones = new BdOperaciones();
		bdOperaciones.abrirConexion();
		boolean correcto = bdOperaciones.validarUsuario(user, password);
		bdOperaciones.cerrarConexion();
		if (correcto) {
			HttpSession sesion = request.getSession(true);
			sesion.setAttribute("user", user);
			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/menu.jsp");
			rd.forward(request, response);
		} else {
			response.sendRedirect("login.html");
		}
	}

}
