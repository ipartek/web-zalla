package basePeliculas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class InsertDirectorBD {

	public static void main(String[] args) {

		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/videoteca";
		String user = "root";
		String password = "admin";

		try {
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user, password); //Realiza conexion
			Statement stmt = conexion.createStatement(); //Lanzador sentencias SQL
			String sentenciaSql = "INSERT INTO director VALUES(0,'Gregory','Noone','nm11453387')";
			System.out.println("sentenciaSql:" + sentenciaSql);

			stmt.executeUpdate(sentenciaSql);

			stmt.close();
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
