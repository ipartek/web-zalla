package bdLibreria.servlets;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bdLibreria.bd.BdOperaciones;
import bdLibreria.beans.Usuario;
import bdLibreria.beans.Libro;


/**
 * Servlet implementation class SrvUsuarios
 */
public class SrvBuscarLibros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SrvBuscarLibros() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void service (HttpServletRequest request,HttpServletResponse response)
    		throws IOException,ServletException
    		{				
    			HttpSession sesion = request.getSession(false);	
    			if (sesion!=null)
    			{			
    				BdOperaciones bdOperaciones = new BdOperaciones();
    				bdOperaciones.abrirConexion();
    				List<Libro> libros = bdOperaciones.getLibros();
    				bdOperaciones.cerrarConexion();
    				request.setAttribute("libros",libros);
    				ServletContext ct = getServletContext();
    				RequestDispatcher rd = ct.getRequestDispatcher("/libros.jsp");
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
