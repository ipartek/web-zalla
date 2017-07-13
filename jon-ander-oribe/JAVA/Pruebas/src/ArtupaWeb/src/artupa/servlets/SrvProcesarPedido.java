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
import artupa.beans.Pedido;

/**
 * Servlet implementation class SrvProcesarPedido
 */
@WebServlet("/SrvProcesarPedido")
public class SrvProcesarPedido extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SrvProcesarPedido() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void service (HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    	HttpSession sesion= request.getSession(false);
    	if(sesion!=null) {
    		String modo_entrada= request.getParameter("modo_entrada");
    		if(modo_entrada.equals("modo_modificacion")) {
    			String dni = request.getParameter("dni");
    			BdOperaciones bdOperaciones= new BdOperaciones();
    			Pedido pedido=bdOperaciones.getPedido(dni);
    			bdOperaciones.cerrarConexion();
    			request.setAttribute("pedido", pedido);
    		}
    		ServletContext ct=getServletContext();
    		RequestDispatcher rd= ct.getRequestDispatcher("/pedido.jsp");
    		rd.forward(request, response);
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
