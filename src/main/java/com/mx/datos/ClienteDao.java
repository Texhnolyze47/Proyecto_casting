package com.mx.datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static com.mx.datos.Conexion.*;
import com.mx.domain.Cliente;


public class ClienteDao {
	
	private static final String  SQL_SELECT =  "SELECT id, nombre, direccion, telefono, persona_contacto, actividad FROM clientes";
	private static final String  SQL_INSERT =  "INSERT  INTO clientes ( nombre, direccion, telefono, persona_contacto, actividad) VALUES(?, ? , ? , ?, ?  )";
	
	public List<Cliente> selecccionar(){
		Connection conn = null;
		PreparedStatement  stmt = null;
		ResultSet rs = null;
		Cliente cliente = null;
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int idPersona = rs.getInt("id");
				String nombreC = rs.getString("nombre");
				String direccion = rs.getString("direccion");
				String contacto = rs.getNString("persona_contacto");
				String actividad = rs.getString("actividad");
				cliente = new Cliente(idPersona, nombreC, direccion, contacto,actividad);
				
				clientes.add(cliente);
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
		finally {
			try {
				Conexion.close(rs);
				Conexion.close(stmt);
				Conexion.close(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(System.out);
			}
		}
		return clientes;
	}
	
	public int  insertar (Cliente cliente) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int registros = 0;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			stmt.setString(1, cliente.getNombre());
			stmt.setString(2, cliente.getDireccion());
			stmt.setString(3, cliente.getTelefono());
			stmt.setString(4, cliente.getPersonaContacto());
			stmt.setString(5, cliente.getActividadRealizar());
	
			registros = stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		finally {
			try {
				close(stmt);
				close(conn);

			} catch (SQLException e) {
				e.printStackTrace(System.out);
			}
		}
		return registros;
	}
}
