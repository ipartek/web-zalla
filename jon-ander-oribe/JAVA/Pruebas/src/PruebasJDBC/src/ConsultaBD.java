import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class ConsultaBD {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://localhost/curso";
	    String user = "root";
	    String password = "admin";

	    try {
	      Class.forName(driver);

	      Connection conexion = DriverManager.getConnection(url, user, password);
	      Statement stmt = conexion.createStatement();
	      String sentenciaSql = "select user,password from usuario WHERE user='bilbo' or password='1234'";
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
