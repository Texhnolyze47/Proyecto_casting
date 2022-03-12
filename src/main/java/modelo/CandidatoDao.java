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


public class CandidatoDao {
    	private static final String  SQL_SELECT =  "SELECT id, nombre, direccion, telefono, fecha_nacimiento , DNI FROM candidato_adulto";
	private static final String  SQL_INSERT =  "INSERT  INTO candidato_adulto (nombre, direccion, telefono, fecha_nacimiento , DNI) VALUES(?, ? , ? , ?,?)";
	
        	public List<Candidato> selecccionar(){
		Connection conn = null;
		PreparedStatement  stmt = null;
		ResultSet rs = null;
		Candidato candidato = null;
		List<Candidato> candidatos = new ArrayList<Candidato>();
		
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String direccion = rs.getString("direccion");
				String telefono = rs.getNString("telefono");
				String fechaNacimiento = rs.getString("fecha_nacimiento");
                                String DNI =  rs.getString("DNI");

				candidato = new Candidato(id, nombre, direccion, telefono, fechaNacimiento , DNI);
				
				candidatos.add(candidato);
				
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
		return candidatos;
	}
                
        	public int  insertar (Candidato candidato) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int registros2 = 0;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			stmt.setString(1, candidato.getNombre());
			stmt.setString(2, candidato.getDirrecion());
			stmt.setString(3, candidato.getTelefono());
			stmt.setString(4, candidato.getFechaNacimiento());
			//stmt.setString(5, candidato.setFoto());
            stmt.setString(5, candidato.getDNI());
	
			registros2 = stmt.executeUpdate();
			
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
		return registros2;
	}        
}
