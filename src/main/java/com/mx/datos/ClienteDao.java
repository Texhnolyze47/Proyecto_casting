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
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return clientes;
		
	}
}
