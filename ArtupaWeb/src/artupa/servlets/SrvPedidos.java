package artupa.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import artupa.bd.BdOperaciones;
import artupa.beans.Cliente;

/**
 * Servlet implementation class SrvPedidos
 */
public class SrvPedidos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		HttpSession sesion = request.getSession(false);
		if (sesion != null) {
			BdOperaciones bdOperaciones = new BdOperaciones();
			bdOperaciones.abrirConexion();
			List<Cliente> clientes = bdOperaciones.getPedidos();
			bdOperaciones.cerrarConexion();
			request.setAttribute("pedidos", pedidos);
			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/pedidos.jsp");
			rd.forward(request, response);
		} else {
			response.sendRedirect("login.html");
		}
	}
}
