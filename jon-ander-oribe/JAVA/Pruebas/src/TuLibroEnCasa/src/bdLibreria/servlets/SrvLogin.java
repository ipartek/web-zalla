package bdLibreria.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bdLibreria.bd.BdBase;
import bdLibreria.config.Configuracion;
import bdLibreria.config.GestorConfiguracion;
import bdLibreria.bd.BdOperaciones;

public class SrvLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// String FICHERO_CONFIGURACION = "C:\\Tomcat
		// 5.5\\webapps\\ArtupaWeb\\WEB-INF\\artupa.properties";
		String FICHERO_CONFIGURACION = getServletConfig().getInitParameter("fichero_propiedades");
		boolean cargaCorrecta = GestorConfiguracion.cargarConfiguracion(FICHERO_CONFIGURACION);
		if (!cargaCorrecta) {
			System.out.println("Fichero de configuración no cargado correctamente");
		} else {
			BdBase.inicializarParametrosConexion(Configuracion.getInstancia());
		}
	}

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		BdOperaciones bdOperaciones = new BdOperaciones();
		bdOperaciones.abrirConexion();
		boolean correcto = bdOperaciones.validarUsuario(user, password);
		bdOperaciones.cerrarConexion();
		System.out.println("Funciono");
		if (correcto) {
			HttpSession sesion = request.getSession(true);
			sesion.setAttribute("user", user);
			System.out.println(user);
			System.out.println(password);
			sesion.setAttribute("password", password);
			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/menu.jsp");
			rd.forward(request, response);
		} else {
			response.sendRedirect("login.jsp");
		}
	}

}
