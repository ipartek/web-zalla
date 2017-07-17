package basedatos;

import java.sql.*;

public class PruebaBorrado {
	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/conexion";
		String user = "root";
		String password = "admin";

		try {
			Class.forName(driver);

			Connection conexion = DriverManager.getConnection(url, user, password);
			Statement stmt = conexion.createStatement();
			String sentenciaSql = "delete from usuarios where usuario='dabid";
			System.out.println("sentenciaSql:" + sentenciaSql);

			stmt.executeUpdate(sentenciaSql);

			stmt.close();
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
