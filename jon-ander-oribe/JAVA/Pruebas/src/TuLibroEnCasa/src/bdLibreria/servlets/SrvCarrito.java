package bdLibreria.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bdLibreria.bd.BdOperaciones;
import bdLibreria.beans.Libro;
import bdLibreria.beans.Usuario;

/**
 * Servlet implementation class SrvCarrito
 */
public class SrvCarrito extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SrvCarrito() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void service (HttpServletRequest request,HttpServletResponse response)
    		throws IOException,ServletException
    		{				
    			HttpSession sesion = request.getSession(false);	
    			if (sesion!=null)
    			{			
    				String modo_entrada = request.getParameter("modo_comprar");
    				if (modo_entrada.equals("modo_comprar"))
    				{
    					String idLibro = request.getParameter("idLibro");
    					BdOperaciones bdOperaciones = new BdOperaciones();
    					bdOperaciones.abrirConexion();
    					Libro libro = bdOperaciones.getLibro(idLibro);
    					bdOperaciones.cerrarConexion();
    					request.setAttribute("libro",libro);
    				}
    				
    				ServletContext ct = getServletContext();
    				RequestDispatcher rd = ct.getRequestDispatcher("/carrito.jsp");
    				rd.forward(request,response);
    			}
    			else
    			{
    				response.sendRedirect("login.jsp");
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
