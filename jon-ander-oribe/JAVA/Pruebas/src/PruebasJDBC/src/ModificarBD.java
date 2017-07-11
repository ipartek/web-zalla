import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class ModificarBD {

	public static void main(String[] args) {

		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/curso";
		String user = "root";
		String password = "admin";

		try {
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user, password); //Realiza conexion
			Statement stmt = conexion.createStatement(); //Lanzador sentencias SQL
			String sentenciaSql = "update usuario set password='AFT' where user='andres'";
			System.out.println("sentenciaSql:" + sentenciaSql);

			stmt.executeUpdate(sentenciaSql);

			stmt.close();
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
