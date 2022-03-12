package com.mx.datos;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	private static final String  JDBC_URL =  "jdbc:mysql://localhost:3306casting?useSSL=false&useTimezone=UTC&allowPublicKeyRetrieval=true";
	private static final String  JDBC_USER =  "root'@'127.0.0.1";
	private static final String  JDBC_PASSWORD =  "admin";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
	}
	
	public static void closeResultSet(ResultSet rs) throws SQLException {
		rs.close();
	}
	public static void closeStatement(Statement smtm) throws SQLException {
		smtm.close();
	}
	public static void closePreparedStatement(PreparedStatement ps) throws SQLException {
		ps.close();
	}
	public static void closeConnection(Connection conn) throws SQLException {
		conn.close();
	}
}
