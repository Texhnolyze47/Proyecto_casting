/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static modelo.Conexion.close;
import static modelo.Conexion.getConnection;

/**
 *
 * @author Ivan
 */
public class RepresentanteDaon {
    
    private static final String  SQL_SELECT =  "SELECT id ,nombre,direccion ,telefono FROM representante ";
    private static final String  SQL_INSERT =  "INSERT INTO representante (nombre,direccion ,telefono) VALUES(?, ? , ? )";
    
    public List<Representante> selecccionar(){
		Connection conn = null;
		PreparedStatement  stmt = null;
		ResultSet rs = null;
		Representante representante = null;
		List<Representante> Representantes = new ArrayList<Representante>();
		
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String direccion = rs.getString("direccion");
				String telefono = rs.getNString("telefono");
		

				representante = new Representante(id, nombre,direccion,telefono);
				
				Representantes.add(representante);
				
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
		return Representantes;
	}
                
        	public int  insertar (Representante representante) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int registros= 0;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			stmt.setString(1, representante.getNombre());
			stmt.setString(2, representante.getDireccion());
			stmt.setString(3, representante.getTelefono());
	
			registros = stmt.executeUpdate();
			
		} catch (SQLException e) {
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
