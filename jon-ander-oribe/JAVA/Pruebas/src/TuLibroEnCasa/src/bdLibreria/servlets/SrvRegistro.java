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
import bdLibreria.beans.Usuario;
import bdLibreria.beans.Usuario;

/**
 * Servlet implementation class SrvRegistro
 */
public class SrvRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SrvRegistro() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void service (HttpServletRequest request,HttpServletResponse response)
    		throws IOException,ServletException
    		{				
    			HttpSession sesion = request.getSession(false);	
    			if (sesion!=null)
    			{			
    				//String modo_entrada = request.getParameter("modo_entrada");
    				
    				String nombre = request.getParameter("nombre");
    				String primerApellido = request.getParameter("primerApellido");
    				String segundoApellido = request.getParameter("segundoApellido");
    				String dni = request.getParameter("dni");
    				String direccion = request.getParameter("direccion");
    				String fechaDeNacimiento = request.getParameter("fechaDeNacimiento");
    				String mail = request.getParameter("mail");
    				String nombreUsuario = request.getParameter("nombreUsuario");
    				String password= request.getParameter("password");
    				String confirmPassword= request.getParameter("confirmPassword");
    				Usuario usuario = new Usuario(nombre,primerApellido,segundoApellido,dni,direccion,fechaDeNacimiento,mail,nombreUsuario,password,confirmPassword);
    				
    				BdOperaciones bdOperaciones = new BdOperaciones();
    				bdOperaciones.abrirConexion();
    				
    				bdOperaciones.insertarUsuario(usuario);
    				
    				bdOperaciones.cerrarConexion();
    				ServletContext ct = getServletContext();
    				RequestDispatcher rd = ct.getRequestDispatcher("/SrvUsuarios"); //ESTO NO TIENE IGUAL
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
