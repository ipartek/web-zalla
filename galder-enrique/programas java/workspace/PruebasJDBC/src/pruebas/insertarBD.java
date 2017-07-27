package pruebas;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class insertarBD {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/pelis";
		String user = "root";
		String password = "admin";
		
		try {
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user,
					password);
			Statement stmt = conexion.createStatement();
			String sentenciaSql = "insert into genero(nombre) values ('tragico')";
			System.out.println("sentenciaSql:" + sentenciaSql);

			stmt.executeUpdate(sentenciaSql);

			stmt.close();
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
