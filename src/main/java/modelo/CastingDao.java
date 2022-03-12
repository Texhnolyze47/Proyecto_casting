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
	
	private static final String  SQL_SELECT =  "SELECT id, nombre, descripcion, fechaContratacion, precio, tipoCasting FROM clientes";
	private static final String  SQL_INSERT =  "INSERT  INTO clientes ( nombre, descripcion, fechaContratacion, precio, tipoCasting) VALUES(?, ? , ? , ?, ?  )";
	
	public List<Cliente> selecccionar(){
		Connection conn = null;
		PreparedStatement  stmt = null;
		ResultSet rs = null;
		Casting casting = null;
		List<Casting> casting = new ArrayList<Casting>();
		
		try {
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int idPersona = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String descripciion = rs.getString("descripcion");
				String fechaContrato = rs.getNString("fechaContrato");
				String precio = rs.getString("precio");
                                String tipoCasting = rs.getString("tipoCasting");
				casting = new Casting(idPersona,nombre, descripcion, fechaContratacion, precio, tipoCasting );
				
				casting.add(casting);
				
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
		return casting;
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
			stmt.setString(3, cliente.getFechaContratacion());
			stmt.setString(4, cliente.getPrecio());
			stmt.setString(5, cliente.getTipoCasting());
	
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