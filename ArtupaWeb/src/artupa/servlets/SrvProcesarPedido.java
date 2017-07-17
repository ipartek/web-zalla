package artupa.servlets;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import artupa.bd.BdOperaciones;
import artupa.beans.Pedido;

/**
 * @author Administrador
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class SrvProcesarPedido extends HttpServlet {
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
			String modo_entrada = request.getParameter("modo_entrada");
			if (modo_entrada.equals("modo_modificacion"))
			{
				int numPedido = Integer.parseInt(request.getParameter("numPedido"));
				BdOperaciones bdOperaciones = new BdOperaciones();
				bdOperaciones.abrirConexion();
				Pedido pedido = bdOperaciones.getPedido(numPedido);
				bdOperaciones.cerrarConexion();
				request.setAttribute("pedido",pedido);
			}
			
			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/pedido.jsp");
			rd.forward(request,response);
		}
		else
		{
			response.sendRedirect("login.html");
		}
	}

}
