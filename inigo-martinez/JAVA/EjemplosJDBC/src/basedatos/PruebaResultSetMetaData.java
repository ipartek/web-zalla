package basedatos;

import java.sql.*;

public class PruebaResultSetMetaData {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.197.52:1526:dieora2";
		String user = "c1";
		String password = "curso1";

		try {
			Class.forName(driver);

			Connection conexion = DriverManager.getConnection(url, user,
					password);
			Statement stmt = conexion.createStatement();
			// String sentenciaSql = "select usuario,password from usuarios";
			String sentenciaSql = "select dni,nombre,apellido1,apellido2,edad from clientes";
			System.out.println("sentenciaSql:" + sentenciaSql);

			ResultSet rs = stmt.executeQuery(sentenciaSql);
			muestraConsulta(rs);
			/*
			 * boolean hayMas = rs.next();
			 * 
			 * while (hayMas) { System.out.println("usuario:" +
			 * rs.getString(1)); System.out.println("password:" +
			 * rs.getString(2)); hayMas = rs.next(); }
			 */

			rs.close();
			stmt.close();
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void muestraConsulta(ResultSet rs) {
		try {
			ResultSetMetaData rsMetaData = rs.getMetaData();
			int numColumnas = rsMetaData.getColumnCount();

			boolean hayMas = rs.next();

			while (hayMas) {
				for (int i = 1; i <= numColumnas; i++) {
					System.out.println(rsMetaData.getColumnName(i) + ": "
							+ rs.getObject(i));
				}
				hayMas = rs.next();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
