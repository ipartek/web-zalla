/*
 * Created on 23-may-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package artupa.servlets;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.log4j.Logger;

import artupa.bd.BdBase;
import artupa.bd.BdOperaciones;
import artupa.config.Configuracion;
import artupa.config.GestorConfiguracion;

;

/**
 * @author Administrador
 * 
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
public class SrvValidarEntrada extends HttpServlet {
	private final static Logger log = Logger.getLogger(SrvValidarEntrada.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// String FICHERO_CONFIGURACION = "C:\\Tomcat
		// 5.5\\webapps\\ArtupaWeb\\WEB-INF\\artupa.properties";
		String FICHERO_CONFIGURACION = getServletConfig().getInitParameter("fichero_propiedades");
		boolean cargaCorrecta = GestorConfiguracion.cargarConfiguracion(FICHERO_CONFIGURACION);
		if (!cargaCorrecta) {
			log.error("Fichero de configuración no cargado correctamente");
		} else {
			BdBase.inicializarParametrosConexion(Configuracion.getInstancia());
		}
	}

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		log.debug("estoy en el service");
		log.trace("traza");
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		BdOperaciones bdOperaciones = new BdOperaciones();
		bdOperaciones.abrirConexion();
		bdOperaciones.abrirTransaccion();
		boolean correcto = bdOperaciones.validarUsuario(user, password);
		bdOperaciones.hacerCommit();
		bdOperaciones.cerrarConexion();
		ServletContext application = getServletContext();
		application.setAttribute("global", "valor de global");
		if (correcto) {
			HttpSession sesion = request.getSession(true);
			sesion.setAttribute("user", user);
			ServletContext ct = getServletContext();
			RequestDispatcher rd = ct.getRequestDispatcher("/menu_new.jsp");
			rd.forward(request, response);
		} else {
			response.sendRedirect("login.html");
		}
	}

}
