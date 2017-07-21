
package bdLibreria.servlets;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import bdLibreria.bd.BdOperaciones;
import bdLibreria.beans.Usuario;

public class SrvActualizarUsuario extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service (HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException
	{				
		HttpSession sesion = request.getSession(false);	
		if (sesion!=null)
		{			
			String modo_entrada = request.getParameter("modo_entrada");
			
			String nombre = request.getParameter("nombre");
			String primerApellido = request.getParameter("primerApellido");
			String segundoApellido = request.getParameter("segundoApellido");
			String dni = request.getParameter("dni");
			String direccion = request.getParameter("direccion");
			String fechaDeNacimiento = request.getParameter("fechaDeNacimiento");
			String mail = request.getParameter("mail");
			String nombreUsuario=request.getParameter("nombreUsuario");
			String password= request.getParameter("password");
			String confirmPassword= request.getParameter("confirmPassword");
			Usuario usuario = new Usuario(nombre,primerApellido,segundoApellido,dni,direccion,fechaDeNacimiento,mail,nombreUsuario,password,confirmPassword);
			
			BdOperaciones bdOperaciones = new BdOperaciones();
			bdOperaciones.abrirConexion();
			if (modo_entrada.equals("modo_alta"))
			{
				bdOperaciones.insertarUsuario(usuario);
			}
			else
			{
				bdOperaciones.modificarUsuario(usuario);
			}
			bdOperaciones.cerrarConexion();
			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/SrvUsuarios");
			rd.forward(request,response);
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	}

}

