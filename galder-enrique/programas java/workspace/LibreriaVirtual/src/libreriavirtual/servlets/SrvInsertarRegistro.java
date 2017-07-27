package libreriavirtual.servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import libreriavirtual.bd.BdBase;
import libreriavirtual.bd.BdOperaciones;
import libreriavirtual.beans.Usuario;
import libreriavirtual.configuracion.Configuracion;

/**
 * Servlet implementation class SrvInsertarRegistro
 */
public class SrvInsertarRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// String FICHERO_CONFIGURACION = "C:\\Tomcat
		// 5.5\\webapps\\ArtupaWeb\\WEB-INF\\artupa.properties";
		String FICHERO_CONFIGURACION = getServletConfig().getInitParameter("fichero_propiedades");
		boolean cargaCorrecta = libreriavirtual.configuracion.GestorConfiguracion.cargarConfiguracion(FICHERO_CONFIGURACION);
		if (!cargaCorrecta) {
			System.out.println("Fichero de configuración no cargado correctamente");
		} else {
			BdBase.inicializarParametrosConexion(Configuracion.getInstancia());
		}
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sesion = request.getSession(false);
		String nombre = request.getParameter("nombre");
		String primerApellido = request.getParameter("primerApellido");
		String segundoApellido = request.getParameter("segundoApellido");
		String dni = request.getParameter("dni");
		String direccion = request.getParameter("direccion");
		String fechaNacimiento = request.getParameter("fechaNacimiento");
		String email = request.getParameter("email");
		String user = request.getParameter("usuario");
		String password = request.getParameter("password");
		String passwordConf = request.getParameter("passwordConf");
		Usuario usuario = new Usuario(nombre, primerApellido, segundoApellido, dni, direccion, fechaNacimiento, email,
				user, password, passwordConf);

		BdOperaciones bdOperaciones = new BdOperaciones();
		bdOperaciones.abrirConexion();
		boolean correcto = bdOperaciones.insertarUsuario(usuario);
		bdOperaciones.cerrarConexion();

		if (correcto == true) {

			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/login.html");
			rd.forward(request,response);
		}

	}

}
