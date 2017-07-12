package artupa.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import artupa.bd.BdOperaciones;

/**
 * Servlet implementation class SrvEliminarPedido
 */
@WebServlet("/SrvEliminarPedido")
public class SrvEliminarPedido extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service (HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession sesion=request.getSession(false);
		if(sesion!=null) {
			String dni=request.getParameter("dni");
			BdOperaciones bdOperaciones= new BdOperaciones();
			bdOperaciones.abrirConexion();
			bdOperaciones.eliminarPedido(dni);
			bdOperaciones.cerrarConexion();
			ServletContext ct =getServletContext();
			RequestDispatcher rd= ct.getRequestDispatcher("/SrvPedidos");
			rd.forward(request,response);
		}else {
			response.sendRedirect("login.html");
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
