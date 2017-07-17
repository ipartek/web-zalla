package basedatos;

import java.sql.*;


public class PruebaConsulta {
  public static void main(String[] args) {
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    String user = "user_805";
    String password = "user_805";

    try {
      Class.forName(driver);

      Connection conexion = DriverManager.getConnection(url, user, password);
      Statement stmt = conexion.createStatement();
      String sentenciaSql = "select usuario,password from usuarios";
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
