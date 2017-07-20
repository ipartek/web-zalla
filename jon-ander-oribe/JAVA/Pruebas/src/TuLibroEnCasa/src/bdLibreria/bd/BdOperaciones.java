package bdLibreria.bd;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import artupa.beans.Cliente;
import bdLibreria.beans.Usuario;

public class BdOperaciones extends BdBase {

	public BdOperaciones() {
		super();
	}

	public boolean validarUsuario(String user, String password) {
		boolean correcto = true;
		try {
			String sentenciaSql = "select nombreUsuario,password from usuario where nombreUsuario='"+user+"' and password='"+password+"'";
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
	
	public boolean insertarUsuario(Usuario usuario) {
		boolean correcto = true;
		try {
			String sentenciaSql = "insert into usuario values ('"
					+ usuario.getNombre() + "','" + usuario.getPrimerApellido() + "','" + usuario.getSegundoApellido() + "','"
					+ usuario.getDni() + "','" + usuario.getDireccion() + "','" + usuario.getFechaDeNacimiento() + "','"
					+ usuario.getMail() + "','" + usuario.getNombreUsuario() + "','"+usuario.getPassword()+"','"+usuario.getConfirmPassword()+"')";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			stmt.execute(sentenciaSql);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inserción de usuario no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}
	
	public List<Usuario> getUsuarios() {
		List<Usuario> clientes = new ArrayList<Usuario>();
		try {
			String sentenciaSql = "select dni,nombre,apellido,edad from clientes";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			Usuario usuario = null;
			while (hayMas) {
				usuario = new Usuario();
				usuario.setDni(rs.getString(1));
				usuario.setNombre(rs.getString(2));
				usuario.setApellido(rs.getString(3));
				usuario.setEdad(rs.getInt(4));
				usuario.add(usuario);
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de clientes no efectuada correctamente");
		}
		return clientes;
	}
}
