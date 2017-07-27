package pruebas;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class consultarBD {

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
			String sentenciaSql = "select user,password from usuario";
			System.out.println("sentenciaSql:" + sentenciaSql);
			
			ResultSet rs = stmt.executeQuery(sentenciaSql);
		    boolean hayMas = rs.next();
		    
		    while (hayMas) {
		        System.out.println("usuario:" + rs.getString(1));
		        System.out.println("password:" + rs.getString(2));
		        hayMas = rs.next();
		      }

		    rs.close();
			stmt.close();
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
