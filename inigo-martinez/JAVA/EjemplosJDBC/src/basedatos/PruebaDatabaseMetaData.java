package basedatos;

import java.sql.*;

public class PruebaDatabaseMetaData {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.197.52:1526:dieora2";
		String user = "c1";
		String password = "curso1";

		try {
			Class.forName(driver);

			Connection conexion = DriverManager.getConnection(url, user,
					password);
			DatabaseMetaData dbMetaData = conexion.getMetaData();
			ResultSet rs = dbMetaData.getTables(null, "c1", null, null);
			// ResultSet rs = dbMetaData.getTables(null, null, null, null);

			// muestraConsulta(rs);

			boolean hayMas = rs.next();
			ResultSetMetaData rsMetaData = rs.getMetaData();

			while (hayMas) {
				System.out.println(rsMetaData.getColumnName(3) + ": "
						+ rs.getObject(3));
				hayMas = rs.next();
			}

			rs.close();
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
