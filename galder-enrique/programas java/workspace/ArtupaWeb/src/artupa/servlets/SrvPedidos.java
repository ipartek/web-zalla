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
import artupa.beans.Pedido;

/**
 * Servlet implementation class SrvPedidos
 */
public class SrvPedidos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sesion = request.getSession(false);
		if (sesion != null) {
			String dni = request.getParameter("dni");
			BdOperaciones bdOperaciones = new BdOperaciones();
			bdOperaciones.abrirConexion();
			List<Pedido> pedidos = bdOperaciones.getPedidos();
			Cliente cliente = bdOperaciones.getCliente(dni);
			bdOperaciones.cerrarConexion();
			request.setAttribute("cliente",cliente);
			request.setAttribute("pedidos", pedidos);
			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/pedidos.jsp");
			rd.forward(request, response);
		} else {
			response.sendRedirect("login.html");
		}
	}

}
