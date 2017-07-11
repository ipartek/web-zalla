package basePeliculas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DeleteDirectorBD {

	public static void main(String[] args) {

		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/videoteca";
		String user = "root";
		String password = "admin";

		try {
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user, password); //Realiza conexion
			Statement stmt = conexion.createStatement(); //Lanzador sentencias SQL
			String sentenciaSql = "DELETE FROM director WHERE nombre='George'";
			System.out.println("sentenciaSql:" + sentenciaSql);

			stmt.executeUpdate(sentenciaSql);

			stmt.close();
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
