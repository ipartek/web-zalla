package basedatos;

import java.sql.*;

public class PruebaInsercion {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.197.52:1526:dieora2";
		String user = "c1";
		String password = "curso1";
		String driverOLD = "com.mysql.jdbc.Driver";
		String urlOLD = "jdbc:mysql://localhost/curso";
		String userOLD = "root";
		String passwordOLD = "admin";
		try {
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user,
					password);
			Statement stmt = conexion.createStatement();
			String sentenciaSql = "insert into usuarios(usuario,password) values ('camilo','camilo')";
			System.out.println("sentenciaSql:" + sentenciaSql);

			stmt.executeUpdate(sentenciaSql);

			stmt.close();
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
