package artupa.servlets;

import java.io.IOException;

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

public class SrvProcesarPedido extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sesion = request.getSession(false);
		if (sesion != null) {
			String modo_entrada = request.getParameter("modo_entrada");
			String dniCliente = request.getParameter("dniCliente");

			if (modo_entrada.equals("modo_modificacion")) {
				String numPedido = request.getParameter("numPedido");
				BdOperaciones bdOperaciones = new BdOperaciones();
				bdOperaciones.abrirConexion();
				Pedido pedido = bdOperaciones.getPedido(numPedido);
				Cliente cliente = bdOperaciones.getCliente(dniCliente);
				bdOperaciones.cerrarConexion();
				request.setAttribute("cliente", cliente);
				request.setAttribute("pedido", pedido);
			}
			else
			{
				BdOperaciones bdOperaciones = new BdOperaciones();
				bdOperaciones.abrirConexion();
				Cliente cliente = bdOperaciones.getCliente(dniCliente);
				bdOperaciones.cerrarConexion();
				request.setAttribute("cliente", cliente);
			}

			// request.setAttribute("cliente",clienteDni);
			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/pedido.jsp");
			rd.forward(request, response);
		} else {
			response.sendRedirect("login.html");
		}
	}
}
