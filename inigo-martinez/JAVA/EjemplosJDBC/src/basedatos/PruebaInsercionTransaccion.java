package basedatos;

import java.sql.*;

public class PruebaInsercionTransaccion {
	public static void main(String[] args) {
		//
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.197.52:1526:dieora2";
		String user = "c1";
		String password = "curso1";
		//
		Connection conexion = null;
		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(url, user, password);
			// ABRIR TRANSACION
			conexion.setAutoCommit(false);
			//
			Statement stmt = conexion.createStatement();
			//
			String sentenciaSql = "insert into usuarios(usuario,password) values ('dabid','dabid')";
			System.out.println("sentenciaSql:" + sentenciaSql);
			stmt.executeUpdate(sentenciaSql);
			//
			String sentenciaSql2 = "insert into usuarios(usuario,password) values ('juan','juan23')";
			System.out.println("sentenciaSql:" + sentenciaSql2);
			stmt.executeUpdate(sentenciaSql2);
			//
			String sentenciaSql3 = "insert into usuarios(usuario,password) values ('marta','mvh23')";
			System.out.println("sentenciaSql:" + sentenciaSql3);
			stmt.executeUpdate(sentenciaSql3);
			//
			String sentenciaSql4 = "insert into usuarios(usuario,password) values ('olatz','orf65')";
			System.out.println("sentenciaSql:" + sentenciaSql4);
			stmt.executeUpdate(sentenciaSql4);
			// HACE COMMIT
			conexion.commit();
			//
			stmt.close();
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conexion.rollback();
			} catch (Exception e1) {

			}
		}
	}
}
