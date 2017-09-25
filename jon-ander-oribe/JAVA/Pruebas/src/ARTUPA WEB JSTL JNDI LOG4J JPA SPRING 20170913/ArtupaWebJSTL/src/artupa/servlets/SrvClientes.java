/*
 * Created on 23-may-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package artupa.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;
import artupa.bd.BdOperaciones;
import artupa.beans.Cliente;

/**
 * @author Administrador
 *
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
public class SrvClientes extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		HttpSession sesion = request.getSession(false);
		if (sesion != null) {
			BdOperaciones bdOperaciones = new BdOperaciones();
			List<Cliente> clientes = null;
			long milisegundosInicio = System.currentTimeMillis();
			for (int i = 0; i < 500; i++) {
				bdOperaciones.abrirConexion();
				clientes = bdOperaciones.getClientes();
				bdOperaciones.cerrarConexion();
			}
			long milisegundosFin = System.currentTimeMillis();
			System.out.println("Tiempo tarda: :" + (milisegundosFin - milisegundosInicio));
			request.setAttribute("clientes", clientes);
			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/clientes_new.jsp");
			rd.forward(request, response);
		} else {
			response.sendRedirect("login.html");
		}
	}
}
