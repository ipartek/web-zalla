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

/**
 * Servlet implementation class SrvActualizarPedido
 */
public class SrvActualizarPedido extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SrvActualizarPedido() {
        super();
       
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession(false);	
		if (sesion!=null)
		{			
			String modo_entrada = request.getParameter("modo_entrada");
			
			String dni = request.getParameter("dni");
			int numPedido = Integer.parseInt(request.getParameter("numPedido"));
			String detallePedido = request.getParameter("detallePedido");
			
			Pedido pedido = new Pedido(dni,numPedido,detallePedido);
			
			BdOperaciones bdOperaciones = new BdOperaciones();
			bdOperaciones.abrirConexion();
			if (modo_entrada.equals("modo_alta"))
			{
				bdOperaciones.insertarPedido(pedido);
			}
			else
			{
				bdOperaciones.modificarPedido(pedido);
			}
			bdOperaciones.cerrarConexion();
			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/SrvPedidos");
			rd.forward(request,response);
		}
	}

}
