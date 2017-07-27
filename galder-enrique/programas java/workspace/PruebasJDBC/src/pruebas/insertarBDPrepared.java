package pruebas;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertarBDPrepared {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/curso";
		String user = "root";
		String password = "admin";
		
		try {
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user,
					password);
			String sentenciaSql = "insert into usuario(user,password) values (?,?)";
			PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql);
		      pStmt.setString(1, "iker");
		      pStmt.setString(2, "iker");
		      pStmt.executeUpdate();

		      pStmt.close();
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
