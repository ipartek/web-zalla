package basedatos;

import java.sql.*;


public class PruebaModificacionConPreparedStatement {
  public static void main(String[] args) {
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    String user = "user_805";
    String password = "user_805";

    try {
      Class.forName(driver);

      Connection conexion = DriverManager.getConnection(url, user, password);
      String sentenciaSql = "update usuarios set password = ? where usuario = ?";
      System.out.println("sentenciaSql:" + sentenciaSql);

      PreparedStatement pStmt = conexion.prepareStatement(sentenciaSql);
      pStmt.setString(1, "iker7");
      pStmt.setString(2, "iker");
      pStmt.executeUpdate();

      pStmt.close();
      conexion.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
