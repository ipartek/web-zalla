package bdLibreria.bd;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bdLibreria.beans.Usuario;

public class BdOperaciones extends BdBase {

	public BdOperaciones() {
		super();
	}

	public boolean validarUsuario(String user, String password) {
		boolean correcto = true;
		try {
			String sentenciaSql = "select nombreUsuario,password from usuario where nombreUsuario='" + user
					+ "' and password='" + password + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			correcto = rs.next();
			rs.close();
			stmt.close();
			/*
			 * PreparedStatement preparado=conexion.prepareStatement(sentenciaSql);
			 * preparado.setString(1, user); preparado.setString(2, password); ResultSet rs
			 * = preparado.executeQuery(sentenciaSql); correcto = rs.next(); rs.close();
			 * preparado.close();
			 */
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
			String sentenciaSql = "insert into usuario values (" + 0 + ",'" + usuario.getNombre() + "','"
					+ usuario.getPrimerApellido() + "','" + usuario.getSegundoApellido() + "','" + usuario.getDni()
					+ "','" + usuario.getDireccion() + "','" + usuario.getFechaDeNacimiento() + "','"
					+ usuario.getMail() + "','" + usuario.getNombreUsuario() + "','" + usuario.getPassword() + "','"
					+ usuario.getConfirmPassword() + "')";
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
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			String sentenciaSql = "select * from usuario";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			Usuario usuario = null;
			while (hayMas) {
				usuario = new Usuario();
				usuario.setNombre(rs.getString(2));
				usuario.setPrimerApellido(rs.getString(3));
				usuario.setSegundoApellido(rs.getString(4));
				usuario.setDni(rs.getString(5));
				usuario.setDireccion(rs.getString(6));
				usuario.setFechaDeNacimiento(rs.getString(7));
				usuario.setMail(rs.getString(8));
				usuario.setNombre(rs.getString(9));
				usuario.setPassword(rs.getString(10));
				usuario.setConfirmPassword(rs.getString(11));
				usuarios.add(usuario);
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de clientes no efectuada correctamente");
		}
		return usuarios;
	}

	public boolean eliminarUsuario(String dni) {
		boolean correcto = true;
		try {
			
			String sentenciaSql="DELETE FROM usuario WHERE dni='"+dni+"'";
			System.out.println(sentenciaSql);
			Statement stmt=conexion.createStatement();
			stmt.execute(sentenciaSql);
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Borrado de usuario no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}
	
	public boolean modificarUsuario(Usuario usuario) {
		boolean correcto = true;
		try {
			String sentenciaSql = "update usuario set " + "nombre='" + usuario.getNombre() + "', " + "primerApellido='"
					+ usuario.getPrimerApellido() + "', " + "segundoApellido=" + usuario.getSegundoApellido() + ", " + "dni='"
					+ usuario.getDni() + "', " + "direccion=" + usuario.getDireccion() + ", " + "fechaDeNacimiento='"
					+ usuario.getFechaDeNacimiento() + "', " + "e-mail=" + usuario.getMail() + "nombreUsuario="+usuario.getNombreUsuario()+"password="+usuario.getPassword()+"passwordConfirmado="+usuario.getConfirmPassword()+ " where dni = '"
					+ usuario.getDni() + "'";
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
	
	public Usuario getUsuario(String dni) {
		Usuario usuario = null;
		try {
			String sentenciaSql = "select * from usuario "
					+ "where dni='" + dni + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			if (hayMas) {
				usuario = new Usuario();
				usuario.setNombre(rs.getString(2));
				usuario.setPrimerApellido(rs.getString(3));
				usuario.setSegundoApellido(rs.getString(4));
				usuario.setDni(rs.getString(5));
				usuario.setDireccion(rs.getString(6));
				usuario.setFechaDeNacimiento(rs.getString(7));
				usuario.setMail(rs.getString(8));
				usuario.setNombreUsuario(rs.getString(9));
				usuario.setPassword(rs.getString(10));
				usuario.setConfirmPassword(rs.getString(11));
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de clientes no efectuada correctamente");
		}
		return usuario;
	}
}
