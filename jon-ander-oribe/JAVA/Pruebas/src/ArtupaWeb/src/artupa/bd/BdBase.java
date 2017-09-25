package artupa.bd;

import java.sql.Connection;
import java.sql.DriverManager;

import artupa.config.Configuracion;

public class BdBase {
	private static final String UNIT_JPA = null;
	private static String DRIVER;
	private static String URL;
	private static String USER;
	private static String PASSWORD;
	protected Connection conexion;

	public static void inicializarParametrosConexion(Configuracion configuracion) {
		DRIVER = configuracion.getDriver();
		URL = configuracion.getUrl();
		USER = configuracion.getUser();
		PASSWORD = configuracion.getPassword();
	}

	protected BdBase() {
		super();
	}

	public boolean abrirConexion() {
		boolean correcto = true;
		try {
			Class.forName(DRIVER);
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
			correcto = false;
		}
		return correcto;
	}

	public boolean cerrarConexion() {
		boolean correcto = true;
		try {
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
			correcto = false;
		}
		return correcto;
	}
	
	public boolean cerrarConexionNew() {
		if(UNIT_JPA != null) {
			return cerrarConexionJPA();
		}else {
			return cerrarConexionOLD();
		}
	}

	private boolean cerrarConexionOLD() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean cerrarConexionJPA() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean abrirTransaccion() {
		boolean correcto = true;
		try {
			conexion.setAutoCommit(false);
		} catch (Exception e) {
			e.printStackTrace();
			correcto = false;
		}
		return correcto;
	}

	public boolean hacerCommit() {
		boolean correcto = true;
		try {
			conexion.commit();
		} catch (Exception e) {
			e.printStackTrace();
			correcto = false;
		}
		return correcto;
	}

	public boolean hacerRollback() {
		boolean correcto = true;
		try {
			conexion.rollback();
		} catch (Exception e) {
			e.printStackTrace();
			correcto = false;
		}
		return correcto;
	}
}
