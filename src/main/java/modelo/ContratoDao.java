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
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import static modelo.Conexion.getConnection;

/**
 *
 * @author Ivan
 */
public class ContratoDao {

    private static final String SQL_SELECT = "SELECT  * FROM candidato_adulto INNER JOIN candidato_nino on candidato_adulto.DNI = candidato_nino.id ";

    public static void selecccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
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
                String telefono = rs.getString("telefono");
                String fechaNacimiento = rs.getString("fecha_nacimiento");
                String dni = rs.getString("DNI");
                candidato = new Candidato(id, nombre,direccion ,telefono, fechaNacimiento,dni);
				
		candidatos.add(candidato);

            }

        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace(System.out);
            }
        }
        System.out.println(Arrays.toString(candidatos.toArray()));
    }

    public List<Candidatonino> selecccionar2() {
        Connection conn = null;
        PreparedStatement stmt = null;
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
                String nombre_tutor = rs.getString("nombre_tutor");

                candidatonino = new Candidatonino(id, nombre, direccion, telefono, fechaNacimiento, nombre_tutor);

                candidatoninos.add(candidatonino);

            }
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace(System.out);
        } finally {
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
}
