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
public class PerfilDao {
    private static final String  SQL_SELECT =  "SELECT id, provincia, sexo , altura, edad ,color_piel,color_ojos,especialidad,experiencia DNI FROM perfil ";
    private static final String  SQL_INSERT =  "INSERT  INTO perfil (provincia, sexo , altura, edad ,color_piel,color_ojos,especialidad,experiencia) VALUES(?, ? , ? , ?,?,?,?,?)";
        
        
        public List<Perfil> selecccionar(){
		Connection conn = null;
		PreparedStatement  stmt = null;
		ResultSet rs = null;
		Perfil perfil = null;
		List<Perfil> Perfiles = new ArrayList<Perfil>();
		
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String provincia = rs.getString("provincia");
				String sexo = rs.getString("sexo");
				String altura = rs.getNString("altura");
				String edad = rs.getString("edad");
                                String coloPiel = rs.getString("color_piel");
                                String colorOjos = rs.getString("color_ojos");
                                String escpecialidad = rs.getString("especialidad");
                                String experencias = rs.getString("experencia");

				perfil = new Perfil(id, provincia, sexo, altura, edad , coloPiel,colorOjos,escpecialidad,experencias);
				
				Perfiles.add(perfil);
				
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
		return Perfiles;
	}
                
        	public int  insertar (Perfil perfil) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int registros2 = 0;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			stmt.setString(1, perfil.getProvincia());
			stmt.setString(2, perfil.getSexo());
			stmt.setString(3, perfil.getAltura());
			stmt.setString(4, perfil.getEdad());
                        stmt.setString(5, perfil.getColorPiel());
                        stmt.setString(6, perfil.getColorOjos());
                        stmt.setString(7, perfil.getEspecialidad());
                        stmt.setString(8, perfil.getExperencia());
	
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
