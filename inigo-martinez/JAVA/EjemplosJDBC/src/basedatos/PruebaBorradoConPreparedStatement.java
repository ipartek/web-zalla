package basedatos;

import java.sql.*;

public class PruebaBorradoConPreparedStatement {
	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/videoteca";
		String user = "root";
		String password = "Admin78945";

		try {
			Class.forName(driver);

			Connection conexion = DriverManager.getConnection(url, user, password);

			String sentenciaSql = "insert into director values(10,'Jon','Ander',' ')";
			System.out.println("sentenciaSql:" + sentenciaSql);
			PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql);
			// pStmt.setString(1, "iker");
			// pStmt.executeUpdate();

			pStmt.close();
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
