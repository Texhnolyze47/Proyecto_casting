package com.mx.datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mx.domain.*;

public class ClienteDao {
	
	private static final String  SQL_SELECT =  "";
	
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
				int idPersona = rs.getInt("id_persona");
				String nombreC = rs.getString("nombre");
				String direccion = rs.getString("direccion");
				String telefono = rs.getNString("persona-contacto");
				String actividad = rs.getString("actividad");
				cliente = new Cliente(idPersona, nombreC, direccion, telefono,actividad);
		
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return clientes;
		
	}
}
