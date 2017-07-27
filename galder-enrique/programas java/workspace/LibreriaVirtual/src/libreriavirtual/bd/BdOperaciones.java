/*
 * Created on 26-abr-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package libreriavirtual.bd;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import libreriavirtual.beans.Libro;

import libreriavirtual.beans.Usuario;



/**
 * @author Administrador
 * 
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
public class BdOperaciones extends BdBase {

	/**
	 * 
	 */
	public BdOperaciones() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean validarUsuario(String usuario, String password) {
		boolean correcto = true;
		try {
			String sentenciaSql = "select usuario,password from cliente where" + " usuario='" + usuario
					+ "' and password='" + password + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			correcto = rs.next();
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Validación de usuario no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}

	public List<Usuario> getUsuarios() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			String sentenciaSql = "select dni,nombre,apellido1,apellido2,direccion,fecha_nacimiento,email,usuario from cliente";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			Usuario usuario = null;
			while (hayMas) {
				usuario = new Usuario();
				usuario.setDni(rs.getString(1));
				usuario.setNombre(rs.getString(2));
				usuario.setPrimerApellido(rs.getString(3));
				usuario.setSegundoApellido(rs.getString(3));
				usuario.setDireccion(rs.getString(4));
				usuario.setFechaNacimiento(rs.getString(5));
				usuario.setEmail(rs.getString(6));
				usuario.setUsuario(rs.getString(7));
				usuarios.add(usuario);
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de usuarios no efectuada correctamente");
		}
		return usuarios;
	}
	public List<Libro> mostrarLibros(String titulo, String autor, String categoria, String opcionCondicion, String opcionOrden) {
		String sentenciaSql = null;
		String ordenarPor = opcionOrden;
		int codCategoria = Integer.parseInt(categoria);
				
		List<Libro> listaLibros = new ArrayList<Libro>();
		try {
			sentenciaSql = "select l.isbn,l.titulo,a.nom_autor,c.nom_categoria, e.nom_editorial,l.precio,l.stock "
					+ "from autor a "
					+ "join libro l on a.cod_autor=l.cod_autor "
					+ "join categoria c on c.cod_categoria = l.cod_categoria "
					+ "join editorial e on e.cod_editorial = l.cod_editorial";
			System.out.println(sentenciaSql);
			
			if(codCategoria ==0){
				sentenciaSql += " where  l.titulo like '%"+titulo+"%' "+opcionCondicion + "a.nom_autor like '%"+autor+"%'";
			}else {
				sentenciaSql += " where c.cod_categoria= "+codCategoria+ "and (l.titulo like '%"+titulo+"%' "+opcionCondicion + "a.nom_autor like '%"+autor+"%')";
			}
			sentenciaSql += " order by " + ordenarPor;
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			Libro libro = null;
			while (hayMas) {
				libro = new Libro();
				libro.setIsbn(rs.getString(1));
				libro.setTitulo(rs.getString(2));
				libro.setCod_autor(rs.getString(3));
				libro.setCod_categoria(rs.getString(3));
				libro.setCod_editorial(rs.getString(4));
				libro.setPrecio(rs.getDouble(5));
				libro.setStock(rs.getInt(6));
				listaLibros.add(libro);
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de usuarios no efectuada correctamente");
		}
		return listaLibros;
	}

	

	public Usuario getUsuario(String dni) {
		Usuario usuario = null;
		try {
			String sentenciaSql = "select dni,nombre,apellido1,apellido2,direccion,fecha_nacimiento,email,usuario from cliente"
					+ " where dni='" + dni + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			if (hayMas) {
				usuario = new Usuario();
				usuario.setDni(rs.getString(1));
				usuario.setNombre(rs.getString(2));
				usuario.setPrimerApellido(rs.getString(3));
				usuario.setSegundoApellido(rs.getString(4));
				usuario.setFechaNacimiento(rs.getString(5));
				usuario.setEmail(rs.getString(6));
				usuario.setUsuario(rs.getString(7));
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de usuarios no efectuada correctamente");
		}
		return usuario;
	}


	public boolean insertarUsuario(Usuario usuario) {
		boolean correcto = true;
		try {
			String sentenciaSql = "insert into cliente(dni,nombre,apellido1,apellido2,direccion,fecha_nacimiento,email,usuario,password) values ('"
					+ usuario.getDni() + "','" + usuario.getNombre() + "','" + usuario.getPrimerApellido() + "','"
					+ usuario.getSegundoApellido() + "','" + usuario.getDireccion() + "','" + usuario.getFechaNacimiento() + "','"
					+ usuario.getEmail() + "','" + usuario.getUsuario() + "','" + usuario.getClave() + "')";
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

	public boolean modificarUsuario(Usuario usuario) {
		boolean correcto = true;
		try {
			String sentenciaSql = "update cliente set " + "nombre='" + usuario.getNombre() + "', " + "primer apellido='"
					+ usuario.getPrimerApellido() + "', " + "segundo apellido=" + usuario.getSegundoApellido() + ", " + "direccion='"
					+ usuario.getDireccion() + "', " + "fecha de nacimiento=" + usuario.getFechaNacimiento() + ", " + "email='"
					+ usuario.getEmail() + "', " + "usuario=" + usuario.getUsuario() + "clave=" 
					+ usuario.getClave() +"confirmación de clave=" + usuario.getConfClave() + " where dni = '"	+ usuario.getDni() + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			stmt.execute(sentenciaSql);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Modificación de usuario no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}

	
}
