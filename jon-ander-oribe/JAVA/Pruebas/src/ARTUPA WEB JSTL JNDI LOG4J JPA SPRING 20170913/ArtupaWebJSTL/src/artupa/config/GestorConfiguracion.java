/*
 * Created on 26-abr-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package artupa.config;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author Administrador
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class GestorConfiguracion {
	public static boolean cargarConfiguracion(String FICHERO_CONFIGURACION) {
		boolean correcto = true;
		try {
			Configuracion configuracion = Configuracion.getInstancia();
			FileInputStream f = new FileInputStream(FICHERO_CONFIGURACION);
			Properties propiedades = new Properties();
			propiedades.load(f);
			f.close();
			String driver = propiedades.getProperty("driver");
			String url = propiedades.getProperty("url");
			String user = propiedades.getProperty("user");
			String password = propiedades.getProperty("password");
			String jndi_bd = propiedades.getProperty("jndi_bd");
			String unit_jpa = propiedades.getProperty("unit_jpa");
			configuracion.setDriver(driver);
			configuracion.setUrl(url);
			configuracion.setUser(user);
			configuracion.setPassword(password);
			configuracion.setJndi_bd(jndi_bd);
			configuracion.setUnit_jpa(unit_jpa);
		} catch (Exception e) {
			correcto = false;
			e.printStackTrace();
		}
		return correcto;
	}
}
