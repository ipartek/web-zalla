package artupa.bd;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;

import artupa.config.Configuracion;

public class BdBase {
	private static String DRIVER;
	private static String URL;
	private static String USER;
	private static String PASSWORD;
	private static String JNDI_BD;
	private static String UNIT_JPA;
	//
	private static DataSource ds;
	//
	protected Connection conexion;
	// JPA
	private static EntityManagerFactory entityManagerFactory;
	//
	protected EntityManager entityManager;

	public static void inicializarParametrosConexion(Configuracion configuracion) {
		DRIVER = configuracion.getDriver();
		URL = configuracion.getUrl();
		USER = configuracion.getUser();
		PASSWORD = configuracion.getPassword();
		JNDI_BD = configuracion.getJndi_bd();
		UNIT_JPA = configuracion.getUnit_jpa();
		//
		if (JNDI_BD != null) {
			try {
				Context ctx = new InitialContext();
				ds = (DataSource) ctx.lookup(JNDI_BD);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory(UNIT_JPA);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected BdBase() {
		super();
	}

	public boolean abrirConexion() {
		if (UNIT_JPA != null) {
			return abrirConexionJpa();
		} else {
			if (JNDI_BD != null) {
				// return abrirConexionJndi();
				return abrirConexionJndi();
			} else {
				return abrirConexionOLD();
			}
		}
	}

	public boolean abrirConexionJpa() {
		System.out.println("abrirConexionJpa");
		boolean correcto = true;
		try {
			entityManager = entityManagerFactory.createEntityManager();
		} catch (Exception e) {
			e.printStackTrace();
			correcto = false;
		}
		return correcto;
	}

	public boolean abrirConexionOLD() {
		System.out.println("abrirConexionOLD");
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

	public boolean abrirConexionJndi() {
		System.out.println("abrirConexionJndi");
		// http://www.journaldev.com/2513/tomcat-datasource-jndi-example-java
		boolean correcto = true;
		try {
			// Allocate and use a connection from the pool
			conexion = ds.getConnection();
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
