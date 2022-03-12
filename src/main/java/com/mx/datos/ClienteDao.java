package com.mx.datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mx.domain.Cliente;

public class ClienteDao {
	
	private static final String  SQL_SELECT =  "SELECT id, nombre, direccion, telefono, persona-contacto, actividad";
	
	public List<Cliente> selecccionar(){
		Connection conn = null;
		PreparedStatement  stmt = null;
		ResultSet rs = null;
		Cliente cliente = null;
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			conn = Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int idPersona = rs.getInt("id");
				String nombreC = rs.getString("nombre");
				String direccion = rs.getString("direccion");
				String contacto = rs.getNString("persona-contacto");
				String actividad = rs.getString("actividad");
				cliente = new Cliente(idPersona, nombreC, direccion, contacto,actividad);
				
				clientes.add(cliente);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				Conexion.closeResultSet(rs);
				Conexion.closeStatement(stmt);
				Conexion.closeConnection(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(System.out);
			}
		}
		return clientes;
		
	}
}
