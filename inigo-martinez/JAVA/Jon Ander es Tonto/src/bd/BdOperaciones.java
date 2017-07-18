/*
 * Created on 26-abr-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package bd;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import beans.*;
import usuario.Usuarios;

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

	public boolean validarUsuario(String user, String password) {
		boolean correcto = true;
		try {
			String sentenciaSql = "select usuario,password from usuarios where" + " usuario='" + user
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

	public List<Cliente> getClientes() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		try {
			String sentenciaSql = "select dni,nombre,apellido,edad from CLIENTE";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			Cliente cliente = null;
			while (hayMas) {
				cliente = new Cliente();
				cliente.setDni(rs.getString(1));
				cliente.setNombre(rs.getString(2));
				cliente.setApellido(rs.getString(3));
				cliente.setEdad(rs.getInt(4));
				clientes.add(cliente);
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

	public Cliente getCliente(String dni) {
		Cliente cliente = null;
		try {
			String sentenciaSql = "select dni,nombre,apellido,edad,direccion,codPostal,localidad,telefono from CLIENTE "
					+ "where dni='" + dni + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sentenciaSql);
			boolean hayMas = rs.next();
			if (hayMas) {
				cliente = new Cliente();
				cliente.setDni(rs.getString(1));
				cliente.setNombre(rs.getString(2));
				cliente.setApellido(rs.getString(3));
				cliente.setEdad(rs.getInt(4));
				cliente.setDireccion(rs.getString(5));
				cliente.setCodPostal(rs.getInt(6));
				cliente.setLocalidad(rs.getString(7));
				cliente.setTelefono(rs.getInt(8));
				hayMas = rs.next();
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Consulta de clientes no efectuada correctamente");
		}
		return cliente;
	}

	public boolean eliminarCliente(String dni) {
		boolean correcto = true;
		try {
			String sentenciaSql = "delete from CLIENTE where dni='" + dni + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			stmt.execute(sentenciaSql);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Borrado de cliente no efectuado correctamente");
			correcto = false;
		}
		return correcto;
	}

	public boolean insertarCliente(Cliente cliente) {
		boolean correcto = true;
		try {
			String sentenciaSql = "insert into CLIENTE(dni,nombre,apellido,edad,direccion,codPostal,localidad,telefono) values ('"
					+ cliente.getDni() + "','" + cliente.getNombre() + "','" + cliente.getApellido() + "',"
					+ cliente.getEdad() + ",'" + cliente.getDireccion() + "'," + cliente.getCodPostal() + ",'"
					+ cliente.getLocalidad() + "'," + cliente.getTelefono() + ")";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			stmt.execute(sentenciaSql);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inserción de cliente no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}

	public boolean modificarCliente(Cliente cliente) {
		boolean correcto = true;
		try {
			String sentenciaSql = "update CLIENTE set " + "nombre='" + cliente.getNombre() + "', " + "apellido='"
					+ cliente.getApellido() + "', " + "edad=" + cliente.getEdad() + ", " + "direccion='"
					+ cliente.getDireccion() + "', " + "codPostal=" + cliente.getCodPostal() + ", " + "localidad='"
					+ cliente.getLocalidad() + "', " + "telefono=" + cliente.getTelefono() + " where dni = '"
					+ cliente.getDni() + "'";
			System.out.println(sentenciaSql);
			Statement stmt = conexion.createStatement();
			stmt.execute(sentenciaSql);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inserción de cliente no efectuada correctamente");
			correcto = false;
		}
		return correcto;
	}

	public boolean logeo(Usuarios usu) {

		String sentencia = "select * from usuarios where usuario=? and password=?";
		try {
			PreparedStatement prepar = conexion.prepareStatement(sentencia);
			prepar.setString(1, usu.getNombreLog());
			prepar.setString(2, usu.getPassword());
			ResultSet resultado = prepar.executeQuery();
			resultado.next();
			prepar.close();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			return false;
		}
	}
	
	public ResultSet busqLibros(int elecc, String ...libro){
		
		String condicion;
		
		if(elecc==1)condicion=" and";
		else condicion=" or";
		
		int condiciones=0;
		ResultSet resultado = null;
		String busqueda = "select * from Libros where";
		if(!libro[0].equals("")){
			busqueda+=" ISBN=?";
			condiciones++;
		}
		if(!libro[1].equals("")){
			if(condiciones>0)busqueda+=condicion;
			busqueda+=" titulo=?";
			condiciones++;
		}
		if(!libro[2].equals("")){
			if(condiciones>0)busqueda+=condicion;
			busqueda+="autor=?";
			condiciones++;
		}
		if(!libro[3].equals("")){
			if(condiciones>0)busqueda+=condicion;
			busqueda+="genero=?";
			condiciones++;
		}
		try{
			
			int vueltas=0;
			PreparedStatement prepar = conexion.prepareStatement(busqueda);
			
			do{
				
				vueltas++;
				prepar.setString(vueltas, libro[vueltas-1]);
				
			}while(condiciones>=vueltas);
			
			resultado=prepar.executeQuery();
			prepar.close();
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return resultado;
		
	}
}
