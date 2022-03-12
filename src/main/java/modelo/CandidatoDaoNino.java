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
public class CandidatoDaoNino {
    	private static final String  SQL_SELECT =  "SELECT id, nombre, direccion, telefono, fecha_nacimiento , nombre_tutor FROM candidato_nino";
	private static final String  SQL_INSERT =  "INSERT  INTO candidato_nino (nombre, direccion, telefono, fecha_nacimiento , nombre_tutor) VALUES(?, ? , ? , ?,?)";
	
        	public List<Candidatonino> selecccionar(){
		Connection conn = null;
		PreparedStatement  stmt = null;
		ResultSet rs = null;
		Candidatonino candidatonino = null;
		List<Candidatonino> candidatoninos = new ArrayList<Candidatonino>();
		
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
                String nombre_tutor =  rs.getString("nombre_tutor");

				candidatonino = new Candidatonino(id, nombre, direccion, telefono, fechaNacimiento , nombre_tutor);
				
				candidatoninos.add(candidatonino);
				
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
		return candidatoninos;
	}
                
        	public int  insertar (Candidatonino candidatonino) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int registros2 = 0;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			stmt.setString(1, candidatonino.getNombre());
			stmt.setString(2, candidatonino.getDirrecion());
			stmt.setString(3, candidatonino.getTelefono());
			stmt.setString(4, candidatonino.getFechaNacimiento());
                        stmt.setString(5, candidatonino.getnombreTutor());
	
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
