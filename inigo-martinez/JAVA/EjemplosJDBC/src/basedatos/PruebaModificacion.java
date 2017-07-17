package basedatos;

import java.sql.*;


public class PruebaModificacion {
  public static void main(String[] args) {
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    String user = "user_805";
    String password = "user_805";

    try {
      Class.forName(driver);

      Connection conexion = DriverManager.getConnection(url, user, password);
      Statement stmt = conexion.createStatement();
      String sentenciaSql = "update usuarios set password = 'dabid7' where usuario = 'dabid'";
      System.out.println("sentenciaSql:" + sentenciaSql);

      stmt.executeUpdate(sentenciaSql);

      stmt.close();
      conexion.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}