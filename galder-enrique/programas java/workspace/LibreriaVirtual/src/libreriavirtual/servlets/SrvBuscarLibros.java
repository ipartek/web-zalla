/*
 * Created on 24-may-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package libreriavirtual.servlets;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 * @author Administrador
 *
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
public class SrvBuscarLibros extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ServletContext ct = getServletContext();
		RequestDispatcher rd = ct.getRequestDispatcher("/buscarLibros.jsp");
		rd.forward(request, response);
	}

}
