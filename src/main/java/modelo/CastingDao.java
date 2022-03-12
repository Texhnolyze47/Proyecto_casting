package modelo;
import modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static modelo.Conexion.*;
import modelo.Casting;


public class CastingDao {
	
	private static final String  SQL_SELECT =  "SELECT id, nombre, descripcion, fecha, precio, tipoCasting FROM casting";
	private static final String  SQL_INSERT =  "INSERT  INTO casting ( nombre, descripcion, fecha, precio, tipoCasting) VALUES(?, ? , ? , ?, ? )";
	
	public List<Cliente> selecccionar(){
		Connection conn = null;
		PreparedStatement  stmt = null;
		ResultSet rs = null;
		Casting casting = null;
		List<Casting> Casting = new ArrayList<Casting>();
		
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int idCasting = rs.getInt("idCasting");
				String nombre = rs.getString("nombre");
				String descripcion = rs.getString("descripcion");
				String fechaContratacion = rs.getString("fechaContratacion");
				String precio = rs.getString("precio");
                                String tipoCasting = rs.getString("tipoCasting");
				casting = new Casting(idCasting, nombre, descripcion, fechaContratacion, precio, tipoCasting);
				
				Casting.add(casting);
				
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
		return Casting;
	}
	
	public int  insertar (Casting casting) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int registros = 0;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			stmt.setString(1, casting.getNombre());
			stmt.setString(2, casting.getDescripcion());
			stmt.setString(3, casting.getFechaContratacion());
			stmt.setString(4, casting.getPrecio());
			stmt.setString(5, casting.getTipoCasting());
	
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