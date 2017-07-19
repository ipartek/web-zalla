package bdLibreria.bd;

import java.sql.*;

public class BdOperaciones extends BdBase {

	public BdOperaciones() {
		super();
	}

	public boolean validarUsuario(String user, String password) {
		boolean correcto = true;
		try {
			String sentenciaSql = "select nombre,password from usuario where nombre='"+user+"' and password='"+password+"'";
			System.out.println(sentenciaSql);
			Statement stmt= conexion.createStatement();
			ResultSet rs= stmt.executeQuery(sentenciaSql);
			correcto=rs.next();
			rs.close();
			stmt.close();
			/*PreparedStatement preparado=conexion.prepareStatement(sentenciaSql);
			preparado.setString(1, user);
			preparado.setString(2, password);
			ResultSet rs = preparado.executeQuery(sentenciaSql);
			correcto = rs.next();
			rs.close();
			preparado.close();*/
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Validacion no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}
}
