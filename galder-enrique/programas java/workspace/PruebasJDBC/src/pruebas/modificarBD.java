package pruebas;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class modificarBD {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/curso";
		String user = "root";
		String password = "admin";
		
		try {
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user,
					password);
			Statement stmt = conexion.createStatement();
			String sentenciaSql = "update usuario set user='Juan', password='userjuan' where user='camilo'";
			System.out.println("sentenciaSql:" + sentenciaSql);

			stmt.executeUpdate(sentenciaSql);

			stmt.close();
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
